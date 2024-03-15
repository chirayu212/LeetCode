package general;

public class ReverseArrayFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,3,5,7,9,11,15,17,19};
		int[] arr2 = new int[arr1.length];
		int frequency = 3;
		int count=0;
		
		
		for(int i=frequency-1;i<arr1.length;i+=3)
		{
			for(int j=i;j>i-frequency;j--)
			{
				arr2[count]=arr1[j];
				count++;
			}
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			System.out.print(arr2[j]+" ");
		}
		

	}

}
