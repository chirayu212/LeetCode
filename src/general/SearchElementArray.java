package general;

public class SearchElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = {1,2,3,5,6,7,8,9};
		int target = 8;
		
		
		for(int i=0;i<arr1.length;i++)
		{
			if (arr1[i]-target == 0)
			{
				System.out.println("Number searched"+i);
				break;
			}
		}
	}

}
