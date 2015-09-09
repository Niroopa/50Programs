package mainPrograms;

public class BaseCust extends BaseCustomer {

	public BaseCust(String Fname)
	 {
		 this.Fname=Fname;
		 System.out.println(Fname);
	 }
	 
	 public BaseCust(String Fname,String Lname,int Cust_Id)
	 {
		 this.Fname=Fname;
		 this.Lname=Lname;
		 this.Cust_Id=Cust_Id;
		 System.out.println("First Name:"+Fname);
		 System.out.println("Last Name:"+Lname);
		 System.out.println("Customer id is:"+Cust_Id);
	 }
	 
	 	 
	
	@Override
	public String details() {
		// TODO Auto-generated method stub
		
		
		return "This is from subclass";
	}

}
