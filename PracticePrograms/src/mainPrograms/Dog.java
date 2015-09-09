package mainPrograms;

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a=new Dog();
		String eat=a.eat();
		System.out.println("Printing Public modifier" + eat);
		String a1=a.action();
		System.out.println("Printing protected modifier:" +a1);
		String a2=a.dogType();
		System.out.println("Public modifier:"+a2);
		String a4=a.Bark();
		System.out.println("Printing No access modifier or default method:"+a4);
	/*	try{
			String a3=a.hasOwner();
			System.out.println("private modifier method cannot be accessed"+a3);
		}catch(Exception e)
		{
			System.out.println("private access modifier..compile time error");
		}*/
				
	}

	@Override
	public String eat() {
		String e="Eating";
		return e;
		}

	@Override
	protected String action() {
			String a="Sleeping";
			return a;
			}

	@Override
	public String dogType() {
		String t="Pamerian";
		return t;
	}

}
