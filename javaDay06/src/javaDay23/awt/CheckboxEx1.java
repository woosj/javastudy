package javaDay23.awt;

import java.awt.*;

public class CheckboxEx1 extends Frame {
	
	private Label la = new Label("��");
	private Button bt = new Button("Ȯ��");
	private Checkbox[] cb = { new Checkbox("�ٳ���"),new Checkbox("����"),new Checkbox("���ξ���"),new Checkbox("���")};
	
	public CheckboxEx1() {
		// TODO Auto-generated constructor stub
		super("CheckBox");
		
		setLayout(new GridLayout(6, 1));
		add(la);
		
		for(int i = 0; i < cb.length; i++){
			add(cb[i]);
		}
		
		add(bt);
		
		setSize(400, 400);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckboxEx1();
	}

}
