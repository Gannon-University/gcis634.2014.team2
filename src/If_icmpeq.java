import java.util.Queue;

/*
 * If ints are equal, 
 * branch to instruction at branchoffset 
 * (signed short constructed from unsigned bytes branchbyte1 << 8 + branchbyte2)
 */

public class If_icmpeq extends If {
	public Queue<String> byteCode;


	protected static void if_icmpeqAction(String command, TXTFileReader commandFeed) {
		int index = Integer.parseInt(command.substring(
				command.indexOf("q") + 2, command.length()));
		int temp1 = 0;
		int temp2 = 0;

		temp1 = DataStack.retrieve();
		temp2 = DataStack.retrieve();

		if (temp1 == temp2) {
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
