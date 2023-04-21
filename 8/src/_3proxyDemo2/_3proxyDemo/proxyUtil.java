package _3proxyDemo2._3proxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyUtil {
    public static UserService getProxy(UserService obj){
        return (UserService) Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long startTime=System.currentTimeMillis();

                        Object rs = method.invoke(obj,args);

                        long endTime=System.currentTimeMillis();
                        System.out.println(method.getName()+" 耗时："+(endTime-startTime)/1000.0+"秒。");
                        return rs;
                    }
                });
    }
}
