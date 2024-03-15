package general;


public class ClosestPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 115687;
		int reverseNumber=0;
		int remainder;
		int temp=1;
		
		
		
		
		/*for(int i =num-1; i>0;i--)
		{
			reverseNumber=0;
			remainder=0;
			
			temp = i;
			while(temp!=0)
			{
				remainder = temp%10;
				reverseNumber = reverseNumber*10+remainder;
				temp=temp/10;
			}
			
			System.out.println(reverseNumber);
			if(i == reverseNumber)
			{
				System.out.println("Pallidrome");
				break;
			}
		}
		
		int diff1 = num-reverseNumber;
		*/
		
		
		while(num!=0)
		{
			if(isPallindrome(num))
			{
				System.out.println("Number is itself a pallindrome number");
				break;
			}
			if (isPallindrome(num-temp))
			{
				System.out.println(num-temp);
				break;
			}
			else if(isPallindrome(num+temp))
			{
				System.out.println(num+temp);
				break;
			}
			else
			{
				temp++;
				continue;
			}
		}		
	}
	
	
	public static boolean isPallindrome(int n)
	{
		int reverseNumber=0;
		int remainder;
		int temp=0;
		
		temp=n;
		
		while(temp!=0)
		{
			remainder = temp%10;
			reverseNumber = reverseNumber*10+remainder;
			temp = temp/10;
		}
		
		if(n==reverseNumber)
		{
			
			return true;
		}
		else {
			return false;
		}
	}

}
