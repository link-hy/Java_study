package cc11_abstract_Test;

public abstract class Card {
    private String userName;
    private double money;

    /**
     *  pay   abstract method
     */
    public abstract void pay(double money);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
