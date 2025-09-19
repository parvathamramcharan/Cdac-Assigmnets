package problem3;

public class Refrigerator extends Appliance{

	public Refrigerator(String brand, int powerConsumption) {
		super(brand, powerConsumption);
	}

	@Override
	public void turnOn() {
        System.out.println("Refrigerator (" + brand + ") is now ON. Power consumed: " + powerConsumption + "W");

		
	}
	
  
}
 
