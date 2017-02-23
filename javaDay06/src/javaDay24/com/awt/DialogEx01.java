package javaDay24.com.awt;

import java.awt.*;

import javaDay23.awt.WinEvent;

public class DialogEx01 extends Frame {
	
	private Dialog d = new Dialog(this,"��ȸ����", false);
	
	private Label dlb = new Label("�̸��� �ֹι�ȣ�� ��й�ȣ ã��");
	private Label dlb1 = new Label("�̸�:",Label.RIGHT);
	private Label dlb2 = new Label("�ֹι�ȣ:",Label.RIGHT);
	private Label dlb3 = new Label("-",Label.CENTER);
	
	private TextField dtf = new TextField(20);	//�̸�
	private TextField dtf1 = new TextField(6);//�ֹι�ȣ���ڸ�
	private TextField dtf2 = new TextField(7);//�ֹι�ȣ���ڸ�
	
	private Button dbt = new Button("ã��");
	private Button dbt1 = new Button("���");
	
	public DialogEx01() {
		// TODO Auto-generated constructor stub
		super("��ȭ���");
		
		//Dialog �����޼��� ȣ��
		setDialog();
		
		setSize(300,200);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		//Dialog ȭ�鿡 ����
		d.setVisible(true);
		d.addWindowListener(event);
		
	}
	
	//��ȭ���� ����
	private void setDialog(){
		
		//��ȭ������ ���̾ƿ� ����
		d.setLayout(new BorderLayout());
		d.setSize(300, 150);
		d.setResizable(false);
		d.add("North",dlb);//title
		
		//�� �г� ����
		Panel p1 = new Panel(new BorderLayout());	//����� ��ư������ ������ ��� ����
		Panel p2 = new Panel(new GridLayout(2, 1));	//�̸�,�ֹι�ȣ ���� ǥ���� ����
		
		p2.add(dlb1);	//�̸� ���� ǥ��
		p2.add(dlb2);	//�ֹι�ȣ ���� ǥ��
		//p2.add(dlb3);
		p1.add("West", p2);	//��ü ������ �̸�,�ֹι�ȣ �� ǥ��
		
		//�ؽ�Ʈ �Է� �гμ���
		Panel p3 = new Panel(new GridLayout(2, 1));
		Panel tfPanel = new Panel(new FlowLayout(FlowLayout.LEFT));	//�̸� �Է��ʵ� ����(�г�)
		
		tfPanel.add(dtf);	//�̸� �Է� �ʵ�
		p3.add(tfPanel);	//p3 = ����Է� �ʵ� ����(�г�), �̸��� �Էºκ��� �־��ش�.
		
		//�ֹι�ȣ �Է��г�
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		
		p4.add(dtf1);	//�ֹι�ȣ ���ڸ� �Է� �ʵ�
		p4.add(dlb3);	//'-' ��
		p4.add(dtf2);	//�ֹι�ȣ ���ڸ� �Է� �ʵ�
		
		p3.add(p4);	//p3 = ����Է� �ʵ� ����(�г�), �ֹι�ȣ �Էºκ��� �־��ش�.
		p1.add("Center", p3);	//����� ��ư������ ������ ��� ����(p1)�� ��� �Է��ʵ带 ǥ�����ش�.
		
		d.add("Center",p1);	//���̾�α� â�� ǥ��
		
		//��ư�߰�
		Panel p = new Panel(new FlowLayout());
		p.add(dbt);
		p.add(dbt1);
		
		d.add("South", p);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DialogEx01();
	}

}
