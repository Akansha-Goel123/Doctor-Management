package dms;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddPatient extends JFrame
{ 
	Container c;
	JPanel panel1,panel2,panel3;
	JLabel label1,name,label3,label4,label5,label6,msg,dises,id,email,emailmsg,mobilemsg,namemsg,footer,label7;
	JButton submit,reset,cancel;
	JTextField nameField,mobileField,t3,t4,t_id,emailIdField,dises_tField,t5,day;
	JRadioButton Male,Female,Other;
	JComboBox pIdField; 
	JTextArea address,screen;
	String s;
     
	public AddPatient()
		{
			super();
			setSize(700,780);
			setLocationRelativeTo(null);
			c=getContentPane();
			
			Cursor cur=new Cursor(Cursor.HAND_CURSOR);
			Font font=new Font("TimesNewRoman",Font.BOLD,15);
			
			panel1=new JPanel();
			panel1.setBounds(100,10,520,60);
			panel1.setBorder(BorderFactory.createLineBorder(Color.black));
			panel1.setBackground(Color.lightGray);
			panel1.setLayout(null);
			c.add(panel1);
			
			label1=new JLabel("Registration Form");
			label1.setBounds(120,20,300,30);
			panel1.add(label1);
			label1.setFont(new Font("TimesNewRoman",Font.BOLD,30));
			
			panel2=new JPanel();
			panel2.setBounds(100,100,520,450);
			panel2.setBorder(BorderFactory.createTitledBorder("Registration Form"));
			panel2.setBackground(Color.lightGray);
			panel2.setLayout(null);
			c.add(panel2);
	        
			id=new JLabel("Patient_ID");
	        id.setBounds(10,20,200,30);
			id.setFont(font);
			panel2.add(id);
			
			String pId[]={"1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10"," 11"," 12"," 13"," 14"," 15"," 16"," 17"," 18"," 19"," 20"," 21"," 22"," 23"," 24"," 25"," 26"," 27"," 28"," 29"," 30"," 31"," 32"," 33"," 34"," 35"," 36"," 37"," 38"," 39"," 40"," 41"," 42"," 43"," 44"," 45"," 46"," 47"," 48"," 49"," 50"," 51"," 52"," 53"," 54"," 55"," 56"," 57"," 58"," 59"," 60"," 61"," 62"," 63"," 64"," 65"," 66"," 67"," 68"," 69"," 70"," 71"," 72"," 73"," 74"," 75"," 76"," 77"," 78"," 79"," 80"," 81"," 82"," 83"," 84"," 85"," 86"," 87"," 88"," 89"," 90"," 91"," 92"," 93"," 94"," 95"," 96"," 97"," 98"," 99"," 100"," 101"," 102"," 103"," 104"," 105"," 106"," 107"," 108"," 109"," 110"," 111"," 112"," 113"," 114"," 115"," 116"," 117"," 118"," 119"," 120"};
		    
			pIdField=new JComboBox(pId);
		    pIdField.setBounds(200,20,200,30);
			panel2.add(pIdField);
			
			name=new JLabel("Name:");
			name.setBounds(10,60,200,30);
			name.setFont(font);
			panel2.add(name);
			
			nameField=new JTextField();
			nameField.setBounds(200,60,200,30);
			panel2.add(nameField);
			
			label3=new JLabel("Gender");
			label3.setBounds(10,100,200,30);
			label3.setFont(font);
			panel2.add(label3);
			
			Male=new JRadioButton("M");
			Male.setBounds(200,100,70,30);
			Male.setFont(font);
			Male.setCursor(cur);
			panel2.add(Male);
			
			Female=new JRadioButton("F");
			Female.setBounds(270,100,70,30);
			Female.setFont(font);
			Female.setCursor(cur);
			panel2.add(Female);
	        
			Other=new JRadioButton("Other");
			Other.setBounds(350,100,70,30);
			Other.setFont(font);
			Other.setCursor(cur);
			panel2.add(Other);
			
			ButtonGroup gender=new ButtonGroup();
			gender.add(Male);
			gender.add(Female);
			gender.add(Other);
			Male.setSelected(true);
			
			label4=new JLabel("Mobile_No:");
			label4.setBounds(10,140,200,30);
			panel2.add(label4);
			
			mobileField=new JTextField();
			mobileField.setBounds(200,140,200,30);
			label4.setFont(font);
			panel2.add(mobileField);
			
			mobilemsg=new JLabel(" ");
			mobilemsg.setBounds(200,170,200,10);
			panel2.add(mobilemsg);
			
			email=new JLabel("Email_id");
			email.setBounds(10,190,200,30);
			email.setFont(font);
			panel2.add(email);
			
			emailIdField=new JTextField();
			emailIdField.setBounds(200,190,200,30);
			panel2.add(emailIdField);
			
			emailmsg=new JLabel(" ");
			emailmsg.setBounds(200,220,200,10);
			panel2.add(emailmsg);
			
			label7=new JLabel("Password:");
			label7.setBounds(10,240,200,30);
			label7.setFont(font);
			panel2.add(label7);
			
			t5=new JTextField();
			t5.setBounds(200,240,200,30);
			panel2.add(t5);
						
			label5=new JLabel("DOB:");
			label5.setBounds(10,280,200,30);
			label5.setFont(font);
			panel2.add(label5);
			
			day=new JTextField();
			day.setBounds(200,280,200,30);
			panel2.add(day);
					
			label6=new JLabel("Address");
			label6.setBounds(10,320,200,30);
			label6.setFont(font);
			panel2.add(label6);
			
			address=new JTextArea();
			address.setBounds(200,320,200,60);
			panel2.add(address);
			
			dises=new JLabel("Disease");
			dises.setBounds(10,400,100,30);
			dises.setFont(font);
			panel2.add(dises);
			
			dises_tField=new JTextField();
			dises_tField.setBounds(200,400,200,30);
			panel2.add(dises_tField);
			
			panel3=new JPanel();
			panel3.setBounds(100,580,520,70);
			panel3.setBorder(BorderFactory.createLineBorder(Color.black));
			panel3.setBackground(Color.lightGray);
			panel3.setLayout(null);
			c.add(panel3);
	        
			submit=new JButton("Submit");
	        submit.setBounds(80,20,100,40);
			submit.setBorder(BorderFactory.createBevelBorder(0));
			submit.setBackground(Color.cyan);
			submit.setCursor(cur);
	        panel3.add(submit);
			
	        reset=new JButton("Reset");
			reset.setBounds(210,20,100,40);
			reset.setCursor(cur);
			reset.setBackground(Color.cyan);
			panel3.add(reset);
			
			cancel=new JButton("Cancel");
			cancel.setBounds(340,20,100,40);
			cancel.setCursor(cur);
			cancel.setBackground(Color.cyan);
			panel3.add(cancel);
			
			footer=new JLabel("Copyright © 2019 Akansha_Himanshu_HIET ");
			footer.setBounds(10,700,500,50);
			this.add(footer);
			
			c.setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			submit.addActionListener(new Submit());
			reset.addActionListener(new Reset());
			cancel.addActionListener(new Cancel());
			setVisible(true);
			setTitle("Doctor Management System");
		}
		
		class Submit implements ActionListener
		{
			
			public void theQuery(String query) {
				
				
				Connection con=null;
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","mysql");
					Statement stmt= con.createStatement();
					stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Patient Added successfully!"," ",JOptionPane.PLAIN_MESSAGE);

				}
				catch(Exception e){
					System.out.println(e);
					
				}
			
			}
			
		   public void actionPerformed(ActionEvent ae)
		   {
			  String Id=id.getText();
			  String name=nameField.getText();
			  String emailid=emailIdField.getText();
			  String gen="Male";
			  if(Female.isSelected())
				  gen="Female";
			  if(Other.isSelected())
				  gen="Other";
		//	  String dob=day.getSelectedItem()+" "+month.getSelectedItem()+" "+year.getSelectedItem();
			  
			  String dob=day.getText();
			
			  String pass=t5.getText();
			  String emailId=emailIdField.getText();
			  String mobileId=mobileField.getText();
			  String add=address.getText();
			  String disease=dises.getText();
			  String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
			
		      Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
			  Pattern pattern=Pattern.compile("^[6-9][0-9]{9}$");
	          Matcher m=pattern.matcher(mobileField.getText());
			  Matcher matcher = EMAIL_PATTERN.matcher(emailIdField.getText());
			   if(mobileField==null)
				   {
					   mobilemsg.setText(" enter mobile no");
					   mobileField.setText(" ");
				   }
			  if (emailIdField == null) {
				   emailmsg.setText("Plese enter email id");
				   emailIdField.setText(" ");
			    }
			   if (matcher.matches()) 
			   {
				    emailmsg.setText("welcome "+emailId);
				    emailIdField.setText(" ");
			   }
			   else
			   {
				    emailmsg.setText("Plese enter valid email id");
					emailIdField.setText(" ");
			   }
			   
			   theQuery("insert into addpatient(Patient_ID,Name,Gender,Mobile_No,Email_id,Password,DOB,Address,Disease)"
						+ " values('"+Id+"','"+name+"', '"+gen+"', '"+mobileId+"', '"+emailid+"','"+pass+"','"+dob+"','"+add+"','"+disease+"')");
			
				
		   }
				
	}
		
		class Reset implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
			{
				//screen.setText(" ");
			}
		}
		
		class Cancel implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
			{
				new PatientLogin();
				dispose();
			}
		}
		
		public void paint(Graphics g){
			
			super.paintComponents(g);
			g.setColor(Color.black);
			g.drawLine(0,740,700, 740);
		}
		
		public static void main(String...ar) throws NullPointerException
		{
			AddPatient regfrom=new AddPatient();
						
		}
	}
