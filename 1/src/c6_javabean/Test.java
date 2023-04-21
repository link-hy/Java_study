package c6_javabean;

public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("abc");
        u1.setHeight(190);
        u1.setSalary(10000);
        System.out.println(u1.getName()+" "+u1.getHeight()+" "+u1.getSalary());

        User u2=new User("efg",199,199999);
        System.out.println(u2.getName()+" "+u2.getHeight()+" "+u2.getSalary());

        /*int s[]=new int[5];
        for (int i = 0; i < s.length; i++) {//快捷键 ：s.fori
            s[i]=i;
        }*/
    }
}
