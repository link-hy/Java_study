package Demo1;

import Demo1.dao.BookDao;
import Demo1.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class appForScope {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据bean标签的id属性和name属性获取bean对象
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2= (BookDao) ctx.getBean("dao");
        System.out.println(bookDao);//spring默认给我们创建的单例对象
        System.out.println(bookDao2);//修改配置文件设置非单例对象
//        bookService.save();
    }
}
