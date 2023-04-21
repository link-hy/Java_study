package cc13_template;

public abstract class Student {
    public void Write(){
        System.out.println("写第一段~");
        //中间段每一个都自己写
        System.out.println(WritrMain());
        System.out.println("写最后一段~");
    }
    public abstract String WritrMain();
}
