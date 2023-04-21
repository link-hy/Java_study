package cc11_abstract_Test;

public class goldCar extends Card{
    @Override
    public void pay(double money) {
        System.out.println("用户："+getUserName());
        System.out.println("消费："+money);
        System.out.println("账户余额："+getMoney());
        System.out.println("实际消费："+ 0.8*money);
        setMoney(getMoney()-0.8*money);
        System.out.println("消费后余额："+getMoney());
    }
}
