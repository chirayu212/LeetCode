package general;

public class InterFaceImplement {

	public static void testingInterface(Demo demo) {
		// TODO Auto-generated method stub

	}

	public void test() {
		// TODO Auto-generated method stub
		System.out.println("In Test");
	}

	public void demo() {
		// TODO Auto-generated method stub
		
		System.out.println("In demo");
		
	}
	
	
	public static void main(String[] args) {
		
		InterFaceImplement i = new InterFaceImplement();
		
		InterFaceImplement.testingInterface(new Demo() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void demo() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}
	

}
