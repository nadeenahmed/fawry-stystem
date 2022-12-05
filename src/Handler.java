
public class Handler {
	public void handleTrans(int num,int amount) {
	if(num==1) {
		Payment p = new Credit();
		p.pay(amount);
	}
	if(num==2) {
		Payment p = new Cash();
		p.pay(amount);
	}
	if(num==3) {
		Payment p = new Wallet();
		p.pay(amount);
	}
}
}