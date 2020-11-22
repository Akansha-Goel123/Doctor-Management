package dms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DeleteDoctor extends JFrame {
	
	JLabel label,label1,footer;
	JTextField text;
	JPanel panel1,panel2;
	Container container;
	JButton b1,b2;
	
	DeleteDoctor()
	{
		setSize(600,500);
		setTitle("Doctor Management System");
		setLocationRelativeTo(null);
		container=getContentPane();
		Cursor hand=new Cursor(HAND_CURSOR);
		Font font1=new Font("Tahoma", Font.CENTER_BASELINE,18);
		
		panel1=new JPanel();
		panel1.setBounds(50,20,500,90);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		container.add(panel1);
		label=new JLabel("Delete Doctor Details");
		label.setBounds(95, 20, 550, 40);
		Font font=new Font("Tahoma",Font.BOLD,30);
		label.setFont(font);
		label.setForeground(Color.blue);
		panel1.add(label);
	
		panel2=new JPanel();
		panel2.setBounds(50,150,500,240);
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);
		container.add(panel2);
		
		label1=new JLabel("Enter ID");
		label1.setBounds(90, 60, 100, 50);
		label1.setFont(font1);
		panel2.add(label1);
		text=new JTextField(20);
		text.setBounds(200, 60, 200, 40);
		text.setFont(font1);
		panel2.add(text);
		
		
		footer=new JLabel("Copyright © 2019 Akansha_Himanshu_SVDC ");
		footer.setBounds(10,420,600,50);
		
		b1=new JButton("Delete");
		b1.setBounds(95,150,130,50);
		b1.setFont(font1);
		b1.setCursor(hand);
		panel2.add(b1);
		
		b2=new JButton("Back");
		b2.setBounds(260,150,130,50);
		b2.setCursor(hand);
		b2.setFont(font1);
		panel2.add(b2);
		
		this.add(footer);
		
		b1.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
			
				try{
					Connection con=null;
					PreparedStatement pos=null;
					String sql="DELETE from adddoctor WHERE Doctor_ID=?";
					con= DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","mysql");
					pos=con.prepareStatement(sql);
					pos.setString(1,text.getText());
					pos.executeUpdate();
					JOptionPane.showMessageDialog(null, "Doctor record deleted successfully");
				}
				catch(SQLException | HeadlessException ex){
					
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		}
	);
		
     b2.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
				new DoctorSection();
				dispose();
			}
		}
		                   );
     
     
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
    public void paint(Graphics g){
		
		super.paintComponents(g);
		g.setColor(Color.black);
		g.drawLine(0,460,600, 460);
	}

    public static void main(String args[]){
    	
		DeleteDoctor dd=new DeleteDoctor();

    }
    }
