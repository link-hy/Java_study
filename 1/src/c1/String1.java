package c1;

public class String1 {
    public static void main(String[] args) {
        String s1=new String();
      //  System.out.println("s1 "+s1);
        char []c2={'a','c','e'};
        String s2=new String(c2);
      //  System.out.println("s2 "+s2);
        String s3="abcd";
      //  System.out.println("s3 "+s3);
        byte[] b4={98,99,97};
        String s4=new String(b4);
      //  System.out.println("s4 "+s4);
        System.out.println(c2);
        String SS="";
        for(int i=2;i>=0;i--){
            SS+=s2.charAt(i);
        }
        System.out.println(SS);

        //String 和SrringBuider
    }
}
