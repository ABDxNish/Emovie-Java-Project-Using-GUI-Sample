import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectItem4 extends JFrame implements ActionListener
{
	private Container c;
	private Font f1,f2,f3,f4;
	private JPanel p1;
	private JLabel l1,l2,l3,l4,l5;
	private JComboBox cb1,cb2,cb3,cb4;
	private String[] date = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	private String[] month = {"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
	private String[] year = {"Year","2023"};
	private String[] hour = {"Hour","9am-12pm","1pm-4pm","6pm-9pm"};
	private JButton b1,b2;
	
	SelectItem4()
	{
		this.setTitle("EMovie Select Time");
		this.setBounds(380,100,1200,800);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		initalComponents();
		
			
	}
	public void initalComponents(){
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		
		
		
		f1 = new Font("Century Gothic",Font.BOLD,38);
		f2 = new Font("Algerian",Font.BOLD,45);
		f3 = new Font("Century Gothic",Font.BOLD,30);
		f4 = new Font("Century Gothic",Font.PLAIN,18);
		
		l1 = new JLabel("Date & Showtime");
		l1.setBounds(425,10,800,80);
		l1.setFont(f2);
		l1.setForeground(Color.WHITE);
		c.add(l1);
		
		p1 = new JPanel();
		p1.setBounds(0,0,1200,100);
		p1.setBackground(Color.BLACK);
		c.add(p1);
		
		l2 = new JLabel("Date & Showtime");
		l2.setBounds(380,150,300,100);
		l2.setForeground(Color.WHITE);
		l2.setFont(f3);
		c.add(l2);
		
		l3 = new JLabel("Date of show");
		l3.setBounds(380,270,200,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(f4);
		c.add(l3);
		
		cb1 = new JComboBox(date);
		cb1.setBounds(380,310,90,35);
		cb1.setEditable(true);
		cb1.setSelectedIndex(0);
		c.add(cb1);
		
		cb2 = new JComboBox(month);
		cb2.setBounds(480,310,140,35);
		cb2.setEditable(true);
		cb2.setSelectedIndex(0);
		c.add(cb2);
		
		cb3 = new JComboBox(year);
		cb3.setBounds(630,310,140,35);
		cb3.setEditable(true);
		cb3.setSelectedIndex(0);
		c.add(cb3);
		
		l4 = new JLabel("Time of show");
		l4.setBounds(380,400,200,30);
		l4.setForeground(Color.WHITE);
		l4.setFont(f4);
		c.add(l4);
		
		cb4 = new JComboBox(hour);
		cb4.setBounds(380,440,140,35);
		cb4.setEditable(true);
		cb4.setSelectedIndex(0);
		c.add(cb4);
		
		b1 = new JButton("Back");
		b1.setBackground(Color.RED);
		b1.setForeground(Color.WHITE);
		b1.setBounds(340,570,110,30);
		b1.setFont(f4);
		b1.addActionListener(this);
		c.add(b1);
		
		b2 = new JButton("Next");
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLACK);
		b2.setBounds(720,570,110,30);
		b2.addActionListener(this);
		b2.setFont(f4);
		c.add(b2);
		
		
		ImageIcon image = new ImageIcon("FlashO.jpg");

        JLabel imageLabe1 = new JLabel();
        imageLabe1.setBounds(0,100,1200,700);
        imageLabe1.setIcon(image);
        imageLabe1.setVerticalAlignment(JLabel.TOP);
        imageLabe1.setHorizontalAlignment(JLabel.CENTER);
		c.add(imageLabe1);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			Booking3 b9=new Booking3();
			b9.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b2){
			String date=cb1.getSelectedItem().toString();
			String month=cb2.getSelectedItem().toString();
			String year=cb3.getSelectedItem().toString();
			String hour=cb4.getSelectedItem().toString();
			if(date.equals("Day") || month.equals("Month") || year.equals("Year")|| hour.equals("Hour")){
				JOptionPane.showMessageDialog(null,"Please Fillup All The Component","Warning",JOptionPane.WARNING_MESSAGE);
		}
		else{
			Payment4 p9=new Payment4();
			p9.setVisible(true);
			this.setVisible(false);
			
		}
		}
}
}