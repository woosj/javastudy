package Multicasting;

import java.io.*;

public class MultiClientThread extends Thread {

	private BufferedReader in; //������ ������ �޽����� �����ϱ� ���� Ŭ����
	
	//��ü �����ÿ� ������ ������ �޽����� �о� ���� �� �ִ� BufferedReader�� ���޹���
	public MultiClientThread(BufferedReader in) {
		// TODO Auto-generated constructor stub
		this.in = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try{
			
			while(true){
				String text = in.readLine();
				System.out.println("���Ÿ޽���:"+text);
			}
			
		}catch(IOException io){
			io.printStackTrace();
		}
		
	}
	
}
