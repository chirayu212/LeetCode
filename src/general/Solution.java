package general;

import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		new Solution().convert("PAYPALISHIRING", 3);
	}
    public String convert(String s, int numRows) {
        char[][] arr = new char[numRows][7];
        int temp = 0;
        int flag = 0;
        int k = numRows - 2;
        String s2 = "";

        main1: for (int i = 0; i < 7; i++) {
            
             if (temp >= s.length() - 1) {
                break main1;
            }
            if (flag != 0) {
                if (k > 0) {
                    arr[k][i] = s.charAt(temp);
                    temp++;
                     
                    k--;
                }

            }

            
            if (flag == 0) {
                for (int j = 0; j < numRows; j++) {
                    
                    arr[j][i] = s.charAt(temp);
                    temp++;
                    System.out.println(temp);
                   
                    flag = 1;
                    
                    if (temp >= s.length() - 1) {
                        break main1;
                    }
                    
                }
                k=numRows - 2;
            }
           
            flag = k;
            

        }

        for (char[] row : arr) {
            System.out.println(Arrays.toString(row));
            s2 = Arrays.toString(row);
        }

        return s2;

    }
}