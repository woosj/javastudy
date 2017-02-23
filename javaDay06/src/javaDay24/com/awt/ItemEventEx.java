package javaDay24.com.awt;


import java.awt.*;
import java.awt.event.*;

import javaDay23.awt.WinEvent;

public class ItemEventEx extends Frame implements ItemListener, ActionListener {
	
	private Label lb = new Label("혈액형 :",Label.RIGHT);
	private Label lb1 = new Label("생년원일 :",Label.RIGHT);
	private Label lb2 = new Label("지역 :",Label.RIGHT);
	
	private TextField bType = new TextField();	//혈액형 입력항목
	
	private Choice blood = new Choice();	//혈액형 선택 박스
	
	private TextField birth = new TextField();	//생년월이 입력항목
	
	private Choice year = new Choice();	//년도 선택 박스
	private Choice month = new Choice();	//월 선택박스
	private Choice day = new Choice();	//일 선택박스
	
	private TextField local = new TextField();	//지역 입력항목
	
	private List li = new List(3,false);	//지역 리스트
	
	private Button end = new Button("끝내기");	//끝내기 버튼
	
	public ItemEventEx() {
		// TODO Auto-generated constructor stub
		
		super("항목 이벤트");
		
		setForm();
		bType.setEditable(false);//편집불가
		birth.setEditable(false);//편집불가
		local.setEditable(false);//편집불가
		
		blood.addItemListener(this);//이벤트 걸어줌
		day.addItemListener(this);
		li.addActionListener(this);
		li.addItemListener(this);
		end.addActionListener(this);
		
		setSize(600,600);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		
	}
	
	public void setForm(){
		setLayout(new GridLayout(2, 1));
		
		Panel p = new Panel(new BorderLayout());	//상단 전체 패널
		
		Panel p1 = new Panel(new GridLayout(3, 1));	//라벨 패널
		p1.add(lb);	//혈액형 라벨
		p1.add(lb1);	//생년월일 라벨
		p1.add(lb2);	//지역 라벨
		
		p.add("West", p1);//전체 패널에 왼쪽 부분에 라벨을 넣어준다.
		
		Panel p2 = new Panel(new GridLayout(3, 1));	//텍스트 필드 패널
		p2.add(bType);
		p2.add(birth);
		p2.add(local);
		p.add("Center", p2);
		
		Panel p3 = new Panel(new GridLayout(4, 1));	//선택 필드 패널
		//혈액형 값을 선택필드에 추가
		blood.add("A형");
		blood.add("B형");
		blood.add("AB형");
		blood.add("O형");
		
		
		//혈액형을 패널에 추가
		p3.add(blood);
		
		//년도를 1900년도부터 2017년까지 넣어준다.
		for(int i = 1900; i < 2018; i++){
			year.add(String.valueOf(i));
		}
		
		//년도를 패널에 추가
		p3.add(year);
		
		for(int i = 1; i <= 12; i++){
			month.add(String.valueOf(i));
		}
		p3.add(month);
		
		for(int i = 1; i <= 31; i++){
			day.add(String.valueOf(i));
		}
		
		p3.add(day);
		p.add("East", p3);
		
		add(p);
		
		Panel p4 = new Panel(new BorderLayout());	//하단 전체 패널
		
		li.add("서울");
		li.add("경기");
		li.add("그외");
		
		p4.add("Center",li);//지역 리스트
		
		
		p4.add("East", end);//버튼
		
		add(p4);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//액션에 대해서
		if(e.getSource() == li){
			int i = li.getSelectedIndex();
			li.remove(i);
		}
		if(e.getSource() == end){
			System.exit(0);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//아이템에 대한
		if(e.getSource() == blood){
			bType.setText(blood.getSelectedItem());
		}
		if(e.getSource() == day){
			birth.setText(year.getSelectedItem() + "/" + month.getSelectedItem() + "/" + day.getSelectedItem());
		}
		if(e.getSource() == li){
			local.setText(li.getSelectedItem());
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemEventEx();
	}

}
