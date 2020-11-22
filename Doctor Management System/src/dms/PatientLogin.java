package dms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PatientLogin extends JFrame{
	
	JLabel label,label1,label2,footer,label3,label4;
	JTextField text1;
	JPasswordField text2;
	JButton btnlogin,btnsign;
	Cursor waitCur,textCur,handCur,crosshair;
	JPanel panel1,panel2,panel3,panel4;
	Container container;

	PatientLogin()
	{
		super();
		setSize(700,700);
		setLocationRelativeTo(null);
		container=getContentPane();
		waitCur=new Cursor(WAIT_CURSOR);
		textCur=new Cursor(TEXT_CURSOR);
		handCur=new Cursor(HAND_CURSOR);
		crosshair=new Cursor(CROSSHAIR_CURSOR);
		Font font1=new Font("Tahoma", Font.CENTER_BASELINE,20);
		panel1=new JPanel();
		panel1.setBounds(50,20,600,80);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);
		container.add(panel1);
		label=new JLabel("Patient Login Form");
		label.setBounds(120, 15, 450, 40);
		Font font=new Font("Tahoma",Font.BOLD,35);
		label.setCursor(crosshair);
		label.setFont(font);
		label.setForeground(Color.blue);
		panel1.add(label);
		
		panel2=new JPanel();
		panel2.setBounds(50,150,600,260);
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);
		container.add(panel2);
		label1=new JLabel("Enter Name :");
		label1.setBounds(80, 40, 150, 30);
		label1.setCursor(crosshair);
		label1.setFont(font1);
		panel2.add(label1);
		text1=new JTextField(20);
		text1.setBounds(300, 40, 150, 30);
		text1.setCursor(textCur);
		panel2.add(text1);
		
		
		label2= new JLabel("Enter Password :");
		label2.setBounds(80, 90, 200, 30);
		label2.setFont(font1);
		panel2.add(label2);
		text2= new JPasswordField(20);
		text2.setCursor(textCur);
		text2.setBounds(300, 90, 150, 30);
		panel2.add(text2);
		btnlogin=new JButton("Login");
		btnlogin.setBounds(250, 150, 140, 50);
		btnlogin.setFont(font1);
		btnlogin.setCursor(waitCur);
		panel2.add(btnlogin);
		label3= new JLabel();
		label3.setText("<html><h2 color=purple>Forgot Password?<u color=blue> Click Here..</u></h2></html>");
		label3.setBounds(220, 210, 400, 22);
		label3.setCursor(handCur);
		Font font2=new Font("Calibri",Font.BOLD,20);
		label3.setFont(font2);
		panel2.add(label3);
		
		
		panel3=new JPanel();
		panel3.setBounds(50,460,600,120);
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel3.setBackground(Color.lightGray);
		panel3.setLayout(null);
		container.add(panel3);
		
		btnsign=new JButton("Sign Up");
		btnsign.setBounds(250,20,120,50);
		btnsign.setCursor(waitCur);
		btnsign.setFont(font1);
		panel3.add(btnsign);
		
		label4= new JLabel();
		label4.setText("<html><h2 color=purple>If you are a new patient, registered here:</h2></html>");
		label4.setBounds(170, 70, 400, 22);
		label4.setCursor(handCur);
		label4.setFont(font2);
		panel3.add(label4);
		
		footer=new JLabel("Copyright © 2019 Akansha_Himanshu_HIET ");
		footer.setBounds(10,620,500,50);		
		
		this.add(footer);
		
		
		setTitle("Doctor Management System");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
		label3.addMouseListener(new MouseListener() {
			
			public void mouseClicked(MouseEvent e) {

				new ForgetPass();
				dispose();
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		
		btnlogin.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
				String name=text1.getText();
				String password=text2.getText();
				if(name.equals("admin")&& password.equals("admin123")){
					
					new PatientSection();
					dispose();
				}
				else{
					
					JOptionPane.showMessageDialog(PatientLogin.this, "Sorry, Username or password Error","Login Error",JOptionPane.ERROR_MESSAGE);
				}

					
				}
			
		}
				);
		
		btnsign.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
				
				new AddPatient();
				dispose();
			}
		}	);
		
			}
	

	public void paint(Graphics g){
		
		super.paintComponents(g);
		g.setColor(Color.black);
		g.drawLine(0,660,700, 660);
	}

	

	public static void main(String args[]) throws Exception{
		PatientLogin pl=new PatientLogin();
		
	}

}


