package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.*;

public class WindowEventEx2 extends Frame {
	
	//����Ŭ���� �̿�
	public WindowEventEx2() {
		// TODO Auto-generated constructor stub
		super("����Ŭ������ �̿��ؼ� ������ ����");
		
		addWindowListener(new WinEventExam());
		setSize(300,200);
		setVisible(true);
		
	}
	
	class WinEventExam extends WindowAdapter {
		
		public void windowClosing(WindowEvent arg0){
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowEventEx2();//
	}

}
