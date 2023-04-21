package cc14_InterfaceDemo;
// 接口用于被类实现，实现接口的类是实现类，，接口类可以单实现也可以多实现
public class PingPongMan implements SportMan,Law{
    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+"在跑步训练~");
    }

    @Override
    public void competition() {
        System.out.println(name+"参加比赛~");
    }

    @Override
    public void rule() {

    }
}
