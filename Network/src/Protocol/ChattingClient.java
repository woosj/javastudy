package Protocol;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ChattingClient extends JFrame implements ActionListener {
	
	//�����
	Socket socket = null;
	ObjectOutputStream oos = null; //���� �Է��� �޽����� ������ ���� ��
	ObjectInputStream ois = null; //�������� ������ �޽����� �о�ö�

	JPanel jp_center = new JPanel();
	
	JTextArea jta_display = new JTextArea();
	JScrollPane jsp_display = new JScrollPane(jta_display);
	
	JTextField jtf_msg = new JTextField();
	JPanel jp_east = new JPanel();
	
	String cols[] = {"��ȭ��"};
	String data[][] = new String[0][0];
	
	DefaultTableModel dtm = new DefaultTableModel(data,cols);
	JTable jtb_name = new JTable(dtm);
	JScrollPane jsp_name = new JScrollPane(jtb_name);
	
	JPanel jp_east_south = new JPanel();
	JButton jbtn_whisper = new JButton("�ӼӸ��ϱ�");
	JButton jbtn_change = new JButton("��ȭ��");
	JButton jbtn_fontColor = new JButton("���ڻ�");
	JButton jbtn_exit = new JButton("������");
	
	//��ȭ���� ���� ���� ����
	String nickName = null;
	
	
	//������
	public ChattingClient() {
		// TODO Auto-generated constructor stub
		
		nickName = JOptionPane.showInputDialog("��ȭ���� �Է��ϼ���");
		
		try {
			
			socket = new Socket("127.0.0.1", 6000);
			
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			oos.writeObject("100#"+nickName);
			ChattingClientThread cct = new ChattingClientThread(this);
			cct.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	//ȭ��ó����
	public void initDisplay(){
		
		//�̺�Ʈ������
		jtf_msg.addActionListener(this);
		jbtn_change.addActionListener(this);
		jbtn_whisper.addActionListener(this);
		jbtn_exit.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter(){
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				exitChat();
				System.exit(0);
			}
			
		});
		
		
		jta_display.setLineWrap(true);
		this.setLayout(new GridLayout(1,2));
		
		jp_center.setLayout(new BorderLayout());
		jp_center.add("Center", jsp_display);
		jp_center.add("South", jtf_msg);
		jp_center.setBackground(Color.orange);
		
		jp_east.setLayout(new BorderLayout());
		jp_east.setBackground(Color.green);
		
		jp_east_south.setLayout(new GridLayout(2,2));
		jp_east_south.add(jbtn_whisper);
		jp_east_south.add(jbtn_change);
		jp_east_south.add(jbtn_fontColor);
		jp_east_south.add(jbtn_exit);
		
		jp_east.add("Center", jsp_name);
		jp_east.add("South", jp_east_south);
		
		this.add(jp_center);
		this.add(jp_east);
		this.setTitle(nickName+"���� ��ȭâ");
		this.setSize(500, 500);
		this.setVisible(true);
		
	}
	
	
	//������ ��ư ȣ���(â�ݱ� ����, â�ݱ� ��ư�� Ŭ����)
	public void exitChat(){
		
		try {
			
			//������ ���� ������ �뺸�ϱ�
			oos.writeObject(Protocol.ROOM_OUT+"#"+this.nickName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object obj = e.getSource(); //�̺�Ʈ�� ������ Ŭ������ �ּҹ����� �޾ƿ�
		String msg = jtf_msg.getText(); //�ؽ�Ʈ�ʵ�κ��� �޽����� �����ٰ� msg�� ����
		
		if(obj==jtf_msg){
			
			//�޽����� �Է��� ����Ű�� ���� ��
			System.out.println("�޽��� �Է� Ȯ��");
			jtf_msg.setText(""); //���͸� ġ�� ������ ���� �ʱ�ȭ��
			
			try {
				oos.writeObject(Protocol.MESSAGE+"#"+nickName+"#"+msg);
			} catch (IOException io) {
				System.out.println(io.toString());
			}
		}//�޽��� ���� ��
		
		
		//��ȭ�� ���� ��ư Ŭ��������
		else if(obj==jbtn_change){
			
			String afterName = JOptionPane.showInputDialog("������ ��ȭ���� �Է��ϼ���.");
			
			//������ ��ȭ���� �Է����� �ʾ��� ���
			if(afterName == null || afterName.trim().length() < 1){
				
				//actionPerformed �޼��� ���� ����
				return;
				
			}//end if
			
			try {
				
				oos.writeObject(Protocol.CHANGE+"#"+nickName+"#"+afterName);
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
		}//��ȭ�� ���� ��
		
		
		//�ͼӸ� �� ��� �����ϱ�
		else if(obj==jbtn_whisper){
			
			int row = jtb_name.getSelectedRow();
			
			//�������� �ʾ��� ���
			if(row == -1){
				
				JOptionPane.showMessageDialog(
						
						this, "�ӼӸ� ���¸� �����ϼ���",
						"INFO",
						JOptionPane.INFORMATION_MESSAGE
						
						);
				
				//actionPerformed �޼��� ��������
				return;
			}else{
				
				String name = (String)dtm.getValueAt(row, 0);
				
				if(nickName.equals(name)){
					
					JOptionPane.showMessageDialog(this, "�ٸ� ��븦 �����ϼ���", "INFO", JOptionPane.INFORMATION_MESSAGE);
					
					//actionPerformed �޼��� ��������
					return;
					
				}
				
				String msg1 = JOptionPane.showInputDialog(name+"�Կ��� ���� �޽��� �Է�");
				
				try {
					oos.writeObject(Protocol.WHISPER
									+"#"+nickName
									+"#"+name
									+"#"+msg1);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}//�ӼӸ� ��ȭ ��
		
		
		//������ ��ư
		else if(obj==jbtn_exit){
			this.exitChat();
			System.exit(0);
		}
		
		
		

	}
	
	public static void main(String[] args) {
		
		ChattingClient cClient = new ChattingClient();
		cClient.initDisplay();
		
	}

}
