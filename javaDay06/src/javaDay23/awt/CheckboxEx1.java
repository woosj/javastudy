package javaDay23.awt;

import java.awt.*;

public class CheckboxEx1 extends Frame {
	
	private Label la = new Label("라벨");
	private Button bt = new Button("확인");
	private Checkbox[] cb = { new Checkbox("바나나"),new Checkbox("딸기"),new Checkbox("파인애플"),new Checkbox("사과")};
	
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
