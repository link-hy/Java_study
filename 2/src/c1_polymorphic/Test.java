package c1_polymorphic;

/**
 * 同类型对象执行同一个行为，表现不同的行为特征。
 *      父类类型 对象名称 = new 子类构造器
 *        接口  对象名称 = new 实现类构造器
 *  特点：
 *       方法调用：编译看左边，运行看右边
 *       变量调用：编译和运行 都看左边
 *  问题：
 *       不能使用子类独有的方法
 */
public class Test {
    //多态,父类的类型 对象=new 子类
    public static void main(String[] args) {
        Animal a=new Dog();
//        System.out.println(a.name);//变量调用：编译和运行 都看左边
        go(a);
        Animal b=new Tortoise();
//        System.out.println(b.name);//变量调用：编译和运行 都看左边
        go(b);
    }

    public static void go(Animal a){
        System.out.println("开始~");
        a.run();
        System.out.println("结束~");
    }
}
