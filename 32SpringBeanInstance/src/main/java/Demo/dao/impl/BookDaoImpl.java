package Demo.dao.impl;

import Demo.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("save bookdao ....");
    }
}
