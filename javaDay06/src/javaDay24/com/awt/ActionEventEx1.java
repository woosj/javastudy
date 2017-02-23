package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javaDay23.awt.WinEvent;

public class ActionEventEx1 extends Frame implements ActionListener {
	
	private Button bt = new Button("�� ������!!!");
	private Button bt2 = new Button("����!!!");
	
	public ActionEventEx1() {
		// TODO Auto-generated constructor stub
		super("��ư�̺�Ʈ");
		
		setLayout(new FlowLayout());
		add(bt);
		add(bt2);
		
		bt.addActionListener(this);
		bt2.addActionListener(this);
		
		setSize(300,200);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bt ){
			System.out.println("�� ������!!");
			
		}else{
			System.out.println("�����ٴ�.");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventEx1();
		
	}

}
