package sample;

/**
 * Created 10/01/2018
 *
 * Reference from JP_2.3
 * In class activity. Best resource is https://www.tutorialspoint.com/java/java_generics.htm
 * These are used to print an array OF ANY TYPE.
 * Generics are most often used for ArrayLists,  then TreeSet,TreMap, ArrayDeque...
 *
 * https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
 *
 * ArrayList is a class that /Implements an interface/.
 */

public class Generics {
	
	public static void genericDemo() {
		//	The call is basically the same.
		Integer() intArray = {1, 2, 3;}
	}
	
	// JP2.3 'Type parameter names'
	// 'E' replaces the D A T A     T Y P E.
	public static <E> void  printArray(E[] inputArray){
		for (E element : inputArray)
			System.out.println(E);
	}
	
	// Wildcards used to say 'I don't know what data type it'll be...but I CAN tell you it'll be
	// at least a NUMBER.
	public class Cell {
		private String data;
		public void set(String wildcard){
		
		}
		
		//	See also:
		//	Note sure what's going on here...
		public class CellType<T>{
			private T t;
			public void set(T celldata){
			
			}
		}
	}
	
}
