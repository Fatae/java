package test;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
public class JFarm extends JFrame {
    public JFarm(){
        super("spc");
        Container c=getContentPane();//返回当前窗格的容器
        c.setLayout(new FlowLayout(FlowLayout.LEFT));//setLayout设置当前窗口的布局格式
        //FlowLayout是一个流式布局，并且左对齐
        String[] s={"1","2","3"};
        ImageIcon[] ic={null,new ImageIcon("1.jpg"),new ImageIcon("1.jpg")};
        //图像类型的数组用来存储图像

    }


}
