package javaDay16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oper {
	int in_num = 0;	//입력받은 정수
	int sum = 0;
	void Input() {
		try {
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
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			System.out.println("잘못된 입력값입니다.");
			System.out.println("숫자를 다시 입력하세요.");
			Input();
		}
	}
	
	//연산처리 calculate
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
