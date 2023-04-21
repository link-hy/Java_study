package tcpBS;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//处理进来的socket管道消息读取
public class serverReaderThread extends Thread {
    private Socket socket;
    public serverReaderThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            PrintStream ps=new PrintStream(socket.getOutputStream());
            //HTTP
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();

            ps.println("<span>hello </span>");
            ps.close();
        }catch (Exception e){
            System.out.println(socket.getRemoteSocketAddress()+"下线了~");
//            e.printStackTrace();
        }
    }
}
