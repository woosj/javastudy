package Multicasting;

/************************************************************
 * MultiServer : 모든 클라이언트의 연결요청을 받아서 Socket을 생성하고
 * 				 Socket을 유지하기 위한 Thread 객체를 생성한다
 * 				 생성된 스레드 객체를 Collection 내에 저장함
 ************************************************************/

import java.net.*;
import java.io.*;
import java.util.*;

public class MultiServer {
	
	//특정 클라이언트가 보낸 메시지를 모든 클라이언트에게 전달하기 위해 
	//클라이언트와 메시지 송수신 할 수 있는 기능을 가진 MultiServerThread 객체를 저장할 자료구조를 선언함
	private ArrayList<MultiServerThread> clientList = new ArrayList<MultiServerThread>();
	private ServerSocket server = null;
	
	public MultiServer() {
		// TODO Auto-generated constructor stub
		
		//1004번 포트번호와 클라이언트의 접속요청을 기다리고 있는 서버소켓생성
		try{
		
			server = new ServerSocket(3000);
			System.out.println("♥♥♥서버시작됨♥♥♥");
			
			while(true){
				
				//클라이언트의 연결요청을 대기하고 있다가
				//연결 요청이 접수되면 해당클라이언트랑 통신 할 수 있는 소켓을 만들어서 반환함
				Socket socket = server.accept();
				
				//소켓으로부터 ip주소와 호스트명을 가지고 있는 InetAddress 객체얻기
				InetAddress ip = socket.getInetAddress();
				
				//InetAddress 객체로부터 ip주소얻기
				String ipAddress = ip.getHostAddress();
				
				System.out.println(ipAddress+"들어옴");
				
				//Client랑 송수신할 수 있는 기능을 가진 MultiServerThread를 저장하고 있는 clientList와
				//해당 클라이언트와 연결된 Socket객체를 전달해서 MultiServerThread객체를 생성함
				MultiServerThread t = new MultiServerThread(clientList, socket);
				t.start();
				
				//생성된 MultiServerThread 객체를 clientList에 저장함
				clientList.add(t);
				
			}
			
		}catch(IOException io){
			System.out.println(io.getMessage());
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MultiServer();
		
	}

}
