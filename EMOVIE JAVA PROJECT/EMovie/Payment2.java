import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment2 extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l0;
	ImageIcon img;
	JButton b1,b2,b3,b4,b5;
	JComboBox c1,c2;
	String[]ticket={"Select one","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
	
	public Payment2(){
		
		this.setTitle("EMovie Payment Page 2");
		this.setSize(1300,900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		p1.setSize(new Dimension(1300,100));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1=new JLabel("Payment Slip");
		l1.setFont(new Font("Algerian",Font.BOLD,90));
		l1.setForeground(Color.yellow);
		l1.setBounds(350,20,800,80);
		p1.add(l1);
		
		p2=new JPanel();
		p2.setSize(new Dimension(1300,700));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
		l4=new JLabel("MOVIE NAME :Avatar-2");
		l4.setFont(new Font("HANDWRITTEN",Font.BOLD,65));
		l4.setForeground(Color.white);
		l4.setBounds(220,110,1000,100);
		p2.add(l4);
		
		/*l2=new JLabel("How Many Ticket You Wants?:");
		l2.setFont(new Font("HANDWRITTEN",Font.BOLD,35));
		l2.setForeground(Color.blue);
		l2.setBounds(250,250,800,60);
		p2.add(l2);
		
		c1=new JComboBox(ticket);
		c1.setBounds(750,270,200,30);
		c1.setEditable(true);
		c1.setSelectedIndex(0);
		p2.add(c1); */
		
		l3=new JLabel("Virtual Payment Option :");
		l3.setFont(new Font("HANDWRITTEN",Font.BOLD,35));
		l3.setForeground(Color.blue);
		l3.setBounds(250,320,500,60);
		p2.add(l3);
		
		b3=new JButton("bkash");
		b3.setFont(new Font("Serif",Font.BOLD,25));
		b3.setForeground(Color.blue);
		b3.setBackground(Color.red);
		b3.setBounds(240,550,150,50);
		b3.addActionListener(this);
		p2.add(b3);
		
		ImageIcon image3 = new ImageIcon("Bikash.jpg");
        l5 = new JLabel();
        l5.setBounds(220,390,200,300);
        l5.setIcon(image3);
        l5.setVerticalAlignment(JLabel.TOP);
        l5.setHorizontalAlignment(JLabel.CENTER);
		p2.add(l5);
		
		
		b4=new JButton("Nagad");
		b4.setFont(new Font("Serif",Font.BOLD,25));
		b4.setForeground(Color.blue);
		b4.setBackground(Color.red);
		b4.setBounds(560,550,120,50);
		b4.addActionListener(this);
		p2.add(b4);
		
		ImageIcon image2 = new ImageIcon("Nogod.jpg");
		l9 = new JLabel();
        l9.setBounds(540,390,150,300);
        l9.setIcon(image2);
        l9.setVerticalAlignment(JLabel.TOP);
        l9.setHorizontalAlignment(JLabel.CENTER);
		p2.add(l9);
		
		b5=new JButton("Card");
		b5.setFont(new Font("Serif",Font.BOLD,25));
		b5.setForeground(Color.blue);
		b5.setBackground(Color.red);
		b5.setBounds(900,550,150,50);
		b5.addActionListener(this);
		p2.add(b5);
		
		ImageIcon image4 = new ImageIcon("Visa.jpg");
        l8 = new JLabel();
        l8.setBounds(830,390,280,300);
        l8.setIcon(image4);
        l8.setVerticalAlignment(JLabel.TOP);
        l8.setHorizontalAlignment(JLabel.CENTER);
		p2.add(l8);
		
		
		
		
		b1=new JButton("Back");
		b1.setFont(new Font("Serif",Font.BOLD,20));
		b1.setForeground(Color.DARK_GRAY);
		b1.setBackground(Color.white);
		b1.setBounds(50,650,150,40);
		b1.addActionListener(this);
		p2.add(b1);
		
		b2=new JButton("Next");
		b2.setFont(new Font("Serif",Font.BOLD,20));
		b2.setForeground(Color.DARK_GRAY);
		b2.setBackground(Color.white);
		b2.setBounds(450,650,150,40);
		b2.addActionListener(this);
		p2.add(b2);
		
		
		
		
		
		this.add(p1);
		this.add(p2);
	}
	
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			SelectItem2 s2=new SelectItem2();
			this.setVisible(false);
			s2.setVisible(true);
			
		}
		else if(ae.getSource()==b3){
			PaymentForm1 f1=new PaymentForm1();
			this.setVisible(false);
			f1.setVisible(true);
		}
		else if(ae.getSource()==b4){
			PaymentForm2 f2=new PaymentForm2();
			this.setVisible(false);
			f2.setVisible(true);
		}
		else if(ae.getSource()==b5){
			PaymentForm3 f3=new PaymentForm3();
			this.setVisible(false);
			f3.setVisible(true);
		}
		
	}
}
