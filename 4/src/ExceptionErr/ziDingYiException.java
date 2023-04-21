package ExceptionErr;

public class ziDingYiException {
    public static void main(String[] args) {
        try {
            checkAge(-23);
        } catch (mySetAgeException e) {
            e.printStackTrace();
        }
    }
    public static void checkAge(int age) throws mySetAgeException {
        if(age<0||age>200){
            //抛出异常对象给调用者
            throw new mySetAgeException(age+" is illeagal!");
        }
        else{
            System.out.println("ok");
        }
    }
}

/**
 * 自定义的编译异常,编译阶段就会提醒，容易出错的地方使用比较好
 * 1.继承Exception
 * 2.重写构造器
 * 自定义的运行时异常，提醒不强
 * 继承RuntimeException
 */
class mySetAgeException extends Exception{
    public mySetAgeException(){}
    public mySetAgeException(String message){
        super(message);
    }
}