package javaDay16;

import java.util.*;

public class MapEx01 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] msg = {
				"Berlin","Dortmund","Frankfurt","Gelsenkirchen","Hamburg"
		};
		
		//HashMap 생성
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//map에 저장
		for(int i = 0; i < msg.length; i++){
			map.put(i,msg[i]);
		}
		
		/*for(int i = 0; i < msg.length; i++){
			System.out.println(map.get(i));
		}*/
		
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key:keys){
			System.out.println(map.get(key));
		}
		
		
	}

}
