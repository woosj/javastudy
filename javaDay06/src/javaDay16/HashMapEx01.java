package javaDay16;

import java.util.Hashtable;

public class HashMapEx01 {
	
	//키 : 동일한 값이 존재 할 수 없다.(만약 키가 존재할 경우 마지막 데이터가 저장됨) null이 될수 없음
	private static final String[] name = {"홍길동","강감찬","김유신","이순신","사오정","손오공"};
	
	//값: 동일한 값이 존재해도 가능하다 why : key값에 의해 데이터값을 불러오기 때문
	private static final String[] tel = {"111-1111","222-2222","233-4575","111-1111","333-3333","444-4444"};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		//해시테이블에 키, 값 입력 put(k,v)
		for(int i = 0; i < name.length; i++){
			ht.put(name[i], tel[i]);

		}
		//해시테이블 값을 키를 이용하여 검색함
		String str = ht.get("홍길동");
		
		if(str != null){
			System.out.println(str);
		}
		
		//키가 존재하는지 검색
		if(ht.containsKey("이순신")){
			System.out.println("이순신 존재함");
		}else{
			System.out.println("이순신 존재 안함");
		}
		
		//값이 존재하는지 검색
		if(ht.containsValue("111-1111")){
			System.out.println("111-1111 존재함");
		}else{
			System.out.println("111-1111 존재 안함");
		}
		
		//키값 삭제
		ht.remove("사오정");
		//키가 존재하는지 검색
		if(ht.containsKey("사오정")){
			System.out.println("사오정 존재함");
		}else{
			System.out.println("사오정 존재 안함");
		}
		
	}

}
