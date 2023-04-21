package _1_unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

//不可变集合 List、Set、Map
//  定义之后不能修改
public class collec_un {
    public static void main(String[] args) {
        List<Double> lists= List.of(5.1,5.5,6.0);
//        lists.add(11.5);
        System.out.println(lists);
        Set<String> names = Set.of("李白","张三");
        System.out.println(names);
        Map<String,Double> maps= Map.of("a",12.0,"b",5.6);
        System.out.println(maps);
    }
}
