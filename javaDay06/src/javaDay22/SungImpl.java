package javaDay22;

import java.util.Scanner;

public class SungImpl implements Sung {
	
	Record[] re;
	int in;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void set() {
		// TODO Auto-generated method stub
		do{
			System.out.print("인원수 입력(1~100):");
			in = sc.nextInt();
		}while( in < 1 || in > 100);
		
		re = new Record[in];
		
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		for( int i = 0; i < re.length; i++){
			
			re[i] = new Record();
			System.out.printf("%d 번째 학색의 학번 이름 입력(공백구분) : ", i+1);
			
			re[i].numbel = sc.nextInt();
			re[i].name = sc.next();
			
			System.out.printf("국어 영어 수학 점수 입력(공백구문):");
			re[i].sco[0] = sc.nextInt();
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			
			//평가
			for(int j = 0; j < re[i].sco.length; j++){
				if(re[i].sco[j] >= 90){
					re[i].scor[j] = "수";
				}else if(re[i].sco[j] >= 80){
					re[i].scor[j] = "우";
				}else if(re[i].sco[j] >= 70){
					re[i].scor[j] = "미";
				}else if(re[i].sco[j] >= 60){
					re[i].scor[j] = "양";
				}else{
					re[i].scor[j] = "가";
				}
			}//end of j
			
			//합계와 평균
			re[i].sum = re[i].sco[0] + re[i].sco[1] + re[i].sco[2];
			re[i].avg = re[i].sum/3;
			
			//정렬
			
		}//end of i
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i < re.length; i++){
			System.out.printf("%5s %5s %3d %3d %3d %3d %3d\n", re[i].numbel,re[i].name,re[i].sco[0],re[i].sco[1],re[i].sco[2],re[i].sum,re[i].avg);
			
		}
	}

}
