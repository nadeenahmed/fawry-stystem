import java.util.ArrayList;
import java.util.Scanner;

public class User implements Observer {
String username;
String Email;
String Password;
String Discount;
int refundAmount;
ArrayList<String> userName = new ArrayList<String>();

{userName.add(0,"toka");
userName.add(1,"mai");
userName.add(2,"nadeen");
}
ArrayList<String> email = new ArrayList<String>(); 
{
	email.add(0,"toka@gmail.com");

	}
ArrayList<String> password = new ArrayList<String>(); 
{
password.add(0,"12345");
password.add(1,"12345");
password.add(2,"12345");

}

void signUp(String uName, String uemail, String upassword) {
	for(int i=0 ; i<userName.size();i++) {
	  if(userName.get(i).equals(uName)&& email.get(i).equals(uemail) && password.get(i).equals(upassword))
		{
		System.out.println("You have an account ,please login");
		break;
	    }
		else {
			userName.add(uName);
			password.add(upassword);
			email.add(uemail);
			System.out.println("You have an account now");
			break;
		}}
	
	}
	

void logIn(String uName, String uemail, String upassword) {
	for(int i=0 ; i<userName.size();i++) {
		 if(userName.get(i).equals(uName)&& email.get(i).equals(uemail) && password.get(i).equals(upassword))
			{
			System.out.println("logged in successfully");
			}
		    }
	}

void searchService(String sName) {
	Scanner k= new Scanner(System.in);
	if(sName.equals("Mobile")) {
		Service s=new MobileRecharge();
		s.displayService();
	  }
	if(sName.equals("Landline")) {
		Service s=new Landline();
		s.displayService();
	}
		if(sName.equals("Internet")) {
			Service s=new InternetPayment();
			s.displayService();
	  }
		if(sName.equals("Donations")) {
			Service s=new Donations();
			s.displayService();
		}
		k.close();
}
void requestRefund() {
	System.out.println("Your Request is waiting for approval");
	
}
void addFund(int amount) {
	Wallet v=new Wallet();
	v.add(amount);
	System.out.println("Fund added");
}
@Override
public void updateDiscount() {
	System.out.println("Discounts: ");
	Admin a=new Admin();
	for (int i=0;i<a.OverallDiscount.size();i++) {
		System.out.println(a.OverallDiscount.get(i));
	}
	for (int i=0;i<a.SpecificDiscount.size();i++) {
		System.out.println(a.SpecificDiscount.get(i));
	}
}
@Override
public void updateRefund() {
	Admin a=new Admin();
	if(a.notifyRefund()==true) {
		System.out.println("Request Approved");
	}
	else {
		System.out.println("Request Rejected");
	}	
}
}

