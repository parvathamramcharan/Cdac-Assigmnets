package Problem2;

public class Person {
      private String name;
      private int id;
      private String place;
      public void set(String name ,int id,String place) {
    	  this.name=name;
    	  this.id=id;
    	  this.place=place;
      }
      public void set(String name,int id) {
    	  this.name=name;
    	  this.id=id;
      }
      public void set(String name) {
    	  this.name= name;
      }
      public void get() {
    	  System.out.println(name+" "+id+" "+place);
      }
}
