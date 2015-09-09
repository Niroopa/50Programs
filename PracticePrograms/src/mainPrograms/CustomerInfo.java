package mainPrograms;

public class CustomerInfo extends BaseCust{

	public CustomerInfo(String Fname) {
		super(Fname);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		BaseCust bs = new BaseCust("Niroopa");
        BaseCust mn=new BaseCust("Niroopa","Tamiri",101);
        System.out.println("Printing something:"+bs.details());
    
	}

}
