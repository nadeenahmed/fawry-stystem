import java.util.Scanner;

public class Landline extends Service {

	@Override
	public void displayService() {
		Scanner k= new Scanner(System.in);
		System.out.println("choose provider: ");
		System.out.println("Enter(1) for monthly receipt");
		System.out.println("Enter(2) for quarter receipt");
		int num=k.nextInt();
		if(num==1){
			LandlineProvider m = new LandlineMonthly();
			m.createLandline();

		} 
		else if(num==2) {
			LandlineProvider q = new LandlineQuarter();
			q.createLandline();
     }
	k.close();
	}

}
