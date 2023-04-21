package ThreadL_API;

public class myThread extends Thread{
    public myThread() {
    }

    public myThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
//            System.out.println("子线程 "+Thread.currentThread().getName()+"  "+i);
            if(getName()=="work1") {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("子线程 "+getName()+"  "+i);
        }
    }
}
