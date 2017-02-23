package javaDay16;

import java.util.*;

public class QueueEx02 {
	private static final String colors[] = {
			"����","��ȫ��","��Ȳ��","�Ķ���","���λ�","����"		
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
