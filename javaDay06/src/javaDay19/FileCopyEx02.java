package javaDay19;

import java.io.*;

public class FileCopyEx02 {
	//byte[] �� �̿��Ͽ� ����
	public static void main(String[] args) {
		
System.out.println("���� ���� ����...");
		
		long start = System.currentTimeMillis();	//�ý��ۿ��� �����ϴ� ����Ÿ��
		
		FileInputStream src = null;	//file original
		
		FileOutputStream dest = null;	//copy file
		
		try {
			//���� ������ �б����� FileInputTream ����
			src = new FileInputStream("l:/files/win.zip");
			
			//���纻 ������ �����ϱ� ���� FileOutStream ��ü ����
			dest = new FileOutputStream(new File("l:/files/win_dest.zip"));
			
			//�ӽ�����ҿ� ����� data�� ��ü ������ ������ ���� ����
			int length = 0;
			
			//�ӽ� ����ҷ� ���� byte[] �迭����
			byte[] buffer = new byte[1024*8];	//�迭�� ũ�� 8kbyte
			
			//inputStream�� ���ؼ� �о���� data�� �ӽ�����ҿ� �׾� �����ϰ� ����� data�� ������ length�� ������
			
			
			while( (length = src.read(buffer)) != -1 ){
				//OutputStream�� ���ؼ� �ӽ�����ҿ� �׿��ִ� data�� length��ŭ ���Ͽ� �����
				dest.write(buffer, 0, length);
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
