package javaDay27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Projectt extends JFrame implements ActionListener, ItemListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JLabel lb1,lb2;
	JLabel jl1;
	
	JTextField t1, t2, t3, t4;
	JTextArea ta1, ta2, ta3;
	
	JPanel p1, p2, p3, p4, p5, p6, p7, p8;
	JPanel jp1;
	
	JScrollPane sp1, sp2, sp3;
	JButton b1, b2;
	
	JMenu m1, m2, m3;
	
	//1.수입 2.지출 3.합계
	static int abc1 =0, abc2 =0, abc3 =0;
	
	JFileChooser filesv = new JFileChooser();
	File jfile = null;
	
	ImageIcon pp;
	
	JComboBox c1, c2;
	
	JMenuBar mb;
	
	JMenuItem save, list, open, info;
	
	String a = "월급";
	String b = "식비";
	//수입
	String c = "";
	String d = "";
	//지출
	String e = "";
	String f = "";
	String g = "";
	
	public Projectt() {
		// TODO Auto-generated constructor stub
		super("가계부");
		
		//메뉴바 설정
		mb = new JMenuBar();
		m1 = new JMenu("기능(F)");
		
		save = new JMenuItem("저장하기(s)");
		m1.add(save);
		
		list = new JMenuItem("불러오기(L)");
		m1.add(list);
		
		m2 = new JMenu("계산기(G)");
		
		open = new JMenuItem("실행하기(O)");
		m2.add(open);
		
		m3 = new JMenu("도움말(H)");
		info = new JMenuItem("정보(I)");
		m3.add(info);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		//패널 구성
		p2 = new JPanel();	//화면왼쪽패널
		p2.setLayout(new GridLayout(1, 2));	//그리드로 구성
		
		p3 = new JPanel();
		p4 = new JPanel();
		p3.setLayout(new BorderLayout());
		
		
		l1 = new JLabel("금액");	//수입입력 항목 라벨
		l2 = new JLabel("금액");	//지출입력 항목 라벨
		
		t1 = new JTextField(10);	//수입 입력 텍스트박스
		t2 = new JTextField(10);	//지출 입력 텍스트박스
		
		l3 = new JLabel("MEMO");	//수입 메모입력 항목 라벨
		l4 = new JLabel("MEMO");	//지출 메모입력 항목 라벨
		
		t3 = new JTextField(20);	//수입 메모입력 텍스트박스
		t4 = new JTextField(20);	//지출 메모입력 텍스트박스
		
		l5 = new JLabel("수입");
		l6 = new JLabel("지출");
		
		b1 = new JButton("INCOME");
		b2 = new JButton("EXPENSE");
		
		p1 = new JPanel(new FlowLayout());	
		
		p5 = new JPanel(new GridLayout(1, 2));
		p6 = new JPanel(new GridLayout(1, 2));
		p7 = new JPanel(new BorderLayout());
		
		l8 = new JLabel("현재잔액:");
		l9 = new JLabel("0원");
		
		pp = new ImageIcon(new ImageIcon("C:/Koala.jpg").getImage().getScaledInstance(300, 180, Image.SCALE_DEFAULT));
		
		l7 = new JLabel(pp);
		
		p8 = new JPanel(new BorderLayout());
		ta3 = new JTextArea();
		
		sp3 = new JScrollPane(ta3);
		p8.add(sp3, new BorderLayout().CENTER);
		
		c1 = new JComboBox();	//수입
		
		c1.addItem("월급");
		c1.addItem("용돈");
		c1.addItem("기타수입");
		
		c2 = new JComboBox();	//지출
		
		c2.addItem("식비");
		c2.addItem("교통비");
		c2.addItem("저축");
		c2.addItem("주거비");
		c2.addItem("의료비");
		c2.addItem("경조사비");
		c2.addItem("데이트비용");
		c2.addItem("문화생활");
		c2.addItem("기타지출");


		p1.add(l5);
		p1.add(c1);
		p1.add(l1);
		p1.add(t1);
		p1.add(l3);
		p1.add(t3);
		
		p1.add(l6);
		p1.add(c2);
		p1.add(l2);
		p1.add(t2);
		p1.add(l4);
		p1.add(t4);
		
		p4.add(b1);
		p4.add(b2);
		
		lb1 = new JLabel("INCOME");
		lb2 = new JLabel("EXPENSE");
		
		p3.add(p1, new BorderLayout().CENTER);
		p3.add(p4, new BorderLayout().SOUTH);
		p3.add(l7, new BorderLayout().NORTH);
		
		ta1 = new JTextArea("");
		sp1 = new JScrollPane(ta1);
		
		ta2 = new JTextArea("");
		sp2 = new JScrollPane(ta2);
		
		p5.add(sp1);
		p5.add(sp2);
		
		p6.add(l8);
		p6.add(l9);
		
		p7.add(p5, new BorderLayout().CENTER);
		p7.add(p6, new BorderLayout().SOUTH);
		
		p2.add(p3);
		p2.add(p7);
		
		p8.setVisible(true);
		p8.setSize(400,300);
		
		getContentPane().add(p2, new BorderLayout().CENTER);
		getContentPane().add(mb, new BorderLayout().NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		c1.addItemListener(this);	//셀렉트박스
		c2.addItemListener(this);	//셀렉트박스
		
		list.addActionListener(this);
		save.addActionListener(this);
		info.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		//수입
		if( o == b1 ){
			c = t1.getText();
			d = t3.getText();
				
			abc1 = abc1 + Integer.parseInt(c);
					
			ta1.setText(ta1.getText() + "\n" + a + " " + c + "원" + d + "\n");
			
			abc3 = abc1 - abc2;
					
			l9.setText(Integer.toString(abc3) + "원");
		}
		
		/*
		//계산하기
		if( o == save ){
					
		}*/
		//저장하기
		if( o == save ){
			fileSave();
		}
				
		//목록
		if( o == list ){
			fileOpen();			
		}
				
		//정보
		if( o == info ){
			help();	
		}
				
		//지출
		if( o == b2 ){
			f = t2.getText();
			g = t4.getText();
					
			abc2 = abc2 + Integer.parseInt(f);
				
			ta2.setText(ta2.getText() + "\n" + b + " " + f + "원" + g + "\n");
					
			abc3 = abc1 - abc2;
				
			l9.setText(Integer.toString(abc3) + "원");
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		
		//수입
		if( o == c1 ){
			if( e.getStateChange() == ItemEvent.SELECTED ){
				
				a = (String)c1.getSelectedItem();
				
			}
		}
		
		//지출
		if( o == c2 ){
			if( e.getStateChange() == ItemEvent.SELECTED ){
				
				b = (String)c2.getSelectedItem();
				
			}
		}
	}
	
	
	//파일 저장하기
	public void fileSave(){
		
		if(filesv.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
			File file = filesv.getSelectedFile();
			
			try {
				save(file);
				jfile = file;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
		}
		
	}
	
	//파일 불러오기
	public void fileOpen(){
		if(filesv.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
			File file = filesv.getSelectedFile();
			
			try {
				list(file);
				jfile = file;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
		}
	}
	
	//내역 저장하기
	public void save(File file) throws IOException {
		
		BufferedWriter wBuffer = new BufferedWriter(new FileWriter(file));
		
		wBuffer.write(" 수 입 \n\n" + ta1.getText() + "\n\n\n 지 출 \n\n" + ta2.getText() + "\n\n\n 현 재 잔 액 \n\n" + Integer.toString(abc3) + "원");
		
		wBuffer.close();
		
	}
	
	//내역 불러오기
	public void list(File file) throws IOException {
		int readn;
		char[] buf = new char[3000];
		BufferedReader buff = new BufferedReader(new FileReader(file));
		StringBuffer read = new StringBuffer();
		
		while( (readn = buff.read(buf)) != -1){
			read.append(buf, 0, readn);
		}
		
		buff.close();
		
		pay aaa = new pay();
		aaa.ta11.setText(read.toString());
	}
	
	//도움말
	public void help(){
		JOptionPane.showMessageDialog(Projectt.this, "(c)Copyright bj park and others 2017.02.01" + "All rights reserved", "에이콘 가계부",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Projectt();
	}

}

class pay extends JFrame {
	JTextArea ta11;
	JScrollPane sp11;
	
	public pay() {
		ta11 = new JTextArea("");
		sp11 = new JScrollPane(ta11);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(sp11, new BorderLayout().CENTER);
		setTitle("내열");
		
		setLocation(400,100);
		setSize(600,400);
		setVisible(true);
	}
	
}
