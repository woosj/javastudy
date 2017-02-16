package Protocol;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;


public class ChattingServerThread extends Thread{

	ChattingServer cs = null;
	ObjectInputStream ois =null;
	ObjectOutputStream oos = null;
	
	//��ȭ���� ���� ����
	String chatName = null;
	
	public ChattingServerThread(ChattingServer cs) {
		// TODO Auto-generated constructor stub
		
		this.cs=cs;
		
		try {
			
			oos = new ObjectOutputStream(cs.client.getOutputStream());
			ois = new ObjectInputStream(cs.client.getInputStream());
			
			//Ŭ���̾�Ʈ���� ������ �޽��� �б�
			
			
			//100#��ȭ��
			//ROOM_IN#����
			//100���̸� ��ȭ�� ����
			String message = (String)ois.readObject();
			StringTokenizer st = new StringTokenizer(message, "#");
			st.nextToken();
			
			chatName = st.nextToken();
			
			//������ �α�â�� ����ϱ�
			cs.jta_log.append(message+"\n");
			
			//������ ä�� �����ڿ��� ���� ����� �뺸��
			for(ChattingServerThread cst : cs.chatList){
				String currentName = cst.chatName;
				this.send(Protocol.ROOM_IN+"#"+currentName);
			}
			
			//List�� ���ο� ����� �߰�
			cs.chatList.add(this);
			
			this.broadCasting(message);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//��ȭ�濡 ������ ��� ������� �޽����� �����
	public void broadCasting(String message){
		
		for(ChattingServerThread cst : cs.chatList){
			cst.send(message);
		}

	}
	
	//Ŭ���̾�Ʈ�κ��� �о�� �޽����� ���
	public void send(String message){
		
		//ROOM_IN #��ȭ��
		
		try {
			oos.writeObject(message);
		} catch (IOException io) {
			io.printStackTrace();
		}
		
	}
	
	//thread�� �����Ű�� ���ؼ��� run�޼��尡 �ʿ�
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		boolean isStop = false;
		
		try{
			
		run_start:
			while(!isStop){
				
				String message = (String)ois.readObject();
				
				//����ڰ� �Է��� �޽����� �����α�â�� ����ϱ�
				cs.jta_log.append(message+"\n");
				StringTokenizer st = null;
				
				int protocol = 0;
				
				if(message != null){
					
					st = new StringTokenizer(message,"#");
					protocol = Integer.parseInt(st.nextToken());
					
				}
				
				
				switch(protocol)
				{
				
				case Protocol.MESSAGE : {
					broadCasting(message);
				}
				break;

				case Protocol.CHANGE : {
					String nickName = st.nextToken();
					String afterName = st.nextToken();
					this.broadCasting(message);
					this.chatName = afterName;
				}
				break;
				
				case Protocol.WHISPER : {
					String nickName = st.nextToken();
					String otherName = st.nextToken();
					String msg = st.nextToken();
					
					for(ChattingServerThread cst : cs.chatList){
						
						if(otherName.equals(cst.chatName)){
							cst.send(message);
						}
						break;
						
					}
					this.send(message);
					
				}
				break;
				
				case Protocol.ROOM_OUT : {
					String name = st.nextToken();
					String msg = Protocol.ROOM_OUT+"#"+name;
					
					cs.chatList.remove(this);
					this.broadCasting(msg);
					break run_start;
				}
				
				}//end switch
								
			}//end while
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}//end run()
	
	
}
