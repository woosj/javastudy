package javaDay23.awt;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutEx extends JFrame {
	
	private JButton bt1, bt2, bt3, bt4, bt5;
	
	public BoxLayoutEx() {
		// TODO Auto-generated constructor stub
		
		setTitle("박스 레이아웃");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료
		
		setSize(400, 400);
		
		Container cp = getContentPane();
		//cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));	//BoxLayout.X_AXIS : X축, 수평으로 나열
		//cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
		cp.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);	//오른쪽정렬
		cp.setLayout(new BoxLayout(cp, BoxLayout.PAGE_AXIS));
		//cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
		
		bt1 = new JButton("버튼1");
		bt2 = new JButton("버튼2버튼2");
		bt3 = new JButton("버튼3버튼3버튼3");
		bt4 = new JButton("버튼4버튼4버튼4버튼4");
		bt5 = new JButton("버튼5버튼5버튼5버튼5버튼5");
		
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
