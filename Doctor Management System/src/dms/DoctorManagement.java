package dms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DoctorManagement extends JFrame {
    
		JLabel label,footer;
		JButton btnAdmin, btnPatient,btnDoctor;
		JPanel panel1,panel2;
		Container container;			
		public DoctorManagement()
		{
			super();
		    setSize(850,700);
			setLocationRelativeTo(null);
			Cursor cursor=new Cursor(HAND_CURSOR);
			Cursor crosshair=new Cursor(CROSSHAIR_CURSOR);
			container=getContentPane();
			panel1=new JPanel();
			panel1.setBounds(50,30,750,120);
			panel1.setBorder(BorderFactory.createLineBorder(Color.black));
			panel1.setBackground(Color.lightGray);
			panel1.setLayout(null);
			container.add(panel1);
					
			label=new JLabel("Doctor Management System");
			label.setBounds(90, 10, 750, 90);
			Font font=new Font("Tahoma",Font.BOLD,40);
			label.setCursor(crosshair);
			label.setFont(font);
			label.setForeground(Color.blue);
			panel1.add(label);
			
			panel2=new JPanel();
	     	panel2.setBounds(50,180,750,420);
			panel2.setBorder(BorderFactory.createBevelBorder(1));
			panel2.setBackground(Color.lightGray);
			panel2.setLayout(null);
			container.add(panel2);
			btnAdmin=new JButton();
			btnAdmin.setBounds(70,130,150,180);
			btnAdmin.setCursor(cursor);
			btnAdmin.setBorder(BorderFactory.createLineBorder(Color.black));
			btnAdmin.setLayout(null);
			panel2.add(btnAdmin);
				
			btnPatient=new JButton();
			btnPatient.setBounds(280, 130,150, 180);
			btnPatient.setCursor(cursor);
			btnPatient.setBorder(BorderFactory.createLineBorder(Color.black));
			btnPatient.setLayout(null);
			panel2.add(btnPatient);
				
			btnDoctor=new JButton();
			btnDoctor.setBounds(490,130,150,180);
			btnDoctor.setCursor(cursor);
			btnDoctor.setBorder(BorderFactory.createLineBorder(Color.black));
			btnDoctor.setLayout(null);
			panel2.add(btnDoctor);
			footer=new JLabel("Copyright © 2020 Akansha_Himanshu_HIET ");
			footer.setBounds(10,620,800,50);
			setLayout(null);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
			btnAdmin.addActionListener(new ActionListener(){
					
						
				public void actionPerformed(ActionEvent e) {
					
					new AdminLogin();
					dispose();
				}
			}

					);
				
			btnPatient.addActionListener(new ActionListener(){
					
					
				public void actionPerformed(ActionEvent e) {
						
					new PatientLogin();
					dispose();
				}
			}
						

					);
				
			btnDoctor.addActionListener(new ActionListener(){
				
					
				public void actionPerformed(ActionEvent e) {
					
					new DoctorLogin();
					dispose();
				}
			}

					);
				
			add(footer);
			
					
			btnAdmin.setIcon(new ImageIcon("C:\\Users\\Akansha\\Documents\\New folder\\admin.jpg"));
							
			btnPatient.setIcon(new ImageIcon("C:\\Users\\Akansha\\Documents\\New folder\\patient.png"));
									
			btnDoctor.setIcon(new ImageIcon("C:\\Users\\Akansha\\Documents\\New folder\\doctor.jpg"));
					
			validate();
				
			}
				
			public void paint(Graphics g){
					
				super.paintComponents(g);
				g.setColor(Color.BLACK);
				g.drawLine(0,660,850, 660);
			}

			public static void main(String args[]){
				DoctorManagement l=new DoctorManagement();
				l.setTitle("Doctor Management System");
				
			}
				
	}

