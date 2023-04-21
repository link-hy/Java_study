package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        /**
         * LinkedList实现栈  ***
         */

        LinkedList<String> stack1=new LinkedList<>();
        //入栈    可以用push，其实里面就是一个addFirst
                //pop 里面也就是一个removeFirst
        stack1.addFirst("第1颗子弹");
        stack1.addFirst("第2颗子弹");
        stack1.addFirst("第3颗子弹");
        stack1.addFirst("第4颗子弹");
        stack1.push("66666");
        System.out.println(stack1);
        //出栈
        System.out.println(stack1.removeFirst()+" used!");
        System.out.println(stack1.removeFirst()+" used!");
        System.out.println(stack1.pop()+" used!");
        System.out.println(stack1);
        /**
         * LinkedList实现队列 ***
         */
        System.out.println("********************");
        LinkedList<String> queue1=new LinkedList<>();
        //入队
        queue1.addLast("张三");
        queue1.addLast("李四");
        queue1.addLast("王五");
        System.out.println(queue1);
        //出队
        System.out.println(queue1.removeFirst()+"出队了");
        System.out.println(queue1);

        System.out.println("********************");
        List<String> list1=new ArrayList<>();
        list1.add("jar");
        list1.add("c++");
        list1.add("c++");
        list1.add("c");
        list1.add("java");list1.add("java");
        list1.add("c");
        list1.add("abc");
        list1.add("c");
        list1.add("c++");
        list1.add("java");
        list1.add("jar");
        list1.add("jar");
        System.out.println(list1);
        //元素删除
        Iterator<String> iterable=list1.iterator();
        while(iterable.hasNext()){
            if(iterable.next().equals("c")){
                iterable.remove();
            };
        }

        /*//foreach 遍历 有bug
        for (String l:list1) {
            if(l.equals("java")){
                list1.remove("java");
            };
        }

        //Lambda  有bug
        list1.forEach(s->{
            if(s.equals("c++"))
                list1.remove("c++");
        });*/

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i).equals("java")) {
                list1.remove("java");
                i -= 1;
            }
            System.out.println(i+"  "+list1);
        }

        while(list1.remove("jar"));
        System.out.println(list1);
    }
}
