public class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name= name;
        this.age= age;
    }
    //setter eliminated by constructor()
    //getter eliminated by toString();

    @Override // telling compiler its not method , it is my parent method
    public String toString(){
        return name+" "+age;
    }
}

//here this method is default which is called automatically
// so we are telling compiler that use my method when this method has called
// public String toString() {
//     return getClass().getName() + "@" + Integer.toHexString(hashCode());
// }
