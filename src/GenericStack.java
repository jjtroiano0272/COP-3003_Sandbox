import java.util.ArrayList;

/*
* Created: 10/10/2018
* */

public class GenericStack {
	// Represents the location [subscript] of the top of the stack.
	private int top;
	// GENERIC ArrayList
	private ArrayList<T> items = new ArrayList<T>(); // T must be defined.
	
	ArrayList<T> items[];
	
	/* ERROR CODE
	public ArrayStack(int maxSize) {
		items = new ArrayList<T>(); // The fuck am I doing in this file...
	}*/
	
	public GenericStack() {}
	
	public int pop() {}
	
}
	// ERROR LINE
	// public int push() P{;}
