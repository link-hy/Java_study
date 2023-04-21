package tcpSocketMulti;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
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
            //从socket管道得到字节输入流
            InputStream is = socket.getInputStream();
            //包装为缓冲字符输入流，以便进行消息接收
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //按行读取消息
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + " " + msg);
            }
        }catch (Exception e){
            System.out.println(socket.getRemoteSocketAddress()+"下线了~");
//            e.printStackTrace();
        }
    }
}
