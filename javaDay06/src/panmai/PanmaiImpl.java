package panmai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PanmaiImpl implements Panmai {
	
	//��ǰ����
	private Map<String,ProductVO> product = new HashMap<String, ProductVO>();
	//�Ǹ���Ȳ
	private List<SaleVO> sale = new ArrayList<SaleVO>();
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void insertProduct() {
		// TODO Auto-generated method stub
		//��ǰ���
		String code;
		System.out.println("\n\t ��ǰ���...");
		System.out.print("\t ��ǰ �ڵ� :");
		code = sc.nextLine();
		if(product.containsKey(code)){
			System.out.println("\t�̹� ��ϵ� �ڵ��Դϴ�.");
			return;
		}
		
		ProductVO pvo = new ProductVO();	//���� ������ ��ǰ ��ü����
		
		System.out.print("\t ��ǰ�� :");
		pvo.setPanme(sc.nextLine());

		System.out.print("\t �ܰ� :");
		pvo.setPrice(sc.nextInt());
		
		System.out.print("\t ���� :");
		pvo.setQuantity(sc.nextInt());
		
		product.put(code, pvo);
		System.out.println("\n\t ��ǰ�� ����Ͽ����ϴ�.");
		
		

	}

	@Override
	public void insertQuantity() {
		// TODO Auto-generated method stub
		
		//��ǰ�������
		String code;
		System.out.println("\n\t ��ǰ ���� ���...");
		System.out.print("\t ��ǰ �ڵ� :");
		code = sc.nextLine();
		
		if(!product.containsKey(code)){
			System.out.println("\t ��ϵ��� ���� �ڵ��Դϴ�.");
			return;
		}
		
		int su;
		ProductVO pvo = product.get(code);	//����� ��ǰ��ü�� ã�ƿ´�.
				
		System.out.print("\t ��ǰ�� :" + pvo.getPanme());
		System.out.print("\t ���� :");
		su = sc.nextInt();
		
		pvo.setQuantity(pvo.getQuantity() + su);
		
				
		System.out.println("\n\t ������ �����Ͽ����ϴ�.");

	}

	@Override
	public void searchProduct() {
		// TODO Auto-generated method stub
		//��ǰ�������
		String code;
		System.out.println("\n\t ��ǰ �ڵ� ��ȸ...");
		System.out.print("\t ��ǰ �ڵ� :");
		code = sc.nextLine();
				
		System.out.println("�ڵ� \t\t ��ǰ�� \t\t �ܰ� \t\t ����");
		
		if(product.containsKey(code)){

			ProductVO pvo = product.get(code);	//����� ��ǰ��ü�� ã�ƿ´�.
			System.out.println(code + " \t\t " + pvo.getPanme() + " \t\t " + pvo.getPrice() + " \t\t " + pvo.getQuantity());
		}
		
		
		/*if(!product.containsKey(code)){
			System.out.println("\t ��ϵ��� ���� �ڵ��Դϴ�.");
			return;
		}
		
		ProductVO pvo = product.get(code);	//����� ��ǰ��ü�� ã�ƿ´�.
		System.out.println(code + " \t\t " + pvo.getPanme() + " \t\t " + pvo.getPrice() + " \t\t " + pvo.getQuantity());
		*/
		System.out.println();
		
		
	}

	@Override
	public void listProduct() {
		// TODO Auto-generated method stub
		//��ǰ ��ü ����Ʈ
		System.out.println("\n\t\t ��ǰ ��ü ����Ʈ.....");
		System.out.println("�ڵ� \t\t ��ǰ�� \t\t �ܰ� \t\t ����");
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
		
		//�Ǹ�
		String code;
		System.out.println("\n\t ��ǰ �ڵ� ��ȸ...");
		System.out.print("\t ��ǰ �ڵ� :");
		sc.nextLine();
		code = sc.nextLine();
		
		if( !product.containsKey(code) ){
			System.out.println("\t ��ϵ��� ���� ��ǰ�Դϴ�.");
			return;
		}
		
		ProductVO pvo = product.get(code);
		
		System.out.println();
		System.out.println("\t ��ǰ�� : " + pvo.getPanme() + ", ���� ���� : " + pvo.getQuantity());
		
		SaleVO svo = new SaleVO();
		
		svo.setCode(code);
		
		System.out.print("\t ���� : ");
		svo.setSname(sc.nextLine());
		
		System.out.print("\t ����� : ");
		svo.setCreated(sc.nextLine());
		
		System.out.print("\t �Ǹż��� : ");
		svo.setQuantity(sc.nextInt());
		
		//�Ǹŷ��� ����� ���Ѵ�.
		//�Ǹŷ��� ������� ���� ���� ����.
		if(svo.getQuantity() > pvo.getQuantity()){
			System.out.println("\t �Ǹŷ��� ������� ���� ���� ����. \n");
			return;
		}
		
		//��� ����
		pvo.setQuantity(pvo.getQuantity() - svo.getQuantity());
		
		//����Ʈ�� ���
		sale.add(svo);
		System.out.println("\t �ֹ��� �Ϸ�Ǿ����ϴ�.");
		
	}

	@Override
	public void searchSale() {
		// TODO Auto-generated method stub
		
		//��ǰ������ �Ǹ���Ȳ ��ȸ
		String pname;
		
		System.out.println("\n\t �Ǹŵ� ��ǰ�� ��ȸ : ");
		pname = sc.nextLine();
		
		System.out.println("�ڵ� \t\t ��ǰ�� \t\t ���� \t\t �Ǹ����� \t\t �ܰ� \t\t ���� \t\t ����");
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
		System.out.println("\n\t ��ü �Ǹ� ����Ʈ.... : ");
		System.out.println("�ڵ� \t\t ��ǰ�� \t\t ���� \t\t �Ǹ����� \t\t �ܰ� \t\t ���� \t\t �ݾ�");
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
