package javaDay22;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class TreeMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("만화", "마녀배달부 키키");
		map.put("호러", "레지던트이블");
		map.put("영화", "황혼에서 새벽까지");
		map.put("TV", "불타는 청춘");
		map.put("가", "불타는 청춘");
		map.put("a", "불타는 청춘");
		
		Map<String, String> subMap = map.subMap("TV", "만화");
		System.out.println(subMap);
		/*
		 * TreeMap 클래스는 소트된 상태로 자료를 추가함
		 * TreeMap 클래스의 SortedMap<k,v> subMap(K fromKey, K toKey) 메서드
		 * 맵의 fromKey(이것의 포함한다) ~ toKey(이것을 포함하지 않는다)의 키 범위를 가지는 부분의 뷰를 리턴함
		 */
		System.out.println(map.toString());
	}

}
