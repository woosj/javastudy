package javaDay23.awt;

import java.awt.*;

public class CheckboxGroupEx extends Frame {
	
	GridLayout gl = new GridLayout(4, 1);
	private Label la = new Label("라벨");
	private Button bt = new Button("확인");
	private CheckboxGroup cg = new CheckboxGroup();
	private Checkbox man = new Checkbox("남",cg,true);	//실행하자마자 체크되잇는 경우 (true)
	private Checkbox woman = new Checkbox("여",cg,false);	//실행하자마자 체크되잇는 경우 (true)
	
	
	public CheckboxGroupEx() {
		// TODO Auto-generated constructor stub
		super("CheckBoxGroup");

		setLayout(gl);
		
		add(la);
		man.setFont(new Font("굴림체",Font.BOLD,30));
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
