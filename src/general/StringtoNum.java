package general;

public class StringtoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(myAtoi("452 23 56"));

	}

	public static int myAtoi(String s) {

		int result = 0;
		int length = s.length();
		char negative = ' ';
		
		loop1: for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (a == ' ') {
				continue loop1;
			}
			int temp=0;

			switch (a) {
			case '1':

				temp = 1;

				break;

			case '2':

				temp = 2;

				break;
				
			case '3':

				temp = 3;

				break;	
				
			case '4':

				temp = 4;

				break;
			case '5':

				temp = 5;

				break;	
				
				
			case '6':

				temp = 6;

				break;
				
			case '7':

				temp = 7;

				break;
				
				
			case '8':

				temp = 8;

				break;
				
				
			case '9':

				temp = 9;

				break;
				
			case '0':

				temp = 0;

				break;
			case '-':
				
				negative = '-';
				break;

			default:
				continue loop1;
			}
			
			System.out.println("Temp value: "+temp);
			
			if(result<=0 )
			{
				result = temp;
				continue loop1;
			}
			
			
			
			else {
				result = result*10;
				result = result+temp;
			}
			if(negative == '-')
			{
				result =  result*-1;
			}
			
			
			
		/*loop2:	for(int j=length-1;j>0;j--)
			{
				temp = temp*10;
				System.out.println("Temp value in for loop: "+temp);
			}
			
			System.out.println("Temp value: "+temp);
			
			length=length-1;
			
			result=result+temp;*/
			
			
			
		}

		return result;

	}

}
