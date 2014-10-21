public class IReturn extends ByteCodeDecorator {

	public void action() {
	}

	protected static int iReturnAction() {
		int type = DataStack.retrieve();
		// System.out.println("Return value: " + temp);
		return type;
	}
}