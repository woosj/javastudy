package javaDay23.awt;

import java.awt.*;

public class TextEx extends Frame {
	
	private TextField tf = new TextField("���� :");
	private TextArea ta = new TextArea("�޸� : ",5, 10);
	
	private Button bt = new Button("Ȯ��");
	private Label la = new Label("����");
	
	public TextEx() {
		// TODO Auto-generated constructor stub
	
		super("�޸���");
		
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
