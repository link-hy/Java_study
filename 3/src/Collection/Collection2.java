package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Collection2 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("Hello");
        System.out.println(list.add("hello"));
        list.add("tttt");
        System.out.println(list.size());
        System.out.println(list);

        Object[] arr = list.toArray();
        System.out.println("转换数组："+Arrays.toString(arr));
        /********************************
         * 3个遍历方法
         */
        System.out.println("-----------------------");
        Collection<String> list2=new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list2.add("王五");
        list2.add("刘六");
        System.out.println(list2);
        System.out.println("1 ------");
        /**
         * 1.定义迭代器 while遍历
         */
        Iterator<String> it=list2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        /**
         * 2.增强for
         * for(数据类型 名字:集合、数组){事件}
         * 快捷键  集合、数组.for Tab
         */
        System.out.println("2 ------");
        for (String a:list2) {
            System.out.println(a);
        }
        /**
         * 3.Lambda 方法
         */
        System.out.println("3 ------");
        list2.forEach(s -> {
            System.out.println(s);
        });
//        list2.forEach(s -> System.out.println(s));//简化的lambda
//        list2.forEach(System.out::println);   //方法引用
        // 【原来的格式】 输入list2.forEach() 点进去看看然后 new Consumer
        // 实际上在forEach里面就是一个增强for，在里面调用我们重写的accept
        list2.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
