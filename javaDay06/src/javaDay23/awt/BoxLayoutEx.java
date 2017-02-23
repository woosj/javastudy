package javaDay23.awt;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutEx extends JFrame {
	
	private JButton bt1, bt2, bt3, bt4, bt5;
	
	public BoxLayoutEx() {
		// TODO Auto-generated constructor stub
		
		setTitle("�ڽ� ���̾ƿ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����
		
		setSize(400, 400);
		
		Container cp = getContentPane();
		//cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));	//BoxLayout.X_AXIS : X��, �������� ����
		//cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
		cp.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);	//����������
		cp.setLayout(new BoxLayout(cp, BoxLayout.PAGE_AXIS));
		//cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
		
		bt1 = new JButton("��ư1");
		bt2 = new JButton("��ư2��ư2");
		bt3 = new JButton("��ư3��ư3��ư3");
		bt4 = new JButton("��ư4��ư4��ư4��ư4");
		bt5 = new JButton("��ư5��ư5��ư5��ư5��ư5");
		
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoxLayoutEx();
		
	}

}
