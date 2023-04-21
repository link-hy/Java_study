package cc1_static;

public class Student {
    public static int nums=0;
    private String name;
    private String Id;

    public Student(String name, String id) {
        this.name = name;
        Id = id;
        nums+=1;
    }

    public static int getNums(){
        System.out.println(nums);
        //this.Id="000";
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(nums);
        System.out.println(Student.nums);
        getNums();

        Student s1=new Student("AA","10001");
        System.out.println(Student.nums);
        System.out.println(s1.nums);
        getNums();
        System.out.println(nums);
    }
}
