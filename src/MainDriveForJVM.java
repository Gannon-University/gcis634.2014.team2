import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

public class MainDriveForJVM {

	public static void main(String[] args) throws IOException {
		/*
		 * System.out.println("Choose a file!");
		 * 
		 * FileBrowse jframe = new FileBrowse(); jframe.run(new FileBrowse(),
		 * 600, 600);
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter three side of traingle: ");
		int input1 = 0, input2 = 0, input3 = 0;
		boolean bError = true;

		
		while (bError) {
			System.out.println("Side 1 is: ");

			if (sc.hasNextInt()) {
				input1 = sc.nextInt();
			} else {
				sc.next();
				continue;
			}

			System.out.println("Side 2 is: ");
			if (sc.hasNextInt()) {
				input2 = sc.nextInt();
			} else {
				sc.next();
				continue;
			}
			System.out.println("Side 3 is: ");
			if (sc.hasNextInt()) {
				input3 = sc.nextInt();
			} else {
				sc.next();
				continue;
			}

			bError = false;
		}

		Processor runner = new Processor(
				"C:/Users/Stephen/Desktop/BytecodeSample.txt", input1, input2,
				input3);
		runner.executeCommands();
	}

}