package mainPrograms;

public final class ImmutableExample {
	/*immutable means :the class should be declared final and variables as final and private 
	 * should use constructors to set the values to the variables rather than using setter methods.
	 * 
	 */
	
 private String name="";
private  String address=" ";
private int age;
	
public ImmutableExample(String name,String address,int age)
{
	this.name=name;
	this.address=address;
	this.age=age;
}
 public String getname()
 {
	 return name;
 }
 
 public String getaddress()
 {
	 return address;
 }
 
 public int getage()
 {
	 return age;
 }
}