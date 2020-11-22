package dms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminLogin extends JFrame{
	
	JLabel label,label1,label2,footer;
	JTextField text1;
	JPasswordField text2;
	JButton btn;
	JPanel panel1,panel2;
	Container container;
	
	public AdminLogin()
	{
		super();
		setSize(600,600);
		setLocationRelativeTo(null);
		container=getContentPane();
		Font font=new Font("Tahoma",Font.BOLD,35);
		Font font1=new Font("Tahoma", Font.CENTER_BASELINE,20);
		Font font2=new Font("Tahoma",Font.PLAIN,15);
		Cursor waitCur=new Cursor(WAIT_CURSOR);
		Cursor textCur=new Cursor(TEXT_CURSOR);
		Cursor handCur=new Cursor(HAND_CURSOR);
		Cursor crosshair=new Cursor(CROSSHAIR_CURSOR);
		panel1=new JPanel();
		panel1.setBounds(50,20,500,80);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		container.add(panel1);
		label=new JLabel("Admin Login Form");
		label.setBounds(100, 15, 450, 50);
		label.setCursor(crosshair);
		label.setFont(font);
		label.setForeground(Color.blue);
		panel1.add(label);
		
		panel2=new JPanel();
		panel2.setBounds(50,150,500,300);
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);
		container.add(panel2);
		label1=new JLabel("Enter Name :");
		label1.setBounds(50, 60, 150, 40);
		label1.setCursor(crosshair);
		label1.setFont(font1);
		panel2.add(label1);
		text1=new JTextField();
		text1.setBounds(230, 60, 200, 40);
		text1.setFont(font2);
		text1.setCursor(textCur);
		panel2.add(text1);
		
		label2= new JLabel("Enter Password :");
		label2.setBounds(50, 130, 200, 40);
		label2.setCursor(crosshair);
		label2.setFont(font1);
		panel2.add(label2);
		text2= new JPasswordField();
		text2.setBounds(230, 130, 200, 40);
		text2.setFont(font2);
		text2.setCursor(textCur);
		panel2.add(text2);
		
		btn=new JButton("Login");
		btn.setBounds(200, 230, 130, 50);
		btn.setCursor(handCur);
		btn.setFont(font1);
		panel2.add(btn);
		
		footer=new JLabel("Copyright © 2019 Akansha_Himanshu_HIET ");
		footer.setBounds(10,520,500,50);
				
		this.add(footer);
				
		btn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
				String name=text1.getText();
				String password=text2.getText();
				if(name.equals("admin")&& password.equals("admin@123")){
					
					new AdminSection();
					dispose();
				}
				else{
					
					JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or password Error","Login Error",JOptionPane.ERROR_MESSAGE);
				}

					
				}
			
		}
				);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		setTitle("Doctor Management System");
	}
	

	public void paint(Graphics g){
		
		super.paintComponents(g);
		g.setColor(Color.black);
		g.drawLine(0,560,600, 560);
	}

	

	public static void main(String...args) throws Exception
	{
		AdminLogin al=new AdminLogin();
	}

}

