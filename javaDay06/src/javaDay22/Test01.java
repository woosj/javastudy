package javaDay22;

//선택정렬(Selection Sort)

public class Test01 {

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
		
		for( i = 0; i < a.length; i++){
			for( j = i+1; j < a.length; j++){
				if(a[i] > a[j]){
					
					/*temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					*/
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
			
			for(int n : a)
				System.out.print(n + " ");
			System.out.println();
		}
		
		System.out.print("정렬후 데이터 : ");
		
		for(int n : a)
			System.out.print(n + " ");
		
		System.out.println();

	}

}
