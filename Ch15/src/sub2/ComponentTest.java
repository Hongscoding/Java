package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기\r\n");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 10, 133, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(12, 37, 95, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
			}
		});
		btn1.setBounds(12, 62, 70, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭");
				
			}
		});
		btn2.setBounds(94, 62, 70, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(176, 62, 70, 23);
		contentPane.add(btn3);
		
		JButton bnt4 = new JButton("버튼4");
		bnt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 	int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭", "확인대화상자", JOptionPane.YES_NO_OPTION);
			 	
			 	if(answer == JOptionPane.YES_OPTION) {
			 		System.out.println("yes");
			 	} else {
			 		System.out.println("no ");
			 	}
			}
		});
		bnt4.setBounds(258, 62, 70, 23);
		contentPane.add(bnt4);
		
		txtf1 = new JTextField();
		txtf1.setBounds(12, 121, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(12, 95, 116, 15);
		contentPane.add(lblNewLabel_2);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(12, 152, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(12, 183, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxtf1result = new JLabel("결과 : ");
		lbltxtf1result.setBounds(214, 124, 116, 15);
		contentPane.add(lbltxtf1result);
		
		JLabel lbltxtf2result = new JLabel("결과 : ");
		lbltxtf2result.setBounds(214, 155, 116, 15);
		contentPane.add(lbltxtf2result);
		
		JLabel lbltxtf3result = new JLabel("결과 : ");
		lbltxtf3result.setBounds(214, 186, 116, 15);
		contentPane.add(lbltxtf3result);
		
		JButton btntxt1 = new JButton("확인");
		btntxt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf1.getText();
				lbltxtf1result.setText("결과 : "+txt);
				
			}
		});
		btntxt1.setBounds(140, 120, 62, 23);
		contentPane.add(btntxt1);
		
		JButton btntxt2 = new JButton("확인");
		btntxt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf2.getText();
				lbltxtf2result.setText("결과 : "+txt);
				
			}
		});
		btntxt2.setBounds(140, 151, 62, 23);
		contentPane.add(btntxt2);
		
		JButton btntxt3 = new JButton("확인");
		btntxt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf3.getText();
				lbltxtf3result.setText("결과 : "+txt);
				
			}
		});
		btntxt3.setBounds(140, 182, 62, 23);
		contentPane.add(btntxt3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 214, 116, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요.");
		lblNewLabel_4.setBounds(12, 239, 116, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(12, 260, 62, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(78, 260, 62, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(140, 260, 62, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(206, 260, 62, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(266, 260, 62, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 : ");
		lblChkResult.setBounds(12, 289, 316, 15);
		contentPane.add(lblChkResult);
		
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : "+chks.toString());
			}
		});
		btnChk.setBounds(336, 260, 62, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(12, 314, 152, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(12, 335, 62, 23);
		contentPane.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(82, 335, 63, 23);
		contentPane.add(rdFemale);
		
		JLabel lblGenderResult = new JLabel("결과 : ");
		lblGenderResult.setBounds(12, 364, 316, 15);
		contentPane.add(lblGenderResult);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(rdMale.isSelected()) {
					lblGenderResult.setText("결과 : 남자");
				}
				if(rdFemale.isSelected()) {
					lblGenderResult.setText("결과 : 여자");
				}
				
			}
		});
		btnGender.setBounds(160, 335, 62, 23);
		contentPane.add(btnGender);
		
	}
}
