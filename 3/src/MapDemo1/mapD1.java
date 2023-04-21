package MapDemo1;

import java.util.*;
import java.util.function.BiConsumer;

public class mapD1 {
    public static void main(String[] args) {
        Map<String ,Integer> maps=new HashMap<>();
        maps.put("tea",18);
        maps.put("coffee",16);
        maps.put("toc",8);

        System.out.println(maps);
        //根据键 找值、删除、是否包含
        System.out.println(maps.get("tea"));
        System.out.println(maps.get("tec"));
        System.out.println(maps.remove("toc"));
        System.out.println(maps.containsKey("tea"));
        //是否有这个值
        System.out.println(maps.containsValue(16));
        //获取全部键的集合      键也是不重复的，所以用set
        Set<String> keys=maps.keySet();
        System.out.println(keys);
        //获取全部值的集合      值可以重复
        Collection<Integer> val=maps.values();
        System.out.println(val);

        System.out.println("- 1. 循环 键找值 ---------------------------------------");
        for (String tag:maps.keySet()) {
            System.out.println(tag+"="+maps.get(tag));
        }
        System.out.println("- 2. Map集合转Set集合 -----------------------------");
        Set<Map.Entry<String,Integer>> entries=maps.entrySet();
        System.out.println(entries);
        for(Map.Entry<String,Integer> entry:entries){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("- 3. Lambda forEach 其实内部有个Entry的for循环 返回键和值在" +
                "accept里面输出 ----------------");
        maps.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+"="+integer);
            }
        });
    }
}
