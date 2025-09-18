package interface2;

public class X  implements showable,printable{

	@Override
	public void prints() {
		System.out.println("prints......");
		
	}

	@Override
	public void show() {
		   System.out.println("shows......");
		
	}
      
}
