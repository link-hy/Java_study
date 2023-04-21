package cc11_abstract_Test;

public class Test {
    public static void main(String[] args) {
      /*  goldCar c1 = new goldCar();
        c1.setUserName("张三");
        c1.setMoney(1000000);
        c1.pay(500);*/

        Card c2=new Card() {
            @Override
            public void pay(double money) {
                System.out.println(money);
            }
        };

        CC c3=new CC(){};
        c3.setS("123");
        System.out.println(c3.getS());

        /*long x=021778;
        short y=1;
        y= (short) (y+1);*/
    }
}

abstract class CC{
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
