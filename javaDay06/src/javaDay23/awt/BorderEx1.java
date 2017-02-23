package javaDay23.awt;

import java.awt.*;

public class BorderEx1 extends Frame {

	Label a, b, c, d, e;
	
	public BorderEx1() {
		// TODO Auto-generated constructor stub
		super("Border layout");
		
		setLayout(new BorderLayout());
		
		a = new Label("North",Label.CENTER);
		b = new Label("Sount",Label.CENTER);
		c = new Label("West",Label.CENTER);
		d = new Label("East",Label.CENTER);
		e = new Label("Center",Label.CENTER);
		
		setBackground(Color.gray);
		a.setBackground(Color.GREEN);
		b.setBackground(Color.red);
		c.setBackground(Color.magenta);
		d.setBackground(Color.WHITE);
		e.setBackground(Color.orange);
		
		a.setForeground(Color.DARK_GRAY);
		b.setForeground(Color.DARK_GRAY);
		c.setForeground(Color.DARK_GRAY);
		d.setForeground(Color.DARK_GRAY);
		e.setForeground(Color.DARK_GRAY);
		
		add("North",a);
		add("South",b);
		//add("West",c);
		add(c, BorderLayout.WEST);
		add("East",d);
		add("Center",e);
		
		//팝업 위치 조정
		setLocation(300, 300);
		
		//크기변경가능 처음 크기가 잡혀있다.
		//pack();
		
		
		setSize(300, 200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderEx1();
	}

}
