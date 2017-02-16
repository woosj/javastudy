package unicasting;

import java.net.*;
import java.io.*;

public class UnicastServerThread extends Thread{

	/*************************************************************
	 * ������ Ŭ���̾�Ʈ�� ����� Socket ��ü�� ������ ������,
	 * Ŭ���̾�Ʈ�� ������ �����ϰ� ����� �����
	 *************************************************************/

	//�����κ��� ���޵� Socket(Ŭ���̾�Ʈ�� �����)�� ������
	Socket socket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	//��ü ������ Socket�� ���޹޾Ƽ� ��������� �����ϴ� ��������
	public UnicastServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket=socket;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//��Ʈ������
		
		try {
			
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//Ŭ���̾�Ʈ�� �ۼ�����
			while(true){
				
				//Ŭ���̾�Ʈ�� ������ �޽��� ����
				String msg = br.readLine();
				System.out.println(msg);
				
				//Ŭ���̾�Ʈ���� �޽��� ������
				bw.write(msg+"\n");
				
				//�޽����� �����ϰ� ���۸� ���
				//���۸� ����� ���ο� �޽����� ���� �� ����
				bw.flush();
				
			}
			
		} catch (IOException io) {
			//Ŭ���̾�Ʈ�� ������ ������ ��� �߻�
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			
			System.out.println("["+address+"]"+"���� ������ ���������ϴ�.");
			
		}
		
	}
	
}
