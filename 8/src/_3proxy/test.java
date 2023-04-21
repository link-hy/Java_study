package _3proxy;

public class test {
    public static void main(String[] args) {
        //对象的类是实现接口的
        star s=new star("Alice");
        //产生代理对象
        skill s2=starAgentProxy.getProxy(s);
        s2.jump();
        s2.sing();

    }
}
