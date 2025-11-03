package Event_AWT;

import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener {

	private TextField nameTextField;
	private TextField emailTextField;
	private Choice jobChoice;

	public RegistrationForm() {
		setLayout(new FlowLayout());

		Label nameLabel = new Label("Name:");
		nameTextField = new TextField(20);

		Label emailLabel = new Label("Email:");
		emailTextField = new TextField(20);

		Label jobLabel = new Label("Job:");
		jobChoice = new Choice();
		jobChoice.add("Cashier");
		jobChoice.add("Crew Member");
		jobChoice.add("Manager");
		jobChoice.add("General Manager");
		jobChoice.add("Kitchen Leader");

		Button submitButton = new Button("Submit");
		submitButton.addActionListener(this);

		add(nameLabel);
		add(nameTextField);
		add(emailLabel);
		add(emailTextField);
		add(jobLabel);
		add(jobChoice);
		add(submitButton);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Submit")) {
			String name = nameTextField.getText();
			String email = emailTextField.getText();
			String selectedJob = jobChoice.getSelectedItem();

			Label UserName = new Label("Name: " + name);
			Label UserEmail = new Label("Email: " + email);
			Label UserJob = new Label("Selected Job: " + selectedJob);

			add(UserName);
			add(UserEmail);
			add(UserJob);
			System.out.println("Name: " + name);
			System.out.println("Email: " + email);
			System.out.println("Job: " + selectedJob);

		}
	}

	public static void main(String[] args) {
		RegistrationForm registrationForm = new RegistrationForm();
		registrationForm.setSize(280, 200);
		registrationForm.setTitle("Registration Form");
		registrationForm.setVisible(true);
	}
}
