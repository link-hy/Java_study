package udpDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class serverP {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端+++");
        //对象
        DatagramSocket socket=new DatagramSocket(8888);
        for (int i = 0; i < 5; i++) {
            //内容
            byte[] buff = new byte[1024 * 10];
            DatagramPacket packet = new DatagramPacket(buff, buff.length);
            //接收
            socket.receive(packet);
            //数据
            int len = packet.getLength();//获取收到内容的长度
            String rs = new String(buff, 0, len);
            System.out.println("收到 " +packet.getSocketAddress().toString()+":"+ rs);
        }
        socket.close();
    }
}
