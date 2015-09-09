package mainPrograms;

public abstract  class Animal {

	public abstract String eat();
	
	protected abstract String action();
	
	@SuppressWarnings("unused")
	private void hasowner()
	{
		System.out.println("May be");
	}
	
	String Bark()
	{   String b="Bow Bow";
		return b;
	}
	public abstract String dogType();
	
	
}
