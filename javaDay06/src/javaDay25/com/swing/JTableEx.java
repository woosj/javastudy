package javaDay25.com.swing;

import java.awt.*;
import javax.swing.*;

public class JTableEx {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("�л�����");
		f.setPreferredSize(new Dimension(400, 300));
		f.setLocation(900, 200);
		
		//������Ʈ
		Container contentPane = f.getContentPane();
		
		//�÷��̸�
		String colNames[] = {"�̸�","����","����"};
		
		//���̺� ����
		Object data[][] = {
				{"����",10,'��'},
				{"����",20,'��'},
				{"����",30,'��'},
				{"Ʋ��",40,'��'},
				{"�ڰ�",50,'��'},
				{"�ʹ�",60,'��'}
		};
		
		//���̺� ����
		JTable table = new JTable(data,colNames);
		
		//��ũ���г� ������ ���̺� ������.
		JScrollPane scrollPane = new JScrollPane(table);
		
		//������Ʈ�� ��ũ���г� ������.
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//��¹�ư
		JButton bt = new JButton("���");
		contentPane.add(bt,BorderLayout.SOUTH);
		bt.addActionListener(new PrintActionListener(table));
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
	}

}
