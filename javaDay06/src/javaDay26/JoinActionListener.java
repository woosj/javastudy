package javaDay26;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JoinActionListener implements ActionListener {
	
	//입력필드
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
		JFrame temp = new JFrame("되어라");
		display = new JDialog(temp, "되어라");
		display.setLayout(new FlowLayout());
		
		if(tfPass.getText().equals(tfPassRe.getText())){
			display.add(new Label(tfId.getText()));
			display.add(new Label(tfPass.getText()));
			display.add(new Label(button.isSelected()?"남자":"여자"));
		}else{
			display.add(new Label("비밀번호를 재확인하세요."));
		}
		
		display.setSize(300, 200);
		display.setVisible(true);
		
	}

}
