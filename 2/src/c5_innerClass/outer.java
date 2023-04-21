package c5_innerClass;

public class outer {

    public static int a=100;
    private int b=2;

    public outer() {
    }

    public outer(int b) {
        this.b = b;
    }

    /**
     * 成员内部类
     */
    public class Inner{
        private String name;
        private int age;
        public static String schoolName;
        public int b=1;

        public void show(){
            System.out.println("姓名 "+name);
            System.out.println("年龄 "+age);
            System.out.println("学校 "+schoolName);
            System.out.println(a);

            //外部类实体，可以直接访问，因为有外部类对象
            //  如果和内部类成员同名用 外部类名.this.外部成员
            System.out.println(b);
            System.out.println(outer.this.b);
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

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
