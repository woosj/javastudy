package javaDay23.awt;

import java.awt.*;

public class LabelEx1 extends Frame {
	
	Label la1, la2, la3, la4, la5;
	
	Font f1, f2;
	
	public LabelEx1() {
		// TODO Auto-generated constructor stub
		super("��");
		
		 f1 = new Font("����ä",Font.BOLD,14);
		 f2 = new Font("����ä",Font.ITALIC,24);
		 
		 la1 = new Label("ȫ�浿");
		 la2 = new Label("������",Label.CENTER);
		 la3 = new Label("������",Label.LEFT);
		 la4 = new Label("��ƶ�",Label.RIGHT);
		 la5 = new Label("þ��",Label.RIGHT);
		 
		 setLayout(new GridLayout(4,1));	//���̾ƿ� �����ڿ� ���� �׸��� ���̾ƿ� ����
		 
		 //�󺧿� ��Ʈ ����
		 la1.setFont(f1);
		 la2.setFont(f2);
		 la3.setFont(f1);
		 la4.setFont(f2);
		 
		 la1.setBackground(Color.blue);
		 la2.setBackground(Color.CYAN);
		 la3.setBackground(Color.gray);
		 la4.setBackground(Color.red);
		 
		 //���̾ƿ��� �߰�
		 add(la1);
		 add(la2);
		 add(la3);
		 add(la4);
		 add(la4);
		 //add(la5);
		 
		 //������ ũ�� ����
		 setSize(400, 300);
		 setVisible(true);
		 WinEvent event = new WinEvent();
		 addWindowListener(event);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx1();
	}

}
