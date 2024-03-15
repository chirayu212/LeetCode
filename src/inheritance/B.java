package inheritance;

public class B extends A implements CommonInt {
	
	public void eat()
	{
		
		System.out.println("In B class eat method");
		
	
	}
	
	public void chew()
	{
		System.out.println("Chewing");
	}
	
	public void chew(String s)
	{
		System.out.println(s+" is chewing");
	}

}
