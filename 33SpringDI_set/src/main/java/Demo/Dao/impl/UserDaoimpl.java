package Demo.Dao.impl;

import Demo.Dao.UserDao;

public class UserDaoimpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao save...");
    }
}
