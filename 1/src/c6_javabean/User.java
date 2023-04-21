package c6_javabean;
//javaBean是实体类，其对象可以在程序中封装数据
//成员变量设置为私有 private
//为成员变量提供set 和get 方法
//提供无参数构造器，鼠标右键-generate
public class User {
    private String name;
    private double height;
    private double salary;

    public User() {
    }

    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
