package ThreadL;
//创建Runnable的匿名内部类对象
public class ThreadDemo2P {
    public static void main(String[] args) {
        Runnable work=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println("子线程 "+i);
                }
            }
        };
        Thread t=new Thread(work);
        t.start();

        new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                System.out.println("Lambda 子线程 "+i);
            }
        }).start();

        for (int i = 0; i < 500; i++) {
            System.out.println("主线程-----"+i);
        }
    }
}
