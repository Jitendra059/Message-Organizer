package jitender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class signin {

	private JFrame frame;
	private JTextField email1;
	private JPasswordField passwordField;
	int count =0,total=0;
	//declaration for databases
	Connection connection = null;  
    ResultSet resultSet = null;
    
    //resultset1 declared to get count of the data
    ResultSet resultSet1 = null;
    
    Statement statement = null;  

    public static String email;

	/**
	 * Launch the application.
	 */
	public void func1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signin window = new signin();
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
	public signin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 434, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(email1.getText().equals("")||passwordField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "please enter all the field");
				}
				else {
					try 
						{  
				         Class.forName("org.sqlite.JDBC");  
				         connection = DriverManager.getConnection("jdbc:sqlite:D:\\customer.db");  
				         statement = connection.createStatement();  
				         resultSet1 = statement.executeQuery("SELECT COUNT(*) FROM customers");
//				         System.out.println(resultSet1.getString(1));
				         total = Integer.parseInt(resultSet1.getString(1));
				         System.out.println(total);
				         
				         resultSet = statement  
				                 .executeQuery("SELECT * FROM customers");  
				         
				         while (resultSet.next()) 
				         {  
				        	 count ++;
				        	 if(email1.getText().equals(resultSet.getString(3))||passwordField.getText().equals(resultSet.getString(4))) {
				        		 email = email1.getText();
				        		 logged ll1 = new logged();
				        		 	ll1.func2(); 
				        		 	break;
				        	 }
				        	
				         }  
				         if(count==total) {
				        	 JOptionPane.showMessageDialog(null, "please enter the correct email and password");	 
				         }
				     } 
				     catch (Exception e1) 
				     {  
				         e1.printStackTrace();  
				     }
				     finally 
				     {  
				         try 
				         {  
				             resultSet.close();  
				             statement.close();  
				             connection.close();  
				         } 
				         catch (Exception e1) 
				         {  
				             e1.printStackTrace();  
				         }  
				     }  
				 }
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(250, 167, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		email1 = new JTextField();
		email1.setBounds(155, 28, 195, 20);
		frame.getContentPane().add(email1);
		email1.setColumns(10);
		
		JLabel email = new JLabel("EMAIL");
		email.setForeground(Color.ORANGE);
		email.setBackground(new Color(240, 240, 240));
		email.setEnabled(false);
		email.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		email.setBounds(20, 26, 70, 20);
		frame.getContentPane().add(email);
		
		JLabel password = new JLabel("PASSWORD");
		password.setForeground(Color.ORANGE);
		password.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		password.setBackground(new Color(240, 240, 240));
		password.setEnabled(false);
		password.setBounds(20, 76, 112, 23);
		frame.getContentPane().add(password);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				Login l1 = new Login();
				l1.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBounds(71, 167, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(155, 75, 195, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JITENDRA SAH\\Downloads\\aab10.jpg"));
		lblNewLabel.setBounds(-11, -17, 1951, 1108);
		frame.getContentPane().add(lblNewLabel);
	}

}