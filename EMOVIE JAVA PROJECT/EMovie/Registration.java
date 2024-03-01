import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.*;
import java.util.*;
public class Registration extends JFrame implements ActionListener
{
	
	private Cursor cursor;
	private JButton b1,b2;
	private Font f1,f2,f3,f4,f5,f6;
	private Container con;
	private JPanel p1;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	private JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	private JPasswordField pf1,pf2;
	public Registration()
	{
		this.setTitle("EMovie Registration ");
		this.setSize(1300,900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con= this.getContentPane();
		con.setLayout(null);
		con.setBackground(Color.DARK_GRAY);
		
		
		f1 = new Font("Century Gothic",Font.BOLD,38);
		f2 = new Font("Century Gothic",Font.BOLD,20);
		f3 = new Font("Century Gothic",Font.PLAIN,20);
		f4 = new Font("Century Gothic",Font.BOLD,20);
		f5 = new Font("Century Gothic",Font.PLAIN,18);
		f6 = new Font("Algerian",Font.BOLD,60);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(380,100,1200,800);
		this.setLocationRelativeTo(null);
		this.setTitle("Registration Form");
		this.setResizable(false);
		
		l9 = new JLabel("SHOW GOES ON!");
		l9.setBounds(390,10,600,80);
		l9.setFont(f6);
		l9.setForeground(Color.WHITE);
		con.add(l9);
		
		
		p1 = new JPanel();
		p1.setBounds(0,0,1200,100);
		p1.setBackground(Color.BLACK);
		con.add(p1);
		
		l1 = new JLabel("Not a user?");
		l1.setBounds(485,150,450,60);
		l1.setForeground(Color.WHITE);
		l1.setFont(f2);
		con.add(l1);
		
		l2 = new JLabel("Register Now!");
		l2.setBounds(482,168,600,85);
		l2.setForeground(Color.WHITE);
		l2.setFont(f1);
		con.add(l2);
		
		l3 = new JLabel("FIRST NAME: ");
		l3.setToolTipText("Don't Put Number");
		l3.setBounds(380,303,200,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(f3);
		con.add(l3);
		
		tf1 = new JTextField();
		tf1.setBounds(580,303,250,30);
		tf1.setBackground(Color.WHITE);
		tf1.setForeground(Color.BLACK);
		tf1.setHorizontalAlignment(JTextField.CENTER);
		tf1.setFont(f5);
		con.add(tf1);
		
		l4 = new JLabel("LAST NAME: ");
		l4.setToolTipText("Don't Put Numbers");
		l4.setBounds(380,350,200,30);
		l4.setForeground(Color.WHITE);
		l4.setFont(f3);
		con.add(l4);
		
		tf2 = new JTextField();
		tf2.setBounds(580,350,250,30);
		tf2.setBackground(Color.WHITE);
		tf2.setForeground(Color.BLACK);
		tf2.setHorizontalAlignment(JTextField.CENTER);
		tf2.setFont(f5);
		con.add(tf2);
		
		l5 = new JLabel("USER NAME: ");
		l5.setToolTipText("Usemname May Contains Number or Sign");
		l5.setBounds(380,491,200,30);
		l5.setForeground(Color.WHITE);
		l5.setFont(f3);
		con.add(l5);
		
		tf3 = new JTextField();
		tf3.setBounds(580,491,250,30);
		tf3.setBackground(Color.WHITE);
		tf3.setForeground(Color.BLACK);
		tf3.setHorizontalAlignment(JTextField.CENTER);
		tf3.setFont(f5);
		con.add(tf3);
		
		l6 = new JLabel("EMAIL ADDRESS: ");
		l6.setBounds(380,397,200,30);
		l6.setForeground(Color.WHITE);
		l6.setFont(f3);
		con.add(l6);
		
		tf4 = new JTextField();
		tf4.setBounds(580,397,250,30);
		tf4.setBackground(Color.WHITE);
		tf4.setForeground(Color.BLACK);
		tf4.setHorizontalAlignment(JTextField.CENTER);
		tf4.setFont(f5);
		con.add(tf4);
		
		l7 = new JLabel("PASSWORD: ");
		l7.setToolTipText("PassWord Must Contains Alphabet & Number");
		l7.setBounds(380,444,200,30);
		l7.setForeground(Color.WHITE);
		l7.setFont(f3);
		con.add(l7);
		
		pf1 = new JPasswordField();
		pf1.setBounds(580,444,250,30);
		pf1.setBackground(Color.WHITE);
		pf1.setForeground(Color.BLACK);
		pf1.setHorizontalAlignment(JTextField.CENTER);
		pf1.setFont(f5);
		con.add(pf1);
		
		l8 = new JLabel("DATE OF BIRTH: ");
		l8.setBounds(380,538,200,30);
		l8.setForeground(Color.WHITE);
		l8.setFont(f3);
		con.add(l8);
		
		tf5 = new JTextField("Date-Month-Year");
		tf5.setBounds(580,538,250,30);
		tf5.setBackground(Color.WHITE);
		tf5.setForeground(Color.BLACK);
		tf5.setHorizontalAlignment(JTextField.CENTER);
		tf5.setFont(f5);
		con.add(tf5);
		
		b1 = new JButton("Back");
		b1.setCursor(cursor);
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.DARK_GRAY);
		b1.setBounds(420,640,110,30);
		b1.setFont(f2);
		b1.addActionListener(this);
		con.add(b1);
		
		b2 = new JButton("SING UP");
		b2.setCursor(cursor);
		b2.setBackground(Color.decode("#C00000"));
		b2.setForeground(Color.WHITE);
		b2.setBounds(650,640,150,30);
		b2.setFont(f2);
		b2.addActionListener(this);
		con.add(b2);
		
		
		ImageIcon image = new ImageIcon("bg.jpg");

        JLabel imageLabe1 = new JLabel();
        imageLabe1.setBounds(0,100,1200,700);
        imageLabe1.setIcon(image);
        imageLabe1.setVerticalAlignment(JLabel.TOP);
        imageLabe1.setHorizontalAlignment(JLabel.CENTER);
		con.add(imageLabe1);	
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1){
           Login n2=new Login();
				this.setVisible(false);
				n2.setVisible(true);
			}
			
			 if(ae.getSource()==b2){
				  String fName=tf1.getText().toString();
	 String lName=tf2.getText().toString();
	 String ead=tf4.getText().toString();
	 String pass=pf1.getText().toString();
	 String uName=tf3.getText().toString();
	 String dob=tf5.getText().toString();
	 if(fName.isEmpty() || lName.isEmpty() || ead.isEmpty() || pass.isEmpty() || uName.isEmpty() || dob.isEmpty()){
		 JOptionPane.showMessageDialog(null,"Please Fillup All The Component","Warning",JOptionPane.WARNING_MESSAGE);
	 }
	 else if(pass.equals(pass)){
				 int choiece= JOptionPane.showConfirmDialog(null,"Are You A Human","Human Confirmation Box", JOptionPane.YES_NO_CANCEL_OPTION);
if(choiece==JOptionPane.NO_OPTION){
			System.exit(0);
		}
		else if(choiece==JOptionPane.CANCEL_OPTION){
			System.exit(0);
		}
		else {
			String ques=JOptionPane.showInputDialog(null,"What is the value of 2+2?","Question Bot",3);
			String q=ques;
			String p="4";
			if(q.equals(p)){
				AccountCreate ac=new AccountCreate(fName,lName,ead,pass,uName,dob);
				ac.addAccount();
				JOptionPane.showMessageDialog(null,"HURRAY YOU'VE CREATED A ACCOUNT");
				
				Login  p2=new Login();
              this.setVisible(false);
			p2.setVisible(true);
			}
			else{
				JOptionPane.showMessageDialog(null,"Sorry You Cant Create Account");
				System.exit(0);
			}
		
			
}
}
		}
}
}