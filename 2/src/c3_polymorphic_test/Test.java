package c3_polymorphic_test;

public class Test {
    public static void main(String[] args) {
        //电脑
        computer c1 = new computer("HUAWEI");
        c1.start();
        //鼠标
        USB m=new mouse("INPHIC");
        c1.installUSB(m);

        // 键盘
        USB k=new keyboard("MECHREVO");
        c1.installUSB(k);

    }
}
