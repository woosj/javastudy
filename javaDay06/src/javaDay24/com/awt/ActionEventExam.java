package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.*;
import javaDay23.awt.WinEvent;

public class ActionEventExam extends Frame {
	
	private Button bt = new Button("��ư");
	
	public ActionEventExam() {
		// TODO Auto-generated constructor stub
		super("this �� ó�����");
		
		setLayout(new BorderLayout());
		add(bt);
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("�͸��Լ�");
			}
		});
		
		setSize(300,200);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventExam();
	}

}
