package javaDay17;

import java.util.Scanner;
import java.util.Random;

/*
 * ����ڷ� ���� �Է¹��� ������ ������ŭ ������ �߻����� �迭�� ��� �迭�� ��� �ִ� �����͵� �� ���� ū ���� ���� ���� ���� ����ϴ� ���α׷��� ���Ͻÿ�.
 * (������ ������ 100) �����Լ� �̿�
 * 
 */
public class Test004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է� ��ü����
		Scanner sc = new Scanner(System.in);
		int num;	//�Է¹��� ���� ���� ����
		
		//�Է� �޼��� ���
		System.out.println("Input Number : ");
		num = sc.nextInt();	//���� �Է�
		//������ �Է��� �迭 ����
		int[] arrNum = new int[num];
		int max = 0, min = 0;	//�ִ밪 �ּҰ� ���� ����

		
		//������ �߻����Ѽ� �迭�� ����
		for(int i = 0; i < arrNum.length; i++){
			arrNum[i] = (int)(Math.random()*100);
		}
		
		
		//�迭 ���
		for(int i = 0; i < arrNum.length; i++){
			System.out.print(arrNum[i] + " ");
		}
		
		System.out.println();
		
		//�ִ밪 �ּҰ� ����
		for(int i = 0; i < arrNum.length-1; i++){
			if( arrNum[i] < arrNum[i+1]){
				min = arrNum[i];
			}
			
			if(arrNum[i] > arrNum[i+1]){
				max = arrNum[i];
			}
		}
		
		System.out.println("�ּҰ�:" + min + ", �ִ밪 : " + max);
		
	}

}
