package javaDay07;

import java.io.IOException;

public class ArrEx03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 콜라 ,사읻, 마운틴, 초코송이, 에이스, 웨하스가 나오는 자판기 프로그램을 작성하여라
		 * 단, do ~ while문과 switch문 사용하시오.
		 * 
		 * 콜라-1,사이다-2,마운티-3,초코송이-4,에이스-5,웨하스-6(0 종료) : 1
		 * 콜라
		 */
		int menu = 0;
		
		do{
			System.out.println("콜라-1,사이다-2,마운티-3,초코송이-4,에이스-5,웨하스-6(0 종료)");
			System.out.print("메뉴를 선택하세요 : ");
			menu = (int)System.in.read()-48;
			System.in.read();
			System.in.read();
			
			switch(menu){
				case 0: 
					System.exit(0); 
					break;
				case 1:
					System.out.println("콜라");
					break;
				case 2:
					System.out.println("사이다");
					break;
				case 3:
					System.out.println("마운틴");
					break;
				case 4:
					System.out.println("초코송이");
					break;
				case 5:
					System.out.println("에이스");
					break;
				case 6:
					System.out.println("웨하스");
					break;
				default:
					System.out.println("선책하신 상품이 없습니다.");
					break;
			}
			
			
		}while(menu != 0);
		
	}

}
