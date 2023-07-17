package com.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.UIManager;

public class SignUp extends JFrame  {

	private JPanel contentPane;
	private JTextField names;
	private JTextField emails;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(1228, 11, -384, 54);
		contentPane.add(layeredPane);
		
		JLabel lblNewLabel = new JLabel("Create Account");
		lblNewLabel.setForeground(new Color(0, 121, 61));
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 35));
		lblNewLabel.setBounds(621, 117, 234, 54);
		contentPane.add(lblNewLabel);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(33, 95, 57));
		panel.setBounds(0, 0, 483, 561);
		contentPane.add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome Back!");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(97, 192, 289, 53);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("To keep connected with us");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(160, 275, 161, 24);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("login with your personal info");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(160, 313, 161, 17);
		panel.add(lblNewLabel_5_1);
		
		JButton signinup = new JButton("Sign In");
		signinup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn signin=new SignIn();
				signin.setVisible(true);
			}
		});
		signinup.setForeground(Color.WHITE);
		signinup.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		signinup.setBackground(new Color(0, 72, 36));
		signinup.setBounds(152, 361, 180, 43);
		panel.add(signinup);
		
		JButton signup = new JButton("Sign Up");
		signup.setForeground(new Color(255, 255, 255));
		signup.setBackground(new Color(0, 40, 0));
		signup.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		signup.setBounds(664, 419, 180, 43);
		contentPane.add(signup);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(240, 240, 240));
		panel_1.setBounds(575, 211, 327, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		names = new JTextField();
		names.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(names.getText().equals("Name")){
					names.setText("");
				}else {
					names.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(names.getText().equals("")){
					names.setText("Name");
				}else {
					names.selectAll();
				}
			}
		});
		names.setBackground(new Color(240, 240, 240));
		names.setBorder(null);
		names.setBounds(10, 0, 307, 43);
		panel_1.add(names);
		names.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		names.setText("Name");
		names.setColumns(10);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(UIManager.getColor("Button.background"));
		panel_1_2.setBounds(575, 272, 327, 43);
		contentPane.add(panel_1_2);
		
		emails = new JTextField();
		emails.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(emails.getText().equals("Email")){
					emails.setText("");
				}else {
					emails.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(emails.getText().equals("")){
					emails.setText("Email");
				}else {
					emails.selectAll();
				}
			}
		});
		emails.setText("Email");
		emails.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		emails.setColumns(10);
		emails.setBorder(null);
		emails.setBackground(UIManager.getColor("Button.background"));
		emails.setBounds(10, 0, 307, 43);
		panel_1_2.add(emails);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(UIManager.getColor("Button.background"));
		panel_1_4.setBounds(575, 330, 327, 43);
		contentPane.add(panel_1_4);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setEchoChar('*');
					pwdPassword.setText("");
				}else {
					pwdPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setEchoChar('.');
					pwdPassword.setText("Password");
				}else {
					pwdPassword.selectAll();
				}
			}
		});
		pwdPassword.setText("Password");
		pwdPassword.setBorder(null);
		pwdPassword.setBackground(new Color(240, 240, 240));
		pwdPassword.setBounds(10, 0, 307, 43);
		panel_1_4.add(pwdPassword);
		signup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = names.getText();
				String email = emails.getText();
				String password = pwdPassword.getText();
				
				if(!name.equals("") && !email.equals("") && !password.equals("")) {
					
					UserDB con =new UserDB();
					con.dbConnection();
					
					try {
						con.addUser(name,email,password);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					SignIn signin=new SignIn();
					signin.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null,"Please enter the empty field" ,"Sign Up", 1);
				}
	
				
				
			}});
	}
}
