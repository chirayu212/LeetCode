package general;

import java.util.HashMap;
import java.util.Map;

public class LogicMonitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="I Love Java and I am QA";
		
		String [] str = s.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<str.length;i++)
		{
			if(map.containsKey(str[i]))
			{
				map.put(str[i], map.get(str[i])+1);
			}else {
				map.put(str[i], 1);
			}
		}
		
		for(Map.Entry<String, Integer> mapElement : map.entrySet())
		{
			System.out.println(mapElement.getKey()+" "+mapElement.getValue());
		}
		
		
		
		
		Select * from employees where ID IN (Select ID from stateDetail where state = "Maharashtra"); 
		
		PatientRegionalDetails : ID, Name, State, Country
		PatientCheckupDetails: ID, Weight, Fee
		
		
		Select * from PatientRegionalDetails INNER JOIN PatientCheckupDetails
		
		cat file1 | grep "Chirayu"
		grep file1 "Chirayu"
		
		
		sshkeygen
		
		
		@BeforeSuite
		@BeforeClass
		@BeforeTest
		@BeforeMethod
		@Test
		@AfterMethod
		@AfterTest
		@AfterClass
		@AfterSuite
		
		Test B
		Test C
		Test A
		
		
		
		
		

	}

}
