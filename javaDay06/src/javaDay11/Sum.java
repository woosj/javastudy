package javaDay11;

import java.io.*;

public class Sum {
	
	int in_num = 0;	//입력받은 정수
	int sum = 0;
	void Input() throws IOException{
		//입력 버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1~1000 까지의 숫자를 입력하세요.");		
		in_num = Integer.parseInt(br.readLine());
		
		if(in_num < 1 || in_num > 1000){
			System.out.println("숫자를 다시 입력하세요.");
			Input();
		}
		
		/*do{
			System.out.println("1~1000 까지의 숫자를 입력하세요.");		
			in_num = Integer.parseInt(br.readLine());
			
			if(in_num < 1 || in_num > 1000){
				System.out.println("숫자를 다시 입력하세요.");
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
		System.out.println("1~"+in_num+" 까지의 합은 : " + sum);
	}
}
