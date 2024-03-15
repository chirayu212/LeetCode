package general;

import java.nio.file.FileAlreadyExistsException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test();
		System.out.println("In main method");
		
		
		
		
	}

	

	public static void test() {
		demo();
	}

	public static void demo() throws ArithmeticException  {
		try {
		throw new ArithmeticException();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
