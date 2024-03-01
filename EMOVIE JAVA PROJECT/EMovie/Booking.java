import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Booking extends JFrame implements ActionListener
{
	
	private JLabel l1,l2,l3;
	private JPanel p1,p2;
	private JButton b1,b2;
    private JComboBox cb1,cb2;
    String[] date = {"Select one","0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"};
	 String[] month ={"Select one","0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"};
	
	
	public Booking (){
		
		this.setTitle("EMovie Ticket Booking");
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
		
		
		
		l1=new JLabel("wHat Do YoU WanT..??");
	l1.setFont(new Font("Algerian",Font.BOLD,50));
	l1.setForeground(Color.white);
	l1.setBounds(300,10,600,80);
	p1.add(l1);
		
		p2=new JPanel();
		p2.setSize(1200,700);
		p2.setBackground(Color.DARK_GRAY);
		p2.setLayout(null);
		
		b1=new JButton("BACK");
		b1.setFont(new Font("Serif",Font.BOLD,20));
		b1.setForeground(Color.white);
		b1.setBackground(Color.red);
		b1.setBounds(20,150,100,50);
		b1.addActionListener(this);
		p2.add(b1);
		
		b2=new JButton("NEXT");
		b2.setFont(new Font("Serif",Font.BOLD,20));
		b2.setForeground(Color.black);
		b2.setBackground(Color.green);
		b2.setBounds(900,600,100,50);
		b2.addActionListener(this);
		p2.add(b2);
		
		l2=new JLabel("VIP Seat:");
		l2.setFont(new Font("Serif",Font.BOLD,20));
		l2.setForeground(Color.blue);
		l2.setBounds(300,250,100,50);
		p2.add(l2);
		
		l3=new JLabel("Regular Seat:");
		l3.setFont(new Font("Serif",Font.BOLD,20));
		l3.setForeground(Color.blue);
		l3.setBounds(500,250,200,50);
		p2.add(l3);
		
		
		cb1 = new JComboBox(date);
		cb1.setBounds(310,310,90,35);
		cb1.setEditable(true);
		cb1.setSelectedIndex(2);
		p2.add(cb1);
		
		cb2 = new JComboBox(month);
		cb2.setBounds(500,310,140,35);
		cb2.setEditable(true);
		cb2.setSelectedIndex(2);
		p2.add(cb2);
		
		
		
		ImageIcon image = new ImageIcon("ShazamO.jpg");

        JLabel imageLabe1 = new JLabel();
        imageLabe1.setBounds(0,100,1200,700);
        imageLabe1.setIcon(image);
        imageLabe1.setVerticalAlignment(JLabel.TOP);
        imageLabe1.setHorizontalAlignment(JLabel.CENTER);
		p2.add(imageLabe1);
		
		
		
		
		
		
		this.add(p1);
		this.add(p2);
	}
	


	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			ViewingandTicketType1 a1=new ViewingandTicketType1();
			this.setVisible(false);
			a1.setVisible(true);
			
		}
		else if(ae.getSource()==b2){
			
			
			SelectItem1 a2=new SelectItem1();
			this.setVisible(false);
			a2.setVisible(true);
			
			
		}
	}
	
}
			
		