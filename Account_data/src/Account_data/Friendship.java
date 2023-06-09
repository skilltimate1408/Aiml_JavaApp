package Account_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Friendship {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Friendship window = new Friendship();
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
	public Friendship() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1039, 731);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Your Name");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 41));
		lblNewLabel_1_1.setBounds(10, 197, 232, 74);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lb = new JLabel("");
		lb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		lb.setBackground(new Color(255, 99, 71));
		lb.setBounds(86, 455, 676, 68);
		frame.getContentPane().add(lb);
		
		tb2 = new JTextField();
		tb2.setFont(new Font("Tahoma", Font.BOLD, 35));
		tb2.setColumns(10);
		tb2.setBackground(new Color(238, 130, 238));
		tb2.setBounds(341, 330, 249, 59);
		frame.getContentPane().add(tb2);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Tahoma", Font.BOLD, 35));
		tb1.setBackground(new Color(238, 130, 238));
		tb1.setBounds(297, 217, 249, 59);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				String n1=tb1.getText();
				String n2=tb2.getText();
				Random r=new Random();
				int i=r.nextInt(1,100);
				lb.setText("Hey Your Friendship % : "+i);
				
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton.setBounds(252, 571, 199, 51);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Friend's  Name");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 41));
		lblNewLabel_1_1_1.setBounds(10, 316, 313, 74);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Friendship calculator");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 41));
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBounds(211, 39, 519, 74);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
