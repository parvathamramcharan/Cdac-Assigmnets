package upcast;


public class ClassicCustomer extends Customer {
    private double irRate;
	public ClassicCustomer(int cid, String cname, double balance,double irRate) {
		super(cid, cname, balance);
		this.irRate=irRate;
	}
	@Override
	public void dispCust() {
		super.dispCust();
		System.out.println("interest rate : "+irRate);
	}
	@Override
	public void calInterest() {
		double SI = (getBalance()*irRate*5)/100;
		System.out.println("SI : "+SI);
	}
	
      
}
