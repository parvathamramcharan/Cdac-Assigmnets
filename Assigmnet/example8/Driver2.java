package assigment8;

public class Driver2 {
    public void genarateGretting() {
    	Greeting g = new Greeting() {
    		public void sayHello() {
    			System.out.println("hwlloooooo");
    		}
    	};
    	g.sayHello();
    }
	
     public static void main(String[] args) {
		Driver2 d = new Driver2();
		d.genarateGretting();


	}

}
