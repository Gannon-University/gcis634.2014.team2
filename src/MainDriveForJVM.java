import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;


public class MainDriveForJVM {

	public static void main(String[] args) throws IOException {
		/*System.out.println("Choose a file!");
		
		FileBrowse jframe = new FileBrowse();
		jframe.run(new FileBrowse(), 600, 600);*/
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter three side of traingle: ");
		
		System.out.println("Side 1 is: ");
		int input1 = sc.nextInt();
		System.out.println("Side 2 is: ");
		int input2 = sc.nextInt();
		System.out.println("Side 3 is: ");
		int input3 = sc.nextInt();
		
		Processor runner = new Processor("C:/Users/XiaoPangZhi/Desktop/trianglejavabytecode.txt", input1, input2, input3);
		runner.executeCommands();
	}

}