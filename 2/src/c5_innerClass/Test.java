package c5_innerClass;

public class Test {
    /**
     * 内部类创建对象方法  外部类.内部类  类=new 外部类().new 内部类()
     */
    public static void main(String[] args) {
        outer.Inner inner=new outer().new Inner("黑马",23);

        outer.Inner.setSchoolName("IT黑马");

        inner.show();
    }
}
