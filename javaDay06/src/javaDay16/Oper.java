package javaDay16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oper {
	int in_num = 0;	//�Է¹��� ����
	int sum = 0;
	void Input() {
		try {
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
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
			Input();
		}
	}
	
	//����ó�� calculate
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
