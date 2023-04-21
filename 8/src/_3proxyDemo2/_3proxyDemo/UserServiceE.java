package _3proxyDemo2._3proxyDemo;

public class UserServiceE implements UserService {
    @Override
    public String login(String name,String psd) {
        String rs="密码错误！";
        if("admin".equals(name)&&"123456".equals(psd))
            rs="密码正确";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户~");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String selectUser() {
        System.out.println("查询用户~");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "查询了用户~";
    }
}
