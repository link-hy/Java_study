import java.util.Scanner;

public class RegexDemo1 {
    /*
    正则表达式
    规则：
        1.字符类 []里面加上字符，^表示除该字符外的字符，[a-f&&[a-g]]是字符集取交集
        2.预定义的字符类 . 表示任意字符
          默认一个       \d \D 数字和非数字
                        \s \S 一个空白字符和一个非空白字符
                        \w \W 字母数字下划线和……
        3.贪婪的量词     X？ 一次或者0次
           默认多个     X*  0次或多次
                       X+  1次或多次
                       X{n} 正好n次
                       X{n，m}
         matches 判断是否匹配正则表达式
     */
    public static void main(String[] args) {
        System.out.println(cheackQQ("1234567"));
        System.out.println(cheackQQ("1234567a"));

//        cheackMail();
//        cheackPhone();

        String names="小路abcd蓉儿efg过儿";
        String []arrs=names.split("\\w+");
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        String name2=names.replaceAll("\\w+"," ");
        System.out.println(name2);
    }
    public static boolean cheackQQ(String qq){
        return qq!=null && qq.matches("\\d{6,20}");
    }
    public static void cheackPhone(){
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("输入手机号：");
            String phone=sc.next();
            if (phone.matches("1[3=9]\\d{9}")) {
                System.out.println("手机号：" + phone);
                break;
            }
            else
                System.out.println("手机号错误!");
        }
    }

    public static void cheackMail(){
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("输入邮箱：");
            String mail=sc.next();
            if (mail.matches("\\w{1,}@[\\w&&[^_]]{2,}(.[\\w&&[^_]]{2,}){1,2}")) {
                System.out.println("邮箱：" + mail);
                break;
            }
            else
                System.out.println("邮箱错误!");
        }
    }
}
