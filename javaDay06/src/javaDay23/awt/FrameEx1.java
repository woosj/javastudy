package javaDay23.awt;

import java.awt.*;

public class FrameEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ ��ü ����
		Frame f = new Frame();
		
		//������ �̺�Ʈ ��ü �߰�
		WinEvent w = new WinEvent();
		//������ ��ü�� ������������Ѵ�.
		f.addWindowListener(w);
		
		f.setSize(300, 200);	//�������� ũ�� ���� ���ο� ����
		f.setVisible(true);	//������ ���̱� ���� true �ϋ��� ����, false�϶��� �Ⱥ���
		
	}

}
