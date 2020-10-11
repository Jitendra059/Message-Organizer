package jitender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class compose extends signin{

	private JFrame frame;
	private JTextField from;
	private JTextField to;
	private JTextField subject;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	
	public static String email1;

	/**
	 * Launch the application.
	 */
	public void func3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					email1 = signin.email;
					compose window = new compose();
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
	public compose() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 550, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FROM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 11, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(10, 62, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		from = new JTextField();
		from.setEnabled(false);
		from.setEditable(false);
		from.setText(email1);
		from.setBackground(new Color(255, 255, 255));
		from.setFont(new Font("Tahoma", Font.ITALIC, 12));
		from.setBounds(90, 9, 305, 20);
		frame.getContentPane().add(from);
		from.setColumns(10);
		
		to = new JTextField();
		to.setBounds(90, 60, 305, 20);
		frame.getContentPane().add(to);
		to.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SUBJECT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(10, 124, 71, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		subject = new JTextField();
		subject.setBounds(90, 122, 305, 20);
		frame.getContentPane().add(subject);
		subject.setColumns(10);
		
		JTextArea emailtext = new JTextArea();
		emailtext.setToolTipText("Compose email");
		emailtext.setFont(new Font("Monospaced", Font.ITALIC, 13));
		emailtext.setTabSize(13);
		emailtext.setBounds(10, 162, 481, 351);
		frame.getContentPane().add(emailtext);
		
		btnNewButton_1 = new JButton("SEND");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//to check all the field is entered
				if(from.getText().equals("") || to.getText().equals("") || emailtext.getText().equals("") || subject.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "please enter all the field ");
				}
				
				else {
					String message = emailtext.getText();
					if(message.contains("otp")) {
						FileWriter fw;
						try {
							fw = new FileWriter("D://file//otp//new.txt");
							for (int i = 0; i < message.length(); i++) 
					            fw.write(message.charAt(i)); 
					  
					        System.out.println("Writing successful"); 
					        //close the file  
					        fw.close();
					        JOptionPane.showMessageDialog(null, "MESSAGE SUCCESSFULLY SEND AND FILTERED AS OTP");
					        frame.dispose();
					  
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							System.out.println(e);
						} 
						     
					}
					
					else if(message.contains("loan") || message.contains("insurance")) {
						FileWriter fw;
						try {
							fw = new FileWriter("D://file//spam//new.txt");
							for (int i = 0; i < message.length(); i++) 
					            fw.write(message.charAt(i)); 
					  
					        System.out.println("Writing successful"); 
					        //close the file  
					        fw.close();
					        JOptionPane.showMessageDialog(null, "MESSAGE SUCCESSFULLY SEND AND FILTERED AS SPAM");
					  
					        frame.dispose();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							System.out.println(e);
						} 
						     
					}
					
					
					else if(message.contains("food") || message.contains("order")) {
						FileWriter fw;
						try {
							fw = new FileWriter("D://file//food//new.txt");
							for (int i = 0; i < message.length(); i++) 
					            fw.write(message.charAt(i)); 
					  
					        System.out.println("Writing successful"); 
					        //close the file  
					        fw.close();
					        JOptionPane.showMessageDialog(null, "MESSAGE SUCCESSFULLY SEND AND FILTERED AS FOOD");
					  
					        frame.dispose();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							System.out.println(e);
						} 
						     
					}
					
					else if(message.contains("transaction") || message.contains("amount") ||message.contains("sir")) {
						FileWriter fw;
						try {
							fw = new FileWriter("D://file//bank//new.txt");
							for (int i = 0; i < message.length(); i++) 
					            fw.write(message.charAt(i)); 
					  
					        System.out.println("Writing successful"); 
					        //close the file  
					        fw.close();
					        JOptionPane.showMessageDialog(null, "MESSAGE SUCCESSFULLY SEND AND FILTERED AS BANK MESSAGE");
					  
					        frame.dispose();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							System.out.println(e);
						} 
						     
					}
					else
					{
						FileWriter fw;
						try {
							fw = new FileWriter("D://file//inbox//new.txt");
							for (int i = 0; i < message.length(); i++) 
					            fw.write(message.charAt(i)); 
					  
					        System.out.println("Writing successful"); 
					        //close the file  
					        fw.close();
					        JOptionPane.showMessageDialog(null, "MESSAGE SUCCESSFULLY SEND AND FILTERED AS NORMAL MESSAGE");
					  
					        frame.dispose();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							System.out.println(e);
						} 
					}
					
					
					
					
				}
				
				//JOptionPane.showMessageDialog(null, "Message successfullt sent");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(279, 554, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				logged l1 = new logged();
				l1.func2();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_2.setBounds(86, 554, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
