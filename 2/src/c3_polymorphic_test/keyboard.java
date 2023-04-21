package c3_polymorphic_test;

public class keyboard implements USB{
    private String name;

    public keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * function
     */
    @Override
    public void connection() {
        System.out.println("键盘"+name+"连接了电脑！");
    }

    public void keydown(){
        System.out.println("键盘"+name+"按下了！");
    }
    @Override
    public void out() {
        System.out.println("键盘"+name+"被拔出了电脑！");
    }
}
