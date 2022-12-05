
public class Credit implements Payment{
int balance=1000;
	@Override
	public void pay(int amount) {
		balance-=amount;
		System.out.println("You have been charged "+amount+" from Credit");
		
	}

}
