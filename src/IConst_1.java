import java.util.Queue;

public class IConst_1 extends IConstDecorator {

	public Queue<String> byteCode;

	public void action() {
	}

	protected static void iConst_1Action() {
		
		System.out.println("Store constant");
		DataStack.store(1);
	}
}