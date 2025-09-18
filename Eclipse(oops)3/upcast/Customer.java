package upcast;


public class Customer {
    private int cid;
    private String cname;
    private double balance;
    private static String bank="SBI";
	public Customer(int cid, String cname, double balance) {
		this.cid = cid;
		this.cname = cname;
		this.balance = balance;
	}
//	@Override
//	public String toString() {
//		return "Customer [cid=" + cid + ", cname=" + cname + ", balance=" + balance + "]";
//	}
	public void dispCust() {
		System.out.println(cid +" "+cname+" "+balance+"  "+bank);
		
	}
	public void calInterest() {
		double SI = (balance*8.5*5)/100;
		System.out.println("total interest : "+SI);
		
	}
	public double getBalance() {
		return balance;
	}
	
	
	
	
    
    
    
    
    
}
