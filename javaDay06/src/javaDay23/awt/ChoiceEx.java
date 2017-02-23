package javaDay23.awt;

import java.awt.*;

public class ChoiceEx extends Frame {
	
	private Label la = new Label("����");
	private Button bt = new Button("Ȯ��");
	private Choice co = new Choice();
	
	public ChoiceEx(){
		
		setLayout(new GridLayout(3, 1));
		
		add(la);
		for(int i = 1; i <= 12; i++)
		{
			co.add(String.valueOf(i) + "��");
		}
		add(co);
		add(bt);
		
		setSize(400, 400);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceEx();
	}

}
