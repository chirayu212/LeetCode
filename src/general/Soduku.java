package general;

public class Soduku {

	public static void main(String[] args)
	
	{
		char[][] board = {{'8','3','.','.','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
						,{'.','9','8','.','.','.','.','6','.'}
						,{'8','.','.','.','6','.','.','.','3'}
						,{'4','.','.','8','.','3','.','.','1'}
						,{'7','.','.','.','2','.','.','.','6'}
						,{'.','6','.','.','.','.','2','8','.'}
						,{'.','.','.','4','1','9','.','.','5'}
						,{'.','.','.','.','8','.','.','7','9'}};
		
		boolean results = isValidSudoku(board);
		
		System.out.println(results);
		
		
		
		
		

	}
	
	 public static boolean isValidSudoku(char[][] board) {
		 
		 
		 
		for(int i=0; i<board.length;i++)
		 {
			
			
			for(int k=1; k<=9;k++) {
				int a =0;
			 for(int j=1;j<=9;j++)
			 {
				 if(board[i][j-1]=='.')	
				 {
					 continue;
				 }
				 else if(Integer.parseInt(String.valueOf(board[i][j-1]))==k)
				 {
					 a=a+1;
					 if(a>1)
					 {
						 
						 return false;
						 
					 }
				 
				 
				 }
				 
				 //System.out.println("Board: "+board[i][j-1]+" K value is "+k+" a value:"+a);
				
			 }
			}
			 
		 }
		
		int q=0;
		
		for(int i=0;i<board.length;i++)
		{
			for(int k=1; k<=9;k++) {
				int a =0;
			for(int j=1;j<=9;j++)
			{
				 if(board[j-1][i]=='.')	
				 {
					 continue;
				 }
				 else if(Integer.parseInt(String.valueOf(board[j-1][i]))==k)
				 {
					 a=a+1;
					 if(a>1)
					 {
						 
						 return false;
						 
					 }
				 
				 
				 }
			}
			}
			
		}
		 
		 
		 return true;
	        
	    }
	
	
	

}
