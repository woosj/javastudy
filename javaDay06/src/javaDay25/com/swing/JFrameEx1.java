package javaDay25.com.swing;

import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;


public class JFrameEx1 extends JFrame {
	
	
	public JFrameEx1() {
		// TODO Auto-generated constructor stub
		super("JFrame");
		
		JButton bt1 = new JButton("North");
		JButton bt2 = new JButton("South");
		
		Container con = getContentPane();//�����̳ʿ��� ������Ʈ�� ������
		con.add("North", bt1);//swing �� �̿�
		
		add("South",bt2);//�����ӿ� ����
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEx1();
	}

}
