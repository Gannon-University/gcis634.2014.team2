import java.util.Queue;

public class If_icmpne extends If {
	public Queue<String> byteCode;



	protected static void if_icmpneAction(String command, TXTFileReader commandFeed) {
		int index = Integer.parseInt(command.substring(
				command.indexOf("e") + 2, command.length()));
	
		if (DataStack.retrieve() != DataStack.retrieve()) {
			System.out.println("If clause met 2");
			while (commandFeed.nextIndex() != index) {
				commandFeed.next();
				System.out.println("Passing through 2");
			}
		} else {
			System.out.println("If clause not met 2");
		}
	}
}