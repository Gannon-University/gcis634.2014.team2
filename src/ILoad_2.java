import java.util.Queue;

public class ILoad_2 extends ByteCodeDecorator {
	public Queue<String> byteCode;

	@Override
	public void action(int vaule2) {
		System.out.println("Storing data: " + vaule2);
		DataStack.store(vaule2);
	}
}
