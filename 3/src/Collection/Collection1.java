package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 * List 有序、可重复、有索引
 * Set  无序、不重复、无索引
 * 支持泛型
 * 不能使用基本数据类型，只能使用引用数据类型
 */
public class Collection1 {
    public static void main(String[] args) {
        Collection c1=new ArrayList<>();
        c1.add("hello");
        c1.add(123);
        System.out.println(c1);

        Collection c2=new HashSet<>();
        c2.add(12);
        c2.add("aaa");
        c2.add(11);
        c2.add(11.0);
        c2.add(11);
        System.out.println(c2);
        System.out.println(c2.size());
        System.out.println(c2.contains(12.0));
        Object[]a=c2.toArray();
//        int[] b=c2.toArray();

//        Collection<double> c3=new ArrayList<double>();
        Collection<Double> c3=new ArrayList<>();
//        c3.add(1); //包装类
        c3.add(1.0);
        Object[] c= c3.toArray();
    }
}
