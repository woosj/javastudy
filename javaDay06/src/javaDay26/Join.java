package javaDay26;

import java.awt.*;
import javax.swing.*;

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ȭ�鱸��
		JFrame frame = new JFrame("ȸ������");
		
		frame.setPreferredSize(new Dimension(300, 300));
		frame.setLocation(800, 200);
		
		Container contentPane = frame.getContentPane();
		
		//��
		JLabel lbId = new JLabel("���̵�");
		JLabel lbPass = new JLabel("��й�ȣ");
		JLabel lbPassRe = new JLabel("��й�ȣ��Ȯ��");
		
		//�Է��ʵ�
		JTextField tfId = new JTextField(50);
		JPasswordField tfPass = new JPasswordField(50);
		JPasswordField tfPassRe = new JPasswordField(50);

		// ���� ��ư
        JRadioButton firstJRD = new JRadioButton( "����", true );
        JRadioButton secondJRD = new JRadioButton( "����" );
        JButton submit = new JButton("Ȯ��");
        
        
        // ��ư �׷� ����
        ButtonGroup buttonGrp = new ButtonGroup();
        buttonGrp.add( firstJRD );
        buttonGrp.add( secondJRD );

        // ���� / �����ӿ� ���
        JPanel panel = new JPanel(new GridLayout(3, 2));
        //���̵� �Է�
        panel.add(lbId);
        panel.add(tfId);
        //��й�ȣ �Է�
        panel.add(lbPass);
        panel.add(tfPass);
        
        //��й�ȣ ���Է�
        panel.add(lbPassRe);
        panel.add(tfPassRe);
        
        // ������ư �г� ���� / �����ӿ� ���
        JPanel buttonPanel = new JPanel();
        //������ư �Է�
        buttonPanel.add(firstJRD);
        buttonPanel.add(secondJRD);
        
        //Ȯ�ι�ư �Է�
        buttonPanel.add(submit);
        
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        
        //�׼Ǹ����� ����
        submit.addActionListener(new JoinActionListener(tfId, tfPass, tfPassRe, firstJRD));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
	}

}
