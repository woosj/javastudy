package javaDay25.com.swing;

import java.awt.*;

import javax.swing.*;

public class GraphicEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("�� �Ҽ��ִ�!!");
		
		f.setPreferredSize(new Dimension(500, 400));
		f.setLocation(900, 200);

		Container contentPane = f.getContentPane();
		
		DrawingPanel drawPanel = new DrawingPanel();
		contentPane.add(drawPanel,BorderLayout.CENTER);
		
		JPanel controlPanel = new JPanel();
		
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		
		JButton button = new JButton("�׷��� �׸���");
		
		controlPanel.add(new JLabel("��������"));
		controlPanel.add(text1);
		
		controlPanel.add(new JLabel("��������"));
		controlPanel.add(text2);
		
		controlPanel.add(new JLabel("��������"));
		controlPanel.add(text3);
		
		controlPanel.add(button);
		
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		
		button.addActionListener(new DrawActionListener(text1,text2,text3,drawPanel));
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
		
	}

}
