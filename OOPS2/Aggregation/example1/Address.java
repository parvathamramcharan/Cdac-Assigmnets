//aggregation has a weak relationship and independent to each other 
//if one destroyed other can exist.
public class Address{
    private int hno;
    private String streetname;
    private String city;
    private int pincode;
    public Address(int hno,String streetname,String city,int pincode){
        this.hno=hno;
        this.streetname=streetname;
        this.city=city;
        this.pincode=pincode;
    }
    @Override
    public String toString(){
        return hno+" "+streetname+" "+city+" "+pincode;
    }
}
