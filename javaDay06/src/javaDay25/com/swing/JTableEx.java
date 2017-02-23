package javaDay25.com.swing;

import java.awt.*;
import javax.swing.*;

public class JTableEx {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("학생정보");
		f.setPreferredSize(new Dimension(400, 300));
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
		
		//테이블 생성
		JTable table = new JTable(data,colNames);
		
		//스크롤패널 생성후 테이블 얹힌다.
		JScrollPane scrollPane = new JScrollPane(table);
		
		//컴포넌트에 스크롤패널 얹힌다.
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//출력버튼
		JButton bt = new JButton("출력");
		contentPane.add(bt,BorderLayout.SOUTH);
		bt.addActionListener(new PrintActionListener(table));
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
	}

}
