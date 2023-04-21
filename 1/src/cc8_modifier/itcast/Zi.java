package cc8_modifier.itcast;

import cc8_modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Fu f=new Fu();
        /*f.privateMethod();
        f.method();*/
//        f.protectMethod();  //报错
        f.publicMethod();

        Zi zi=new Zi(); //子类使用就应该是子类的对象访问
        zi.protectMethod();
        zi.publicMethod();
    }
}
