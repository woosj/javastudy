package javaDay19;

import java.io.*;

public class FileCopyEx01 {
	//byte �� �̿��Ͽ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� ���� ����...");
		
		long start = System.currentTimeMillis();	//�ý��ۿ��� �����ϴ� ����Ÿ��
		
		FileInputStream src = null;	//file original
		
		FileOutputStream dest = null;	//copy file
		
		try {
			//���� ������ �б����� FileInputTream ����
			src = new FileInputStream("l:/files/write.zip");
			
			//���纻 ������ �����ϱ� ���� FileOutStream ��ü ����
			dest = new FileOutputStream(new File("l:/files/write_dest.zip"));
			
			//FileInputstream�� ���ؼ� �о���� ���� ������ ���� ����
			int readValue = 0;
			
			//FinleInputStream�� read()�޼��带 ���ؼ� �о���� ���� readValue������ ����
			while( (readValue = src.read()) != 1 ){
				//readValue�� ����� ���� FileOutputStream�� write()�޼��带 ���ؼ� ���Ͽ� ���
				dest.write(readValue);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try{
				if(dest != null){
					dest.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
				
			}
			
			try{
				if(src != null){
					src.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
				
			}
		}
		
		long end = System.currentTimeMillis();
		
		long copyTime = (end - start)/1000;
		
		System.out.println("�����ϴµ� �ɸ��ð�:" + copyTime + "��");
		
	}

}
