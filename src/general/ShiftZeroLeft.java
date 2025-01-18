package general;

public class ShiftZeroLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,53,0,423,12,2,0,6,0};
		int count=0, temp=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0) {
				
				for(int j=i-1;j>=0;j--)
				{
					a[j+1] = a[j];
					
				}
				a[0] = 0;
				
			}
		
		}
		
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
