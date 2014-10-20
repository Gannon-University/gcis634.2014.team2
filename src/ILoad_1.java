import java.util.Queue;


public class ILoad_1 extends ByteCodeDecorator{
	public Queue<String> byteCode;

	@Override
	public void action(int vaule1) {
		System.out.println("Storing data: "+vaule1);
		DataStack.store(vaule1);
	}
}
