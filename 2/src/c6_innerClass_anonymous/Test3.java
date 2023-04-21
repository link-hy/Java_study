package c6_innerClass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        // 创建窗口
        JFrame win=new JFrame("登录界面");
        JPanel panel=new JPanel();
        JPanel panel1=new JPanel();
        win.add(panel);
        win.add(panel1);
        final int[] tim = {1};
        //按钮对象
        JButton btn=new JButton("旋转");
        JButton btn1=new JButton("登录");
        //按钮监听器
        btn.addActionListener(new ActionListener() {//匿名内部类
            @Override
            public void actionPerformed(ActionEvent e) {
                tim[0] +=1;
                if(tim[0]%2==0)
                    win.setSize(500,300);
                else
                    win.setSize(300,500);
                JOptionPane.showMessageDialog(win,"已旋转~");
            }
        });
        btn1.addActionListener(e -> JOptionPane.showMessageDialog(win,"登录~_~"));
        // 把按钮对象加到窗口展示
        panel.add(btn);
        panel1.add(btn1);
        win.setSize(300,500);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
