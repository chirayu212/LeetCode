package general;

public class SmallestNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {10,6,8,1,4,2,3,1,5};
		int temp=a[0],result=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(temp>a[i])
			{
				result=temp;
				temp = a[i];
			}else if(temp<a[i] && result>a[i])
			{
				result = a[i];
			}
		}
		
		System.out.println(result+" "+temp);

	}

}
