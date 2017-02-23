package javaDay05;
import java.io.*;

public class DoWhileEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 1.회원가입
		 * 2.회원조회
		 * 3.회원탈퇴
		 * 0.종료
		 * 
		 */
		
		int menu = 0;
		
		do{
			System.out.println("1.회원가입");
			System.out.println("2.회원탈퇴");
			System.out.println("3.회원조회");
			System.out.println("0.프로그램종료");
			
			System.out.print("메뉴 선택 :");
			menu = System.in.read()-48;	//숫자로 받기위해서
			//enter key 처리위해서 (\r \n)
			System.in.read();
			System.in.read();			
			
		}while(menu != 1 && menu != 2 && menu != 3 && menu != 0);
		
		System.out.println("선택한 메뉴는 : " + menu);
	}

}
