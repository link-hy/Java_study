import java.util.Arrays;
import java.util.Comparator;
public class Arraysd1 {
    public static void main(String[] args) {
        int []arr={10,2,6,44,32};
        //数组转字符串
        System.out.println(Arrays.toString(arr));
        //数组排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //二分查找
        int k=2;
        System.out.println(k+":"+Arrays.binarySearch(arr, k));
        Integer []arr1={11,2,3,55,8,9};
        //重载排序
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2) {
               //返回正数就前后交换
                /*if(o1>o2)
                    return 1;
                if(o1<o2)
                    return -1;
                return 0;*/
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr1));

        /**
        二分搜索
         */
        int []a={1,3,4,6,8,18};
        int c1=Arrays.binarySearch(a,5);
        System.out.println(c1);
    }

}
