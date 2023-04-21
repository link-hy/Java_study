package Demo1.factory;

import Demo1.dao.UserDao;
import Demo1.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import javax.naming.spi.InitialContextFactory;

public class UserDaoFactoryBean implements FactoryBean<UserDao> , InitializingBean, DisposableBean {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }


    //在这里写对应的方法内容
    public void init(){
        System.out.println("init userDaofac...");
    }
    public void destory(){
        System.out.println("destory userDaofac...");
    }
//**************************
    @Override
    public void destroy() throws Exception {
        System.out.println("destory...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ini...");

    }


}
