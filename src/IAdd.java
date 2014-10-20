import java.util.Queue;

/*
 * add two ints
 */

public class IAdd extends ByteCodeDecorator {
	public Queue<String> byteCode;

	public void action() {
	
	}

	protected static void iADDAction() {
		int temp;
		temp = DataStack.retrieve() + DataStack.retrieve();
		DataStack.store(temp);
		System.out.println("Add called");
	}
}
