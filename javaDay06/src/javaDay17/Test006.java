package javaDay17;

import java.util.Random;
import java.util.Scanner;

/*
 * 1 ~ 3  사이의 난수를 발생시켜 가위, 바위, 보 게임을 구현하시오.
 * 단, 배열을 사용하고 클래스분할로 구현
 * 기준 데이터 :	1. 가위, 2: 바위, 3: 보
 * 실행결과
 * 1: 가위 2: 바위 3: 보 중 입력: 2
 * 사용자 : 바위 
 * 컴퓨터 : 보
 * 컴퓨터가 이겼습니다.
 * The Class name is RookPaperScissor
 * 클래스 하지마
 */
public class Test006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] game = new int[3];
		String[] str = {"가위","바위","보"};
		int user;
		int com;	
		Random r = new Random();
		
		//배열에 1,2,3을 입력 값이 1이면 가위 2이면 바위 3이면 보
		for(int i = 0; i < game.length; i++){
			game[i] += i+1;
		}
		
		do{
			System.out.println("1: 가위 2: 바위 3: 보 중 입력 : ");
			user = sc.nextInt();
			if( user < 1 || user > 3){
				System.out.println("잘못 입력하였습니다.");
			}
		}while(user < 1 || user > 3);
		
		com = r.nextInt(3);
		
		System.out.println("사용자 : " + str[user]);
		System.out.println("컴퓨터 : " + str[com]);
		
		if(game[com] == game[user]){
			
			System.out.println("비겼습니다.");
			
		}else if( (game[user] == 2 && game[com] == 1) || (game[user] == 3 && game[com] == 2) || (game[user] == 1 && game[com] == 3) ){
			
			System.out.println("사용자가 이겼습니다.");
			
		}else{
			
			System.out.println("컴퓨터가 이겼습니다.");
			
		}
		
		
		
		
		
	}

}
