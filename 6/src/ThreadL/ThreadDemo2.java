package ThreadL;

/**
 * 实现Runnable接口
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable work= new myRunnable();//创建MyRunnable任务对象
        Thread t=new Thread(work);
        t.start();

        for (int i = 0; i < 500; i++) {
            System.out.println("主线程-----"+i);
        }
    }
}

/**
 * 定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法
 * 可以继续继承类和实现接口
 */
class myRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("子线程 "+i);
        }
    }
}