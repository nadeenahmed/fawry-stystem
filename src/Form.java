import java.util.Scanner;

public class Form {
	public void displayForm() {
		Scanner k= new Scanner(System.in);
System.out.println("Enter your mobile number and amount");
String mobileNum=k.nextLine();
int amount=k.nextInt();
	System.out.println("Choose Payment way");
	System.out.println("(1) for Default (Credit card) ");
	System.out.println("(2) for Cash");
	System.out.println("(3) for Wallet");
	Handler h = new Handler();
	int num=k.nextInt();
	h.handleTrans(num,amount);
	k.close();
	}}
