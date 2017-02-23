package javaDay23.awt;

import java.awt.*;

public class FrameEx2 extends Frame {

	public FrameEx2() {
		// TODO Auto-generated constructor stub
		super("«¡∑π¿”");
		setSize(300, 200);
		setVisible(true);
		WinEvent w = new WinEvent();
		addWindowListener(w);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrameEx2();
		
	}

}
