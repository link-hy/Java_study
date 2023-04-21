package c7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_4_student {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        Student s1=new Student("10001","李白",22,"a1");
        Student s2=new Student("10002","张三",23,"a3");
        Student s3=new Student("10003","李四",24,"a2");
        Student s4=new Student("10004","王五",21,"a3");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getIdnumber()+"\t"+students.get(i).getName()+"\t"+students.get(i).getAge()+"\t"+students.get(i).getClassname());
        }
        //根据学号查找
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("输入学号：");
            String idIn= sc.next();
            if (idIn.equals("q")) {
                System.out.println("退出！");
                break;
            }
            Student find=getStudentById(students,idIn);
            if(find!=null){
                System.out.println(find.getName());
            }
            else
                System.out.println("未查到！");
        }
    }


    // 输入 /** 再回车就出来了
    /**
     * 根据学号从集合中查找
     * @param students
     * @param Id
     * @return st
     */
    public static Student getStudentById(ArrayList<Student>students,String Id){
        Student st = null;
        for (int i = 0; i < students.size(); i++) {
            if(Id.equals(students.get(i).getIdnumber())){
                st=students.get(i);
                break;
            }
        }
        return st;
    }
}
