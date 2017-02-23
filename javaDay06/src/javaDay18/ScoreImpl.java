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
		System.out.print("\n 자료추가..");
		
		String hak;
		System.out.print("학번 :");
		hak = sc.next();
		
		ScoreVo temp = readScoreVo(hak);
		
		if(temp != null){
			System.out.println("등록된 학번입니다.");
			return;
		}
		
		ScoreVo vo = new ScoreVo();
		
		vo.setHak(hak);
		
		System.out.println("이름 : ");
		vo.setName(sc.next());
		
		System.out.println("생년월일 : ");
		vo.setBirth(sc.next());
		
		System.out.println("국어 : ");
		vo.setKor(sc.nextInt());
		
		System.out.println("영어 : ");
		vo.setEng(sc.nextInt());
		
		System.out.println("수학 : ");
		vo.setMat(sc.nextInt());
		
		list.add(vo);
		System.out.println("추가 완료... \n");
		
	}//end of insert();

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print("\n 자료수정..");
		
		String hak;
		System.out.print("수정할 학번 :");
		hak = sc.next();
		
		ScoreVo vo = readScoreVo(hak);
		
		if(vo == null){
			System.out.println("등록된 학번이 없습니다.");
			return;
		}
		
		System.out.println("이름 : ");
		vo.setName(sc.next());
		
		System.out.println("생년월일 : ");
		vo.setBirth(sc.next());
		
		System.out.println("국어 : ");
		vo.setKor(sc.nextInt());
		
		System.out.println("영어 : ");
		vo.setEng(sc.nextInt());
		
		System.out.println("수학 : ");
		vo.setMat(sc.nextInt());
		
		System.out.println("수정 완료... \n");
		
	}//end of update()

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
		System.out.print("\n 자료삭제..");
		
		String hak;
		System.out.print("삭제할 학번 :");
		hak = sc.next();
		
		ScoreVo vo = readScoreVo(hak);
		
		if(vo == null){
			System.out.println("등록된 학번이 없습니다.");
			return;
		}
		
		list.remove(vo);
		
		System.out.println("삭제 완료... \n");
		
	}//end of delete()

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("\n 전체 자료 출력...");
		
		//리스트 안에 있는 데이터를 반복자를 통해서 계속 가지고 올 수 있는 객체생성
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
		
		System.out.print("\n학번 검색 : ");
		
		String hak;
		
		System.out.print("검색할 학번 : ");
		hak = sc.next();
		
		ScoreVo vo = readScoreVo(hak);
		
		if(vo == null){
			System.out.println("학번이 존재하지 않습니다.");
			return;
		}
		
		System.out.println(vo);

	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub
		
		System.out.print("\n이름 검색 : ");
		
		String name;
		
		System.out.print("검색할 이름 : ");
		name = sc.next();
		
		for(ScoreVo vo : list){
			if(vo.getName().startsWith(name)){
				System.out.println(vo);
				
			}
		}
		
	}
	
	//학번이 data에 있는지 확인
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
