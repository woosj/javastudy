package javaDay25.com.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JFrameEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("�л�����");
		f.setPreferredSize(new Dimension(600, 300));
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
		

		DefaultTableModel model = new DefaultTableModel(colNames,0);//table.getModel();
		
		//���̺� ����
		JTable table = new JTable(model);
		//JTable table = new JTable(data,colNames);
		
		//��ũ���г� ������ ���̺� ������.
		JScrollPane scrollPane = new JScrollPane(table);
		
		//������Ʈ�� ��ũ���г� ������.
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//��ư �г�
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		//��¹�ư
		JButton bt = new JButton("���");
		JButton bt2 = new JButton("�Է�");
		JButton bt3 = new JButton("����");
		
		//��
		JLabel lbName = new JLabel("�̸�");
		JLabel lbAge = new JLabel("����");
		JLabel lbSex = new JLabel("����");
		
		//�ؽ�Ʈ�ʵ� 
		JTextField tfName = new JTextField(10);
		JTextField tfAge = new JTextField(3);
		JTextField tfSex = new JTextField(2);
		
		p.add(lbName);
		p.add(tfName);
		
		p.add(lbAge);
		p.add(tfAge);
		
		p.add(lbSex);
		p.add(tfSex);
		
		p.add(bt);
		p.add(bt2);
		p.add(bt3);
		
		contentPane.add(p,BorderLayout.SOUTH);
		
		bt.addActionListener(new PrintActionListener(table));
		bt2.addActionListener(new AddActionListener(table, tfName, tfAge, tfSex));
		bt3.addActionListener(new RemoveActionListener(table));
				
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}

}
