package jitender;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;

public class spam_view {

	private JFrame frame;
	private JTextField textField;
	public static String temp;

	/**
	 * Launch the application.
	 */
	public void spam2(String str) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temp = str;
					spam_view window = new spam_view();
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
	public spam_view() {
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
		
		String FILENAME = "D:\\file\\spam\\"+temp;
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
		textField.setBounds(10, 38, 416, 214);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
