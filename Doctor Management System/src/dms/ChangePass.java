package dms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ChangePass extends JFrame
{
	Container container;
	JPanel panel1,panel2,panel3;
	JLabel msg,conPass,email,footer;
	JPasswordField passField,conPassField;
	JButton submit;
	public ChangePass()
	{
		setTitle("Change Password");
		setSize(700,500);
		setLocationRelativeTo(null);
		container =getContentPane();
		Font font=new Font("Arial",Font.BOLD,30);
		Font font1=new Font("Arial",Font.BOLD,15);
		panel1=new JPanel();
		panel1.setBounds(30,30,620,80);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		container.add(panel1);
		msg=new JLabel("Change Password");
		msg.setBounds(200,20,300,50);
		msg.setForeground(Color.blue);
		msg.setFont(font);
		panel1.add(msg);
		panel2=new JPanel();
		panel2.setBounds(100,160,450,250);
		panel2.setBorder(BorderFactory.createTitledBorder("Change Password"));
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);
		container.add(panel2);
		email=new JLabel("New Password:");
		email.setBounds(10,30,200,50);
		email.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		panel2.add(email);
		passField=new JPasswordField();
		passField.setFont(font1);
		passField.setBounds(220,40,200,30);
		//passField.setFont(font);
		panel2.add(passField);
		
		conPass=new JLabel("Confirm Password:");
		conPass.setBounds(10,90,200,50);
		conPass.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		panel2.add(conPass);
		conPassField=new JPasswordField();
		conPassField.setFont(font1);
		conPassField.setBounds(220,100,200,30);
		//passField.setFont(font);
		panel2.add(conPassField);
		
		submit=new JButton("Submit");
		submit.setBounds(150,180,100,50);
		submit.setFont(font1);
		submit.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.add(submit);
		
		footer=new JLabel("Copyright © 2019 Akansha_Himanshu_HIET ");
		footer.setBounds(10,430,500,50);
				
		container.add(footer);
		submit.addActionListener(new Submit());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	public void paint(Graphics g){
		
		super.paintComponents(g);
		g.setColor(Color.black);
		g.drawLine(0,460,700,460);
	}
	
// Java program to validate email in Java
class Submit implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		String str=passField.getText();
		String str1=conPassField.getText();
		
		if (str1.equals(str)) 
		{
			if (str == null)
			{
				JOptionPane.showMessageDialog(ChangePass.this, "Password eror","Password not save ",JOptionPane.ERROR_MESSAGE);
				passField.setText("");
				conPassField.setText("");
			}
			if (str1==null) 
			{
				JOptionPane.showMessageDialog(ChangePass.this, "Password eror","Password not save ",JOptionPane.ERROR_MESSAGE);
				conPassField.setText("");
				passField.setText("");
			}
			else
			{
				JOptionPane.showMessageDialog(ChangePass.this, "Password updated successfully","Welcome dear ",JOptionPane.ERROR_MESSAGE);
				passField.setText("");
				conPassField.setText("");
			}
		}
		
		else
		{
			
			passField.setText("");
			conPassField.setText("");
			JOptionPane.showMessageDialog(ChangePass.this, "Password Mismatch","Try again",JOptionPane.ERROR_MESSAGE);
		}
		
	}

			
}
	public static void main (String...args)
	{
		ChangePass efp=new ChangePass();
	}
}
