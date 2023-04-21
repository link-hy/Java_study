package c2_polymorphic_convert;

public class Test {
    public static void main(String[] args) {
        Animal d1=new Dog("123hao");
        d1.run();

        Animal t1=new Tortoise();
        t1.run();

        System.out.println("强制类型转换------------");
        /**
         * 强制类型转换
         * 错误转换 异常：ClassCastException
         * 建议使用instance判断在转换
         */
        Dog d2= (Dog) d1;
        d2.lookDoor();
        Tortoise t2=(Tortoise) t1;
        t2.layEggs();

        System.out.println("instance判断");
        if(d1 instanceof Dog){
            Dog d3= (Dog) d1;
            d3.lookDoor();
        }
        if(t1 instanceof Dog){
            Dog d4= (Dog) t1;//错误转换的情况
            d4.lookDoor();
        }
        else
            System.out.println("判断不是狗");

        System.out.println("方法里面的使用-----------");
        go(d1);
        go(new Tortoise());
    }

    /**
     * 使用到方法里面
     */
    public static void go(Animal a){
        a.run();
        if(a instanceof Dog){
            Dog a1=(Dog) a;
            a1.lookDoor();
        }
        else{
            Tortoise a1=(Tortoise) a;
            a1.layEggs();
        }

    }
}
