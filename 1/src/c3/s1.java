package c3;

public class s1 extends s{
    private int age2=19;
    public void run(){
        System.out.println("RUNING>>>继承");
    }
    public void shows1(){
        System.out.println("s1_age:"+this.age2);
        System.out.println("s_age: "+super.age2);
    }
}
