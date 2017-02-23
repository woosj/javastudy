package javaDay23.awt;

import java.awt.*;

public class ListEx1 extends Frame {

	private Label lb = new Label("인원목록");
	private List li = new List(4,true);	//다중모드 지원여부(true)
	private Button bt = new Button("확인");
	private String[] name;
	
	public ListEx1(String[] a) {
		// TODO Auto-generated constructor stub
		super("List");
		name = a;
		
		setLayout(new BorderLayout());
		
		for(int i = 0; i < name.length;i++){
			li.add(name[i]);	//리스트에 추가
			
		}
		
		add("North",lb);	//라벨을 위쪽에 배이
		add("South",bt);
		add("Center",li);
		
		
		li.setFont(new Font("굴림쳉",Font.BOLD,20));
		
		setSize(400, 400);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx1(args);
	}

}
