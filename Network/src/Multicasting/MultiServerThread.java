package Multicasting;

import java.net.*;
import java.io.*;
import java.util.*;

/************************************************************************************
 * MultiServerThread : ������ Ŭ���̾�Ʈ�� ����� Socket ��ü�� ������ ������, Ŭ���̾�Ʈ�� ������
 * 					    �����ϰ� ����� �����
 * 					    Ư�� Ŭ���̾�Ʈ�� ������ �޽����� �����ؼ� ��� Ŭ���̾�Ʈ���� �����ϴ� broadcasting��
 * 					    �����Ǿ����
 ***********************************************************************************/

public class MultiServerThread extends Thread {

	private Socket socket; //MultiServer�� �������ִ� Socket�� ��Ƶ� �������
	private BufferedReader in; //client�� ������ �޽����� �о���� ��Ʈ��
	private PrintWriter out; //client�� �޽����� ������ ��Ʈ��

	//��� MultiServerThread ��ü�� �����ϰ� �ִ� ArrayList
	private ArrayList<MultiServerThread> clientList;

	//MultiServerThread�� ��ü�� �����Ǵ� ������ MultiServer�κ��� clientList�� client�� ��� �� �� �ִ�
	//Socket�� ���� ����
	public MultiServerThread(ArrayList<MultiServerThread> clientList, Socket socket) {
		// TODO Auto-generated constructor stub
		
		this.socket = socket;
		this.clientList = clientList;		
	}
	
	//�����带 �̿��ؼ� �����Ű�����ϴ� ������ ����
	//����ȭ�� �����Ǿ����
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		
		try {
			
			//��Ʈ������
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			//Ŭ���̾�Ʈ�� �޽��� �ۼ����� �ݺ�
			while(true){
				
				//Ŭ���̾�Ʈ�� �۽��� �޽��� �б�
				String msg = in.readLine();
				System.out.println(msg);
				
				//��� Ŭ���̾�Ʈ���� �޽��� ����(broadcasting)
				broadcasting(msg);
				
			}
			
			
		} catch (IOException e) {
			// TODO: handle exception
			
			//Ŭ���̾�Ʈ�� ������ ������ ��� �ش� MultiServerThread ��ü�� ��Ͽ��� ����
			//������� �����ߴµ� �ѻ���� ������ ������� ��� IOException�� �߻���
			//�̰�� �ڱ� �ڽ��� ���������
			clientList.remove(this);

			//Ŭ���̾�Ʈ���� ������ �������� ������ �� ipAddress�� �ּҸ� ������ ����
			String ipAddress = socket.getInetAddress().getHostAddress();
			
			try{
				broadcasting(ipAddress+"�� ������ ���������ϴ�.");
			}catch(IOException io){
				io.printStackTrace();
			}

		}
		
	}//end run()
		
	//��� Ŭ���̾�Ʈ���� �޽��� ����
	public void broadcasting(String msg) throws IOException{
			
		//clientList�� ����� MultiServerThread�� ������ŭ �ݺ��ϸ鼭
		//������ MultiServerThread�� sendMsg �޼��带 ȣ���ؼ� ����� Ŭ���̾�Ʈ���� �޽��� ����
		for(MultiServerThread t : clientList){
			
			//���� MultiServerThread�� sendMsg �޼��带 ȣ���ؼ�
			//�޽����� ������ Ŭ���̾�Ʈ���� ����
			t.sendMsg(msg);
			
		}
		
	}
	
	//���޹��� �޽����� Socket�� OutputStream�� ����� PrintWriter�� �̿��ؼ� Ŭ���̾�Ʈ�� �����ϴ� �޼���
	public void sendMsg(String msg) throws IOException{
		
		out.println(msg);
		out.flush(); //�޽��� ������ ��Ʈ�� ���
		
	}

}
