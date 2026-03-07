import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CustomerLoginStrategy implements LoginStrategy{
	
	JFrame f, f1;
	 JLabel firstNameLabel, surnameLabel, pPPSLabel, dOBLabel;
	 JTextField firstNameTextField, surnameTextField, pPSTextField, dOBTextField;
		JLabel customerIDLabel, passwordLabel;
		JTextField customerIDTextField, passwordTextField;
	Container content;
		Customer e;


	 JPanel panel2;
		JButton add;
		String 	PPS,firstName,surname,DOB,CustomerID;
		
		private ArrayList<Customer> customerList = new ArrayList<Customer>();

	@Override
	public void login() {
		boolean loop = true, loop2 = true;
		boolean cont = false;
		boolean found = false;
		Customer customer = null;
	    while(loop)
	    {
	    Object customerID = JOptionPane.showInputDialog(f, "Enter Customer ID:");
	    
	    for (Customer aCustomer: customerList){
	    	
	    	if(aCustomer.getCustomerID().equals(customerID))//search customer list for matching customer ID
	    	{
	    		found = true;
	    		customer = aCustomer;
	    	}					    	
	    }
	    
	    if(found == false)
	    {
	    	int reply  = JOptionPane.showConfirmDialog(null, null, "User not found. Try again?", JOptionPane.YES_NO_OPTION);
	    	if (reply == JOptionPane.YES_OPTION) {
	    		loop = true;
	    	}
	    	else if(reply == JOptionPane.NO_OPTION)
	    	{
	    		f.dispose();
	    		loop = false;
	    		loop2 = false;
	    	}
	    }
	    else
	    {
	    	loop = false;
	    }
	   
	    }
	    
	    while(loop2)
	    {
	    	Object customerPassword = JOptionPane.showInputDialog(f, "Enter Customer Password;");
	    	
	    	   if(!customer.getPassword().equals(customerPassword))//check if custoemr password is correct
			    {
			    	int reply  = JOptionPane.showConfirmDialog(null, null, "Incorrect password. Try again?", JOptionPane.YES_NO_OPTION);
			    	if (reply == JOptionPane.YES_OPTION) {
			    		
			    	}
			    	else if(reply == JOptionPane.NO_OPTION){
			    		f.dispose();
			    		loop2 = false;
			    	}
			    }
	    	   else
	    	   {
	    		   loop2 =false;
	    		   cont = true;
	    	   }
	    }
	    	
	    if(cont)
	    {
		f.dispose();
	    	loop = false;
	    }	
	}	
}
