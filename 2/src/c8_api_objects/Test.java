package c8_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1=null;
        String s2=new String("hello ");
//        System.out.println(s1.equals(s2));    //空指针异常
        System.out.println(Objects.equals(s1,s2));  //更安全
        /**
         * public static boolean equals(Object a, Object b) {
         *         return (a == b) || (a != null && a.equals(b));
         *     }
         */
    }
}
