package general;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Hel]lo";
		
		switch(s) {
		case "hi" : System.out.println("In Hi");
		break;
		
		case "Hello" : System.out.println("In hello");
		break;
		
		case "Howdy" : System.out.println("In howdy");
		
		default: System.out.println("In Namaste");
		}

	}

}
