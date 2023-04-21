package set_1;

import java.util.HashSet;
import java.util.Set;

//不重复
public class setDemo1 {
    public static void main(String[] args) {
        String n1="aaa1";
        String n2="aaa2";
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());

        Set<String> sets=new HashSet<>();
        sets.add("c");
        sets.add("sql");
        sets.add("java");
        sets.add("java");
        sets.add("c");
        sets.add("sql");
        System.out.println(sets);
    }
}
