package javaDay26;

import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel {
	
	Image image;
	Toolkit toolkit = getToolkit();
	
	void setPath(String path){
		
		image = toolkit.getImage(path);
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		g.clearRect(0, 0, getWidth(), getHeight());
		
		if(image != null){
			g.drawImage(image, 0, 0, this);
		}
		
	}
}
