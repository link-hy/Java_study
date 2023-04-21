package MapDemo1;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Student, List<String>> maps1=new HashMap<>();

        Student s1=new Student(1011,"李白",19);
        Student s2=new Student(1015,"王维",18);
        Student s3=new Student(1012,"李贺",22);
        Student s4=new Student(1021,"王勃",17);
        List<String> sels=new ArrayList<>();
        Collections.addAll(sels,"A","C");
        maps1.put(s1,sels);
        List<String> sels2=new ArrayList<>();
        Collections.addAll(sels2,"B","C");
        maps1.put(s2,sels2);
        List<String> sels3=new ArrayList<>();
        Collections.addAll(sels3,"A","B");
        maps1.put(s3,sels3);
        List<String> sels4=new ArrayList<>();
        Collections.addAll(sels4,"A","D");
        maps1.put(s4,sels4);
        System.out.println(maps1);

        //统计每个景点选择的人数
        Map<String,Integer> infos=new HashMap<>();
            //记录全部选择的景点
        Collection<List<String>> values=maps1.values();

        for (List<String> value : values) {
            for (String s : value) {
                if(infos.containsKey(s))
                    infos.put(s,infos.get(s)+1);
                else
                    infos.put(s,1);
            }
        }
        System.out.println(infos);
    }
}

class Student{
    private int Id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
