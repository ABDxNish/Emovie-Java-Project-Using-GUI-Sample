
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaymentForm3 extends JFrame implements ActionListener {
    private JTextField cardNumberTextField, nameOnCardTextField, cvvTextField, amountTextField;
    private JButton submitButton,backButton;

    public PaymentForm3() {
        setTitle("Payment Form");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(Color.DARK_GRAY);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);

        Font welcomeFont = new Font("Algerian", Font.BOLD, 40);
        JLabel welcomeLabel = new JLabel("Welcome to Online Getway Payment System");
        welcomeLabel.setFont(welcomeFont);
        welcomeLabel.setForeground(Color.WHITE);
        constraints.gridwidth = 2;
        mainPanel.add(welcomeLabel, constraints);

        Font labelFont = new Font("Arial Rounded MT Bold", Font.BOLD, 20);
        Font textFieldFont = new Font("Algerian", Font.BOLD, 20);

        constraints.gridwidth = 1;

        JLabel cardNumberLabel = new JLabel("Card Number");
        cardNumberLabel.setFont(labelFont);
        cardNumberLabel.setForeground(Color.WHITE);
        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(cardNumberLabel, constraints);

        cardNumberTextField = new JTextField(20);
        cardNumberTextField.setForeground(Color.BLACK);
        cardNumberTextField.setFont(textFieldFont);
        constraints.gridx = 1;
        mainPanel.add(cardNumberTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;

        JLabel nameLabel = new JLabel("Card Holder's Name");
        nameLabel.setFont(labelFont);
        nameLabel.setForeground(Color.WHITE);
        mainPanel.add(nameLabel, constraints);

        nameOnCardTextField = new JTextField(20);
        nameOnCardTextField.setForeground(Color.BLACK);
        nameOnCardTextField.setFont(textFieldFont);
        constraints.gridx = 1;
        mainPanel.add(nameOnCardTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;

        JLabel cvvLabel = new JLabel("CVV");
        cvvLabel.setFont(labelFont);
        cvvLabel.setForeground(Color.WHITE);
        mainPanel.add(cvvLabel, constraints);

        cvvTextField = new JTextField(20);
        cvvTextField.setForeground(Color.BLACK);
        cvvTextField.setFont(textFieldFont);
        constraints.gridx = 1;
        mainPanel.add(cvvTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;

        JLabel amountLabel = new JLabel("Amount");
        amountLabel.setFont(labelFont);
        amountLabel.setForeground(Color.WHITE);
        mainPanel.add(amountLabel, constraints);

        amountTextField = new JTextField(20);
        amountTextField.setForeground(Color.BLACK);
        amountTextField.setFont(textFieldFont);
        constraints.gridx = 1;
        mainPanel.add(amountTextField, constraints);

        backButton = new JButton("Back");
        backButton.addActionListener(this);
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.anchor = GridBagConstraints.CENTER;
        mainPanel.add(backButton, constraints);
		
		submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.anchor = GridBagConstraints.LINE_END;
        mainPanel.add(submitButton, constraints);

        add(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource()==submitButton){

				 
				 String mob=cardNumberTextField.getText().toString();
				 
				 String holder=nameOnCardTextField.getText().toString();
				 String amt= amountTextField.getText().toString();
				 String ccv=cvvTextField.getText().toString();
				 if(mob.isEmpty()||amt.isEmpty()||ccv.isEmpty()||holder.isEmpty()){
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
