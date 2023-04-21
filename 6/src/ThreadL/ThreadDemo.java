package ThreadL;

/**
 * 多线程方法一：Thread
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t=new MyThread();//子线程对象
        t.start();//启动线程

        for (int i = 0; i < 500; i++) {
            System.out.println("主线程-----"+i);
        }
    }
}

/**
 * 定义一个线程类Thread
 * 重写run方法，定义线程之后要干嘛
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("子线程 "+i);
        }
    }
}