//3.Constructer Overloading
//Extend the person class from the previous problem and  add multiple constructors(default,parameterized ,etc...) to initialize
// the attributes.Also,include method to display the details.
class Person{
    String name;
    int age;
    String Country;
    Person(){       // see last comment line
    }
    Person(String n,int a,String c){
        name=n; 
        age =a;
        Country=c;
    }
    Person(String n ,int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name+" "+age+" "+Country);
    }
    


}
public class Problem3 {
    public static void main(String[] args) {
        Person p1 = new Person();                          //A default constructor
        Person p2 = new Person("ram",21,"India");   //A fully parameterized constructor
        Person p3 = new Person("raju",21);           //A partially parameterized constructor

        p1.display();    //null 0 null
        p2.display();    //ram 21 India
        p3.display();    //raju 21 null

    }
}



//Java only provides a default (no-argument) constructor if you don't write any constructors yourself.
//But as soon as you add any constructor (e.g., the parameterized ones you wrote), 
//Java stops generating the default constructor automatically.