package general;

public class ZigzagConversion {

	public static void main(String[] args) {

		String s = "PAYPALISHIRING";
		int numRows = 3;

		String result = convert(s, numRows);
		
		System.out.println(result);

	}

	public static String convert(String s, int numRows) {

		
		int stringIndex = 0;
		int i = 0;
		char[][] zigzag = new char[numRows][7];
		s.lastIndexOf(s);
		int length = s.length();
		String result="";

		while (length > 0) {
			
			int g = numRows - 2;

			for (int j = 0; j < numRows; j++) {
				if (stringIndex < 14) {
					// System.out.println(j+" "+i);
					
					zigzag[j][i] = s.charAt(stringIndex);
					System.out.println("Values: " + zigzag[j][i]);
					stringIndex++;
					length = length - 1;
				}
			}
			i++;

			while (g > 0 && stringIndex<14) {
				
				

				zigzag[g][i] = s.charAt(stringIndex);
				
				//System.out.println("Values: " + zigzag[g][i]);

				stringIndex++;
				length = length - 1;
				g = g - 1;
				i=i+1;
			}
			

		}

		System.out.println("Zigzag length: "+zigzag.length+" and column length: "+i);
		for (int r = 0; r < numRows; r++) {
			for (int q = 0; q < i; q++) {
				
				if((zigzag[r][q])!='\0')
				{	
				
				result = result+zigzag[r][q];
				}
				
			}
			System.out.println();
		}

		return result;

	}

}
