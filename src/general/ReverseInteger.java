package general;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse(120);

	}
	
	
	
	public static int reverse(int x) {
		
		int result=0;
		
		
		result = (x%10)*100;
		x = x/10;
		
		System.out.println("X1:"+x);
		
		
		result = (x%10)*10+result;
		x=x/10;
		
		System.out.println("X1:"+x);
		
		result = result+x;
		
		System.out.println(result);
		
		
		return result;
        
    }

}
