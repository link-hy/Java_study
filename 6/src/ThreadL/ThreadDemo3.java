package ThreadL;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 利用Callable、FutureTask接口实现多线程
 *      定义类实现Callable接口，重写call方法
 *      用FutureTask把Callable对象封装成线程任务对象
 *          *FutureTask实现了Runnable的对象，可以给Thread，可以使用get方法获得返回值
 *      把线程任务对象交给Thread
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Callable<String> call=new myCallable(190);
        FutureTask<String> futureTask=new FutureTask<>(call);
        Thread t=new Thread(futureTask);
        t.start();

        Callable<String> call2=new myCallable(299);
        FutureTask<String> futureTask2=new FutureTask<>(call2);
        Thread t2=new Thread(futureTask2);
        t2.start();

        try {//如果线程任务没有完成会在这里等待
            System.out.println(futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(futureTask2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 150; i++) {
            System.out.println("主线程-----"+i);
        }
    }
}

/**
 * 有返回结果类型
 */
class myCallable implements Callable<String>{
    private int n;
    public myCallable(int n){
        this.n=n;
    }
    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            System.out.println("任务进行中: "+i+"/"+n);
            sum+=i;
        }
        System.out.println("任务完成: "+n);
        return "子线程计算1+...+n的值："+sum;
    }
}