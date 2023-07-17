package com.login;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.UIManager;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmailOrUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(33, 95, 57));
		panel.setBounds(501, 0, 483, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Hello, Friend!");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(125, 204, 251, 53);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Enter your personal details");
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(172, 283, 162, 24);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("and start a jounal with us");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(182, 318, 153, 17);
		panel.add(lblNewLabel_5_1);
		
		JButton signupin = new JButton("Sign Up");
		signupin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp signup=new SignUp();
				signup.setVisible(true);
			}
		});
		signupin.setForeground(Color.WHITE);
		signupin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		signupin.setBackground(new Color(0, 40, 0));
		signupin.setBounds(172, 369, 180, 43);
		panel.add(signupin);
		
		JLabel lblNewLabel_2 = new JLabel("Forgot your password?");
		lblNewLabel_2.setForeground(new Color(51, 51, 51));
		lblNewLabel_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(178, 350, 144, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nameEmail = txtEmailOrUsername.getText();
				String password = passwordField.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aekiladb","root","");
					Statement stmt = con.createStatement();
					String sql = "Select * from users where Name='"+nameEmail +"' and Password='"+password.toString()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null,"Login successfully...");
					}else {
						JOptionPane.showMessageDialog(null,"Incorrect Username or Password...");
						con.close();
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
		});
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		btnSignIn.setBackground(new Color(0, 40, 0));
		btnSignIn.setBounds(162, 389, 180, 43);
		contentPane.add(btnSignIn);
		
		JLabel logo = new JLabel("AKIALLA");
		logo.setForeground(new Color(0, 74, 37));
		logo.setFont(new Font("Bell MT", Font.BOLD, 55));
		logo.setBounds(130, 101, 252, 81);
		contentPane.add(logo);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(UIManager.getColor("Button.background"));
		panel_1_1.setBounds(100, 229, 327, 43);
		contentPane.add(panel_1_1);
		
		txtEmailOrUsername = new JTextField();
		txtEmailOrUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmailOrUsername.getText().equals("Email or Username")) {
					txtEmailOrUsername.setText("");
				}else {
					txtEmailOrUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmailOrUsername.getText().equals("")) {
					txtEmailOrUsername.setText("Email or Username");
				}else {
					txtEmailOrUsername.selectAll();
				}
			}
		});
		txtEmailOrUsername.setText("Email or Username");
		txtEmailOrUsername.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		txtEmailOrUsername.setColumns(10);
		txtEmailOrUsername.setBorder(null);
		txtEmailOrUsername.setBackground(UIManager.getColor("Button.background"));
		txtEmailOrUsername.setBounds(10, 0, 307, 43);
		panel_1_1.add(txtEmailOrUsername);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(UIManager.getColor("Button.background"));
		panel_1_4.setBounds(100, 296, 327, 43);
		contentPane.add(panel_1_4);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(passwordField.getText().equals("Password")) {
				passwordField.setEchoChar('*');
				passwordField.setText("");
			}else {
				passwordField.selectAll();
			}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(passwordField.getText().equals("")) {
					passwordField.setEchoChar('.');
					passwordField.setText("Password");
				}else {
					passwordField.selectAll();
				}
			}
		});

		passwordField.setText("Password");
		passwordField.setBorder(null);
		passwordField.setBackground(UIManager.getColor("Button.background"));
		passwordField.setBounds(10, 0, 307, 43);
		panel_1_4.add(passwordField);
	}
}
