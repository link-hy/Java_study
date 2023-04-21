package ThreadSafe.bank;

public class Demo {
    public static void main(String[] args) {
        account acc=new account("happy",10000);

        new getMoneyThread(acc,"张三").start();
        new getMoneyThread(acc,"李四").start();
    }
}

class account{
    private String ID;
    private double money;
    public account(){}
    public account(String id,double money){
        this.ID=id;
        this.money=money;
    }

    public void getMoney(double money){
        String name=Thread.currentThread().getName();
        //
        if(this.money>=money){
            System.out.println(name+"取出"+money);
            this.money-=money;
            System.out.println(ID+"剩余"+this.money);
        }
        else
            System.out.println(name+"取钱"+money+" 失败"+"剩余"+this.money);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

class getMoneyThread extends Thread{
    private account a;
    public getMoneyThread(account a,String name){
        super(name);
        this.a=a;
    }
    @Override
    public void run() {
        a.getMoney(10000);
    }
}