package javaDay24.com.awt;


import java.awt.*;
import java.awt.event.*;

import javaDay23.awt.WinEvent;

public class ItemEventEx extends Frame implements ItemListener, ActionListener {
	
	private Label lb = new Label("������ :",Label.RIGHT);
	private Label lb1 = new Label("������� :",Label.RIGHT);
	private Label lb2 = new Label("���� :",Label.RIGHT);
	
	private TextField bType = new TextField();	//������ �Է��׸�
	
	private Choice blood = new Choice();	//������ ���� �ڽ�
	
	private TextField birth = new TextField();	//������� �Է��׸�
	
	private Choice year = new Choice();	//�⵵ ���� �ڽ�
	private Choice month = new Choice();	//�� ���ùڽ�
	private Choice day = new Choice();	//�� ���ùڽ�
	
	private TextField local = new TextField();	//���� �Է��׸�
	
	private List li = new List(3,false);	//���� ����Ʈ
	
	private Button end = new Button("������");	//������ ��ư
	
	public ItemEventEx() {
		// TODO Auto-generated constructor stub
		
		super("�׸� �̺�Ʈ");
		
		setForm();
		bType.setEditable(false);//�����Ұ�
		birth.setEditable(false);//�����Ұ�
		local.setEditable(false);//�����Ұ�
		
		blood.addItemListener(this);//�̺�Ʈ �ɾ���
		day.addItemListener(this);
		li.addActionListener(this);
		li.addItemListener(this);
		end.addActionListener(this);
		
		setSize(600,600);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		
	}
	
	public void setForm(){
		setLayout(new GridLayout(2, 1));
		
		Panel p = new Panel(new BorderLayout());	//��� ��ü �г�
		
		Panel p1 = new Panel(new GridLayout(3, 1));	//�� �г�
		p1.add(lb);	//������ ��
		p1.add(lb1);	//������� ��
		p1.add(lb2);	//���� ��
		
		p.add("West", p1);//��ü �гο� ���� �κп� ���� �־��ش�.
		
		Panel p2 = new Panel(new GridLayout(3, 1));	//�ؽ�Ʈ �ʵ� �г�
		p2.add(bType);
		p2.add(birth);
		p2.add(local);
		p.add("Center", p2);
		
		Panel p3 = new Panel(new GridLayout(4, 1));	//���� �ʵ� �г�
		//������ ���� �����ʵ忡 �߰�
		blood.add("A��");
		blood.add("B��");
		blood.add("AB��");
		blood.add("O��");
		
		
		//�������� �гο� �߰�
		p3.add(blood);
		
		//�⵵�� 1900�⵵���� 2017����� �־��ش�.
		for(int i = 1900; i < 2018; i++){
			year.add(String.valueOf(i));
		}
		
		//�⵵�� �гο� �߰�
		p3.add(year);
		
		for(int i = 1; i <= 12; i++){
			month.add(String.valueOf(i));
		}
		p3.add(month);
		
		for(int i = 1; i <= 31; i++){
			day.add(String.valueOf(i));
		}
		
		p3.add(day);
		p.add("East", p3);
		
		add(p);
		
		Panel p4 = new Panel(new BorderLayout());	//�ϴ� ��ü �г�
		
		li.add("����");
		li.add("���");
		li.add("�׿�");
		
		p4.add("Center",li);//���� ����Ʈ
		
		
		p4.add("East", end);//��ư
		
		add(p4);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//�׼ǿ� ���ؼ�
		if(e.getSource() == li){
			int i = li.getSelectedIndex();
			li.remove(i);
		}
		if(e.getSource() == end){
			System.exit(0);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//�����ۿ� ����
		if(e.getSource() == blood){
			bType.setText(blood.getSelectedItem());
		}
		if(e.getSource() == day){
			birth.setText(year.getSelectedItem() + "/" + month.getSelectedItem() + "/" + day.getSelectedItem());
		}
		if(e.getSource() == li){
			local.setText(li.getSelectedItem());
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemEventEx();
	}

}
