import java.util.Queue;

public class ILoad_3 extends ByteCodeDecorator {
	public Queue<String> byteCode;

	@Override
	public void action(int vaule3) {
		System.out.println("Storing data: " + vaule3);
		DataStack.store(vaule3);
	}
}
