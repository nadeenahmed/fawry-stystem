import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner k= new Scanner(System.in);
		 System.out.println("please enter user or admin");
		  String usertype=k.nextLine();
		  SystemMenu obj1=new SystemMenu(usertype);
		  if(usertype.equals("user"))
		  {
			  obj1.signinUserPrintMenu();
			  int aNum=k.nextInt();
			  obj1.signinUserMenu(aNum);
			  obj1.printUserMenu();
			  int num=k.nextInt();
			  obj1.userMenu(num);
		  }
		  else if(usertype.equals("admin"))
		  {
			  obj1.signinAdminPrintMenu();
			  int aNum=k.nextInt();
			  obj1.signinAdminMenu(aNum);
			  obj1.printAdminMenu();
			  int num=k.nextInt();
			  obj1.adminMenu(num);
		
		  }
	k.close();
	}	  
	}