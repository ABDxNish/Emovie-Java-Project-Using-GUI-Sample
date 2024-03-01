import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Page4 extends JFrame implements ActionListener
{

	private JLabel l1,l2,l3,l4,l5;
	private JTextField t1,t2,t3,t4;
	private JButton b1,b2;
	
	private JPanel p1,p2;

public Page4(){
	
	this.setTitle(" EMovie Customer Info");
	this.setSize(1200,800);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	initialComponents();
}
	public void initialComponents(){
	p1=new JPanel();
	p1.setSize(new Dimension(1200,100));
	p1.setBackground(Color.black);
	p1.setLayout(null);
	
	l1=new JLabel("Customer Info");
	l1.setFont(new Font("Algerian",Font.BOLD,60));
	l1.setForeground(Color.white);
	l1.setBounds(390,10,600,80);
	p1.add(l1);
	
	p2=new JPanel();
	p2.setSize(new Dimension(1200,700));
	p2.setBackground(Color.DARK_GRAY);
	p2.setLayout(null);
	
	l2=new JLabel("Customer Name :");
	l2.setFont(new Font("Century Gothic",Font.BOLD,20));
	l2.setForeground(Color.white);
	l2.setBounds(380,303,200,30);
	p2.add(l2);

	
	l3=new JLabel("Customer Age    :");
	
	l3.setFont(new Font("Century Gothic",Font.BOLD,20));
	l3.setForeground(Color.white);
	l3.setToolTipText("You Must Be 11 Years Old Or Greater");
	l3.setBounds(380,350,200,30);
	p2.add(l3);
	
	l4=new JLabel("Customer Address :");
	l4.setFont(new Font("Century Gothic",Font.BOLD,20));
	l4.setForeground(Color.white);
	l4.setBounds(360,397,200,30);
	p2.add(l4);
	
	
	
	t1=new JTextField();
	t1.setBounds(580,303,250,30);
	t1.setBackground(Color.WHITE);
    t1.setForeground(Color.BLACK);
	p2.add(t1);
	//String f=t1.getText();
	
		
	
	t2=new JTextField();
	t2.setBounds(580,350,250,30);
	t2.setBackground(Color.WHITE);
    t2.setForeground(Color.BLACK);
	p2.add(t2);
	
	t3=new JTextField();
	t3.setBounds(580,397,250,100);
    t3.setBackground(Color.WHITE);
	t3.setForeground(Color.BLACK);
	p2.add(t3);
	
	
	
	b1=new JButton("Back");
	b1.setFont(new Font("Century Gothic",Font.BOLD,20));
	b1.setForeground(Color.white);
	b1.setBackground(Color.decode("#2E75B6"));
	b1.setBounds(389,530,150,55);
	b1.addActionListener(this);
	p2.add(b1);
	
	b2=new JButton("Next");
	b2.setFont(new Font("Century Gothic",Font.BOLD,20));
	b2.setForeground(Color.white);
	b2.setBackground(Color.orange);
	b2.setBounds(700,530,150,55);
	b2.addActionListener(this);
	p2.add(b2);
	
	ImageIcon image = new ImageIcon("bg.jpg");

        JLabel imageLabe1 = new JLabel();
        imageLabe1.setBounds(0,0,1200,700);
        imageLabe1.setIcon(image);
        imageLabe1.setVerticalAlignment(JLabel.TOP);
        imageLabe1.setHorizontalAlignment(JLabel.CENTER);
		p2.add(imageLabe1);
	
	
	
	this.add(p1);
	this.add(p2);
}

	

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1){
			Login l1=new Login();
			this.setVisible(false);
			l1.setVisible(true);
		}
		else if(ae.getSource()==b2){
			String name=t1.getText().toString();
			String address=t3.getText().toString();
			String age=t2.getText().toString();
			
			if(name.isEmpty() || address.isEmpty() || age.isEmpty()){
				 JOptionPane.showMessageDialog(null,"Please Fillup All The Component","Warning",JOptionPane.WARNING_MESSAGE);
			}
			try{
				int age1=Integer.parseInt(age);
			 if(age1<=11){
				JOptionPane.showMessageDialog(null,"You're not allowed to go in because of your age under 11","Age Restricted",JOptionPane.WARNING_MESSAGE);
			}
			else{
				 JOptionPane.showMessageDialog(null,"Verified");
			MovieTimeShow t1=new MovieTimeShow();
			this.setVisible(false);
			t1.setVisible(true);
			}
			}
			catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"Put Number in age","Number Exception",JOptionPane.WARNING_MESSAGE);
			}
			
		}
	}
}
	
