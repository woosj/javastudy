package javaDay26;

import javax.swing.*;
import java.awt.event.*;

public class LoadActionListener implements ActionListener {

	JTextField text;
	ImagePanel imagePanel;
	
	public LoadActionListener(JTextField text,ImagePanel imagePanel) {
		// TODO Auto-generated constructor stub
		this.text = text;
		this.imagePanel = imagePanel;
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		imagePanel.setPath(text.getText());
		imagePanel.repaint();
		

	}

}
