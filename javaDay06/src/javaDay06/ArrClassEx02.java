package javaDay06;

import java.util.Scanner;

public class ArrClassEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * ����� �迭(���� �迭)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int[][] score;	//�л����� ���� �� ���� ����
		String[] name;	//�̸����� �迭
		String[] grade;	//������� �迭
		double[] avg;	//������� �迭
		int[] rank;	//�������� �迭
		int student;	//�л���
		String Sname;	//�Էµ� �̸� �ӽ� ���� ����
		int total = 0, subnum, sco;
		
		System.out.print("�л� �� �Է� : ");
		student = sc.nextInt();
		
		//�迭 �ʱ�ȭ
		score = new int[student][];
		name = new String[student];
		grade = new String[student];
		avg = new double[student];
		rank = new int[student];
		
		for(int i = 0; i < score.length; i++){
			System.out.print( (i+1) + "���� �л� �̸� �Է� : ");
			
			//�̸��Է�
			Sname = sc.next();
			name[i] = Sname;
			
			//�����
			System.out.print( (i+1) + "���� �л� ����� �Է� : ");
			subnum = sc.nextInt();
			
			//�����迭 (���� �迭 �ʱ�ȭ)
			//�л����� �ٸ� ������� �Է¹޾�
			//�迭�� ���̰� ��� �ٸ� �� ����
			score[i] = new int[subnum];
			
			for( int j = 0; j < score[i].length; j++){
				System.out.print( (i+1) + "���� �л�" + (j+1) + "��° ���� �����Է� : " );
				sco = sc.nextInt();
				total += sco;	//�հ�
				score[i][j] = sco;
			}
			
			//���
			avg[i] = (double)total/subnum;
			//�հ� �ʱ�ȭ
			total = 0;
			
			switch((int)avg[i]/10){
				case 10:
				case 9:
					grade[i] = "A";
					break;
				case 8:
					grade[i] = "B";
					break;
				case 7:
					grade[i] = "C";
					break;
				case 6:
					grade[i] = "D";
					break;
				default:
					grade[i] = "F";
					break;
			}
			
			
		}
		
		//�������ϱ�
		for(int i = 0; i < name.length; i++){
			rank[i] = 1;
			for( int j = 0; j < name.length; j++){
				if(avg[i] < avg[j]){
					rank[i]++;
				}
			}
		}
		
		//���
		for(int i = 0; i < score.length; i++){
			System.out.printf("�̸� : %s\t",name[i]);
			for(int j = 0; j < score[i].length; j++){
				System.out.printf("%d ���� : %d\t", j+1, score[i][j]);
			}
			
			System.out.printf("��� : %.1f\t", avg[i]);
			System.out.printf("���� : %s\t\n", grade[i]);
		}
		
	}

}
