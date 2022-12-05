import java.util.Scanner;

public class Donations extends Service {
	@Override
	public void displayService() {
		Scanner k= new Scanner(System.in);
		System.out.println("choose provider: ");
		System.out.println("Enter(1) for Cancer Hospital Donations");
		System.out.println("Enter(2) for Schools Donations");
		System.out.println("Enter(3) for NGOs Donations");	
		int num2=k.nextInt();
		if(num2==1){
			DonationProvider c = new DonationCancer();
			c.CreateDonation();
		} 
		else if(num2==2) {
			DonationProvider s = new DonationSchool();
			s.CreateDonation();
	
     }
		else if(num2==3) {
			DonationProvider n = new DonationNGO();
			n.CreateDonation();
			
		     }
		k.close();
	}

}
