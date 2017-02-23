package javaDay26;

import java.awt.*;
import javax.swing.*;

public class AudioEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("오디오로딩");
		
		f.setPreferredSize(new Dimension(500, 80));
		f.setLocation(800, 200);
		
		Container contentPane = f.getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		
		JTextField text = new JTextField(30);
		JButton button = new JButton("플레이");
		
		//테스트 필드와 버튼을 패널에 추가
		contentPane.add(text);
		contentPane.add(button);
		
		button.addActionListener(new PlayActionListener(text));
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
		
	}

}
