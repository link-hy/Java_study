package ExceptionErr;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//直接继承自RuntimeException或者其子类
public class RuntimeExceptions {
    public static void main(String[] args) {
        //数组越界异常:ArrayIndexOutOfBoundsException
        System.out.println("程序开始：");
        int[] arr={1,2,3};
//        System.out.println(arr[4]);
        //
        String date="2023-01-01 10:11:12";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d= null;
        try {
            d = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();//打印异常栈信息
        }
        System.out.println(d);

        try{int a=1/0;} catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("程序结束。");
    }
}
