package javaDay26;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JoinActionListener implements ActionListener {
	
	//�Է��ʵ�
	JTextField tfId;
	JTextField tfPass;
	JTextField tfPassRe;
	JRadioButton button;
	JDialog display;
	
	public JoinActionListener(JTextField tfId, JTextField tfPass, JTextField tfPassRe, JRadioButton firstJRD) {
		// TODO Auto-generated constructor stub
		this.button = firstJRD;
		this.tfId = tfId;
		this.tfPass = tfPass;
		this.tfPassRe = tfPassRe;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame temp = new JFrame("�Ǿ��");
		display = new JDialog(temp, "�Ǿ��");
		display.setLayout(new FlowLayout());
		
		if(tfPass.getText().equals(tfPassRe.getText())){
			display.add(new Label(tfId.getText()));
			display.add(new Label(tfPass.getText()));
			display.add(new Label(button.isSelected()?"����":"����"));
		}else{
			display.add(new Label("��й�ȣ�� ��Ȯ���ϼ���."));
		}
		
		display.setSize(300, 200);
		display.setVisible(true);
		
	}

}
