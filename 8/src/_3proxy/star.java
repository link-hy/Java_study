package _3proxy;

public class star implements skill{
    private String name;
    public star(String name){
        this.name=name;
    }
    @Override
    public void jump() {
        System.out.println(name+"开始跳舞~");
    }

    @Override
    public void sing() {
        System.out.println(name+"开始唱歌~");
    }
}
