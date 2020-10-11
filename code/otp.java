package jitender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class otp {

	private JFrame frame;
	//public static String path;

	/**
	 * Launch the application.
	 */
	public void otp1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					otp window = new otp();
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
	public otp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[] name = new String[10];
		int count =0;
		//path ="D://file//otp";
		try {
			File file = new File("D://file//otp");
	        File[] files = file.listFiles();
	        for(File f: files){
	            System.out.println(f.getName());
	            name[count] = f.getName();
	            count = count+1;
	        }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THE OTP YOU HAVE SEND ARE");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(68, 11, 302, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button1 = new JButton(name[0]);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//path = path+"//"+button1.getText();
				//System.out.println(path);
				view_message v1 = new view_message();
				v1.show(button1.getText());
			}
		});
		button1.setBounds(10, 73, 89, 23);
		//button1.setText(name[0]);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton(name[1]);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				path = path+"//"+button2.getText();
//				System.out.println(path);
				view_message v1 = new view_message();
				v1.show(button2.getText());
			}
		});
		
		button2.setBounds(243, 73, 89, 23);
		//button2.setText(name[1]);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton(name[3]);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				path = path+"//"+button3.getText();
//				System.out.println(path);
				view_message v1 = new view_message();
				v1.show(button3.getText());			}
		});
		
		button3.setBounds(10, 137, 89, 23);
		button3.setText(name[2]);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton(name[4]);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				path = path+"//"+button1.getText();
//				System.out.println(path);
				view_message v1 = new view_message();
				v1.show(button4.getText());
			}
		});
		
		button4.setBounds(243, 137, 89, 23);
		button4.setText(name[3]);
		frame.getContentPane().add(button4);
		
		JButton btnNewButton_4 = new JButton("BACK");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logged l1 = new logged();
				l1.func2();
			}
		});
		btnNewButton_4.setBounds(154, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JITENDRA SAH\\Downloads\\aab7.jpg"));
		lblNewLabel_1.setBounds(10, 11, 728, 410);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
