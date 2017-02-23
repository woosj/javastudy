package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.*;

import javaDay23.awt.WinEvent;

public class MouseEventEx extends Frame implements MouseListener {
	
	private Button bt = new Button("Ȯ��");
	private Button bt1 = new Button("���");
	
	
	public MouseEventEx() {
		// TODO Auto-generated constructor stub
		super("���콺�̺�Ʈ");
		
		setLayout(new FlowLayout());
		add(bt);
		add(bt1);
		
		bt.addMouseListener(this);
		bt1.addMouseListener(this);
		
		
		setSize(300,200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bt){
			System.out.println("Ȯ�� ��ư�Դϴ�.");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bt1){
			System.out.println("��� ��ư�Դϴ�.");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bt1){
			System.out.println("��� ��ư�� ������ ���Ҵ�.");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//���콺 ��ư ���� �ö󰡸�
		if(e.getSource() == bt){
			System.out.println("Ȯ�� ��ư���� �ִ�.");
		}else{
			System.out.println("��� ��ư���� �ִ�.");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//��ư���� �ö󰬴ٰ� ������ ����
		if(e.getSource() == bt){
			System.out.println("Ȯ�� ��ư�� �����.");
		}else{
			System.out.println("��� ��ư�� �����.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventEx();
	}

}
