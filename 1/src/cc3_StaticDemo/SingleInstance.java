package cc3_StaticDemo;

public class SingleInstance {
    //@@@ 饿汉单例，提前产生了对象保存
    /*//私有化构造器
    private SingleInstance(){
        System.out.println("创建了一个对象 ");
    }
    //用一个静态变量存储一个对象
    public static SingleInstance instance=new SingleInstance();*/

    //@@@ 懒汉单例，需要的时候才创建一个对象
    //私有化构造器，在内部用一个私有的静态变量存储还未产生的对象，在使用的时候用get方法产生对象，通过判断产生一次
    private SingleInstance(){
        System.out.println("创建了一个对象 ");
    }
    private static SingleInstance instance;
    public static SingleInstance getInstance(){
        if(instance==null)
            instance=new SingleInstance();
        return instance;
    }
}
