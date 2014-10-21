import java.util.Queue;

public class If_icmple extends If {
	public Queue<String> byteCode;



	protected static void if_icmpleAction(String command, TXTFileReader commandFeed) {
		int index = Integer.parseInt(command.substring(
				command.indexOf("e") + 2, command.length()));

		// Above parse is very command specific. May need modification based on
		// the command string!

		int first = 0;
		int second = 0;

		first = DataStack.retrieve();
		second = DataStack.retrieve();

		System.out.println(second + "<=" + first);
		if (second <= first) {
			System.out.println("If clause met");
			while (commandFeed.nextIndex() != index) {
				commandFeed.next();
				System.out.println("Passing through");
			}
		} else {
			System.out.println("If clause not met");
		}
	}
}