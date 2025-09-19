package problem3;

public class Microwave extends Appliance{

	public Microwave(String brand, int powerConsumption) {
		super(brand, powerConsumption);
	}

	@Override
	public void turnOn() {
        System.out.println("Microwave (" + brand + ") is now ON. Power consumed: " + powerConsumption + "W");

	}
          
}
 
