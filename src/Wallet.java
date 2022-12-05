 
public class Wallet implements Payment {
int balance=1000;
	@Override
	public void pay(int amount) {
		balance-=amount;
		System.out.println("You have been charged "+amount+" from Wallet");
	}
public void add(int b) {
balance+=b;	
System.out.println("Fund Added");
}
}
