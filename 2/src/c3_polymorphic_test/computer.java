package c3_polymorphic_test;

public class computer {
    private String name;

    public computer(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(name+" 开机了！");
    }
    /**
     * 安装USB
     */

    public void installUSB(USB usb){
        //多态
        usb.connection();
        //独有功能 强制转换
        if(usb instanceof mouse){
            mouse u1= (mouse) usb;
            u1.click();
        }
        else if(usb instanceof keyboard){
            keyboard u1=(keyboard) usb;
            u1.keydown();
        }

        usb.out();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
