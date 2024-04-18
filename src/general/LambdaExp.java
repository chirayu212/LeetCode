package general;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,-5,-6,-7,-4,-2,-9,-2};
		int temp=arr[0],result=arr[0];
		
		for(int j=0;j<arr.length;j++)
		{
			if(temp>arr[j])
			{
				temp = arr[j];
			}
		}
		result = temp;
		
		for(int i=0;i<arr.length;i++)
		{
			if(temp<arr[i])
			{
				result = temp;
				temp = arr[i];
			}else if(temp>arr[i] && result<arr[i])
			{
				result = arr[i];
			}
		}
		
		System.out.println(result);
			

	}
	
	
	

}
