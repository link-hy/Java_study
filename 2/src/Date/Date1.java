package Date;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        //获得时间  date类，当前系统时间
        Date d1=new Date();
        System.out.println(d1);
        //时间对象d1的毫秒值
        long time=d1.getTime();
        System.out.println(time);

        //获得当前时间的毫秒值
        long time2=System.currentTimeMillis();
        System.out.println(time2);

        try {
            Thread.sleep(1000); //1000 毫秒，也就是1秒.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(System.currentTimeMillis());

        //设置时间对象的时间
        long time3=time+(24*60*60+60*60+60+1)*1000;
        Date t2=new Date(time3);
        System.out.println(t2);

//        String t="2021年08月06日11点11分11秒";
//        System.out.println(Date.parse(t));
    }
}
