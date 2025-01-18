package general;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="I am Java developer I am proud of it";
		
		String[] a = s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
