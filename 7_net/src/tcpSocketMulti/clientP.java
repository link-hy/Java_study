package tcpSocketMulti;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class clientP {
    public static void main(String[] args) {
        System.out.println("***客户端***");
        Scanner scanner=new Scanner(System.in);
        try {
            Socket socket=new Socket("127.0.0.1",6666);
            OutputStream os= socket.getOutputStream();//字节输出流，用于发送消息
            PrintStream ps=new PrintStream(os);//字节流-》包装为打印流
            while(true) {
                String s=scanner.nextLine();
                ps.println(s);
                ps.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
