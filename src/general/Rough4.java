package general;

public class Rough4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 114;
		
		//System.out.println(isBoolean(a));
		
		loop1: for(int i=1;;i++)
		{
			if(isBoolean(a+i))
			{
				System.out.println("The no is: "+(a+i));
				break loop1;
			}
			else if(isBoolean(a-i))
			{
				System.out.println("The no is: "+(a-i));
				break loop1;
			}
			
			String s1 = new String("hi");
		}
		

	}
	
	
	public static boolean isBoolean(int num)
	{
		int result=0;
		int temp=num;
		
		while(num!=0)
		{
			result=result*10+num%10;
			num=num/10;
		}
		
	//	System.out.println(temp+" "+result);
		
		if(temp==result)
		return true;
		
		else
			return false;
	}

}
