package jitender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class signup3 {

	private JFrame frame;
	private JTextField password;
	private JTextField confirm;

	
	public static String fname,lname,gmail;
	/**
	 * Launch the application.
	 */
	
	//declaring for database
	Connection connection = null;  
    ResultSet resultSet = null;  
    Statement statement = null;  

	public void func6(String first,String last,String email) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//initializing
					fname = first;
					lname = last;
					gmail = email;
					
					System.out.println(fname+lname+gmail);
					signup3 window = new signup3();
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
	public signup3() {
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
		
		JLabel lblNewLabel = new JLabel("CREATE A STRONG PASSWORD WITH A MIXTURE OF");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 11, 399, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LETTERS,NUMBERS AND SYMBOLS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(91, 36, 224, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		password = new JTextField();
		password.setFont(new Font("Tahoma", Font.ITALIC, 12));
		password.setToolTipText("PASSWORD");
		password.setBounds(100, 86, 186, 20);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		confirm = new JTextField();
		confirm.setToolTipText("CONFIRM");
		confirm.setBounds(100, 126, 186, 20);
		frame.getContentPane().add(confirm);
		confirm.setColumns(10);
		
		JButton btnNewButton = new JButton("NEXT\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				String pass = password.getText();
				String conf = confirm.getText();
				if(pass.equals("")||confirm.equals("")) {
					JOptionPane.showMessageDialog(null, "please enter all the field");
				}
				
				else if(!pass.equals(conf)){
					JOptionPane.showMessageDialog(null, "the password in both the field didnot matches");
				}
				else
				{
				JOptionPane.showMessageDialog(null, "GMAIL ACCOUNT SUCCESSFULLY CREATED");
				new Login().main(null);
				try 
			     {  
			         Class.forName("org.sqlite.JDBC");  
			         connection = DriverManager.getConnection("jdbc:sqlite:D:\\customer.db");  
			         statement = connection.createStatement();  
			         @SuppressWarnings("unused")
			         //inserting the new user into database
					ResultSet r =statement.executeQuery("insert into customers values('"+fname+"','"+lname+"','"+gmail+"','"+pass+"')");
			     } 
			     catch (Exception e1) 
			     {  
			         e1.printStackTrace();  
			     }
			     finally 
			     {  
			         try 
			         {  
			            // resultSet.close();  
			             statement.close();  
			             connection.close();  
			         } catch (Exception e2) 
			         {  
			             e2.printStackTrace();  
			         }  
			     }
			     
			 }  

				
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(235, 207, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signup2 s1 = new signup2();
				s1.func5(null,null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(39, 207, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JITENDRA SAH\\Downloads\\aab4.jpg"));
		lblNewLabel_2.setBounds(0, -27, 448, 301);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
