import java.util.Queue;

public class IConst_2 extends IConstDecorator {

	public Queue<String> byteCode;

	public void action() {

	}

	protected static void iConst_2Action() {
		System.out.println("Store constant");
		DataStack.store(2);
	}
}