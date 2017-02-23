package javaDay20;

import java.io.*;

public class BufferedReaderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream("l:/files/hellow.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			//�� ���ξ� �о���� ���ڿ� ������ ���� ����
			String str = null;
			
			//readLine() ���๮�ڸ� ������ ���� ���� ���������� ���ڿ��� ��ȯ�ϰ� 
			//��Ʈ���� ���� �����ϸ� null�� ��ȯ��
			
			while( (str = br.readLine() ) != null ){
				System.out.println(str);
			}
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.getMessage();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {
			try {
				if(fis != null){
					fis.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			try {
				if(isr != null){
					isr.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			try {
				if(br != null){
					br.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
	}

}
