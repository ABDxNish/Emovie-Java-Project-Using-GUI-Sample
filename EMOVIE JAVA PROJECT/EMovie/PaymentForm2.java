
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaymentForm2 extends JFrame implements ActionListener {
    private JTextField mobileNumberTextField, pinTextField, amountTextField;
    private JButton submitButton,backButton;

    public PaymentForm2() {
        setTitle("Payment Form");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);

        mainPanel.setBackground(new Color(255, 192, 10));

        Font labelFont = new Font("Arial Rounded MT Bold", Font.BOLD, 25);

        JLabel mobileNumberLabel = new JLabel("Mobile Number");
        mobileNumberLabel.setFont(labelFont);
        mainPanel.add(mobileNumberLabel, constraints);

        mobileNumberTextField = new JTextField(25);
        mobileNumberTextField.setFont(labelFont);
        constraints.gridx = 1;
        mainPanel.add(mobileNumberTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel pinLabel = new JLabel("PIN");
        pinLabel.setFont(labelFont);
        mainPanel.add(pinLabel, constraints);

        pinTextField = new JPasswordField(25);
        pinTextField.setFont(labelFont);
        constraints.gridx = 1;
        mainPanel.add(pinTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        JLabel amountLabel = new JLabel("Amount");
        amountLabel.setFont(labelFont);
        mainPanel.add(amountLabel, constraints);

        amountTextField = new JTextField(25);
        amountTextField.setFont(labelFont);
        constraints.gridx = 1;
        mainPanel.add(amountTextField, constraints);

        backButton = new JButton("Back");
        backButton.addActionListener(this);
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.anchor = GridBagConstraints.CENTER;
        mainPanel.add(backButton, constraints);
		
		submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.anchor = GridBagConstraints.LINE_END;
        mainPanel.add(submitButton, constraints);

        add(mainPanel);

        JLabel welcomeLabel = new JLabel("Welcome to Nagod Digital Payment System");
        welcomeLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 36));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        add(welcomeLabel, BorderLayout.NORTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

     if(ae.getSource()==submitButton){

				
				 String mob=mobileNumberTextField.getText().toString();
				 String pin=pinTextField.getText().toString();
				 String amt= amountTextField.getText().toString();
				 if(mob.isEmpty()||pin.isEmpty()||amt.isEmpty()){
					 JOptionPane.showMessageDialog(null,"Please Fillup All The Component","Warning",JOptionPane.WARNING_MESSAGE);
					 this.setVisible(true);
				 }
				 else{
				  int choiece= JOptionPane.showConfirmDialog(null,"Are You Sure About Payment?","Payment Confirmation Box", JOptionPane.YES_NO_CANCEL_OPTION);
if(choiece==JOptionPane.NO_OPTION){
			this.setVisible(true);
		}
		else if(choiece==JOptionPane.CANCEL_OPTION){
			this.setVisible(true);
		}
		else {
			LastPage l1=new LastPage();
			this.setVisible(false);
			l1.setVisible(true);
		}
		}
	 }
		if(ae.getSource()==backButton){
			MovieTimeShow ms1=new MovieTimeShow();
			this.setVisible(false);
			ms1.setVisible(true);
		}
	 }
	}

   
