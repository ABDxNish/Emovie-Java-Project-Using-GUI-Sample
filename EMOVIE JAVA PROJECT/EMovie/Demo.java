import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Demo extends JFrame implements ActionListener {
private JLabel label;
private JPanel p1;
private JButton button;
private Container con;
private ImageIcon imageLabel,img1,img2;
 public Demo()
	 {  
	 this.setTitle("EMovie");
		 this.setSize(1200,800);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initialComponents();
		
		}
		public void initialComponents(){
			
		con=this.getContentPane();
		con.setLayout(null);
			
		
			 p1 = new JPanel();
		p1.setBounds(0,0,1200,800);
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(null);
		
		
		
		label= new JLabel("SHOW GOES ON");
		 label.setFont(new Font("Algerian",Font.BOLD,60));
		 label.setForeground(Color.red);
		 label.setBounds(400,250,500,50);
		 p1.add(label);
		
		
		 button =new JButton("START");
		
		 button.setForeground(Color.black);
		 button.setBackground(Color.pink);
		 button.setBounds(520,300,150,40);
		 button.addActionListener(this);
		 p1.add(button);
		
		
	
	

        	img2 = new ImageIcon(getClass().getResource("WELLCOME.GIF"));
	

       JLabel imageLabe1 = new JLabel(img2);
       imageLabe1.setBounds(0,0,img2.getIconWidth(),img2.getIconHeight());
    
		p1.add(imageLabe1);
		
		con.add(p1);

		
			
		}
	
public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==button){
				Login  f2=new Login();
              this.setVisible(false);
              f2.setVisible(true);			  

}	
		}
}