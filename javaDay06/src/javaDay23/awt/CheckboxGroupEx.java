package javaDay23.awt;

import java.awt.*;

public class CheckboxGroupEx extends Frame {
	
	GridLayout gl = new GridLayout(4, 1);
	private Label la = new Label("��");
	private Button bt = new Button("Ȯ��");
	private CheckboxGroup cg = new CheckboxGroup();
	private Checkbox man = new Checkbox("��",cg,true);	//�������ڸ��� üũ���մ� ��� (true)
	private Checkbox woman = new Checkbox("��",cg,false);	//�������ڸ��� üũ���մ� ��� (true)
	
	
	public CheckboxGroupEx() {
		// TODO Auto-generated constructor stub
		super("CheckBoxGroup");

		setLayout(gl);
		
		add(la);
		man.setFont(new Font("����ü",Font.BOLD,30));
		add(man);
		add(woman);
		add(bt);
		
		setSize(400, 400);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckboxGroupEx();
	}

}
