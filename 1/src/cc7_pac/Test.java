package cc7_pac;

import cc7_pac.p2.User2;

public class Test {
    public static void main(String[] args) {
        //同一个包下的类互相可以直接访问； 不同包的类需要导包才能用；
        // 使用不同包的相同类名，只能导一个包，另一个全名访问
        User.onlineNumber();
        cc7_pac.cc7_packageImport.User2.onlineNumber2();
        User2.onlineNumber2();

    }
}
