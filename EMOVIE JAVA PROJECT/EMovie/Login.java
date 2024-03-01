import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.*;
import java.util.*;
public class Login extends JFrame implements ActionListener
{
	private Container c;
	private Font f1,f2,f3,f4;
	private JLabel l1,l2,l3,l4;
	private JPanel p1;
	private JTextField tf1;
	private JPasswordField pf1;
	private JButton b1,b2,b3;
	private Cursor cursor;
	Login()
	{
		
		f1 = new Font("Century Gothic",Font.BOLD,20);
		f2 = new Font("Algerian",Font.BOLD,50);
		f3 = new Font("Century Gothic",Font.BOLD,38);
		f4 = new Font("Century Gothic",Font.PLAIN,20);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(380,100,1200,800);
		this.setLocationRelativeTo(null);
		this.setTitle("EMovie Login Form");
		this.setResizable(false);
		
		l1 = new JLabel("WELCOME TO SHOW GOES ON!");
		l1.setBounds(230,10,1200,80);
		l1.setFont(f2);
		l1.setForeground(Color.WHITE);
		c.add(l1);
		
		p1 = new JPanel();
		p1.setBounds(0,0,1200,100);
		p1.setBackground(Color.BLACK);
		c.add(p1);
		
		l2 = new JLabel("Login!");
		l2.setBounds(540,168,600,85);
		l2.setForeground(Color.WHITE);
		l2.setFont(f3);
		c.add(l2);
		
		l3 = new JLabel("User Name: ");
		l3.setBounds(380,303,200,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(f4);
		c.add(l3);
		
		tf1 = new JTextField();
		tf1.setBounds(550,303,250,30);
		tf1.setBackground(Color.WHITE);
		tf1.setForeground(Color.BLACK);
		tf1.setHorizontalAlignment(JTextField.CENTER);
		tf1.setFont(f4);
		c.add(tf1);
		
		l4 = new JLabel("Password: ");
		l4.setBounds(380,390,200,30);
		l4.setForeground(Color.WHITE);
		l4.setFont(f4);
		c.add(l4);
		
		pf1 = new JPasswordField();
		pf1.setBounds(550,390,250,30);
		pf1.setBackground(Color.WHITE);
		pf1.setForeground(Color.BLACK);
		pf1.setHorizontalAlignment(JPasswordField.CENTER);
		pf1.setFont(f4);
		c.add(pf1);
		
		b1 = new JButton("Create a new Account");
		b1.setCursor(cursor);
		b1.setBackground(Color.decode("#2E75B6"));
		b1.setForeground(Color.BLACK);
		b1.setBounds(320,500,300,30);
		b1.setFont(f1);
		b1.addActionListener(this);
		c.add(b1);
		
		
		b2 = new JButton("Login");
		b2.setCursor(cursor);
		b2.setBackground(Color.decode("#C00000"));
		b2.setForeground(Color.WHITE);
		b2.setBounds(700,500,130,30);
		b2.setFont(f1);
		b2.addActionListener(this);
		c.add(b2);
		
		
		
		
		ImageIcon image = new ImageIcon("bg.jpg");

        JLabel imageLabe1 = new JLabel();
        imageLabe1.setBounds(0,100,1200,700);
        imageLabe1.setIcon(image);
        imageLabe1.setVerticalAlignment(JLabel.TOP);
        imageLabe1.setHorizontalAlignment(JLabel.CENTER);
		c.add(imageLabe1);
		
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1){
				
				Registration r1=new Registration();
				r1.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==b2){
				String uName=tf1.getText().toString();
				
				String pass=pf1.getText().toString();
				AccountCreate ac=new AccountCreate();
				if(ac.getAccount(uName,pass)){
				Page4  r5=new Page4();
              this.setVisible(false);
					r5.setVisible(true);
				}
				else{
				JOptionPane.showMessageDialog(null,"Check User Name Or Password","Warning",JOptionPane.WARNING_MESSAGE);}
					}
	
   }
       }


     