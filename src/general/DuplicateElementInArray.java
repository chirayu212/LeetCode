package general;

public class DuplicateElementInArray {
	
	public static void main(String[] args) {
		
		
		int arr[] = {1, 5, 3, 4, 3, 5, 6};
		
		
		loop1: for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;i<arr.length;i++)
			{
				if(i==j)
				{
					System.out.println("Smallest number: "+(i+1));
					break loop1;
				}
			}
		}
		
	}

}
