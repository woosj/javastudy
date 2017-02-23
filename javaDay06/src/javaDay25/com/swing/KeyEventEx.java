package javaDay25.com.swing;

import java.awt.event.*;

import javaDay23.awt.WinEvent;

import java.awt.*;

public class KeyEventEx extends Frame implements KeyListener {
	
	Label la = new Label("주민번호:", Label.RIGHT);
	Label la1 = new Label("-", Label.CENTER);
	
	TextField jumin1 = new TextField(10);
	TextField jumin2 = new TextField(10);
	
	Button bt = new Button("확인");
	
	
	public KeyEventEx() {
		// TODO Auto-generated constructor stub
		super("키이벤트");
		
		setForm();
		
		setSize(400,100);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);
		bt.addKeyListener(this);
	}
	
	public void setForm(){
		
		setLayout(new GridLayout(2,1));
		
		
		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add(la);
		p.add(jumin1);
		p.add(la1);
		p.add(jumin2);
		p.add(bt);
		
		add(p);
		
		/*Panel p2 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(bt);
		add(p2);*/
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bt){
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jumin1){
			if(jumin1.getText().length() >= 6 ){
				jumin2.requestFocus();
			}
		}
		
		if(e.getSource() == jumin2){
			if(jumin2.getText().length() >= 7 ){
				bt.requestFocus();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventEx();
	}

}
