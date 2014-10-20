/*
 * This class is just a .txt file reader.
 * After it read from .txt file, 
 * it will store data in a Queue.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;


public class TXTFileReader {
	FileReader dataStream;
	BufferedReader bufferedDataStream;
	
	Queue<String> data;

	
	public TXTFileReader(String filePath) throws IOException
	{
		
		try 
		{
			dataStream = new FileReader(filePath);
		} catch (FileNotFoundException e) 
		{
			System.out.println("File not found!");
		}
		bufferedDataStream = new BufferedReader(dataStream);
		data = new LinkedList<String>();
		
		String line = new String(); //Used to store the current line of text
		System.out.println("File found. Loading commands... ");
		
		while((line=bufferedDataStream.readLine()) != null)
    	{
			data.add(line);
    	}
	}
	
	public String next() {
		String nextCommand = data.remove();
		nextCommand = nextCommand.substring(nextCommand.indexOf("i"),
				nextCommand.length());
		return nextCommand;
	}

	public int nextIndex() {
		String nextIndex = data.peek();
		nextIndex = nextIndex.substring(0, nextIndex.indexOf(" "));
		return Integer.parseInt(nextIndex);
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}
}
