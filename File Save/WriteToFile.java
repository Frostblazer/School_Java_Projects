import java.io.*;
public class WriteToFile
{
	//Writes String to file
	public static void write(File file, String text)throws IOException
	{
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(text);
		
		if(bw != null)
			bw.close();
		
		if(fw != null)
			fw.close();					
	}
	//Writes an array of Strings to a file, putting a new line after each array element 
	public static void write(File file, String[] textArray)throws IOException
	{
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (String s : textArray)
			bw.write(s + "\n");
		
		if(bw != null)
			bw.close();
			
		if(fw != null)
			fw.close();	
	}

}
