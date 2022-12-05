import java.util.Scanner;

public class MobileRecharge extends Service {

	@Override
	public void displayService() {
		System.out.println("choose provider: ");
		System.out.println("Enter(1) for We");
		System.out.println("Enter(2) for Etisalat");
		System.out.println("Enter(3) for Orange");
		System.out.println("Enter(2) for Vodafone");
		Scanner k= new Scanner(System.in);
		int num=k.nextInt();
		if(num==1){
			MobileProvider we =new MobileWe();
			we.createMobile();
		}
		else if(num==2) {
			MobileProvider etisalat=new MobileEtisalat();
			etisalat.createMobile();
			  }
		else if(num==3) {
			MobileProvider orange=new MobileOrange();
			orange.createMobile();

			}
			else if(num==4)
			{
				MobileProvider voda=new MobileVodafone();
				voda.createMobile();
			}
		
	k.close();
	}}

