package general;

public class CountandSay {

	public static void main(String[] args) {
		
		
		

	}
	
	
public String countAndSay(int n) {
	
	int a=1;
	int q=0,w=0,e=0,r=0,t=0,y=0;
	String z;
	
	
	for(int i=2;i<=n;i++)
	{
		while(a!=0)
		{	
			a=a/10;
			q = a%10;
			System.out.println(q);
			
			switch (q) {
			case 1:
				w=w+1;
				z = String.valueOf(w);
				System.out.println("String Z value: "+z);
				z=z+"1";
				break;
				
			case 2:
				w=w+1;
				z = String.valueOf(w);
				System.out.println("String Z value: "+z);
				z=z+"1";
				break;

			default:
				break;
			}
			
		}
		
	}
	
	
	return "hello";
        
    }

}
