package reflact_class;

import java.lang.reflect.Constructor;

/**
 * 反射
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * 反射-获取class对象
         */
        // 1.Class类的静态方法；2.类名.class；3.对象.getclass
        Class c1=Class.forName("reflact_class.Student");
        System.out.println(c1);
        Class c2=Student.class;
        System.out.println(c2);
        Class c3=new Student().getClass();
        System.out.println(c3);
        /**
         * 获取 构造器;
         * 作用：初始化一个对象返回
         */
        //全部public修饰的，getConstructors
        Constructor[] constructors=c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+":"+constructor.getParameterCount());
        }
        //全部的，getDeclaredConstructors
        Constructor[] constructors2 =c1.getDeclaredConstructors();
        for (Constructor constructor : constructors2) {
            System.out.println(constructor.getName()+"::"+constructor.getParameterCount());
        }
        //某一个public构造器
        Constructor constructor= c1.getConstructor();
        System.out.println(constructor.getName()+"-"+constructor.getParameterCount());
        //任意一个构造器
        Constructor constructor2 = c1.getDeclaredConstructor(String.class);
        System.out.println(constructor2.getName()+"--"+ constructor2.getParameterCount());
        //***public的构造器使用
        Student s=(Student)constructor.newInstance();
        System.out.println(s);
        //***非public的构造器使用---暴力反射
        constructor2.setAccessible(true);
        Student s2=(Student)constructor2.newInstance("a");
        System.out.println(s2);
    }

    /*@org.junit.jupiter.api.Test
    public void redlect() throws ClassNotFoundException {
        //反射-获取class对象
        //
        Class c1=Class.forName("reflact_class.Student");
        System.out.println(c1);

        Constructor[] constructors=c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+":"+constructor.getParameterCount());
        }
    }*/
}
