package javaDay16;

import java.util.*;

public class QueueEx02 {
	private static final String colors[] = {
			"빨강","분홍색","주황색","파랑색","연두색","남색"		
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		
		for(String str:colors){
			q.offer(str);
		}
		
		while(q.peek() != null){
			System.out.println(q.poll());
		}
		
	}

}
