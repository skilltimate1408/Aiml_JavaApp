package Account_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MOvie {

	private JFrame frame;
	String m;
	String t;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MOvie window = new MOvie();
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
	public MOvie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1075, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\n.PNG"));
		lblNewLabel.setBounds(22, 10, 185, 171);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book My Show");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(297, 60, 350, 67);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m="SpiderMan";
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\m11.PNG"));
		lblNewLabel_2.setBounds(32, 168, 217, 348);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m="Transformers";
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\m22.PNG"));
		lblNewLabel_2_1.setBounds(339, 168, 217, 348);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m="Unstoppable";
			}
		});
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\m33.PNG"));
		lblNewLabel_2_2.setBounds(679, 168, 217, 348);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JComboBox c1 = new JComboBox();
		c1.setForeground(new Color(255, 0, 0));
		c1.setFont(new Font("Tahoma", Font.BOLD, 20));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Tickets", "1", "2", "3", "4", "5"}));
		c1.setBounds(853, 39, 124, 21);
		frame.getContentPane().add(c1);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String t1;
				t1=(String) c1.getSelectedItem();
				
				int a;
				a=Integer.parseInt(t1);
				
				
				JOptionPane.showMessageDialog(btnNewButton, "Hello "+
				" Selected Movie :"+m+" \n Tickets : "+a);
				
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.setBounds(415, 586, 159, 45);
		frame.getContentPane().add(btnNewButton);
	}

}
