package problem3;

public class WashingMachine extends Appliance{

	public WashingMachine(String brand, int powerConsumption) {
		super(brand, powerConsumption);
	}

	@Override
	public void turnOn() {
        System.out.println("Washing Machine (" + brand + ") is now ON. Power consumed: " + powerConsumption + "W");
		
	}
	
               
}
