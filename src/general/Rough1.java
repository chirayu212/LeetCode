package general;

import java.util.ArrayList;
import java.util.List;

public class Rough1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numRows = 5;
		
		int temp=0;
		
		ArrayList<ArrayList<Integer>> listoflist = new ArrayList<ArrayList<Integer>>();
	       ArrayList<Integer> singleList = new ArrayList<Integer>();
	       
	        singleList.add(1);

	        listoflist.add( singleList);

	        for(int i=1;i<4;i++)
	        {
	            ArrayList<Integer> singleList2 = new ArrayList<Integer>();
	            
	            for(int j=0;j<(listoflist.get(listoflist.size()-1).size())+1;j++)
	            {
	            	//System.out.println(("Value of j: "+listoflist.get(listoflist.size()-1).size()));
	            	
	            	if(j==0 || j==(listoflist.get(listoflist.size()-1).size()))
	            	{
	            		
	            		singleList2.add(1);
	            	}
	            	else
	            	{
	            		int count = 0;
	            		System.out.println(j);
	            		temp=j;
	            		while(temp<(listoflist.get(listoflist.size()-1).size()))
	            		{
	            			System.out.println(listoflist.get(listoflist.size()-1).size());
	            			
	            			int g = listoflist.get(listoflist.size()-1).get(count)+listoflist.get(listoflist.size()-1).get(count+1);
	            			System.out.println("Value of g is: "+g);
	            			singleList2.add(g);
	            			count++;
	            			temp++;
	            			System.out.println(temp);
	            			System.out.println("While loop ends");
	            		}
	            		j=temp;
	            		System.out.println(j);
	            		
	            	}
	            }
	            
	            listoflist.add(singleList2);


	        }
	        
	        for(ArrayList<Integer> l1:listoflist)
	        {
	        	for(int q:l1)
	        	{
	        		System.out.print(q+" ");
	        	}
	        }

}}
