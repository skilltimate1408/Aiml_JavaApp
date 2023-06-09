package Account_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Registration_data {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_data window = new Registration_data();
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
	public Registration_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(186, 85, 211));
		frame.setBounds(100, 100, 668, 754);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setBounds(101, 78, 314, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(248, 248, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblName.setBounds(10, 198, 226, 45);
		frame.getContentPane().add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(248, 248, 255));
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGender.setBounds(10, 281, 226, 45);
		frame.getContentPane().add(lblGender);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setForeground(new Color(248, 248, 255));
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblBranch.setBounds(10, 378, 226, 45);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblProgrammingLanguage = new JLabel("Programming");
		lblProgrammingLanguage.setForeground(new Color(248, 248, 255));
		lblProgrammingLanguage.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblProgrammingLanguage.setBounds(10, 473, 226, 45);
		frame.getContentPane().add(lblProgrammingLanguage);
		
		JLabel lblLanguage = new JLabel("Language");
		lblLanguage.setForeground(new Color(248, 248, 255));
		lblLanguage.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLanguage.setBounds(10, 508, 226, 45);
		frame.getContentPane().add(lblLanguage);
		
		tb = new JTextField();
		tb.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tb.setBounds(206, 198, 235, 38);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Female");
		r1.setForeground(new Color(0, 0, 128));
		r1.setBackground(new Color(186, 85, 211));
		r1.setFont(new Font("Tahoma", Font.BOLD, 20));
		r1.setBounds(206, 281, 131, 45);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Male");
		r2.setForeground(new Color(0, 0, 139));
		r2.setBackground(new Color(186, 85, 211));
		r2.setFont(new Font("Tahoma", Font.BOLD, 20));
		r2.setBounds(383, 281, 131, 45);
		frame.getContentPane().add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
        bg.add(r2);		
		
		JComboBox co = new JComboBox();
		co.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE", "IT", "ECE", "EEE", "AIML", "IoT", "CS", "DS"}));
		co.setFont(new Font("Tahoma", Font.BOLD, 20));
		co.setForeground(new Color(0, 0, 205));
		co.setBounds(215, 378, 226, 39);
		frame.getContentPane().add(co);
		
		JCheckBox cb1 = new JCheckBox("Java");
		cb1.setForeground(new Color(0, 0, 139));
		cb1.setBackground(new Color(186, 85, 211));
		cb1.setFont(new Font("Tahoma", Font.BOLD, 25));
		cb1.setBounds(244, 491, 104, 27);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Python");
		cb2.setForeground(new Color(0, 0, 139));
		cb2.setFont(new Font("Tahoma", Font.BOLD, 25));
		cb2.setBackground(new Color(186, 85, 211));
		cb2.setBounds(410, 491, 148, 27);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("C");
		cb3.setForeground(new Color(0, 0, 139));
		cb3.setFont(new Font("Tahoma", Font.BOLD, 25));
		cb3.setBackground(new Color(186, 85, 211));
		cb3.setBounds(585, 491, 148, 27);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String n=tb.getText();
			String g;
			if(r1.isSelected())
			{
				g="Female";
			}
			else if(r2.isSelected())
			{
				g="Male";
			}
			else
			{
				g="Invalid";
			}
			String b=(String) co.getSelectedItem();
			String pl=" ";
			if(cb1.isSelected())
			{
				pl=pl+" Java";
			}
			if(cb2.isSelected())
			{
				pl=pl+" Python";
			}
			if(cb3.isSelected())
			{
				pl=pl+" c";
			}
			try {
				Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/aiml","root","Welcome@123");
				String q="insert into registration values('"+n+"','"+g+"','"+b+"','"+pl+"')";
				Statement sta=con.createStatement();
				sta.execute(q);
				con.close();
				JOptionPane.showMessageDialog(btnNewButton, "Done");
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
			
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBounds(192, 607, 178, 50);
		frame.getContentPane().add(btnNewButton);
	}
}
