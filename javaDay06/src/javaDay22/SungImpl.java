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
			System.out.print("�ο��� �Է�(1~100):");
			in = sc.nextInt();
		}while( in < 1 || in > 100);
		
		re = new Record[in];
		
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		for( int i = 0; i < re.length; i++){
			
			re[i] = new Record();
			System.out.printf("%d ��° �л��� �й� �̸� �Է�(���鱸��) : ", i+1);
			
			re[i].numbel = sc.nextInt();
			re[i].name = sc.next();
			
			System.out.printf("���� ���� ���� ���� �Է�(���鱸��):");
			re[i].sco[0] = sc.nextInt();
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			
			//��
			for(int j = 0; j < re[i].sco.length; j++){
				if(re[i].sco[j] >= 90){
					re[i].scor[j] = "��";
				}else if(re[i].sco[j] >= 80){
					re[i].scor[j] = "��";
				}else if(re[i].sco[j] >= 70){
					re[i].scor[j] = "��";
				}else if(re[i].sco[j] >= 60){
					re[i].scor[j] = "��";
				}else{
					re[i].scor[j] = "��";
				}
			}//end of j
			
			//�հ�� ���
			re[i].sum = re[i].sco[0] + re[i].sco[1] + re[i].sco[2];
			re[i].avg = re[i].sum/3;
			
			//����
			
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
