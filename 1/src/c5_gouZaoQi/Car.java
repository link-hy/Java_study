package c5_gouZaoQi;
//构造器
public class Car {
    String name;
    double price;
    //无参数构造器，默认有的，如果写了有参数构造器则无参数构造器必须写
    public Car(){
        System.out.println("无参数构造器...");
    }
    //有参数
    public Car(String name,double price){
        System.out.println("有参数构造器："+name+" "+price);
        this.name=name;
        this.price=price;
    }
}
