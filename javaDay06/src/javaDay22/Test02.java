package javaDay22;

//��������

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {52,42,12,63,50,29,80,10};
		/*
		 * 
		 */
		
		int i,j,temp;
		System.out.print("���� ������ : ");
		
		for(int n : a)
			System.out.print(n + " ");
		
		System.out.println();
		
		for( i = a.length-1; i > 0; i--){
			for(j = 0; j < i; j++){
				if(a[j] > a[j+1]){
					//�������� ����
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
		
		System.out.print("�������� ������ : ");
		
		for(int n : a)
			System.out.print(n + " ");
		
		System.out.println();
		
		for( i = a.length-1; i > 0; i--){
			for(j = 0; j < i; j++){
				if(a[j] < a[j+1]){
					//�������� ����
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
		
		System.out.print("��������  ������ : ");
		
		for(int n : a)
			System.out.print(n + " ");
		
		System.out.println();
	}

}
