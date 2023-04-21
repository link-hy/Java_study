package cc16_interface_jdk8;

/**
 * Jdk_8开始可以在接口里面实现方法。有3类：
 *      1.默认接口方法，用default修饰，默认是public，用对象来调用接口方法
 *      2.静态接口方法，用static修饰，默认也是public，只能用接口名来调用接口方法！
 *      3.私有接口方法，private修饰，只能在接口内使用（Jdk_9开始）
 */

/**
 * 接口实现与接口继承的问题：
 *      1.接口不能创建对象
 *      2.一个类实现多个接口，里面有同样的静态static方法，不冲突。因为只能用接口来调用静态接口方法。
 *      3.一个类继承了父类又实现了接口，父类和接口有同方法，默认用父类的。
 *      4.一个类实现了多个接口，有同名的default方法，则类里面必须重写该方法。
 *      5.一个接口继承多个接口，存在同名方法不同返回类型冲突则不行。
 */
public interface SportManInter {
    default void run(){
        go();   //私有内部接口方法调用
        System.out.println("跑得快~");
    }

    static void compet(){
        System.out.println("参加比赛~");
    }
    private void go(){
        System.out.println("开始跑~");
    }
}

class PingPongMan implements SportManInter{}

class Test{
    public static void main(String[] args) {
        PingPongMan s1=new PingPongMan();
        s1.run();
        SportManInter.compet();
    }
}
