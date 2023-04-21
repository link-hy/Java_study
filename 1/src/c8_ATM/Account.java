package c8_ATM;

public class Account {
    //姓名、卡号、密码 、总存款、一次可用额度
    private String name;
    private String Id;
    private String passwd;
    private double allMoney;
    private double maxInOne;

    public Account() {
    }

    public Account(String name, String id, String passwd, int allMoney, int maxInOne) {
        this.name = name;
        Id = id;
        this.passwd = passwd;
        this.allMoney = allMoney;
        this.maxInOne = maxInOne;
    }

    //方法：查询，取款、存款、转账、修改密码
    // 查询
    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public String getPasswd() {
        return passwd;
    }

    public double getAllMoney() {
        return allMoney;
    }

    public double getMaxInOne() {
        return maxInOne;
    }
    //取款//转账//存款,都是修改钱
    public void setAllMoney(double allMoney) {
        this.allMoney += allMoney;
    }

    //修改密码
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
