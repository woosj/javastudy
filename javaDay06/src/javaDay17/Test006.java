package javaDay17;

import java.util.Random;
import java.util.Scanner;

/*
 * 1 ~ 3  ������ ������ �߻����� ����, ����, �� ������ �����Ͻÿ�.
 * ��, �迭�� ����ϰ� Ŭ�������ҷ� ����
 * ���� ������ :	1. ����, 2: ����, 3: ��
 * ������
 * 1: ���� 2: ���� 3: �� �� �Է�: 2
 * ����� : ���� 
 * ��ǻ�� : ��
 * ��ǻ�Ͱ� �̰���ϴ�.
 * The Class name is RookPaperScissor
 * Ŭ���� ������
 */
public class Test006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] game = new int[3];
		String[] str = {"����","����","��"};
		int user;
		int com;	
		Random r = new Random();
		
		//�迭�� 1,2,3�� �Է� ���� 1�̸� ���� 2�̸� ���� 3�̸� ��
		for(int i = 0; i < game.length; i++){
			game[i] += i+1;
		}
		
		do{
			System.out.println("1: ���� 2: ���� 3: �� �� �Է� : ");
			user = sc.nextInt();
			if( user < 1 || user > 3){
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}while(user < 1 || user > 3);
		
		com = r.nextInt(3);
		
		System.out.println("����� : " + str[user]);
		System.out.println("��ǻ�� : " + str[com]);
		
		if(game[com] == game[user]){
			
			System.out.println("�����ϴ�.");
			
		}else if( (game[user] == 2 && game[com] == 1) || (game[user] == 3 && game[com] == 2) || (game[user] == 1 && game[com] == 3) ){
			
			System.out.println("����ڰ� �̰���ϴ�.");
			
		}else{
			
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			
		}
		
		
		
		
		
	}

}
