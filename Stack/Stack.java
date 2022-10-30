import java.util.ArrayList;
import java.util.Scanner;
public class Stack {

	private ArrayList<Integer> stack;

	Stack()
	{
		stack = new ArrayList<Integer>();
	}

	public void push(int element)
	{
		stack.add(element);
	}

	public void pop()
	{
		if (stack.isEmpty())
			System.out.print("Stack is empty");

		stack.remove(0);
		System.out.print("pop: ");
		printStack();
	}

	public int peek()
	{
		int sizeOfStack;

		sizeOfStack = stack.size();

		if (sizeOfStack>=1)
			return(stack.get(sizeOfStack-1));

		return(-1);

	}

	public int search(int element)
	{
		return(stack.indexOf(element));
	}
	public Boolean move(int element)
	{
		int pos, tmp1, tmp2;
		pos = search(element);

		if (pos == -1)
		{
			System.out.println("Move: Element does not exist in the stack");
			return(false);
		}

		while (pos>0)
		{
			tmp1 = stack.get(pos);
			tmp2 = stack.get(pos-1);
			stack.set(pos-1, tmp1);
			stack.set(pos, tmp2);
			pos--;
		}

		return(true);
	}

	public void printStack()
	{
		for (Integer item: stack)
			System.out.printf("%d ", item);
		System.out.println();
	}


	public static void main(String[] args) {

		int element, pos;
		Boolean success;

		// Create a stack object
		Stack myStack = new Stack();

		// Initialize the stack
		System.out.print("Please enter an element and terminate by entering 0: ");
		Scanner input = new Scanner(System.in);
		element = input.nextInt();
		while (element !=0)
		{
			myStack.push(element);
			System.out.print("Please enter an element and terminate by entering 0: ");
			element = input.nextInt();
		}

		// Print the elements in the stack
		myStack.printStack();

		// Pop: Remove an element from the top of the stack
		myStack.pop();

		// Peek: Print the last element in the stack
		element = myStack.peek();
		if (element != -1)
			System.out.println("Peek: " + element);

		// Search: Search for a specific element in the stack
		System.out.print("Please enter the element to search in the stack: ");
		input = new Scanner(System.in);
		element = input.nextInt();
		pos = myStack.search(element);
		if (pos == -1)
			System.out.println("Search: Element does not exist in the stack");
		else
			System.out.println("Search: Element at position " + pos);

		// Move: Move an element to the top of the stack without removing it from the stack
		System.out.print("Please enter the element to move to the top of the stack: ");
		input = new Scanner(System.in);
		element = input.nextInt();
		success = myStack.move(element);
		if(success)
		{
			System.out.printf("Move: ");
			myStack.printStack();
		}
	}
}