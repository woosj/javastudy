package javaDay26;

import java.awt.*;
import javax.swing.*;

public class ImageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("이미지로딩");
		
		f.setPreferredSize(new Dimension(500, 400));
		f.setLocation(800, 200);
		
		Container contentPane = f.getContentPane();
		ImagePanel imagePanel = new ImagePanel();
		contentPane.add(imagePanel,BorderLayout.CENTER);
		
		JPanel controlPanel = new JPanel();
		JTextField text = new JTextField(30);
		JButton button = new JButton("이미지로딩");
		
		//테스트 필드와 버튼을 패널에 추가
		controlPanel.add(text);
		controlPanel.add(button);
		
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		button.addActionListener(new LoadActionListener(text, imagePanel));
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		

	}

}
