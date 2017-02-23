package javaDay16;

import java.util.*;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동1", new Integer(30));
		map.put("홍길동2", new Integer(30));
		map.put("홍길동3", new Integer(50));
		map.put("홍길동4", new Integer(60));
		map.put("홍길동5", new Integer(70));
		
		/*
		 * 키와 값을 Set형태로 저장
		 * (HashMap을 이용해서 key와 value을 묵어주기위해서) 객체를 이용함
		 * Map.Entry 인터페이스 이용
		 * Map.entrySet 메서드는 클래스에 속하는 요소를 가지는 맵의 컬렉션 뷰를 반환함
		 * 맵 엔트리의 참조를 취득하는 유일한 방법은 이컬렉션 뷰의 반복자를 이용하여 취득함 (Iterator)
		 * 
		 */
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String,Integer>> it1 = set1.iterator();
		
		while(it1.hasNext()){
			Map.Entry<String, Integer> e = it1.next();
			System.out.println(e.getKey() + " " + e.getValue());
			
		}
		
		Set set2 = map.keySet();	//키를 set에 저장함
		System.out.println("시험 응시자 명단:" + set2);
		System.out.println(map.values());
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		
		while(it2.hasNext()){
			Integer i = it2.next();
			sum +=i;
		}
		
		System.out.println("합계" + sum);
		System.out.println("평균" + (float)sum/set2.size());
		
		System.out.println("최고점수" + Collections.max(v));
		System.out.println("최하점수" + Collections.min(v));
		
		
	}

}
