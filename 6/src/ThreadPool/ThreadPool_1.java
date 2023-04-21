package ThreadPool;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

public class ThreadPool_1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 创建线程池
         */
        ExecutorService pool=new ThreadPoolExecutor(3,6,8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(6), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Runnable target=new myRunnable();
        pool.execute(target);

        Callable myCallable=new myCallable(10);
//        FutureTask<String> futureTask=new FutureTask<String>(myCallable);
//        Thread t=new Thread(futureTask);
//        t.start();

        Future<String> f1 = pool.submit(myCallable);
        System.out.println(f1.get());

        Future<String> f2 = pool.submit(new myCallable(20));
        System.out.println(f2.get());
        pool.shutdown();
        /**
         * 创建线程池2
         */
        ScheduledExecutorService pool2=Executors.newScheduledThreadPool(3);
        pool2.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"定时器1"+new Date());
            }
        },3,3,TimeUnit.SECONDS);



        Timer t=new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"定时器2"+new Date());
            }
        },3000,3000);
    }
}

/**
 *
 */
class myRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " ——>" + i);
        }
        try {
            System.out.println(Thread.currentThread().getName() + " —— 休眠");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " —— 启动");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class myCallable implements Callable<String> {
    private int n;
    public myCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int s=0;
        for (int i = 0; i < n; i++) {
            s+=n;
        }

        return Thread.currentThread().getName()+" 1+...+" + n +
                ", 子线程执行结果： "+s;
    }
}