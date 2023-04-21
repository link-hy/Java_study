package Demo.Srevice.impl;

import Demo.Dao.BookDao;
import Demo.Dao.UserDao;
import Demo.Dao.impl.UserDaoimpl;
import Demo.Srevice.BookService;

public class BookServiceimpl implements BookService {
    private BookDao bookdao;
    private UserDao userDao;

/*    public BookServiceimpl(BookDao bookdao, UserDao userDao) {
        this.bookdao = bookdao;
        this.userDao = userDao;
    }*/

/*    public BookServiceimpl( UserDao userDao,BookDao bookdao) {
        this.bookdao = bookdao;
        this.userDao = userDao;
    }*/

    public void setBookDao(BookDao bookdao){
        this.bookdao=bookdao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookdao.save();
        userDao.save();
    }
}
