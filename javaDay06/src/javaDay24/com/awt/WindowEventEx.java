package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx extends Frame implements WindowListener {

	public WindowEventEx(){
		super("������ �̿� ������ ����");
		
		
		addWindowListener(this);
		setSize(300,200);
		setVisible(true);
		
		
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		//�����츦 ����
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		//�����ư�� ������ ����
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//�����찡 ������ ����
		// TODO Auto-generated method stub
		

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowEventEx();
	}

}
