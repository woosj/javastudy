package javaDay06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrClassEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�̸�
		String[] name = new String[5];
		
		int[] sum = new int[5];
		int[] avg = new int[5];
		char[] grade = new char[5];
		
		int i,j,k,h;
		
		String sub[] = {"����","����","����","��ȸ","����"};
		int[][] soc = new int[5][5];	//����
		int rank[] = new int[5];	//����
		
		for( i = 0; i < name.length; i++){
			//�̸��Է� 
			System.out.print("�̸� :");
			name[i] = br.readLine();
			
			for( j = 0; j < sub.length; j++){
				System.out.print(name[i] + "�� " + sub[j] + "���� :" );
				soc[i][j] = Integer.parseInt(br.readLine());
				sum[i] += soc[i][j];
			}
			
			//��ձ��ϱ�
			avg[i] = sum[i]/5;
			
			if(avg[i] >= 90){
				grade[i] = 'A';
			}else if(avg[i] >= 80){
				grade[i] = 'B';
			}else if(avg[i] >= 70){
				grade[i] = 'C';
			}else if(avg[i] >= 60){
				grade[i] = 'D';
			}else{
				grade[i] = 'F';
			}
			
			System.out.println();
			
		}
		
		//�������ϱ�
		for( i = 0; i < name.length; i++){
			rank[i] = 1;
			for( j = 0; j < name.length; j++){
				if(avg[i] < avg[j]){
					rank[i]++;
				}
			}
		}
		
		//Ÿ��Ʋ ���
		System.out.print("�̸�\t");
		for( i = 0; i < name.length; i++){
			//Ÿ��Ʋ ���
			System.out.print(sub[i] + "����\t");
		}
		System.out.print("�հ�\t");
		System.out.print("���\t");
		System.out.print("����\t");
		System.out.print("���\t");
		System.out.println();
		
		//DATA ���	
		for( i = 0; i < name.length; i++){
			//�̸� ���
			System.out.print(name[i] + "\t");
			
			for( j = 0; j < name.length; j++){
				//���� ���
				System.out.print(soc[i][j]);
				System.out.print("\t");
			}
			//�հ� ���
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.print(grade[i] + "\t");
			
			System.out.println();
		}
	}

}
