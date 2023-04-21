import java.util.regex.Matcher;
import java.util.regex.Pattern;
//对于一串字符串根据正则化表达式找出内容
public class RegexDemo2 {
    public static void main(String[] args) {
        String re="电话13055566666，电话19856566666，邮箱13589aa@qq.com";
        //定义字符串形式
        String regex="(1[3-9]\\d{9})|(\\w{1,20}@[\\w&&[^_]]{1,10}(\\.[\\w&&[^_]]{1,10}){1,2})";
        //编译匹配对象
        Pattern pattern=Pattern.compile(regex);
        //得到一个内容匹配器对象
        Matcher matcher=pattern.matcher(re);
        //寻找
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
