package c2_polymorphic_convert;

public class Dog extends Animal {
    public String name="子类狗";
    @Override
    public void run() {
        System.out.println("Dog跑的快乐");
    }
    /**
     * 独有功能
     */
    public void lookDoor(){
        System.out.println(name + "在看门");
    }

    public Dog(String name) {
        this.name = name;
    }
}
