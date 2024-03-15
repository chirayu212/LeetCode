package general;

public class Test111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( test());

	}
	
	
	
	public static int test()
	{
		try {
			int y = 3/0;
			return 56;
		} catch (Exception e) {
			System.out.println("Not possible");
			return 5;
		}
		
		finally {
			
			
		}
		
		
	}

}
