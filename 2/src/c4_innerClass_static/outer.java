package c4_innerClass_static;

public class outer {

    public static int a=100;
    public int b;


    /**
     * 静态成员内部类
     */
    public static class Inner{
        private String name;
        private int age;
        public static String schoolName;

        public void show(){
            System.out.println("姓名 "+name);
            System.out.println("年龄 "+age);
            System.out.println("学校 "+schoolName);
            System.out.println(a);

            //外部类实体，通过对象访问，不能直接访问
            outer o=new outer();
            o.b=101;
            System.out.println(o.b);
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

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
