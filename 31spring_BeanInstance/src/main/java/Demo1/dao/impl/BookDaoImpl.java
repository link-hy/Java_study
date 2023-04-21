package Demo1.dao.impl;

import Demo1.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private BookDaoImpl() {
        System.out.println("book dao constructor is running ....");
    }
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
