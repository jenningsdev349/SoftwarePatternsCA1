import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NewUserLoginStrategy implements LoginStrategy{

	JFrame f, f1;
	 JLabel firstNameLabel, surnameLabel, pPPSLabel, dOBLabel;
	 JTextField firstNameTextField, surnameTextField, pPSTextField, dOBTextField;
		JLabel customerIDLabel, passwordLabel;
		JTextField customerIDTextField, passwordTextField;
	Container content;
		Customer e;
		private String password;
		private ArrayList<Customer> customerList = new ArrayList<Customer>();


	 JPanel panel2;
		JButton add;
		String 	PPS,firstName,surname,DOB,CustomerID;
		
	@Override
	public void login() {
		f.dispose();		
		f1 = new JFrame("Create New Customer");
		f1.setSize(400, 300);
		f1.setLocation(200, 200);
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) { System.exit(0); }
		});
			Container content = f1.getContentPane();
			content.setLayout(new BorderLayout());
			
			firstNameLabel = new JLabel("First Name:", SwingConstants.RIGHT);
			surnameLabel = new JLabel("Surname:", SwingConstants.RIGHT);
			pPPSLabel = new JLabel("PPS Number:", SwingConstants.RIGHT);
			dOBLabel = new JLabel("Date of birth", SwingConstants.RIGHT);
			firstNameTextField = new JTextField(20);
			surnameTextField = new JTextField(20);
			pPSTextField = new JTextField(20);
			dOBTextField = new JTextField(20);
			JPanel panel = new JPanel(new GridLayout(6, 2));
			panel.add(firstNameLabel);
			panel.add(firstNameTextField);
			panel.add(surnameLabel);
			panel.add(surnameTextField);
			panel.add(pPPSLabel);
			panel.add(pPSTextField);
			panel.add(dOBLabel);
			panel.add(dOBTextField);
				
			panel2 = new JPanel();
			add = new JButton("Add");
			
			 add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			
					
		PPS = pPSTextField.getText();
		firstName = firstNameTextField.getText();
		surname = surnameTextField.getText();
		DOB = dOBTextField.getText();
		password = "";
	
		CustomerID = "ID"+PPS ;
		
	
		
		
		
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.dispose();
				
				boolean loop = true;
				while(loop){
				 password = JOptionPane.showInputDialog(f, "Enter 7 character Password;");
				
				 if(password.length() != 7)//Making sure password is 7 characters
				    {
				    	JOptionPane.showMessageDialog(null, null, "Password must be 7 charatcers long", JOptionPane.OK_OPTION);
				    }
				 else
				 {
					 loop = false;
				 }
				}
				
				
				
				
			    ArrayList<CustomerAccount> accounts = new ArrayList<CustomerAccount> ();
						Customer customer = new Customer(PPS, surname, firstName, DOB, CustomerID, password, accounts);
							
						customerList.add(customer);
					
						JOptionPane.showMessageDialog(f, "CustomerID = " + CustomerID +"\n Password = " + password  ,"Customer created.",  JOptionPane.INFORMATION_MESSAGE);
					f.dispose();
			}
		});	
				}
			});						
			JButton cancel = new JButton("Cancel");					
			cancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					f1.dispose();
				}
			});	
			
			panel2.add(add);
			panel2.add(cancel);
			
			content.add(panel, BorderLayout.CENTER);
			content.add(panel2, BorderLayout.SOUTH);
	
			f1.setVisible(true);
	}

}
