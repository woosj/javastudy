package javaDay07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ArgsEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int human = Integer.parseInt(args[0]);
		
		String name[] = new String[human];
		String[] subject = new String[args.length-1];
		
		int[][] jumsu = new int[human][args.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
		for(int i =0; i< args.length -1; i++){
			//과목명 가저오기
			subject[i] = args[i+1];
		}
		
		for(int i =0; i< human; i++){
			//사람 수만큼 반복
			System.out.print(i+1 + "번째 학생 이름 : ");
			name[i] = br.readLine();
			System.out.println(name[i] + " 학생 점수입력");
			for(int j = 0; j < subject.length; j++){
				//과목수 만큼 총점을 구한다.
				System.out.print(subject[j] + "점수 :");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				//총점 구함
				jumsu[i][subject.length] += jumsu[i][j];
			}
		}
		
		//평균 구하기
		for(int i = 0; i < human; i++){
			avg[i] = (float)jumsu[i][subject.length]/subject.length;
		}
		
		//학점 구하기
		
		//석차 구하기 
		
		//출력
		System.out.print("이름\t");
		for(int i = 0; i < subject.length; i++){
			//과목
			System.out.print(subject[i]+"\t");
		}
		System.out.print("총점\t");
		System.out.print("평균\t");
		System.out.println();
		
		for(int i =0; i< name.length; i++){
			//사람 출력
			System.out.print(name[i]+"\t");
			for(int j = 0; j < jumsu.length; j++){
				//과목 점수 총점
				System.out.print(jumsu[i][j]+"\t");
			}
			
			//평균
			System.out.println(avg[i]);
		}
				
	}

}
