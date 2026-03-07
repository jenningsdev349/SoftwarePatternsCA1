import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminLoginStrategy implements LoginStrategy{
	
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
		
	@Override
	public void login() {
		boolean loop = true, loop2 = true;
		boolean cont = false;
	    while(loop)
	    {
	    Object adminUsername = JOptionPane.showInputDialog(f, "Enter Administrator Username:");

	    if(!adminUsername.equals("admin"))//search admin list for admin with matching admin username
	    {
	    	int reply  = JOptionPane.showConfirmDialog(null, null, "Incorrect Username. Try again?", JOptionPane.YES_NO_OPTION);
	    	if (reply == JOptionPane.YES_OPTION) {
	    		loop = true;
	    	}
	    	else if(reply == JOptionPane.NO_OPTION)
	    	{
	    		f1.dispose();
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
	    	Object adminPassword = JOptionPane.showInputDialog(f, "Enter Administrator Password;");
	    	
	    	   if(!adminPassword.equals("admin11"))//search admin list for admin with matching admin password
			    {
			    	int reply  = JOptionPane.showConfirmDialog(null, null, "Incorrect Password. Try again?", JOptionPane.YES_NO_OPTION);
			    	if (reply == JOptionPane.YES_OPTION) {
			    		
			    	}
			    	else if(reply == JOptionPane.NO_OPTION){
			    		f1.dispose();
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
		f1.dispose();
	    	loop = false;
	    }		
	}
}
