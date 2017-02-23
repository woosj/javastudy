package panmai;

import java.util.*;

public class PanmaiMain {
	
	private Panmai p = new PanmaiImpl();	
	Scanner sc = new Scanner(System.in);
	
	public void product(){
		
		//상품 등록 화면
		char ch;
		
		while(true){
			System.out.println("\n\t[상품 등록 화면]");
			System.out.println("\t-----------------------------------");
			System.out.println("\t 1. 상품 등록");
			System.out.println("\t 2. 수량 등록");
			System.out.println("\t 3. 상품 리스트");
			System.out.println("\t 4. 상품코드 검색");
			System.out.println("\t 5. 복귀");
			
			
			
			
			System.out.println("\t-----------------------------------");
			System.out.println("\t 선택 =====>");
			ch = sc.next().charAt(0);
			
			switch(ch){
			case '1': p.insertProduct();break;
			case '2': p.insertQuantity();break;
			case '3': p.listProduct();break;
			case '4': p.searchProduct();break;
			case '5': System.out.println();return;
			}//end of switch
			
		}//end of while
	}//end of product()
	
	public void sale(){
		//상품 판매 현황
		char ch;
		while(true){
			System.out.println("\n\t [상품판매]");
			System.out.println("\t-----------------------------------");
			System.out.println("\t 1. 상품 판매");
			System.out.println("\t 2. 판매현황리스트");
			System.out.println("\t 3. 판매형황검색");
			System.out.println("\t 4. 복귀");
			System.out.println("\t-----------------------------------");
			System.out.println("\t 선택 =====>");
			ch = sc.next().charAt(0);
			
			switch(ch){
			case '1': p.insertSale();break;
			case '2': p.listSale();break;
			case '3': p.searchSale();break;
			case '4': System.out.println();return;
			}//end of switch
		}//end of while
	}//end of sale()
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		PanmaiMain pp = new PanmaiMain();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("\n\t [메인메뉴]");
			System.out.println("\t-----------------------------------");
			System.out.println("\t 1. 상품 등록");
			System.out.println("\t 2. 상품 판매");
			System.out.println("\t 3. 종류");
			System.out.println("\t-----------------------------------");
			System.out.println("\t 선택 =====>");
			ch = sc.next().charAt(0);
			
			switch(ch){
			case '1': pp.product();break;
			case '2':pp.sale();break;
			case '3': System.exit(0);break;
			}//end of switch
		}//end of while

	}//end of main()

}
