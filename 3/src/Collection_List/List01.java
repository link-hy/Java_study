package Collection_List;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //ArrayList集合对象
        //List有序可重复有索引
        ArrayList<String> tes=new ArrayList<>();
        tes.add("AAA");
        List<String> list1=new ArrayList<>();
        //增加
        list1.add("C++");
        list1.add("Java");
        list1.add("Python");
        list1.add(2,"Matlab");
        System.out.println(list1);
        //索引获取值
        System.out.println(list1.get(1));
        //删除
        list1.remove("Python");
        System.out.println(list1);
        //修改
        list1.set(1,"C");
        System.out.println(list1);

    }
}
