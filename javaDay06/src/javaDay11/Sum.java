package javaDay11;

import java.io.*;

public class Sum {
	
	int in_num = 0;	//�Է¹��� ����
	int sum = 0;
	void Input() throws IOException{
		//�Է� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1~1000 ������ ���ڸ� �Է��ϼ���.");		
		in_num = Integer.parseInt(br.readLine());
		
		if(in_num < 1 || in_num > 1000){
			System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
			Input();
		}
		
		/*do{
			System.out.println("1~1000 ������ ���ڸ� �Է��ϼ���.");		
			in_num = Integer.parseInt(br.readLine());
			
			if(in_num < 1 || in_num > 1000){
				System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
			}else{
				break;
			}
			
		}while(true);*/
	}
	
	int Sum_result(){
		for(int i = 0; i <= in_num; i++){
			sum = sum + i;
		}
		 return sum;
	}
	
	void disp(){
		System.out.println("1~"+in_num+" ������ ���� : " + sum);
	}
}
