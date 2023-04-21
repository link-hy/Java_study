package tcpsocketDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class clientP {
    public static void main(String[] args) {
        System.out.println("***客户端***");
        try {
            Socket socket=new Socket("127.0.0.1",6666);
            OutputStream os= socket.getOutputStream();
            PrintStream ps=new PrintStream(os);
            while(true) {
                ps.println("hello~");
                ps.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
