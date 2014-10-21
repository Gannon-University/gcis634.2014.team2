import java.io.IOException;

public class Processor {
	TXTFileReader commandFeed;
	ByteCodeDecorator bcD = new ByteCodeDecorator();

	int a, b, c; // define variables
	int returnVal;

	public Processor(String filePath, int a, int b, int c) throws IOException {
		commandFeed = new TXTFileReader(filePath);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int executeCommands() {
		while (!commandFeed.isEmpty()) // While there are still commands in the
										// queue, execute them
		{
			if (executeNext()) // Continue executing commands until we return
								// true
			{
				return returnVal;
			}
		}
		return -1;
	}//

	public boolean executeNext() {
		String command = new String();
		command = commandFeed.next();

		// Begin command parse
		if (command.contains("iload_1")) {
			bcD = new ILoad_1();
			bcD.action(a);
		}else if(command.contains("iload_2")){
			bcD = new ILoad_2();
			bcD.action(b);
		}else if(command.contains("iload_3")){
			bcD = new ILoad_3();
			bcD.action(c);
		} else if (command.contains("if_icmpeq")) {
			If_icmpeq.if_icmpeqAction(command, commandFeed);
		} else if (command.contains("if_icmpne")) {
			If_icmpne.if_icmpneAction(command, commandFeed);
		} else if (command.contains("if_icmpge")) {
			If_icmpge.if_icmpgeAction(command, commandFeed);
		} else if (command.contains("if_icmple")) {
			If_icmple.if_icmpleAction(command, commandFeed);
		} else if (command.contains("iconst_0")) {
			IConst_0.iConst_0Action();
		} else if (command.contains("iconst_1")) {
			IConst_1.iConst_1Action();
		} else if (command.contains("iconst_2")) {
			IConst_2.iConst_2Action();
		} else if (command.contains("iadd")) {
			IAdd.iADDAction();
		} else if (command.contains("ireturn")) {
			returnVal = IReturn.iReturnAction();
			return true; // return true indicates we have hit a return, and
							// should break out of the process stream
		}
		return false;
	}
}