package general;

public class Mindtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = {600,80,2,4,3,1,5,7,9,10};
		int temp= 0, result=0;
		
		
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
