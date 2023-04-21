package c7_ArrayList;

public class Student {
    private String idnumber;
    private String name;
    private int age;
    private String classname;

    public Student(String idnumber, String name, int age, String classname) {
        this.idnumber = idnumber;
        this.name = name;
        this.age = age;
        this.classname = classname;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassname() {
        return classname;
    }
}
