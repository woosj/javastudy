package javaDay24.com.awt;

import java.awt.*;

import javaDay23.awt.WinEvent;

public class FileDialogEx extends Frame {

	FileDialog fd = new FileDialog(this, "���� ����", FileDialog.SAVE);//mode : save, load
	 
	
	public FileDialogEx() {
		
		super("���� ���̾�α�");
		
		setSize(300,200);
		setVisible(true);
		
		fd.setVisible(true);
		
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileDialogEx();
	}

}
