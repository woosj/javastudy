package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.*;

public class WindowEventEx3 extends Frame {
	
	
	public WindowEventEx3() {
		// TODO Auto-generated constructor stub
		super("�͸�Ŭ������ �̿��� ������ ����");
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		setSize(300, 200);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new WindowEventEx3();
		
	}

}
