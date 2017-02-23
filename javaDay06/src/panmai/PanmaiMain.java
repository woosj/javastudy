package panmai;

import java.util.*;

public class PanmaiMain {
	
	private Panmai p = new PanmaiImpl();	
	Scanner sc = new Scanner(System.in);
	
	public void product(){
		
		//��ǰ ��� ȭ��
		char ch;
		
		while(true){
			System.out.println("\n\t[��ǰ ��� ȭ��]");
			System.out.println("\t-----------------------------------");
			System.out.println("\t 1. ��ǰ ���");
			System.out.println("\t 2. ���� ���");
			System.out.println("\t 3. ��ǰ ����Ʈ");
			System.out.println("\t 4. ��ǰ�ڵ� �˻�");
			System.out.println("\t 5. ����");
			
			
			
			
			System.out.println("\t-----------------------------------");
			System.out.println("\t ���� =====>");
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
		//��ǰ �Ǹ� ��Ȳ
		char ch;
		while(true){
			System.out.println("\n\t [��ǰ�Ǹ�]");
			System.out.println("\t-----------------------------------");
			System.out.println("\t 1. ��ǰ �Ǹ�");
			System.out.println("\t 2. �Ǹ���Ȳ����Ʈ");
			System.out.println("\t 3. �Ǹ���Ȳ�˻�");
			System.out.println("\t 4. ����");
			System.out.println("\t-----------------------------------");
			System.out.println("\t ���� =====>");
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
			System.out.println("\n\t [���θ޴�]");
			System.out.println("\t-----------------------------------");
			System.out.println("\t 1. ��ǰ ���");
			System.out.println("\t 2. ��ǰ �Ǹ�");
			System.out.println("\t 3. ����");
			System.out.println("\t-----------------------------------");
			System.out.println("\t ���� =====>");
			ch = sc.next().charAt(0);
			
			switch(ch){
			case '1': pp.product();break;
			case '2':pp.sale();break;
			case '3': System.exit(0);break;
			}//end of switch
		}//end of while

	}//end of main()

}
