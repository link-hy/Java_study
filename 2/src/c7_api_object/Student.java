package c7_api_object;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String sex;

    public Student(){}
    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    /**
     * 重写equals
     */
    @Override
    public boolean equals(Object o) {
        if(o instanceof Student){
            Student s2=(Student) o;
            if(this.name.equals(s2.name)&&this.age==s2.age&&this.sex.equals(s2.sex))
                return true;
            else
                return false;
        }
        else
            return false;
    }

}
