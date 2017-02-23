package javaDay26;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.applet.*;
import java.net.*;

public class PlayActionListener implements ActionListener {
	
	JTextField text;
	
	public PlayActionListener(JTextField text) {
		// TODO Auto-generated constructor stub
		this.text = text;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			File file = new File(text.getText());
			AudioClip audioClip = Applet.newAudioClip(file.toURL());
			audioClip.play();
			
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(text, "잘못된 파일명입니다.","에러메세지",JOptionPane.ERROR_MESSAGE);
		}
	}

}
