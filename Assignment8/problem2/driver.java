package problem2;
//Problem 2: Create an abstract class Animal with an abstract method void sound().
//Then, create three subclasses, Dog, Cat, and Cow, each implementing the sound
//method with their respective sounds. Write a main method to create instances of Dog,
//Cat, and Cow, and invoke the sound method on each instance.
public class Driver {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		Cow cw = new Cow();
		d.sound();
		c.sound();
		cw.sound();

	}

}
