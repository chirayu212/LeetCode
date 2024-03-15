package general;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generateMatrix(1);

	}

	public static void generateMatrix(int n) {
		
		int count = 1;
		int [][] arr = new int[n][n];
		
		loop1:for(int i=0;i<n;i++)
		{
			loop2:for(int j=0;j<n;j++)
			{
				if((i>0 && i<n) && j!=n-1)
				{
					continue loop2;
				}
				
				arr[i][j] = count;
				count++;
				
				if(i==n-1)
				{
					for(int k = j-1;k>=0;k--)
					{
						arr[i][k]=count;
						count++;
					}
					
					for(int q=i-1;q>0;q--)
					{
						for(int r=0;r<n-1;r++) {
						arr[q][r]=count;
						count++;
						}
					}
				}
				
				
				
				
				
			}
			
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		

	}

}
