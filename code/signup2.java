package jitender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class signup2 extends signup{

	private JFrame frame;
	private JTextField gmail;
	
	int count =0,total=0;
	
	
	ResultSet resultSet1 = null;
    

	//declaration for databases
	Connection connection = null;  
    ResultSet resultSet = null;  
    Statement statement = null;  
    
    public static String fname,lname;


	/**
	 * Launch the application.
	 */
	public void func5(String first,String last) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//initializing
					fname = first;
					lname = last;
					//System.out.println(fname+lname);
					
					signup2 window = new signup2();
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
	public signup2() {
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
		
		JLabel lblNewLabel = new JLabel("CREATE YOUR GMAIL ADDRESS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(108, 11, 241, 14);
		frame.getContentPane().add(lblNewLabel);
		
		gmail = new JTextField();
		gmail.setToolTipText("Create a gmail address");
		gmail.setBounds(88, 62, 261, 29);
		frame.getContentPane().add(gmail);
		gmail.setColumns(10);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mail = gmail.getText();
				if(mail.equals("")) {
					JOptionPane.showMessageDialog(null, "please enter the new gmail address");
				}
				else {
					try 
					{  
			         Class.forName("org.sqlite.JDBC");  
			         connection = DriverManager.getConnection("jdbc:sqlite:D:\\customer.db");  
			         statement = connection.createStatement();  
			         resultSet1 = statement.executeQuery("SELECT COUNT(*) FROM customers");
//			         System.out.println(resultSet1.getString(1));
			         total = Integer.parseInt(resultSet1.getString(1));
			         System.out.println(total);
			         
			         resultSet = statement  
			                 .executeQuery("SELECT * FROM customers");  
			         
			         while (resultSet.next()) 
			         {  
			        	 if(gmail.getText().equals(resultSet.getString(3))) {
			        		 JOptionPane.showMessageDialog(null, "the email address alrady exist please enter the new one.");
			        		 break;
			        	 }
			        	 else {
			        		 count++;
			        	 }
			         }  
			         
			         if(count==total) {
			        	 //JOptionPane.showMessageDialog(null, "entered in the database successfully");
			        	 new signup3().func6(fname,lname,gmail.getText());
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(261, 201, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new signup1().func4(fname,lname);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(54, 201, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JITENDRA SAH\\Downloads\\aab3.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1886, 1440);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
