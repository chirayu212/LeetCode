package general;

public class LogicMonitor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {2,5,4,63,4,8,9,2};
		
		int temp=0, result=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>temp)
			{
				result = temp;
				temp = a[i];
			}else if(a[i]<temp && a[i]>result)
			{
				result = a[i];
			}
		}
		
		System.out.println(result);

	}

}
