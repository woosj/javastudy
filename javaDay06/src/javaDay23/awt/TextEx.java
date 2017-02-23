package javaDay23.awt;

import java.awt.*;

public class TextEx extends Frame {
	
	private TextField tf = new TextField("제목 :");
	private TextArea ta = new TextArea("메모 : ",5, 10);
	
	private Button bt = new Button("확인");
	private Label la = new Label("내용");
	
	public TextEx() {
		// TODO Auto-generated constructor stub
	
		super("메모장");
		
		setLayout(new BorderLayout());
		add("North",tf);
		add("South",bt);
		add("Center",ta);
		add("West",la);
		
		
		setSize(400, 400);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextEx();
	}

}
