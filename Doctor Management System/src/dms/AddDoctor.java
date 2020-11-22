package dms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddDoctor extends JFrame {

	JLabel label,label1,label2,label3,label4,label5,label6,footer;
	JTextField text1, text2,text3, text4,text5,text6;
	JButton b1,b2;
	JPanel panel1,panel2;
	String s;
	Container container;
	
	AddDoctor()
	{
		setSize(800,700);	
		setTitle("Doctor Management System");
		Font font=new Font("Tahoma",Font.BOLD,30);
		Font font1=new Font("Tahoma",Font.BOLD,20);
		Font font2=new Font("Tahoma",Font.PLAIN,15);

		container=getContentPane();
		Cursor hand=new Cursor(HAND_CURSOR);
		Cursor wait=new Cursor(WAIT_CURSOR);
		panel1=new JPanel();
		panel1.setBounds(100,20,600,80);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		container.add(panel1);
		label=new JLabel("Doctor Registration Form");
		label.setBounds(130, 10, 450,50);
		label.setFont(font);
		label.setForeground(Color.BLUE);
		panel1.add(label);
		
		panel2=new JPanel();
		panel2.setBounds(100,140,600,430);
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);
		container.add(panel2);
		label1=new JLabel("Doctor_Name");
		label1.setBounds(100, 20, 160, 30);
		label1.setFont(font1);
		panel2.add(label1);
		text1=new JTextField(20);
		text1.setBounds(300, 20, 200, 30);
		text1.setFont(font2);
		panel2.add(text1);
		
		label2= new JLabel("Speciality");
		label2.setBounds(100, 70, 160, 30);
		label2.setFont(font1);
		panel2.add(label2);
		text2= new JTextField(20);
		text2.setBounds(300, 70, 200, 30);
		text2.setFont(font2);
		panel2.add(text2);
		
		label3= new JLabel("Password");
		label3.setBounds(100, 120, 160, 30);
		label3.setFont(font1);
		panel2.add(label3);
		text3= new JTextField(20);
		text3.setBounds(300, 120, 200, 30);
		text3.setFont(font2);
		panel2.add(text3);
		
		label4= new JLabel("Email_ID");
		label4.setBounds(100, 170, 160, 30);
		label4.setFont(font1);
		panel2.add(label4);
		text4= new JTextField(20);
		text4.setBounds(300, 170, 200, 30);
		text4.setFont(font2);
		panel2.add(text4);
		
		label5= new JLabel("Address");
		label5.setBounds(100, 220, 160, 30);
		label5.setFont(font1);
		panel2.add(label5);
		text5= new JTextField(20);
		text5.setBounds(300, 220, 200, 30);
		text5.setFont(font2);
		panel2.add(text5);
		
		label6= new JLabel("Mobile_No");
		label6.setBounds(100, 270, 160, 30);
		label6.setFont(font1);
		panel2.add(label6);
		text6= new JTextField(20);
		text6.setBounds(300, 270, 200, 30);
		text6.setFont(font2);
		panel2.add(text6);
		footer=new JLabel("Copyright © 2019 Akansha_Himanshu_SVDC ");
		footer.setBounds(10,620,600,50);
		
		b1=new JButton("Add Doctor");
		b1.setBounds(150,350, 150, 50);
		b1.setFont(font1);
		b1.setCursor(wait);
		panel2.add(b1);
		b2=new JButton("Cancel");
		b2.setBounds(340, 350, 150, 50);
		b2.setFont(font1);
		b2.setCursor(hand);
		panel2.add(b2);
		
		
		this.add(footer);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
		

		b1.addActionListener(new ActionListener(){
				
				
					
					public void theQuery(String query) {
						
						
						Connection con=null;
						
						try{
							Class.forName("com.mysql.cj.jdbc.Driver");
							con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","mysql");
							Statement stmt= con.createStatement();
							stmt.executeUpdate(query);
							JOptionPane.showMessageDialog(null, "Doctor Added successfully!"," ",JOptionPane.PLAIN_MESSAGE);

						}
						catch(Exception e){
							System.out.println(e);
							
						}
					

					}
				
		public  void actionPerformed(ActionEvent e) {
			
			theQuery("insert into adddoctor(Doctor_Name, Speciality,Password,Email_ID, Address, Mobile_No)"
					+ " values('"+text1.getText()+"','"+text2.getText()+"', '"+text3.getText()+"', '"+text4.getText()+"', '"+text5.getText()+"','"+text6.getText()+"')");
		
			
					}
				}
			);
		
		
        b2.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
				new DoctorLogin();
		  		dispose();
			}
		}

				);
		
	}
	
      public void paint(Graphics g){
		
		 super.paintComponents(g);
		 g.setColor(Color.black);
		 g.drawLine(0,660,800, 660);
	}

	  
       public static void main(String args[])
       {
    	  AddDoctor ad=new AddDoctor();
       }

}