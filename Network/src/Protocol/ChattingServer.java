package Protocol;

import java.net.*;
import java.util.*;
import javax.swing.*;

public class ChattingServer extends JFrame{

	//�����
	//Ŭ���̾�Ʈ ������ ������ �޾��ִ� �������� ����
	ServerSocket server = null;
	
	//���� �޽����� �ְ� ���� �� ����ϴ� ����
	Socket client = null;
	
	//�������Ͽ� ������ �ؿ��� Ŭ���̾�Ʈ �� ����ڵ鿡 ���� ������ ��� �� �ڷᱸ�� ����
	List<ChattingServerThread> chatList = null;
	ChattingServerThread csThread = null;
	
	JTextArea jta_log = new JTextArea();
	JScrollPane jsp_log = new JScrollPane(jta_log, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	//������
	public ChattingServer() {
		// TODO Auto-generated constructor stub
	}
	
	//���� �ʱ� �����ϱ�
	public void init(){
		
		//������ ������ Ŭ���̾�Ʋ�� ������ �����带 ���� ���� ����
		chatList = new Vector<ChattingServerThread>();
		
		boolean isStop = false;
		
		try {
			
			server = new ServerSocket(6000);
			
			while(!isStop){
				
				//���������� ���� ������ ����� ���� ������ �޾Ƽ� ���Ͽ� ���
				client = server.accept();
				
				//���������
				csThread = new ChattingServerThread(this);
				csThread.start();
				
			}
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//end init()
	
	//ȭ��ó��
	public void initDisplay(){
		
		jta_log.setEditable(false);
		this.add("Center",jsp_log);
		this.setTitle("�α����â");
		this.setSize(500,500);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChattingServer cServer = new ChattingServer();
		cServer.initDisplay();
		cServer.init();

	}

}
