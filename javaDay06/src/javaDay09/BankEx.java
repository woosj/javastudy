package javaDay09;

import java.util.Scanner;
import java.io.*;

public class BankEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		
		Account na = new Account("ȫ�浿");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strWork;
		
		
		do
		{
			System.out.println("\n\n �۾� ������ �����ϼ���.");
			System.out.println("=====================");
			System.out.println("�� �� =====> 1");
			System.out.println("�� �� =====> 2");
			System.out.println("�� ȸ =====> 3");
			System.out.println("�� �� =====> 0");
			System.out.println("=====================");
			
			System.out.print("�۾��� �����ϼ��� :");
			strWork = br.readLine();
			int switchInt = 0;
			if(strWork != null){
				switchInt = Integer.parseInt(strWork);
			}else{
				System.out.println("�۾������� �Է����� �ʾҽ��ϴ�.");
				System.exit(0);
			}
			
			switch(switchInt){
				case 0:
					//System.exit(0);
					break;
				case 1:
					//�Ա�
					System.out.println("=====================");
					System.out.println("�ݾ��� �Է��ϼ���.");
					String strdepositIn = br.readLine();
					//string �� ���� �Ǽ����� long Ÿ������ ����ȯ
					long depositLong = Long.parseLong(strdepositIn);
					//accont Ŭ������ �Աݱ��
					na.deposit(depositLong);
					break;
				case 2:
					//���
					System.out.println("=====================");
					System.out.println("�ݾ��� �Է��ϼ���.");
					String strwithdrawIn = br.readLine();
					//string �� ���� �Ǽ����� long Ÿ������ ����ȯ
					long withdrawLong = Long.parseLong(strwithdrawIn);
					//accont Ŭ������ ��ݱ��
					na.withdraw(withdrawLong);
					break;
				case 3:
					//��ȸ
					System.out.println("=====================");
					System.out.println(na.getName() + "���� �ܾ��� " + na.getBalance() + "�� �Դϴ�.");
					break;
				default :
					System.out.println("0~3 ���̿� ���ڸ� �Է��ϼ���.");
			}//end switch
			
		}while(!strWork.equals("0"));
	}

}
