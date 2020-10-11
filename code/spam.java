package jitender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class spam {

	private JFrame frame;
	public static String path;

	/**
	 * Launch the application.
	 */
	public void spam1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					spam window = new spam();
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
	public spam() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String[] name = new String[10];
		int count =0;
		path="D://file//spam";
		try {
			File file = new File("D://file//spam");
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
		
		JLabel lblNewLabel = new JLabel("THE SPAM MAIL AVAILABLE ARE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(61, 11, 286, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button1 = new JButton(name[0]);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//path = path+"//"+button1.getText();
				//System.out.println(path);
				spam_view v1 = new spam_view();
				v1.spam2(button1.getText());
			}
		});
		button1.setBounds(10, 72, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton(name[1]);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				path = path+"//"+button2.getText();
//				System.out.println(path);
				spam_view v1 = new spam_view();
				v1.spam2(button2.getText());
			}
		});
		button2.setBounds(308, 72, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton(name[2]);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				path = path+"//"+button3.getText();
//				System.out.println(path);
				spam_view v1 = new spam_view();
				v1.spam2(button3.getText());
			}
		});
		
		button3.setBounds(10, 143, 89, 23);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton(name[3]);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				path = path+"//"+button4.getText();
//				System.out.println(path);
				spam_view v1 = new spam_view();
				v1.spam2(button4.getText());
			}
		});
		
		button4.setBounds(308, 143, 89, 23);
		frame.getContentPane().add(button4);
		
		JButton btnNewButton_4 = new JButton("BACK");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_4.setBounds(166, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JITENDRA SAH\\Downloads\\aab5.jpg"));
		lblNewLabel_1.setBounds(-11, -13, 477, 303);
		frame.getContentPane().add(lblNewLabel_1);
			frame.getContentPane().add(btnNewButton_4);
	}

}
