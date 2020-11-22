package dms;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AdminSection extends JFrame{
	
	JLabel label,footer;
	JButton btnManageDoctor, btnManagePatient, btnBill, btnLog;
	Container container;
	JPanel panel1,panel2,panel3;
	
    AdminSection()
	{
        setSize(800,700);
		setLocationRelativeTo(null);
		setTitle("Doctor Management System");
		container=getContentPane();
		Cursor cur=new Cursor(HAND_CURSOR);
		Cursor crosshair=new Cursor(CROSSHAIR_CURSOR);
		Cursor waitCur=new Cursor(WAIT_CURSOR);
		
		panel1=new JPanel();
		panel1.setBounds(50,20,700,60);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		container.add(panel1); 
		label=new JLabel("Admin Section");
    	label.setBounds(240,10, 300, 40);
		label.setCursor(crosshair);
		Font font=new Font("Tahoma",Font.BOLD,40);
		label.setFont(font);
		label.setForeground(Color.BLUE);
		panel1.add(label);
		panel2=new JPanel();
		panel2.setBounds(50,140,700,450);
		panel2.setBorder(BorderFactory.createBevelBorder(1));
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);
		container.add(panel2);
		btnManageDoctor=new JButton();
		btnManageDoctor.setBounds(50,80,170,175);
		btnManageDoctor.setBorder(BorderFactory.createBevelBorder(1));
		btnManageDoctor.setCursor(cur);
		panel2.add(btnManageDoctor);
		btnManagePatient=new JButton();
		btnManagePatient.setBounds(250,80,170,175);
		btnManagePatient.setBorder(BorderFactory.createBevelBorder(1));
		btnManagePatient.setCursor(cur);
		panel2.add(btnManagePatient);
		btnBill=new JButton();
		btnBill.setBounds(470,80,170,175);
		btnBill.setBorder(BorderFactory.createBevelBorder(1));
		btnBill.setCursor(cur);
		panel2.add(btnBill);
		btnLog=new JButton("Log out");
		btnLog.setBounds(280,350,110,44);
		btnLog.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		btnLog.setCursor(waitCur);
		panel2.add(btnLog);
		
		btnManageDoctor.setIcon(new ImageIcon("C:\\Users\\Akansha\\Documents\\New folder\\doc.png"));
				
		btnManagePatient.setIcon(new ImageIcon("C:\\Users\\Akansha\\Documents\\New folder\\manpatient.png"));
		
		btnBill.setIcon(new ImageIcon("C:\\Users\\Akansha\\Documents\\New folder\\bill.jpg"));

		btnLog.setIcon(new ImageIcon("C:\\Users\\Akansha\\Documents\\New folder\\logout1.png"));

		footer=new JLabel("Copyright © 2019 Akansha_Himanshu_HIET ");
		footer.setBounds(10,620,600,50);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnManageDoctor.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
		       new DoctorsSection();
				dispose();
			}
		}

				);
		
		btnManagePatient.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
			
				new PatientsSection();
				dispose();
				
				}
		}
			
				);
		
				
		btnLog.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
			    new DoctorManagement();
				dispose();
			}
		}

				);
	    
	    
		add(footer);
		
		}
    

	public void paint(Graphics g){
		
		super.paintComponents(g);
		g.setColor(Color.black);
		g.drawLine(0,660,850, 660);
	}


    public static void main(String args[]){
    	
    	AdminSection as=new AdminSection();
		as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		as.setTitle("Doctor Management System");

    }

}
