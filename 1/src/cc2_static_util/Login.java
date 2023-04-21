package cc2_static_util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        String Co=util.gencode(5);
        boolean ar= util.check(Co);
        if(ar)
            System.out.println("Success!");
        else
            System.out.println("Failure!");

        //util i=new util();//构造器已经私有了，不能产生对象
    }
}
