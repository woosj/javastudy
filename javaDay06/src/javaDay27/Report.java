package javaDay27;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();	//프레임 객체 생성
		JButton[] btn = new JButton[25];	//버튼 배열 생성
		int star = 0;	//별표 앞뒤 공백 개수
		boolean flag = true;	//star 변수를 증가 감소 구분변수 
		
		//버튼을 정렬할 레이아웃 설정
		f.getContentPane().setLayout(new GridLayout(5, 5));
		
		//버튼 배열에 버튼 객체 생성후 패널에 버튼을 추가해준다.
		for( int i = 0; i < btn.length; i++){
			btn[i] = new JButton();	//버튼 객체 생성
			f.getContentPane().add(btn[i]);	//레이아웃에 버튼 추가
		}
		
		//별표 찍기
		for( int i = 0; i < btn.length; i+=5){
			
			//시작 값과 끝 값에 공간값을 넣어주어서 별을 찍을 범위를 설정한다.
			for( int j = i+star; j < i+5-star; j++){
				btn[j].setText("*");	//버튼에 텍스트 생성
				if(star == 2) flag = false;	//공백의 값이 2일때 다시 공백을 하나씩 줄이기 위해 값을 변환
			}
			
			
			if(flag){
				//true 일 경우 공백을 하나씩 늘린다.
				star++;
			}else{
				//false 일 경우 공백을 하나씩 줄인다.
				star--;
			}
		}
		
		//프레임 출력 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
		
	}

}
