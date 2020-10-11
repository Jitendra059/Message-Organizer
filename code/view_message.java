package jitender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextField;
import java.awt.Color;

public class view_message {

	private JFrame frame;
	private JTextField textField;
	public static String temp;

	/**
	 * Launch the application.
	 */
	public void show(String str) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("get value"+str);
					temp = str;
					//System.out.println("filename="+FILENAME);
					view_message window = new view_message();
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
	public view_message() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VIEWING THE MESSAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(80, 11, 236, 24);
		frame.getContentPane().add(lblNewLabel);
		
		
		String FILENAME = "D:\\file\\otp\\"+temp;
		String message ="";
		
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			   String strCurrentLine;

			   while ((strCurrentLine = br.readLine()) != null) {
			    System.out.println(strCurrentLine);
			    message = message+strCurrentLine;
			   }

			  } catch (IOException e) {
			   System.out.println(e);
			  }

	textField = new JTextField(message);
	textField.setBackground(new Color(255, 255, 255));
	textField.setEditable(false);
	//textField.setT
	textField.setBounds(10, 50, 416, 202);
	frame.getContentPane().add(textField);
	textField.setColumns(10);

}}
