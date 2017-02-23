package javaDay25.com.swing;

import java.awt.*;
import javax.swing.*;


public class GraphicEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("내가이긴다");
		
		f.setLocation(900, 200);
		f.setPreferredSize(new Dimension(400, 300));
		
		Container contentPane = f.getContentPane();
		
		CarDrawingPanel drawingPanel = new CarDrawingPanel();
		
		contentPane.add(drawingPanel);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
		
		
	}

}
