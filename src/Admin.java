import java.util.ArrayList;
import java.util.Scanner;
public class Admin implements Subject {
	String adminName;
	String Email;
	String Password;
	ArrayList<String> AdminName = new ArrayList<String>();
	ArrayList<String> OverallDiscount= new ArrayList<String>();
	ArrayList<String> SpecificDiscount= new ArrayList<String>();
{
	OverallDiscount.add("10%");

	}
{
	SpecificDiscount.add("30% on we mobile recharge");	
}
	{
	AdminName.add("nadeen");
	}
	ArrayList<String> email = new ArrayList<String>(); 
	{
		
		email.add("nadeen@gmail.com");

		}
	ArrayList<String> password = new ArrayList<String>(); 
	{
	password.add("12345");

	}

	void signUp(String aName, String aemail, String apassword) {
		for(int i=0 ; i<AdminName.size();i++) {
		  if(AdminName.get(i).equals(aName)&& email.get(i).equals(aemail) && password.get(i).equals(apassword))
			{
			System.out.println("You have an account ,please login");
			break;
		    }
			else {
				AdminName.add(aName);
				password.add(apassword);
				email.add(aemail);
				System.out.println("You have an account now");
			}}	
		
		}
		

	void logIn(String aName, String aemail, String apassword) {
		for(int i=0 ; i<AdminName.size();i++) {
			 if(AdminName.get(i).equals(aName)&& email.get(i).equals(aemail) && password.get(i).equals(apassword))
				{
				System.out.println("logged in successfully");
				}
			    }
		}
	@Override
	public void addObserver(User u) {
		Scanner y= new Scanner(System.in);
		 System.out.println("Add Discount: ");
		 String d=u.Discount;
		  d=y.nextLine();
		System.out.println("Choose discount type: ");
		System.out.println("(1) for Overall");
		System.out.println("(2) for Specific");
		int n = y.nextInt();
		if(n==1) {
			OverallDiscount.add(d);
			System.out.println("Discount added");
		}
		if(n==2) {
			SpecificDiscount.add(d);
			System.out.println("Discount added");
		}
		y.close();
	}
	@Override
	public void notifyDiscount(User u) {
		u.updateDiscount();
		
	}
	@Override
	public boolean notifyRefund() {
		Scanner y= new Scanner(System.in);
		System.out.println("(1) To approve refund ");
		System.out.println("(2) To reject refund ");
		int n = y.nextInt();
		if(n==1) {
			System.out.println("Refund Approved");
			y.close();
			return true;
			}
		else {
				System.out.println("Refund Rejected");
				y.close();
				return false;
			}
	}
	@Override
	public void removeObserver(User u) {	
	}	
	public void addProvider() {
		Scanner y= new Scanner(System.in);
		System.out.println("Enter Provider type: ");
		System.out.println("(1) Mobile Provider ");
		System.out.println("(2) Internet Provider ");
		System.out.println("(3) Landline Provider ");
		System.out.println("(4) Donations Provider ");
		int n = y.nextInt();
		if(n==1) {
			System.out.println("Enter Provider name: ");
			String m = y.nextLine();
			System.out.println("Provider Added");
			
			}
		else if(n==2) {
			String m = y.nextLine();
			System.out.println("Provider Added");
				
			}
		else if(n==3) {
			String m = y.nextLine();
			System.out.println("Provider Added");
		}
		else if(n==4) {
			String m = y.nextLine();
			System.out.println("Provider Added");
		}
		y.close();
	}
};
