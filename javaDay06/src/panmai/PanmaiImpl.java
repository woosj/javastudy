package panmai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PanmaiImpl implements Panmai {
	
	//상품정보
	private Map<String,ProductVO> product = new HashMap<String, ProductVO>();
	//판매현황
	private List<SaleVO> sale = new ArrayList<SaleVO>();
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void insertProduct() {
		// TODO Auto-generated method stub
		//상품등록
		String code;
		System.out.println("\n\t 상품등록...");
		System.out.print("\t 상품 코드 :");
		code = sc.nextLine();
		if(product.containsKey(code)){
			System.out.println("\t이미 등록된 코드입니다.");
			return;
		}
		
		ProductVO pvo = new ProductVO();	//새로 저장할 상품 객체생성
		
		System.out.print("\t 상품명 :");
		pvo.setPanme(sc.nextLine());

		System.out.print("\t 단가 :");
		pvo.setPrice(sc.nextInt());
		
		System.out.print("\t 수량 :");
		pvo.setQuantity(sc.nextInt());
		
		product.put(code, pvo);
		System.out.println("\n\t 상품을 등록하였습니다.");
		
		

	}

	@Override
	public void insertQuantity() {
		// TODO Auto-generated method stub
		
		//상품수량등록
		String code;
		System.out.println("\n\t 상품 수량 등록...");
		System.out.print("\t 상품 코드 :");
		code = sc.nextLine();
		
		if(!product.containsKey(code)){
			System.out.println("\t 등록되지 않은 코드입니다.");
			return;
		}
		
		int su;
		ProductVO pvo = product.get(code);	//저장된 상품객체를 찾아온다.
				
		System.out.print("\t 상품명 :" + pvo.getPanme());
		System.out.print("\t 수량 :");
		su = sc.nextInt();
		
		pvo.setQuantity(pvo.getQuantity() + su);
		
				
		System.out.println("\n\t 수량을 수정하였습니다.");

	}

	@Override
	public void searchProduct() {
		// TODO Auto-generated method stub
		//상품수량등록
		String code;
		System.out.println("\n\t 상품 코드 조회...");
		System.out.print("\t 상품 코드 :");
		code = sc.nextLine();
				
		System.out.println("코드 \t\t 상품명 \t\t 단가 \t\t 수량");
		
		if(product.containsKey(code)){

			ProductVO pvo = product.get(code);	//저장된 상품객체를 찾아온다.
			System.out.println(code + " \t\t " + pvo.getPanme() + " \t\t " + pvo.getPrice() + " \t\t " + pvo.getQuantity());
		}
		
		
		/*if(!product.containsKey(code)){
			System.out.println("\t 등록되지 않은 코드입니다.");
			return;
		}
		
		ProductVO pvo = product.get(code);	//저장된 상품객체를 찾아온다.
		System.out.println(code + " \t\t " + pvo.getPanme() + " \t\t " + pvo.getPrice() + " \t\t " + pvo.getQuantity());
		*/
		System.out.println();
		
		
	}

	@Override
	public void listProduct() {
		// TODO Auto-generated method stub
		//상품 전체 리스트
		System.out.println("\n\t\t 상품 전체 리스트.....");
		System.out.println("코드 \t\t 상품명 \t\t 단가 \t\t 수량");
		System.out.println("---------------------------------------------------");
		
		Iterator<String> it = product.keySet().iterator();
		
		while(it.hasNext()){
			
			String code = it.next();
			ProductVO pvo = product.get(code);
			
			System.out.println(code + " \t\t " + pvo.getPanme() + " \t\t " + pvo.getPrice() + " \t\t " + pvo.getQuantity() + " \t\t ");
			
		}//end of while
		System.out.println();
		
	}//end of listProduct()

	@Override
	public void insertSale() {
		// TODO Auto-generated method stub
		
		//판매
		String code;
		System.out.println("\n\t 상품 코드 조회...");
		System.out.print("\t 상품 코드 :");
		sc.nextLine();
		code = sc.nextLine();
		
		if( !product.containsKey(code) ){
			System.out.println("\t 등록되지 않은 상품입니다.");
			return;
		}
		
		ProductVO pvo = product.get(code);
		
		System.out.println();
		System.out.println("\t 상품명 : " + pvo.getPanme() + ", 남은 수량 : " + pvo.getQuantity());
		
		SaleVO svo = new SaleVO();
		
		svo.setCode(code);
		
		System.out.print("\t 고객명 : ");
		svo.setSname(sc.nextLine());
		
		System.out.print("\t 등록일 : ");
		svo.setCreated(sc.nextLine());
		
		System.out.print("\t 판매수량 : ");
		svo.setQuantity(sc.nextInt());
		
		//판매량과 재고량을 비교한다.
		//판매량이 재고량보다 많은 수는 없다.
		if(svo.getQuantity() > pvo.getQuantity()){
			System.out.println("\t 판매량이 재고량보다 많은 수는 없다. \n");
			return;
		}
		
		//재고량 감소
		pvo.setQuantity(pvo.getQuantity() - svo.getQuantity());
		
		//리스트에 등록
		sale.add(svo);
		System.out.println("\t 주문이 완료되었습니다.");
		
	}

	@Override
	public void searchSale() {
		// TODO Auto-generated method stub
		
		//상품명으로 판매현황 조회
		String pname;
		
		System.out.println("\n\t 판매된 상품명 조회 : ");
		pname = sc.nextLine();
		
		System.out.println("코드 \t\t 상품명 \t\t 고객명 \t\t 판매일자 \t\t 단가 \t\t 수량 \t\t 수량");
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Iterator<SaleVO> it = sale.iterator();
		
		while(it.hasNext()){
			
			SaleVO svo = it.next();
			ProductVO pvo = product.get(svo.getCode());
			
			if(!pvo.getPanme().startsWith(pname)){
				continue;
			}
			
			System.out.println(svo.getCode() + " \t\t " + pvo.getPanme() + " \t\t " + svo.getSname() + " \t\t " + svo.getCreated() + " \t\t " + pvo.getPrice() + " \t\t " + pvo.getQuantity() + " \t\t " + (svo.getQuantity()*pvo.getPrice()) );
		}
		
		System.out.println();
	}

	@Override
	public void listSale() {
		// TODO Auto-generated method stub
		System.out.println("\n\t 전체 판매 리스트.... : ");
		System.out.println("코드 \t\t 상품명 \t\t 고객명 \t\t 판매일자 \t\t 단가 \t\t 수량 \t\t 금액");
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Iterator<SaleVO> it = sale.iterator();
		
		while(it.hasNext()){
			
			SaleVO svo = it.next();
			ProductVO pvo = product.get(svo.getCode());
			
			System.out.println(svo.getCode() + " \t\t " + pvo.getPanme() + " \t\t " + svo.getSname() + " \t\t " + svo.getCreated() + " \t\t " + pvo.getPrice() + " \t\t " + pvo.getQuantity() + " \t\t " + (svo.getQuantity()*pvo.getPrice()) );
		}
		
		System.out.println();
	}

}
