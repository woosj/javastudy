package javaDay27;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();	//������ ��ü ����
		JButton[] btn = new JButton[25];	//��ư �迭 ����
		int star = 0;	//��ǥ �յ� ���� ����
		boolean flag = true;	//star ������ ���� ���� ���к��� 
		
		//��ư�� ������ ���̾ƿ� ����
		f.getContentPane().setLayout(new GridLayout(5, 5));
		
		//��ư �迭�� ��ư ��ü ������ �гο� ��ư�� �߰����ش�.
		for( int i = 0; i < btn.length; i++){
			btn[i] = new JButton();	//��ư ��ü ����
			f.getContentPane().add(btn[i]);	//���̾ƿ��� ��ư �߰�
		}
		
		//��ǥ ���
		for( int i = 0; i < btn.length; i+=5){
			
			//���� ���� �� ���� �������� �־��־ ���� ���� ������ �����Ѵ�.
			for( int j = i+star; j < i+5-star; j++){
				btn[j].setText("*");	//��ư�� �ؽ�Ʈ ����
				if(star == 2) flag = false;	//������ ���� 2�϶� �ٽ� ������ �ϳ��� ���̱� ���� ���� ��ȯ
			}
			
			
			if(flag){
				//true �� ��� ������ �ϳ��� �ø���.
				star++;
			}else{
				//false �� ��� ������ �ϳ��� ���δ�.
				star--;
			}
		}
		
		//������ ��� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
		
	}

}
