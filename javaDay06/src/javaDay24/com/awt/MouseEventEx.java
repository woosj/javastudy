package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.*;

import javaDay23.awt.WinEvent;

public class MouseEventEx extends Frame implements MouseListener {
	
	private Button bt = new Button("확인");
	private Button bt1 = new Button("취소");
	
	
	public MouseEventEx() {
		// TODO Auto-generated constructor stub
		super("마우스이벤트");
		
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
			System.out.println("확인 버튼입니다.");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bt1){
			System.out.println("취소 버튼입니다.");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bt1){
			System.out.println("취소 버튼을 눌렀다 놓았다.");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//마우스 버튼 위로 올라가면
		if(e.getSource() == bt){
			System.out.println("확인 버튼위에 있다.");
		}else{
			System.out.println("취소 버튼위에 있다.");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//버튼위로 올라갔다가 나오는 순간
		if(e.getSource() == bt){
			System.out.println("확인 버튼을 벗어났다.");
		}else{
			System.out.println("취소 버튼을 벗어났다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventEx();
	}

}
