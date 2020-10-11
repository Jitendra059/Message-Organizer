package jitender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	private JTextField txtMesssageOrganizer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		
		txtMesssageOrganizer = new JTextField();
		txtMesssageOrganizer.setForeground(Color.MAGENTA);
		txtMesssageOrganizer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtMesssageOrganizer.setText("MESSSAGE ORGANIZER");
		txtMesssageOrganizer.setBackground(Color.BLACK);
		txtMesssageOrganizer.setEditable(false);
		txtMesssageOrganizer.setEnabled(false);
		txtMesssageOrganizer.setBounds(131, 25, 184, 36);
		frame.getContentPane().add(txtMesssageOrganizer);
		txtMesssageOrganizer.setColumns(10);
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signin s1 = new signin();
				s1.func1();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(39, 129, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton signup = new JButton("SIGN UP");
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				signup up = new signup();
				up.sign1();
			}
		});
		signup.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		signup.setBounds(267, 129, 115, 23);
		frame.getContentPane().add(signup);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JITENDRA SAH\\Downloads\\aab.jpg"));
		lblNewLabel.setBounds(0, 0, 436, 263);
		frame.getContentPane().add(lblNewLabel);
	}
}
