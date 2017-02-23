package javaDay09;

import java.util.Scanner;
import java.io.*;

public class BankEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		
		Account na = new Account("홍길동");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strWork;
		
		
		do
		{
			System.out.println("\n\n 작업 내용을 선택하세요.");
			System.out.println("=====================");
			System.out.println("입 금 =====> 1");
			System.out.println("출 금 =====> 2");
			System.out.println("조 회 =====> 3");
			System.out.println("종 료 =====> 0");
			System.out.println("=====================");
			
			System.out.print("작업을 선택하세요 :");
			strWork = br.readLine();
			int switchInt = 0;
			if(strWork != null){
				switchInt = Integer.parseInt(strWork);
			}else{
				System.out.println("작업내용을 입력하지 않았습니다.");
				System.exit(0);
			}
			
			switch(switchInt){
				case 0:
					//System.exit(0);
					break;
				case 1:
					//입금
					System.out.println("=====================");
					System.out.println("금액을 입력하세요.");
					String strdepositIn = br.readLine();
					//string 형 값을 실수형인 long 타입으로 형변환
					long depositLong = Long.parseLong(strdepositIn);
					//accont 클래스의 입금기능
					na.deposit(depositLong);
					break;
				case 2:
					//출금
					System.out.println("=====================");
					System.out.println("금액을 입력하세요.");
					String strwithdrawIn = br.readLine();
					//string 형 값을 실수형인 long 타입으로 형변환
					long withdrawLong = Long.parseLong(strwithdrawIn);
					//accont 클래스의 출금기능
					na.withdraw(withdrawLong);
					break;
				case 3:
					//조회
					System.out.println("=====================");
					System.out.println(na.getName() + "님의 잔액은 " + na.getBalance() + "원 입니다.");
					break;
				default :
					System.out.println("0~3 사이에 숫자를 입력하세요.");
			}//end switch
			
		}while(!strWork.equals("0"));
	}

}
