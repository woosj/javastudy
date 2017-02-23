package javaDay24.com.awt;

import java.awt.*;

import javaDay23.awt.WinEvent;

public class DialogEx01 extends Frame {
	
	private Dialog d = new Dialog(this,"조회서비스", false);
	
	private Label dlb = new Label("이름과 주민번호로 비밀번호 찾기");
	private Label dlb1 = new Label("이름:",Label.RIGHT);
	private Label dlb2 = new Label("주민번호:",Label.RIGHT);
	private Label dlb3 = new Label("-",Label.CENTER);
	
	private TextField dtf = new TextField(20);	//이름
	private TextField dtf1 = new TextField(6);//주민번호앞자리
	private TextField dtf2 = new TextField(7);//주민번호뒷자리
	
	private Button dbt = new Button("찾기");
	private Button dbt1 = new Button("취소");
	
	public DialogEx01() {
		// TODO Auto-generated constructor stub
		super("대화상사");
		
		//Dialog 설정메서드 호출
		setDialog();
		
		setSize(300,200);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		//Dialog 화면에 생성
		d.setVisible(true);
		d.addWindowListener(event);
		
	}
	
	//대화상자 생성
	private void setDialog(){
		
		//대화상자의 레이아웃 설정
		d.setLayout(new BorderLayout());
		d.setSize(300, 150);
		d.setResizable(false);
		d.add("North",dlb);//title
		
		//라벨 패널 설정
		Panel p1 = new Panel(new BorderLayout());	//제목과 버튼영역을 제외한 모든 영역
		Panel p2 = new Panel(new GridLayout(2, 1));	//이름,주민번호 라벨을 표시할 영역
		
		p2.add(dlb1);	//이름 라벨을 표시
		p2.add(dlb2);	//주민번호 라벨을 표시
		//p2.add(dlb3);
		p1.add("West", p2);	//전체 영역에 이름,주민번호 라벨 표시
		
		//텍스트 입력 패널설정
		Panel p3 = new Panel(new GridLayout(2, 1));
		Panel tfPanel = new Panel(new FlowLayout(FlowLayout.LEFT));	//이름 입력필드 영역(패널)
		
		tfPanel.add(dtf);	//이름 입력 필드
		p3.add(tfPanel);	//p3 = 모든입력 필드 영역(패널), 이름을 입력부분을 넣어준다.
		
		//주민번호 입력패널
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		
		p4.add(dtf1);	//주민번호 앞자리 입력 필드
		p4.add(dlb3);	//'-' 라벨
		p4.add(dtf2);	//주민번호 뒷자리 입력 필드
		
		p3.add(p4);	//p3 = 모든입력 필드 영역(패널), 주민번호 입력부분을 넣어준다.
		p1.add("Center", p3);	//제목과 버튼영역을 제외한 모든 영역(p1)에 모든 입력필드를 표시해준다.
		
		d.add("Center",p1);	//다이얼로그 창에 표시
		
		//버튼추가
		Panel p = new Panel(new FlowLayout());
		p.add(dbt);
		p.add(dbt1);
		
		d.add("South", p);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DialogEx01();
	}

}
