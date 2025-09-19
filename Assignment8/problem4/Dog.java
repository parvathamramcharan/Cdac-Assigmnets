package problem4;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("dog braks: bow");
	}

	@Override
	public void eat() {
		System.out.println("dog eat bones");
	}
      
} 
