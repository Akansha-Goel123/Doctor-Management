package dms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ForgetPass extends JFrame
{
	Container container;
	JPanel panel1,panel2,panel3;
	JLabel msg,emailmsg,email,footer;
	JTextField emailIdField;
	JButton submit;
	public ForgetPass()
	{
		setTitle("Forget Password");
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
		msg=new JLabel("Forget Password");
		msg.setBounds(200,20,300,50);
		msg.setForeground(Color.blue);
		msg.setFont(font);
		panel1.add(msg);
		panel2=new JPanel();
		panel2.setBounds(150,160,350,250);
		panel2.setBorder(BorderFactory.createTitledBorder(" Forget Password"));
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);
		container.add(panel2);
		email=new JLabel("Email:");
		email.setBounds(10,70,100,50);
		email.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		panel2.add(email);
		emailIdField=new JTextField();
		emailIdField.setFont(font1);
		emailIdField.setBounds(100,80,200,40);
		//emailIdField.setFont(font);
		panel2.add(emailIdField);
		
		submit=new JButton("Search");
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
		  String emailId=emailIdField.getText();
		  String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
		
		  Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
		  Matcher matcher = EMAIL_PATTERN.matcher(emailIdField.getText());
		  if (emailIdField == null) {
			 JOptionPane.showMessageDialog(ForgetPass.this, "Plese Enter Email id","Login Error",JOptionPane.ERROR_MESSAGE);
		  }
		  if (matcher.matches()) 
		  {
			//emailmsg.setText("welcome "+emailId);
			//emailIdField.setText(" ");
			  new ChangePass();
		  }
		  else
		  {
			//emailmsg.setText("Plese enter valid email id");
			 JOptionPane.showMessageDialog(ForgetPass.this, "Plese, Enter Valid Email Id ,try again","Login Error",JOptionPane.ERROR_MESSAGE);
		  }
		
	}

			
}
	public static void main (String...args)
	{
		ForgetPass efp=new ForgetPass();
	}
}
