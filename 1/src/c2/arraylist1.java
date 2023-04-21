package c2;
import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        //集合对象，添加元素：add;删除元素：remove (元素或者索引都可以)；修改索引元素：set；
        // 返回指定索引元素：get；返回元素个数：size
        ArrayList<String> array=new ArrayList<>();
        System.out.println("array "+array);
        array.add("hello ");
        System.out.println("array = " + array);
        array.add("zzz");
        array.add("2rr");
        System.out.println("array = " + array);
        array.add(2,"add2");
        System.out.println("array = " + array);
        int num=array.size();
        System.out.println("num = " + num);
        for(int i=0;i<num;i++) {
            System.out.println(i+" "+array.get(i));
        }
    }
}
