package javaDay11;

import java.util.Scanner;

public class Sung {
	//�ֿ� ����(�Ӽ� ����)
	int inwon;	//�ο���
	Record[] rec;	//Record Ŭ���� �迭ȭ
	String[] title = {"����","����","����"};
	//���(�޼���)
	
	//�ο��� �Է�
	void set(){
		//�ο��� �Է¹޴� �۾�
		Scanner sc = new Scanner(System.in);
		System.out.println("�ο����� �Է��ϼ���.");
		inwon = sc.nextInt();
		
		rec = new Record[inwon];
		
		setData();
		setRank();
	}
	
	//������ �Է� �� ���
	void setData(){
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < rec.length; i++){
			System.out.print("�̸��� �Է��ϼ��� : ");
			/*
			 * ���� �߿��� 
			 */
			rec[i] = new Record();
			
			rec[i].name = sc.nextLine();
			
			for(int j =0; j < rec[i].score.length; j++){
				System.out.print(title[j] + " : ");
				/*switch(j){
					case 0 : System.out.print("�������� :");break;
					case 1 : System.out.print("�������� :");break;
					case 2 : System.out.print("�������� :");break;
				}*/
				
				//���� �Է�
				rec[i].score[j] = sc.nextInt();
				//�հ�
				rec[i].tot += rec[i].score[j];
			}
			//��ձ��ϱ�
			rec[i].avg = rec[i].tot/3.0;
			
		}
		
		
	}
	
	
	//�������
	void setRank(){
		int i, j;
		
		//��� �л��� ����� 1�� �ʱ�ȭ
		for(i = 0; i < rec.length; i++){
			rec[i].rank = 1;
		}
		
		for(i=0; i<rec.length; i++){
			for(j=0;j<rec.length;j++){
				if(rec[i].tot < rec[j].tot){
					rec[i].rank++;
				}
			}
		}
	}
	
	//���
	void disp(){
		for(int i =0; i < rec.length; i++){
			System.out.println("�̸� : "+rec[i].name);
			
			for(int j =0; j < rec[i].score.length; j++){
				System.out.println(title[j] + " : " + rec[i].score[j]);
			}
			
			System.out.println("�հ� : "+rec[i].tot);
			System.out.println("��� : "+rec[i].avg);
			
		}
	}
	 
}
