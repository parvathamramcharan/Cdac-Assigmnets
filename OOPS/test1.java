// demonstarte of this keyword
class test{
    void main(){
        System.out.println(this+"hello");  //test@2f92e0f4hello
    }
}
public class test1 {
    public static void main(String[] args) {
        test t =  new test();
        System.out.println(t);   // hashcode  => test@2f92e0f4
        t.main();

    }
}
