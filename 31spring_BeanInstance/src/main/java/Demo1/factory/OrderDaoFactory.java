package Demo1.factory;

import Demo1.dao.OrderDao;
import Demo1.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
