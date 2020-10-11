package jitender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class logged {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void func2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logged window = new logged();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public logged() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 631, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ALL MAILS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allmail m1 = new allmail();
				m1.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(10, 57, 137, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SPAM");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spam s1 = new spam();
				s1.spam1();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(413, 228, 165, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("OTP");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				otp o1 = new otp();
				o1.otp1();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(10, 215, 137, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("COMPOSE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compose c1 = new compose();
				c1.func3();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_3.setBounds(427, 362, 165, 38);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("CHOOSE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(217, 11, 111, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("FOOD");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				food fo = new food();
				fo.food1();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_4.setBounds(10, 362, 137, 38);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("BANKING");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bank b1 = new bank();
				b1.bank1();
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_5.setBounds(413, 73, 165, 38);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("INBOX");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inbox i1 = new inbox();
				i1.inbox1();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_6.setForeground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		btnNewButton_6.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		btnNewButton_6.setBounds(224, 183, 124, 46);
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JITENDRA SAH\\Downloads\\jkjkj.jpg"));
		lblNewLabel_1.setBounds(-12, 0, 629, 466);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
