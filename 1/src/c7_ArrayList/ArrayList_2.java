package c7_ArrayList;

import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> chengji=new ArrayList<>();
        int []a={90,98,88,78,64,85,100};
        for (int i = 0; i < a.length; i++) {
            chengji.add(a[i]);
        }
        System.out.println(chengji);
        System.out.println("修改：");
        for (int i = 0; i < chengji.size(); i++) {
            if(chengji.get(i)<80) {
                chengji.remove(i);
                i = i - 1;
            }
        }
        System.out.println(chengji);
    }
}
