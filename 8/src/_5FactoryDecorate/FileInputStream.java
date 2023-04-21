package _5FactoryDecorate;

import java.util.Arrays;

/**
 * 实现子类，原始类
 */
public class FileInputStream extends InputStream{
    @Override
    public int read() {
        System.out.println("低性能方法读取字节a");
        return 97;
    }

    @Override
    public int read(byte[] buffer) {
        buffer[0]=97;
        buffer[1]=98;
        buffer[2]=99;
        System.out.println("低性能方法读取字节数组a"+ Arrays.toString(buffer));
        return buffer.length;
    }
}
