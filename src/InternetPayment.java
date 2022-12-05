import java.util.Scanner;

public class InternetPayment extends Service {

	@Override
	public void displayService() {
		Scanner k= new Scanner(System.in);
		System.out.println("choose provider: ");
		System.out.println("Enter(1) for we");
		System.out.println("Enter(2) for Vodafone");
		System.out.println("Enter(3) for orange");
		System.out.println("Enter(4) for Etisalat");		
		int num2=k.nextInt();
		if(num2==1){
			InternetProvider we = new InternetWE();
			we.createInternet();

		} 
		else if(num2==2) {
			InternetProvider voda = new InternetVodafone();
			voda.createInternet();
	
     }
		else if(num2==3) {
			InternetProvider orange = new InternetOrange();
			orange.createInternet();
		
		}
		else if(num2==4)
		{
			InternetProvider etisalat = new InternetEtisalat();
			etisalat.createInternet();
			
		}
	k.close();
	}

}
