package javaDay16;

import java.util.LinkedList;

public class QueueEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] item = {"홍길동","강감찬","김유신","이순신"};
		
		LinkedList<String> q = new LinkedList<String>();
		
		for(String n:item){
			System.out.println(q.offer(n));
		}
		
		System.out.println(q.size());
		
		String data = "";
		
		while((data = q.poll()) != null){
			System.out.println(data);
			System.out.println("q의 크기" + q.size());
		}
	}

}
