import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class AccountCreate{
	private String fName;
	private String lName;
	private String ead;
	private String pass;
	private String uName;
	private String dob;
	public AccountCreate(){
		System.out.println("Default Constructor");
	}
	public AccountCreate(String fName,String lName,String ead,String pass,String uName,String dob){
		this.fName=fName;
		this.lName=lName;
		this.ead=ead;
		this.pass=pass;
		this.uName=uName;
		this.dob=dob;
	}
	public void setFName(String fName){
		this.fName=fName;
	}
	public void setLName(String lName){
		this.lName=lName;
	}
	public void setEad(String ead){
		this.ead=ead;
	}
	public void setPass(String pass){
		this.pass=pass;
	}
	public void setUName(String uName){
		this.uName=uName;
	}
	public void setDob(String dob){
		this.dob=dob;
	}
	public String getFName(){
		return fName;
	}
	public String getLName(){
		return lName;
	}
	public String getEad(){
		return ead;
	}
	public String getUName(){
		return uName;
	}
	public String getDob(){
		return dob;
	}
	public String getPass(){
		return pass;
	}
	public void addAccount(){
		try{
			FileWriter writer=new FileWriter("AccountCreation.txt",true);
			writer.write(getFName()+"\t");
			writer.write(getLName()+"\t");
			writer.write(getEad()+"\t");
			writer.write(getPass()+"\t");
			writer.write(getUName()+"\t");
			writer.write(getDob()+"\n");
			writer.close();
		}
		catch(IOException ae){
			ae.printStackTrace();
		}
	}
	public boolean getAccount(String uName,String pass){
		boolean r=false;
		try{
		FileReader inFile=new FileReader("AccountCreation.txt");
		Scanner input=new Scanner(inFile);
		String s;
		
			while(input.hasNextLine()){
				s=input.nextLine();
				String[]value=s.split("\t");
				
				if(value[3].equals(pass)&& value[4].equals(uName)){
					r=true;
				}
			}
			inFile.close();
			
		}
		catch(Exception ioe){}
		return r;
	}
}

	
		