package cc5_extendsOverRide;

public class Test {
    public static void main(String[] args) {
        phone p1=new phone();
        newPhone p2=new newPhone();
        p1.call();
        p2.call();
    }
}
class phone {
    public void call(){
        System.out.println("打电话 ");
    }
    public void message(){
        System.out.println("发信息 ");
    }
}

class newPhone extends phone{
    @Override  //重写方法校验注解，加上之后这个方法必须是正确重写的
    public void call() {
        super.call();
        System.out.println("视频通话 ");
    }

    @Override
    public void message() {
        super.message();
        System.out.println("发送语音、图片 ");
    }
}

