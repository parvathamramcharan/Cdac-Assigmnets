public class TechEmp extends Emp {
    //all non private members  and setter ,getter ,calsalary method acquired
}
 
// here ename,eid city,basic,org are private , but how acquired by the child class??
//new TechEmp(); will create a default constructor which provides super()
//in which it refers to immediate obj class ,it will have default values in obj.

// in this case we are setting with method ,means no constructor,that why it taken default
//constructor ,in it refereed automatically super(immediate reference of object)

//but if their is a constructor then we have to manually set
