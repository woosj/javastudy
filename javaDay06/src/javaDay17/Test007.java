package javaDay17;

import java.util.Iterator;
import java.util.TreeSet;

public class Test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,7,10,11};
		int b[] = {3,6,10,14};
		int[] temp = new int[a.length + b.length];
		int n;
		
		for(n = 0; n < a.length; n++){
			temp[n] = a[n];
		}
		
		for(int k = 0; k < b.length; k++){
			boolean flag = false;
			
			for(int j = 0; j < a.length; j++){
				if(b[k] == a[j]){
					flag = true;
					break;
				}
			}
			
			if(flag){
				continue;
			}
			
			//temp에 저장
			temp[n] = b[k];
			n++;
		}
		
		for(int i = 0; i < temp.length; i++){
			if(temp[i] == 0) continue;
			System.out.printf("%3d",temp[i]);
		}
		System.out.println();
		
		int max = a.length < b.length ? b.length:a.length;
		int min = a.length < b.length ? a.length:b.length;
		
		/*for(int i = 0; i < max; i++ ){
			if( a.length > b.length){
				if(a[max-i-1] == b[min-i-1]){
					System.out.println(a[max-i-1]);
				}else{
					System.out.println(a[max-i-1]);
					System.out.println(b[min-i-1]);
				}
			}else{
				if(a[min-i-1] == b[max-i-1]){
					System.out.println(b[max-i-1]);
				}else{
					System.out.println(b[max-i-1]);
					System.out.println(a[min-i-1]);
				}
			}
			
			
		}*/
		System.out.println();
		for(int i = 0; i < a.length; i++){
			System.out.printf("%3d",a[i]);
		}
				
		for(int i = 0; i < b.length; i++){
			boolean flag = false;
			
			//중복이 되었을 경우
			for(int j = 0; j < a.length; j++)
				if(b[i] == a[j]){
					flag = true;
					break;
				}
			
			//중복이 일어나지 않앗을 경우 계속 진행
			if(flag) continue;
			
			System.out.printf("%3d",b[i]);
			
		}
		/*TreeSet<Integer> tree = new TreeSet<Integer>();
		
		for(int i = 0; i < a.length; i++){
			tree.add(a[i]);
		}
		
		for(int i = 0; i < b.length; i++){
			tree.add(b[i]);
		}
		
		Iterator<Integer> it = tree.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
	}

}
