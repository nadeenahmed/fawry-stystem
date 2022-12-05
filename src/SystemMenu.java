import java.util.Scanner;
public class SystemMenu {
	Scanner k=new Scanner(System.in);
	 String userType;
	 User obj=new User();
	 Admin a = new Admin();
	 SystemMenu(String userType )
	 {
		this.userType=userType;
		 }
	 void userMenu(int num1) {
		 if(num1==1)
			 {
				 System.out.println("please enter service name");
				 String sName=k.nextLine();
				obj.searchService(sName); 
			 }
		 if(num1==2)
		 {
			obj.requestRefund();
		 }
		 if(num1==3)
		 {
		  System.out.println("Enter amount");
	     int amount= k.nextInt();
	     obj.addFund(amount);
		 }
		 if(num1==4)
		 {
			 obj.updateDiscount();
		 }
		 if(num1==5)
		 {
			 obj.updateRefund();
		 }
		 }
	 void printUserMenu() {
		 System.out.println("Enter:");
		 System.out.println("(1) to  Search for any service");
		 System.out.println("(2) to Request Refund");
		 System.out.println("(3) to add fund");
		 System.out.println("(4) to see Discounts");
		 System.out.println("(5) to see refund Update");
	 }
	 void signinUserMenu(int num) {
			
		 if(num==1) {
			 Scanner k= new Scanner(System.in);
			  System.out.println("please enter your Username, password, Email");
			  String userName=k.nextLine();
			  String userPassword=k.nextLine();
			  String userEmail=k.nextLine();
			 obj.signUp(userName, userEmail, userPassword);
		 }
			 else{
				 System.out.println("please enter your Username, password, Email");
				  String Name=k.nextLine();
				  String Password=k.nextLine();
				  String Email=k.nextLine();
				 obj.logIn(Name, Email, Password); 
			 }
		 }
	 void signinUserPrintMenu() {
		 System.out.println("Enter:");
		 System.out.println("(1) to sign in");
		 System.out.println("(2) to login");
		 
}

	 void signinAdminMenu(int num) {
		 if(num==1) {
			 Scanner k= new Scanner(System.in);
			 System.out.println("Please enter your Username, Password, and Email");
			  String adminName=k.nextLine();
			  String adminPassword=k.nextLine();
			  String adminEmail=k.nextLine();
			 a.signUp(adminName, adminEmail,adminPassword);
		 }
		 if(num==2) {
			 System.out.println("Please enter your Username, Password, and Email");
			  String adminName=k.nextLine();
			  String adminPassword=k.nextLine();
			  String adminEmail=k.nextLine();
			  a.logIn(adminName, adminEmail, adminPassword);
		 }
	 }
	 void signinAdminPrintMenu() {
		 System.out.println("Enter:");
		 System.out.println("(1) to sign in");
		 System.out.println("(2) to login");
		 
}
	 void adminMenu(int num2) {
		 if(num2==1) {
			 a.addObserver(obj);
		 }
		 if(num2==2) {
			 a.notifyDiscount(obj);
		 }
		 if(num2==3) {
			 a.notifyRefund();
		 }
		 if(num2==4) {
			a.addProvider();
		 }
	 }
	 void printAdminMenu() {
		 System.out.println("Enter:");
		 System.out.println("(1) to add discount");
		 System.out.println("(2) to notify discount");
		 System.out.println("(3) to notify refund");
		 System.out.println("(4) to add provider");
	 }
}

