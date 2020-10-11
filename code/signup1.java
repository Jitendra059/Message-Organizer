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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class signup1 {

	private JFrame frame;
	private JTextField day;
	private JTextField month;
	private JTextField year;
	private JTextField gender;
	
	public static String fname,lname;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public void func4(String first,String last) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fname = first;
					lname = last;
					//System.out.println(fname+lname);
					signup1 window = new signup1();
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
	public signup1() {
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
		
		JLabel lblNewLabel = new JLabel("BASIC INFORMATION");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(144, 11, 201, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DATE OF BIRTH");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(154, 59, 104, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		day = new JTextField();
		day.setToolTipText("Day");
		day.setFont(new Font("Tahoma", Font.ITALIC, 12));
		day.setBounds(47, 112, 96, 20);
		frame.getContentPane().add(day);
		day.setColumns(10);
		
		month = new JTextField();
		month.setToolTipText("Month");
		month.setBounds(166, 112, 96, 20);
		frame.getContentPane().add(month);
		month.setColumns(10);
		
		year = new JTextField();
		year.setToolTipText("Year");
		year.setBounds(285, 112, 96, 20);
		frame.getContentPane().add(year);
		year.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new signup().sign1();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(47, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String day1 = day.getText();
				String month1 = month.getText();
				String year1 = year.getText();
				if(day1.equals("") || month1.equals("")|| year1.equals("")) {
					JOptionPane.showMessageDialog(null, "plese enter all the fields");
				}
				else {
				new signup2().func5(fname,lname);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBounds(241, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		gender = new JTextField();
		gender.setToolTipText("Gender");
		gender.setBounds(126, 164, 164, 20);
		frame.getContentPane().add(gender);
		gender.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JITENDRA SAH\\Downloads\\aab2.jpg"));
		lblNewLabel_2.setBounds(0, 0, 436, 938);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
