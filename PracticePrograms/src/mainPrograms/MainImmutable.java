package mainPrograms;

public class MainImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ImmutableExample ex=new ImmutableExample("Pradeep","655 Fairoaks Ave,Sunnyvale",34);
	System.out.println("Name:"+ex.getname());
	System.out.println("Address:"+ex.getaddress());
	System.out.println("Age is:"+ex.getage());
		
	}

}
