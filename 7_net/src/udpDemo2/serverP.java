package udpDemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class serverP {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端+++");

        Thread t=new myThread();//服务端接收线程
        t.start();

        //发送 对象
        DatagramSocket socketp =new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        while(true) {
            //内容
            String msg=sc.nextLine();

            byte[] buff = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buff, buff.length,
                    InetAddress.getLocalHost(), 8888);
            //接收
            socketp.send(packet);
            if("再见".equals(msg)) {
                socketp.close();
                System.out.println("断开连接~");
                break;
            }
        }
    }
}

/**
 * 接收线程
 */
class myThread extends Thread{
    @Override
    public void run() {
        //对象
        DatagramSocket socket= null;
        try {
            socket = new DatagramSocket(8889);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        while (true) {
            //内容
            byte[] buff = new byte[1024 * 10];
            DatagramPacket packet = new DatagramPacket(buff, buff.length);
            //接收
            try {
                socket.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //数据
            int len = packet.getLength();//获取收到内容的长度
            String rs = new String(buff, 0, len);
            System.out.println("收到 " +packet.getSocketAddress().toString()+
                    ":"+ rs);
            if("再见".equals(rs)) {
                socket.close();
                break;
            }
        }
    }
}