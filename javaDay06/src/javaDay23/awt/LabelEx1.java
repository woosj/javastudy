package javaDay23.awt;

import java.awt.*;

public class LabelEx1 extends Frame {
	
	Label la1, la2, la3, la4, la5;
	
	Font f1, f2;
	
	public LabelEx1() {
		// TODO Auto-generated constructor stub
		super("라벨");
		
		 f1 = new Font("굴림채",Font.BOLD,14);
		 f2 = new Font("바탕채",Font.ITALIC,24);
		 
		 la1 = new Label("홍길동");
		 la2 = new Label("축지법",Label.CENTER);
		 la3 = new Label("범죄자",Label.LEFT);
		 la4 = new Label("잡아라",Label.RIGHT);
		 la5 = new Label("첸스",Label.RIGHT);
		 
		 setLayout(new GridLayout(4,1));	//레이아웃 관리자에 의해 그리드 레이아웃 생성
		 
		 //라벨에 폰트 적용
		 la1.setFont(f1);
		 la2.setFont(f2);
		 la3.setFont(f1);
		 la4.setFont(f2);
		 
		 la1.setBackground(Color.blue);
		 la2.setBackground(Color.CYAN);
		 la3.setBackground(Color.gray);
		 la4.setBackground(Color.red);
		 
		 //레이아웃에 추가
		 add(la1);
		 add(la2);
		 add(la3);
		 add(la4);
		 add(la4);
		 //add(la5);
		 
		 //프레임 크기 설정
		 setSize(400, 300);
		 setVisible(true);
		 WinEvent event = new WinEvent();
		 addWindowListener(event);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx1();
	}

}
