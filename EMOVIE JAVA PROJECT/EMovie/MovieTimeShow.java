import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 public class MovieTimeShow extends JFrame implements ActionListener{
 
 
 
    
	 private JLabel imgLabel;
	 private ImageIcon img;
	private  JLabel label,labe2,labe3,labe4,labe5,labe6,labe7,labe8,labe9,labe10,labe11,labe12,labe13,labe14,labe15,labe16;
	 private JButton backbutton,button,button1,button2,button3;
	 private JPanel p,p1;
	 
	 public MovieTimeShow()
	 {
		 this.setTitle("EMovie Available Movie");
		 this.setSize(1200,700);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 
		initialComponents();
	 }
	 public void initialComponents(){
		  
		 p = new JPanel();
		p.setBounds(0,0,1200,80);
		p.setBackground(Color.black);
		p.setLayout(null);
		
		
		 backbutton=new JButton("back");
		
		 backbutton.setForeground(Color.black);
		 backbutton.setBackground(Color.cyan);
		 backbutton.setBounds(20,20,90,40);
		 backbutton.addActionListener(this);
		 p.add(backbutton);
		 
		 
		
		p1 = new JPanel();
		p1.setBounds(0,80,1200,620);
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(null);
		label= new JLabel("ALL MOVIES");
		 label.setFont(new Font("Algerian",Font.BOLD,60));
		 label.setForeground(Color.white);
		 label.setBounds(400,10,500,70);
		 p.add(label);
		
		ImageIcon image2 = new ImageIcon("shazam!.jpg");

        JLabel imageLabe2 = new JLabel();
        imageLabe2.setBounds(50,105,240,370);
        imageLabe2.setIcon(image2);
        imageLabe2.setVerticalAlignment(JLabel.TOP);
        imageLabe2.setHorizontalAlignment(JLabel.CENTER);
		p1.add(imageLabe2);
		
		
		 
		 labe2= new JLabel("IMDb ratting:7/10");
		 labe2.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe2.setForeground(Color.white);
		 labe2.setBounds(50,550,240,20);
		 p1.add(labe2);
		 
		 labe3= new JLabel("Language: English");
		 labe3.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe3.setForeground(Color.white);
		 labe3.setBounds(50,520,240,20);
		 p1.add(labe3);
		 
		 labe4= new JLabel("Movie Name: Shazam!");
		 labe4.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe4.setForeground(Color.white);
		 labe4.setBounds(50,490,240,20);
		 p1.add(labe4);
		
		 
		 
		 ImageIcon image3 = new ImageIcon("avater 2.jpg");

        JLabel imageLabe3 = new JLabel();
        imageLabe3.setBounds(340,105,240,370);
        imageLabe3.setIcon(image3);
        imageLabe3.setVerticalAlignment(JLabel.TOP);
        imageLabe3.setHorizontalAlignment(JLabel.CENTER);
		p1.add(imageLabe3);
		 
		 
		 labe5= new JLabel("IMDb ratting:8.2/10");
		 labe5.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe5.setForeground(Color.white);
		 labe5.setBounds(340,550,240,20);
		 p1.add(labe5);
		 
		 labe5= new JLabel("Language: English");
		 labe5.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe5.setForeground(Color.white);
		 labe5.setBounds(340,520,240,20);
		 p1.add(labe5);
		
		 
		 labe6= new JLabel("Movie Name:Avatar 2");
		 labe6.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe6.setForeground(Color.white);
		 labe6.setBounds(340,490,240,20);
		 p1.add(labe6);
		 
		 ImageIcon image4 = new ImageIcon("john Wick.jpg");

        JLabel imageLabe4 = new JLabel();
        imageLabe4.setBounds(630,105,240,370);
        imageLabe4.setIcon(image4);
        imageLabe4.setVerticalAlignment(JLabel.TOP);
        imageLabe4.setHorizontalAlignment(JLabel.CENTER);
		p1.add(imageLabe4);
		
		
		 labe7= new JLabel("IMDb ratting:9.3/10");
		 labe7.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe7.setForeground(Color.white);
		 labe7.setBounds(630,550,240,20);
		 p1.add(labe7);
		 
		 labe8= new JLabel("Language: English");
		 labe8.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe8.setForeground(Color.white);
		 labe8.setBounds(630,520,240,20);
		 p1.add(labe8);
		 
		 labe9= new JLabel("Movie Name:John Wick");
		 labe9.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe9.setForeground(Color.white);
		 labe9.setBounds(630,490,240,20);
		 p1.add(labe9);
		 
		 
		ImageIcon image5 = new ImageIcon("the flash.jpg");

        JLabel imageLabe5 = new JLabel();
        imageLabe5.setBounds(920,105,240,370);
        imageLabe5.setIcon(image5);
        imageLabe5.setVerticalAlignment(JLabel.TOP);
        imageLabe5.setHorizontalAlignment(JLabel.CENTER);
		p1.add(imageLabe5);
		 
		 
		 labe10= new JLabel("IMDb ratting:7.8/10");
		 labe10.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe10.setForeground(Color.white);
		 labe10.setBounds(920,550,240,20);
		 p1.add(labe10);
		 
		 labe11= new JLabel("Language: English");
		 labe11.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe11.setForeground(Color.white);
		 labe11.setBounds(920,520,240,20);
		 p1.add(labe11);
		 
		 labe12= new JLabel("Movie Name:The Flash");
		 labe12.setFont(new Font("Times New Roman",Font.BOLD,20));
		 labe12.setForeground(Color.white);
		 labe12.setBounds(920,490,240,20);
		 p1.add(labe12);
		 
		 
		 
		 
		 button=new JButton("BOOK NOW");
		
		 button.setForeground(Color.white);
		 button.setBackground(Color.red);
		 button.setBounds(50,580,240,50);
		 button.addActionListener(this);
		 p1.add(button);
		 
		
		
		
		
		button1=new JButton("BOOK NOW");
		button1.setForeground(Color.white);
		button1.setBackground(Color.red);
	    button1.setBounds(340,580,240,50);
		button1.addActionListener(this);
		p1.add(button1);
		
		
		
		
		button2=new JButton("BOOK NOW");
		button2.setForeground(Color.white);
		button2.setBackground(Color.red);
	    button2.setBounds(630,580,240,50);
		button2.addActionListener(this);
		p1.add(button2);
		
		
		
		
		
		button3=new JButton("BOOK NOW");
		button3.setForeground(Color.white);
		button3.setBackground(Color.red);
	    button3.setBounds(920,580,240,50);
		button3.addActionListener(this);
		p1.add(button3);
		
		
		
		
		ImageIcon image = new ImageIcon("black2.jpg");

        JLabel imageLabe1 = new JLabel();
        imageLabe1.setBounds(0,80,1200,620);
        imageLabe1.setIcon(image);
        imageLabe1.setVerticalAlignment(JLabel.TOP);
        imageLabe1.setHorizontalAlignment(JLabel.CENTER);
		p1.add(imageLabe1);
		
		
		this.add(p);
		this.add(p1);
		
		
		
	}
	
public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==backbutton){
		Page4 p5=new Page4();
		this.setVisible(false);
		p5.setVisible(true);
	}
	else if(ae.getSource()==button){
		ViewingandTicketType1 b1=new ViewingandTicketType1();
		b1.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==button1){
		ViewingandTicketType2 b2=new ViewingandTicketType2();
		b2.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==button2){
		ViewingandTicketType3 b3=new ViewingandTicketType3();
		b3.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==button3){
		ViewingandTicketType4 b4=new ViewingandTicketType4();
		b4.setVisible(true);
		this.setVisible(false);
	}

}
 }