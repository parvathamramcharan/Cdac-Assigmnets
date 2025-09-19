package problem3;
//Create an abstract class Appliance with fields for brand and power
//consumption, and an abstract method void turnOn(). Create three subclasses,
//WashingMachine, Refrigerator, and Microwave, each providing their own
//implementation of the turnOn method. Write a main method to create instances of
//WashingMachine, Refrigerator, and Microwave, and invoke the turnOn method on each
//instance to display brand and power consumed.
public class Driver {

	public static void main(String[] args) {
		WashingMachine w = new WashingMachine("LG",1400);
		Refrigerator r = new Refrigerator("Samsung",2000);
		Microwave m = new Microwave("Panosonic",2500);
		w.turnOn();
		r.turnOn();
		m.turnOn();
		//or
        Appliance wm = new WashingMachine("LG",1400);
        Appliance fridge = new Refrigerator("Samsung",2000);
        Appliance micro = new Microwave("Panosonic",2500);
        
        wm.turnOn();
        fridge.turnOn();
        micro.turnOn();
	}

}
