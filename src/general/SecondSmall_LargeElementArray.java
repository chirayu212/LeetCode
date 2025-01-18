package general;

public class SecondSmall_LargeElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,5,8,2,3,4,2,1,5,2,3,2,8,4};
		
		int largest=0,smallest=0,secondLargest=0,secondSmallest=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondLargest = largest;
				largest = a[i];
			}else if(a[i]<largest && a[i]>secondLargest)
			{
				secondLargest = a[i];
			}else if(a[i]<smallest)
			{
				secondSmallest = smallest;
				smallest = a[i];
			}else if(a[i]>smallest && a[i]<secondSmallest)
			{
				secondSmallest = a[i];
			}
		}
		
		System.out.println("Second Largest no is: "+ secondLargest+" and second smallest no is: "+secondSmallest);

	}

}
