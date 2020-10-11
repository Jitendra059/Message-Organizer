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

public class signup {

	private JFrame frame;
	public static JTextField fname;
	public static JTextField lname;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public void sign1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
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
		
		JLabel lblNewLabel = new JLabel("CREATE A ACCOUNT");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(129, 11, 203, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your name");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(147, 47, 116, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		fname = new JTextField();
		fname.setFont(new Font("Tahoma", Font.ITALIC, 12));
		fname.setToolTipText("First name");
		fname.setBounds(81, 86, 203, 20);
		frame.getContentPane().add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setToolTipText("Last name");
		lname.setBounds(81, 133, 203, 20);
		frame.getContentPane().add(lname);
		lname.setColumns(10);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname1 = fname.getText();
				String lname1 = lname.getText();
				if(fname1.equals("")|| lname1.equals("")) {
					JOptionPane.showMessageDialog(null, "please enter all the fields");
				}
				else {
				new signup1().func4(fname.getText(),lname.getText());
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(237, 207, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				new Login().main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(49, 209, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JITENDRA SAH\\Downloads\\aab1.png"));
		lblNewLabel_2.setBounds(0, -18, 436, 281);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
