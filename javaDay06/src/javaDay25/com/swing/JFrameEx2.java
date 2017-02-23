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
		JFrame f = new JFrame("학생정보");
		f.setPreferredSize(new Dimension(600, 300));
		f.setLocation(900, 200);
		
		//컴포넌트
		Container contentPane = f.getContentPane();
		
		//컬럼이름
		String colNames[] = {"이름","나이","성별"};
		
		//테이블 정보
		Object data[][] = {
				{"집에",10,'남'},
				{"가서",20,'여'},
				{"장판",30,'남'},
				{"틀고",40,'여'},
				{"자고",50,'남'},
				{"싶다",60,'여'}
		};
		

		DefaultTableModel model = new DefaultTableModel(colNames,0);//table.getModel();
		
		//테이블 생성
		JTable table = new JTable(model);
		//JTable table = new JTable(data,colNames);
		
		//스크롤패널 생성후 테이블 얹힌다.
		JScrollPane scrollPane = new JScrollPane(table);
		
		//컴포넌트에 스크롤패널 얹힌다.
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//버튼 패널
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		//출력버튼
		JButton bt = new JButton("출력");
		JButton bt2 = new JButton("입력");
		JButton bt3 = new JButton("삭제");
		
		//라벨
		JLabel lbName = new JLabel("이름");
		JLabel lbAge = new JLabel("나이");
		JLabel lbSex = new JLabel("성별");
		
		//텍스트필드 
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
