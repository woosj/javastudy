package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx extends Frame implements WindowListener {

	public WindowEventEx(){
		super("리스너 이용 윈도우 종료");
		
		
		addWindowListener(this);
		setSize(300,200);
		setVisible(true);
		
		
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		//윈도우를 열떄
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		//종료버튼을 누르고 나서
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//윈도우가 닫히고 나서
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
