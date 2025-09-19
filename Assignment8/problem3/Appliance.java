package problem3;

public abstract class Appliance {
       String brand;
       int powerConsumption;
       public Appliance(String brand,int powerConsumption){
    	   this.brand=brand;
    	   this.powerConsumption=powerConsumption;
       }
       public abstract void turnOn();
}
