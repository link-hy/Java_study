package cc3_StaticDemo;

public class staticDemo2 {
    public staticDemo2(){
        System.out.println("*******无参数构造器********");
    }
    // 实例代码块属于对象，构建对象触发一次
    {
        System.out.println(">>>>>>>>实例代码块>>>>>>>");
    }

    public static void main(String[] args) {
        staticDemo2 s1=new staticDemo2();
    }
}
