package javaDay23.awt;

import java.awt.*;

public class ListEx1 extends Frame {

	private Label lb = new Label("�ο����");
	private List li = new List(4,true);	//���߸�� ��������(true)
	private Button bt = new Button("Ȯ��");
	private String[] name;
	
	public ListEx1(String[] a) {
		// TODO Auto-generated constructor stub
		super("List");
		name = a;
		
		setLayout(new BorderLayout());
		
		for(int i = 0; i < name.length;i++){
			li.add(name[i]);	//����Ʈ�� �߰�
			
		}
		
		add("North",lb);	//���� ���ʿ� ����
		add("South",bt);
		add("Center",li);
		
		
		li.setFont(new Font("������",Font.BOLD,20));
		
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
