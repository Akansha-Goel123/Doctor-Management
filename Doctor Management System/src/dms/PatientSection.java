package dms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PatientSection  extends JFrame{
	
	JLabel label,footer;
	JButton btnAdd,btnEdit,btnSearch,btnDelete,btnLog;
	JPanel panel1,panel2,panel3;
	Container container;
    PatientSection(){
		
    	container=getContentPane();
		Cursor crosshair=new Cursor(CROSSHAIR_CURSOR);
		Cursor waitCur=new Cursor(WAIT_CURSOR);
		Cursor cursor=new Cursor(HAND_CURSOR);
		panel1=new JPanel();
		panel1.setBounds(40,30,620,80);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		container.add(panel1);
    	label=new JLabel("Patient Section");
    	label.setBounds(180, 20, 450, 40);
		label.setCursor(crosshair);
		Font font=new Font("Tahoma",Font.BOLD,40);
		label.setFont(font);
		label.setForeground(Color.BLUE);
		panel1.add(label);
		panel2=new JPanel();
		panel2.setBounds(40,140,620,350);
		panel2.setBorder(BorderFactory.createTitledBorder("Operations "));
		panel2.setBackground(Color.lightGray);
		panel2.setFont(new Font("Tahoma",Font.BOLD,20));
		panel2.setLayout(null);
		container.add(panel2);
		btnAdd=new JButton("Add New Patient");
		btnAdd.setBounds(240,40,180,40);
		btnAdd.setCursor(cursor);
		btnAdd.setBorder(BorderFactory.createBevelBorder(1));
        btnAdd.setFont(new Font("TimesNewRoman",Font.BOLD,15));		
		panel2.add(btnAdd);
		
		btnEdit=new JButton("Edit Patient Record");
	    btnEdit.setBounds(240,120,180,40);
		btnEdit.setCursor(cursor);
		btnEdit.setBorder(BorderFactory.createBevelBorder(1));
        btnEdit.setFont(new Font("TimesNewRoman",Font.BOLD,15));		
	    panel2.add(btnEdit);
		
		btnDelete=new JButton("Delete Patient Record");
		btnDelete.setBounds(240,200,180,40);
		btnDelete.setCursor(cursor);
		btnDelete.setBorder(BorderFactory.createBevelBorder(1));
        btnDelete.setFont(new Font("TimesNewRoman",Font.BOLD,15));
		panel2.add(btnDelete);
		btnSearch=new JButton("Search Patient Record");
        btnSearch.setBounds(240,280,180,40);
		btnSearch.setCursor(cursor);
		btnSearch.setBorder(BorderFactory.createBevelBorder(1));
        btnSearch.setFont(new Font("TimesNewRoman",Font.BOLD,15));
        panel2.add(btnSearch);
		
		panel3=new JPanel();
		panel3.setBounds(40,520,620,80);
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel3.setBackground(Color.lightGray);
		panel3.setLayout(null);
		container.add(panel3);
		btnLog=new JButton("Log Out");
        btnLog.setBounds(280,20,80,40);
		btnLog.setCursor(waitCur);
		btnLog.setBorder(BorderFactory.createBevelBorder(1));
        btnLog.setFont(new Font("TimesNewRoman",Font.BOLD,15));	
		panel3.add(btnLog);

		footer=new JLabel("Copyright © 2019 Akansha_Himanshu_HIET ");
		footer.setBounds(10,620,600,50);
        
		btnAdd.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
				new AddPatient();
				dispose();
			}
		}

				);
		
		btnEdit.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
				new EditPatient();
				dispose();
			}
		}

				);
		
		btnSearch.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
				new SearchPatient();
				dispose();
			}
		}

				);
		
		
	    	btnDelete.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
				new DeletePatient();
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
	    	
	    setLayout(null);
		
		add(footer);
		setSize(700,700);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("Doctor Management System");

    }
    
	public void paint(Graphics g){
		
		super.paintComponents(g);
		g.setColor(Color.black);
		g.drawLine(0,660,750, 660);
	}


    public static void main(String args[]){
    	
    	PatientSection as=new PatientSection();
    }

}

