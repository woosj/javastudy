package javaDay02;
//���� �ϳ� �̻� �Է¹ޱ�
import java.io.*;

public class InputEx4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor,eng,mat,sum =0;
		
		System.out.print("��������");
		kor  = Integer.parseInt(br.readLine());
		System.out.print("��������");
		eng  = Integer.parseInt(br.readLine());
		System.out.print("��������");
		mat  = Integer.parseInt(br.readLine());
		
		sum = kor + eng + mat;
		
		System.out.println("�հ�����:"+sum);
	}

}
