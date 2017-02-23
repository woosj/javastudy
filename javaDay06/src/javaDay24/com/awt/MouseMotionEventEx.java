package javaDay24.com.awt;

import java.awt.*;
import java.awt.event.*;

import javaDay23.awt.WinEvent;

public class MouseMotionEventEx extends Frame implements MouseMotionListener {
	
	
	public MouseMotionEventEx() {
		// TODO Auto-generated constructor stub
		
		setSize(300,200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		addMouseMotionListener(this);
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this){
			System.out.println("X : " + e.getX() + ", Y : " + e.getY());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseMotionEventEx();
	}

}
