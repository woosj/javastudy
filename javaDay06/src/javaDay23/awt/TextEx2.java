package javaDay23.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEx2 extends Frame implements ActionListener {

	private TextField tf = new TextField(10);
	
	public TextEx2() {
		// TODO Auto-generated constructor stub
		super("텍스트 이벤트");

		setLayout(new FlowLayout());
		add(tf);
		
		setSize(400, 400);
		setVisible(true);
		
		tf.addActionListener(this);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//이벤트 실행 메서드
		
		if(e.getSource() == tf){
			String imsi = tf.getText();
			System.out.println("메세지:" + imsi);
			tf.setText("");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextEx2();
	}

}
