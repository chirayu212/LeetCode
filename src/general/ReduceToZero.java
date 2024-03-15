package general;

public class ReduceToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 123;
		int count=0;
		
		
		while(a!=0)
		{
			if(a%2==0)
			{
				a = a/2;
				count++;
			}
			else
			{
				a=a-1;
				count++;
			}
		}
		
		System.out.println(count);

	}

}
