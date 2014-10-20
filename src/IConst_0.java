import java.util.Queue;

public class IConst_0 extends IConstDecorator {

	public Queue<String> byteCode;

	public void action() {
	
	}

	protected static void iConst_0Action() {

		System.out.println("Store constant");
		DataStack.store(0);
	}
}