package javaDay02;
import java.io.*;
import java.util.*;

public class InputEx3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String name;
		String nai;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("���� �Է� :");
		nai = br.readLine();
		
		System.out.println("����� �̸��� :" + name);
		System.out.println("����� ���̴� :" + nai);
		
		//��ĳ�ʿ��� ������� ����
		Scanner sc = new Scanner(System.in);
		
	}

}
