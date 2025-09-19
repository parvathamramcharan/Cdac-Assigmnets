package problem4;
//4: Task: Create an interface Animal with methods makeSound() and eat().
//Implement this interface in two classes Dog and Cat.
public class Driver {
       public static void main(String[] args) {
    	   Animal dog = new Dog();  //Dog d = new Dog(); d.makeSound() also correct
           Animal cat = new Cat();

           dog.makeSound();
           dog.eat();

           cat.makeSound();
           cat.eat();
	}
}
