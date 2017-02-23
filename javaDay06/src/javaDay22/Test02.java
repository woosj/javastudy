package javaDay22;

//버블정렬

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {52,42,12,63,50,29,80,10};
		/*
		 * 
		 */
		
		int i,j,temp;
		System.out.print("원본 데이터 : ");
		
		for(int n : a)
			System.out.print(n + " ");
		
		System.out.println();
		
		for( i = a.length-1; i > 0; i--){
			for(j = 0; j < i; j++){
				if(a[j] > a[j+1]){
					//오름차순 정렬
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
		
		System.out.print("오름차순 데이터 : ");
		
		for(int n : a)
			System.out.print(n + " ");
		
		System.out.println();
		
		for( i = a.length-1; i > 0; i--){
			for(j = 0; j < i; j++){
				if(a[j] < a[j+1]){
					//내림차순 정렬
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
		
		System.out.print("내림차순  데이터 : ");
		
		for(int n : a)
			System.out.print(n + " ");
		
		System.out.println();
	}

}
