package _5FactoryDecorate;

/**
 * 装饰类  继承父类，包装原始类，增强功能
 */
public class BufferedInputStream extends InputStream{
    private InputStream is;
    public BufferedInputStream(InputStream is){
        this.is=is;
    }
    @Override
    public int read() {
        System.out.println("提供8kb缓冲区，提高性能！");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8kb缓冲区，提高性能！");
        return is.read(buffer);
    }
}
