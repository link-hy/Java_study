package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
//1.时间对象的时间 Date对象
//2.系统读取时间毫秒值
//3.时间的格式化 SimpleDateFormat对象

public class Data2 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);//已经被重写了，输出不是对象地址
        //格式化的时间对象
        System.out.println("格式化的时间对象");
        SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd HH:mm:ss EEE a");
        String rs= sdf.format(d);
        System.out.println(rs);
        //格式化时间毫秒值
        System.out.println("格式化时间毫秒值");
        long time=System.currentTimeMillis()+121*1000;
        String rs2=sdf.format(time);
        System.out.println(rs2);
    }
}
