package Demo.Dao.impl;

import Demo.Dao.BookDao;

/**
 * 给BookDaoImpl注入一些简单数据类型的数据
 * 参考引用数据类型的注入，我们可以推出具体的步骤为:
 * 1.在BookDaoImpl类中声明对应的简单数据类型的属性
 * 2.为这些属性提供对应的setter方法
 * 3.在applicationContext.xml中配置
 */

public class BookDaoimpl implements BookDao {
    private String databaseName;
    private int connectionNum;


    public BookDaoimpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

//    public void setDatabaseName(String databaseName) {
//        this.databaseName = databaseName;
//    }
//
//    public void setConnectionNum(int connectionNum) {
//        this.connectionNum = connectionNum;
//    }

    @Override
    public void save() {
//        System.out.println("Book dao save ...");
        System.out.println("Book dao save ..."+databaseName+":"+connectionNum);
    }
}
