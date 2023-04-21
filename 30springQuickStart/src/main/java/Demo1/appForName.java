package Demo1;

import Demo1.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class appForName {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据bean标签的id属性和name属性获取bean对象
        BookService bookService = (BookService) ctx.getBean("service");
        bookService.save();
    }
}
