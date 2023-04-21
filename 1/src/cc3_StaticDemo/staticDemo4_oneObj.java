package cc3_StaticDemo;

public class staticDemo4_oneObj {
    public static void main(String[] args) {
        /*SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        System.out.println("饿汉单例："+(s1==s2));*/

        SingleInstance s3 = SingleInstance.getInstance();
        SingleInstance s4 = SingleInstance.getInstance();
        System.out.println("懒汉单例："+(s3==s4));
    }
}
