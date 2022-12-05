
public class Cash implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("You will be charged "+amount+" from Cash on Delievry");
	}

}
