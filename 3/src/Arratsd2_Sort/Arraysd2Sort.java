package Arratsd2_Sort;

import java.util.Arrays;
import java.util.Comparator;

public class Arraysd2Sort {
    public static void main(String[] args) {
        Student []students=new Student[3];
        students[0]=new Student("张三",13,167);
        students[1]=new Student("李四",19,175);
        students[2]=new Student("王五",15,188);
//        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //比较器
        Comparator p= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getHeight()-o1.getHeight();
            }
        };
        Arrays.sort(students,p);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(Arrays.toString(students));
    }



}

