import java.util.Stack;


public class DataStack {
	static Stack<Integer> dataStack = new Stack<Integer>();
	
	public static void store(int value)
	{
		dataStack.push(value);
	}
	
	public static int retrieve()
	{
		if (!dataStack.isEmpty())
			{
			return dataStack.pop();
			}
		else
			{
			System.out.println("ERROR: No data left in the stack!");
			return -1;
			}
	}
}
