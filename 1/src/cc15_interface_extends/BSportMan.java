package cc15_interface_extends;

public class BSportMan implements SportMan{
    private String name;

    public BSportMan(String name) {
        this.name = name;
    }

    @Override
    public void rule() {
        System.out.println(name + "遵纪守法~");
    }

    @Override
    public void run() {
        System.out.println(name + "运动~");
    }

    @Override
    public void compet() {
        System.out.println(name + "比赛~");
    }

    @Override
    public void eat() {
        System.out.println(name + "吃饭~");
    }

    @Override
    public void sleep() {
        System.out.println(name + "睡觉~");
    }
}
