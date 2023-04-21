package c1;

public class StringBuider1 {
    public static void main(String[] args) {
        StringBuilder ss=new StringBuilder();
        System.out.println("ss:"+ss);
        System.out.println("ss-l" + ss.length());
        StringBuilder sr=new StringBuilder("zzz");
        System.out.println("sr = " + sr);
        System.out.println(sr.length());

        String cc=sr.toString();
        System.out.println("StringBuilder 2 String:"+cc);
        StringBuilder cr=new StringBuilder(cc);
        System.out.println("String 2 StringBuilder:"+cr);
    }
}
