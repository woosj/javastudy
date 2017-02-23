package javaDay25.com.swing;

import java.awt.*;
import java.awt.event.*;
import javaDay23.awt.WinEvent;

public class FocusEventEx extends Frame implements FocusListener {
	
	private TextField[] tf = new TextField[3];
	
	public FocusEventEx() {
		// TODO Auto-generated constructor stub
		super("포커스 이벤드");
		
		setForm();
		
		setSize(300,200);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		
	}
	
	public void setForm(){
		
		setLayout(new BorderLayout());
		//setLayout(new GridLayout(3, 1));
		
		//라벨추가
		Panel p = new Panel(new GridLayout(3, 1));
		
		p.add(new Label("이름:"));
		p.add(new Label("전번:"));
		p.add(new Label("주소:"));
		p.setBackground(Color.cyan);
		add("West", p);
		
		//텍스트 필드 추가
		Panel p2 = new Panel(new GridLayout(3, 1));
		
		for(int i = 0; i < tf.length; i++){
			tf[i] = new TextField();
			p2.add(tf[i]);
			tf[i].addFocusListener(this);
		}
		
		add("Center", p2);
		
	}
	
	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource() == tf[1]){
			if(tf[0].getText().trim().length() == 0){
				tf[0].setText("");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				tf[0].requestFocus();
			}
		}
		
		if(arg0.getSource() == tf[2]){
			if(tf[1].getText().trim().length() == 0){
				tf[1].setText("");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				tf[1].requestFocus();
			}
		}

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FocusEventEx();
		
	}

}
