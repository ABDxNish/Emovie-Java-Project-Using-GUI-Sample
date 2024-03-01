import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewingandTicketType3 extends JFrame implements ActionListener{

private JButton backbutton,button;
private JRadioButton aD,bD,cD,dD;
private JLabel label1,label2;
private JPanel p1;

 public ViewingandTicketType3()
	 {   this.setTitle("EMovie Ticket Type3");
		 this.setSize(1200,800);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 initialComponents();
		
	 }
		
		public void initialComponents(){
			  p1 = new JPanel();
		p1.setBounds(0,0,1200,800);
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(null);
		
		 backbutton=new JButton("back");
		 backbutton.setForeground(Color.white);
		 backbutton.setBackground(Color.decode("#2E75B6"));
		 backbutton.setBounds(20,640,90,40);
		 backbutton.addActionListener(this);
		 p1.add(backbutton);
		 
		  button=new JButton("Verify");
		 button.setForeground(Color.white);
		 button.setBackground(Color.green);
		 button.setBounds(550,640,90,70);
		 button.addActionListener(this);
		 p1.add(button);
		
		label1= new JLabel("Viewing :");
		 label1.setFont(new Font("Algerian",Font.BOLD,40));
		 label1.setForeground(Color.blue);
		 label1.setBounds(0,0,300,80);
		 p1.add(label1);
		
		aD=new JRadioButton("3D");
		aD.setForeground(Color.white);
		aD.setBackground(Color.decode("#2E75B6"));
		aD.setBounds(150,70,80,30);
		p1.add(aD);
		 
		 
		 bD=new JRadioButton("2D");
		bD.setForeground(Color.white);
		bD.setBackground(Color.decode("#2E75B6"));
		bD.setBounds(400,70,80,30);
		p1.add(bD);
		
		ButtonGroup group=new ButtonGroup();
		group.add(aD);
		group.add(bD);
		
		label2= new JLabel("Choose Ticket Type :");
		 label2.setFont(new Font("Algerian",Font.BOLD,35));
		 label2.setForeground(Color.blue);
		 label2.setBounds(0,120,700,70);
		 p1.add(label2);
		 
		cD=new JRadioButton("VIP-(4500BDT)");
		cD.setForeground(Color.white);
		cD.setBackground(Color.decode("#2E75B6"));
		cD.setBounds(255,575,170,45);
		p1.add(cD);
		
		
		dD=new JRadioButton("Regular-(800BDT)");
		dD.setForeground(Color.white);
		dD.setBackground(Color.decode("#2E75B6"));
		dD.setBounds(740,575,170,45);
		p1.add(dD);
		
		
		ButtonGroup group1=new ButtonGroup();
		group1.add(cD);
		group1.add(dD);
		
		
		
		
		
		ImageIcon image2 = new ImageIcon("vip.jpg");

        JLabel imageLabel2 = new JLabel();
        imageLabel2.setBounds(113,170,454,390);
        imageLabel2.setIcon(image2);
        imageLabel2.setVerticalAlignment(JLabel.TOP);
        imageLabel2.setHorizontalAlignment(JLabel.CENTER);
		p1.add(imageLabel2);
		
		ImageIcon image3 = new ImageIcon("normal.jpg");

        JLabel imageLabe13 = new JLabel();
        imageLabe13.setBounds(597,170,454,390);
        imageLabe13.setIcon(image3);
        imageLabe13.setVerticalAlignment(JLabel.TOP);
        imageLabe13.setHorizontalAlignment(JLabel.CENTER);
		p1.add(imageLabe13);
		
		 ImageIcon image = new ImageIcon("john wick2.jpg");

        JLabel imageLabe1 = new JLabel();
        imageLabe1.setBounds(0,0,1200,800);
        imageLabe1.setIcon(image);
        imageLabe1.setVerticalAlignment(JLabel.TOP);
        imageLabe1.setHorizontalAlignment(JLabel.CENTER);
		p1.add(imageLabe1);
		
		
		
		this.add(p1);
		}
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==backbutton){
				MovieTimeShow m0=new MovieTimeShow();
				this.setVisible(false);
				m0.setVisible(true);
			}
			else if(ae.getSource()==button){
				Booking2 b0=new Booking2();
				b0.setVisible(true);
			 this.setVisible(false);
			}
		}
	

}