package javaDay18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	
	private List<ScoreVo> list = new ArrayList<ScoreVo>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.print("\n �ڷ��߰�..");
		
		String hak;
		System.out.print("�й� :");
		hak = sc.next();
		
		ScoreVo temp = readScoreVo(hak);
		
		if(temp != null){
			System.out.println("��ϵ� �й��Դϴ�.");
			return;
		}
		
		ScoreVo vo = new ScoreVo();
		
		vo.setHak(hak);
		
		System.out.println("�̸� : ");
		vo.setName(sc.next());
		
		System.out.println("������� : ");
		vo.setBirth(sc.next());
		
		System.out.println("���� : ");
		vo.setKor(sc.nextInt());
		
		System.out.println("���� : ");
		vo.setEng(sc.nextInt());
		
		System.out.println("���� : ");
		vo.setMat(sc.nextInt());
		
		list.add(vo);
		System.out.println("�߰� �Ϸ�... \n");
		
	}//end of insert();

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print("\n �ڷ����..");
		
		String hak;
		System.out.print("������ �й� :");
		hak = sc.next();
		
		ScoreVo vo = readScoreVo(hak);
		
		if(vo == null){
			System.out.println("��ϵ� �й��� �����ϴ�.");
			return;
		}
		
		System.out.println("�̸� : ");
		vo.setName(sc.next());
		
		System.out.println("������� : ");
		vo.setBirth(sc.next());
		
		System.out.println("���� : ");
		vo.setKor(sc.nextInt());
		
		System.out.println("���� : ");
		vo.setEng(sc.nextInt());
		
		System.out.println("���� : ");
		vo.setMat(sc.nextInt());
		
		System.out.println("���� �Ϸ�... \n");
		
	}//end of update()

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
		System.out.print("\n �ڷ����..");
		
		String hak;
		System.out.print("������ �й� :");
		hak = sc.next();
		
		ScoreVo vo = readScoreVo(hak);
		
		if(vo == null){
			System.out.println("��ϵ� �й��� �����ϴ�.");
			return;
		}
		
		list.remove(vo);
		
		System.out.println("���� �Ϸ�... \n");
		
	}//end of delete()

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("\n ��ü �ڷ� ���...");
		
		//����Ʈ �ȿ� �ִ� �����͸� �ݺ��ڸ� ���ؼ� ��� ������ �� �� �ִ� ��ü����
		Iterator<ScoreVo> it = list.iterator();
		
		while(it.hasNext()){
			
			ScoreVo vo = it.next();
			System.out.println(vo);
			
		}
		
		System.out.println();
		
	}// end of listAll()

	@Override
	public void searchHak() {
		// TODO Auto-generated method stub
		
		System.out.print("\n�й� �˻� : ");
		
		String hak;
		
		System.out.print("�˻��� �й� : ");
		hak = sc.next();
		
		ScoreVo vo = readScoreVo(hak);
		
		if(vo == null){
			System.out.println("�й��� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println(vo);

	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub
		
		System.out.print("\n�̸� �˻� : ");
		
		String name;
		
		System.out.print("�˻��� �̸� : ");
		name = sc.next();
		
		for(ScoreVo vo : list){
			if(vo.getName().startsWith(name)){
				System.out.println(vo);
				
			}
		}
		
	}
	
	//�й��� data�� �ִ��� Ȯ��
	public ScoreVo readScoreVo(String hak){
		ScoreVo vo = null;
			
		for(ScoreVo temp: list){
			if(temp.getHak().equals(hak)){
				vo = temp;
				break;
			}
		}
			
		return vo;
			
	}

}
