package javaDay26;

import java.awt.*;
import javax.swing.*;

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//화면구성
		JFrame frame = new JFrame("회원가입");
		
		frame.setPreferredSize(new Dimension(300, 300));
		frame.setLocation(800, 200);
		
		Container contentPane = frame.getContentPane();
		
		//라벨
		JLabel lbId = new JLabel("아이디");
		JLabel lbPass = new JLabel("비밀번호");
		JLabel lbPassRe = new JLabel("비밀번호재확인");
		
		//입력필드
		JTextField tfId = new JTextField(50);
		JPasswordField tfPass = new JPasswordField(50);
		JPasswordField tfPassRe = new JPasswordField(50);

		// 라디오 버튼
        JRadioButton firstJRD = new JRadioButton( "남자", true );
        JRadioButton secondJRD = new JRadioButton( "여자" );
        JButton submit = new JButton("확인");
        
        
        // 버튼 그룹 설정
        ButtonGroup buttonGrp = new ButtonGroup();
        buttonGrp.add( firstJRD );
        buttonGrp.add( secondJRD );

        // 설정 / 프레임에 등록
        JPanel panel = new JPanel(new GridLayout(3, 2));
        //아이디 입력
        panel.add(lbId);
        panel.add(tfId);
        //비밀번호 입력
        panel.add(lbPass);
        panel.add(tfPass);
        
        //비밀번호 재입력
        panel.add(lbPassRe);
        panel.add(tfPassRe);
        
        // 라디오버튼 패널 설정 / 프레임에 등록
        JPanel buttonPanel = new JPanel();
        //라디오버튼 입력
        buttonPanel.add(firstJRD);
        buttonPanel.add(secondJRD);
        
        //확인버튼 입력
        buttonPanel.add(submit);
        
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        
        //액션리스너 붙임
        submit.addActionListener(new JoinActionListener(tfId, tfPass, tfPassRe, firstJRD));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
	}

}
