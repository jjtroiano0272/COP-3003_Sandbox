public class Main {
	
	public static void main(String args[]) {
		/**
		 * Lambda expression to implement functional interface in class FuncInterface. This interface
		 * by default implements abstractFun().
		 */
		FuncInterface fObj = (int x) -> System.out.println(2 * x);
		
		// This calls above lambda expression and prints 10.
		fObj.abstractFun(5);
		
	}
}
