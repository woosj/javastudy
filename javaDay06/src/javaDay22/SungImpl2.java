package javaDay22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class SungImpl2 implements Sung2 {
	
	private Map<String,Sung2VO> map;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public SungImpl2() {
		// TODO Auto-generated constructor stub
		map = new TreeMap<String, Sung2VO>();
		//map = new HashMap<String, Sung2VO>();
	}
	
	@Override
	public int insert() throws IOException {
		// TODO Auto-generated method stub
		
		String hak;
		System.out.print("\n학번 : ");
		hak = br.readLine();
		
		if(map.containsKey(hak)){
			System.out.println("이미 존재하는 학번입니다.");
			return 0;
		}
		
		Sung2VO ob = new Sung2VO();
		ob.setHak(hak);
		
		System.out.print("이름 :");
		ob.setName(br.readLine());
		
		System.out.print("국어점수 :");
		ob.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("영어점수:");
		ob.setEng(Integer.parseInt(br.readLine()));
		
		System.out.print("수학점수 :");
		ob.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, ob);
		
		return 1;
	}

	@Override
	public int update() throws IOException {
		// TODO Auto-generated method stub
		
		String hak;
		System.out.print("\n수정할 학번 : ");
		hak = br.readLine();
		
		if(!map.containsKey(hak)){
			System.out.println("존재하지 않는 학번입니다.");
			return 0;
		}
		
		Sung2VO ob = new Sung2VO();
		ob.setHak(hak);
		
		System.out.print("이름 :");
		ob.setName(br.readLine());
		
		System.out.print("국어점수 :");
		ob.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("영어점수:");
		ob.setEng(Integer.parseInt(br.readLine()));
		
		System.out.print("수학점수 :");
		ob.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, ob);
		
		return 1;
	}

	@Override
	public void search() throws IOException {
		// TODO Auto-generated method stub
		//학번으로 검색시
		String hak;
		System.out.print("\n검색 할 학번 : ");
		hak = br.readLine();
		
		if(!map.containsKey(hak)){
			System.out.println("존재하지 않는 학번입니다.");
		}
		
		/*Sung2VO info = map.get(hak);
		System.out.println(info.toString());
		*/
		
		System.out.println(map.get(hak).toString());
		
		/*//이름으로 검색시
		String name;
		System.out.print("\n검색 할 이름 : ");
		name = br.readLine();
		
		//키값을 배열로 가져옴
		Set<String> keys = map.keySet();
		//배열의 키값을 하나씩 가져온다.
		for(String key : keys){
			//각각의 키값으로 객체를 불러와 저장한다.
			Sung2VO ob = map.get(key);
			//이름을 비교하여 같으면 정보 출력
			if(ob.getName().equals(name)){
				System.out.println(ob.toString());
			}
			
		}
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			Sung2VO data = map.get(key);
			if(data.getName().equals(name)){
				System.out.println(data.toString());
			}
		}*/
		
	}

	@Override
	public int delete() throws IOException {
		// TODO Auto-generated method stub
		
		String hak;
		System.out.print("\n삭제할 학번 : ");
		hak = br.readLine();
		
		if(!map.containsKey(hak)){
			System.out.println("존재하지 않는 학번입니다.");
			return 0;
		}
		
		map.remove(hak);		
		System.out.println("자료삭제 완료....");
		
		return 1;
	}

	//전체출력(학번순)
	@Override
	public void writeAll() {
		// TODO Auto-generated method stub
		
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		
		System.out.println("\n 전체출력 ");
		
		while(it.hasNext()){
			String key = it.next();
			Sung2VO data = map.get(key);
			System.out.println(data.toString());
			
		}

	}
	
	//전체출려(정렬)
	@Override
	public void writeSort() {
		// TODO Auto-generated method stub
		List<Sung2VO> lists = new ArrayList<Sung2VO>();
		Set<String> set = map.keySet();
		Iterator<String> it1 = set.iterator();
		
		while(it1.hasNext()){
			String key = it1.next();
			lists.add(map.get(key));
		}
		//오름차순 정렬
		Collections.sort(lists, new MyComparator<Sung2VO>());
		//내림차순 정렬
		Collections.sort(lists, Collections.reverseOrder(new MyComparator<Sung2VO>()));
		System.out.println("\n 합계순으로 출력");
		
		Iterator<Sung2VO> it2 = lists.iterator();
		
		while(it2.hasNext()){
			Sung2VO data = it2.next();
			System.out.println(data.toString());
		}
	}

}

class MyComparator<T> implements Comparator<T>{
		@Override
		public int compare(T o1, T o2) {
			// TODO Auto-generated method stub
			Sung2VO s1 = (Sung2VO)o1;
			Sung2VO s2 = (Sung2VO)o2;
			
			int n = s1.getTot() - s2.getTot();
			if(n > 1){
				return 1;
			}else{
				return -1;
			}
		}
		
}