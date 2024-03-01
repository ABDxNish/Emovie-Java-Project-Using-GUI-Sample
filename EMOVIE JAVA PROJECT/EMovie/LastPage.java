
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LastPage extends JFrame {
JLabel label;
JPanel p1;

JButton button;
 public LastPage()
	 {  
	
	 
	 
	 
	 
	   
        this.setTitle("Completed");
		 this.setSize(1200,800);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 
		  p1 = new JPanel();
		p1.setBounds(0,0,1200,800);
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(null);
		
		
		
		/*label= new JLabel("Thank You");
		 label.setFont(new Font("Algerian",Font.BOLD,80));
		 label.setForeground(Color.red);
		 label.setBounds(200,250,500,100);
		 p1.add(label);*/
		
		
		
		
		 ImageIcon image = new ImageIcon("thankyougif.GIF");

        JLabel imageLabe1 = new JLabel(image);
        imageLabe1.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
        imageLabe1.setIcon(image);
		p1.add(imageLabe1);
		
		this.add(p1);
		
		}

			
}