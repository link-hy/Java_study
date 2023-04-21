package tcpsocketDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class serverP {
    public static void main(String[] args) {
        System.out.println("***服务端***");
        try {
            //注册端口
            ServerSocket serverSocket=new ServerSocket(6666);
            //
            Socket socket=serverSocket.accept();
            //
            InputStream is=socket.getInputStream();

            BufferedReader br=new BufferedReader(new InputStreamReader(is));

            String msg;
            while((msg=br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+" "+msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
