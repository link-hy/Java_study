package c5_gouZaoQi;
//构造器
public class Test {
    public static void main(String[] args) {
        Car c=new Car();
        c.name="a";
        c.price=1000000;
        System.out.println("名称："+c.name);
        System.out.println("价格："+c.price);

        Car d=new Car("b",10000000);
        System.out.println("名称："+d.name);
        System.out.println("价格："+d.price);
    }
}
