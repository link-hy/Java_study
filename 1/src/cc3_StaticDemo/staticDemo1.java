package cc3_StaticDemo;

public class staticDemo1 {
    //静态代码块，属于类与类一起优先加载一次，自动触发一次执行
    static {//用于初始化静态资源
        System.out.println(">>>>>> Static >>>>>>>");
    }
    public static void main(String[] args) {
        System.out.println(">>>>>> main >>>>>>>");

    }
}
