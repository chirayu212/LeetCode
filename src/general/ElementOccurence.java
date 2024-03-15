package general;

public class ElementOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,0,22,25,0,0,52,0,0,21,0,1,1,8,0,2,3};
		int count=arr.length-1,temp=0;
		
		
		for(int i =0;i<(arr.length/2)+1;i++)
		{
			if(arr[i]==0 && arr[count]!=0)
			{
				
				arr[i]=arr[count];
				arr[count]=temp;
				
				count--;
			}
			
			else if(arr[i]==0 && arr[count]==0){
				count--;
				
				arr[i]=arr[count];
				arr[count]=temp;
			}
		}
		
		for(int j =0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}

	}

}
