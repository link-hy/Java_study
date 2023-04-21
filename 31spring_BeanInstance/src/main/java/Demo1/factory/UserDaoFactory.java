package Demo1.factory;

import Demo1.dao.UserDao;
import Demo1.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
