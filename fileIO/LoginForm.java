package Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
	private JPanel cards;
	private CardLayout cardLayout;

	public LoginForm() {
		setTitle("Login/Register Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);

		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(new BorderLayout());
		loginPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JLabel usernameLabel = new JLabel("Username:");
		JTextField usernameField = new JTextField(10);

		JLabel passwordLabel = new JLabel("Password:");
		JPasswordField passwordField = new JPasswordField(10);

		JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
		inputPanel.add(usernameLabel);
		inputPanel.add(usernameField);
		inputPanel.add(passwordLabel);
		inputPanel.add(passwordField);

		JPanel buttonPanel = new JPanel(new FlowLayout());
		JButton loginButton = new JButton("Login");
		JButton registerButton = new JButton("Register");
		buttonPanel.add(loginButton);
		buttonPanel.add(registerButton);

		loginPanel.add(inputPanel, BorderLayout.CENTER);
		loginPanel.add(buttonPanel, BorderLayout.SOUTH);

		cardLayout = new CardLayout();
		cards = new JPanel(cardLayout);
		cards.add(loginPanel, "LoginPanel");

		add(cards);

		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginForm loginForm = new LoginForm();
				loginForm.setVisible(true);
			}
		});
	}
}
