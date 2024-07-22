//reading 1byte at a time and display in no formate from a file
import java.io.*;
class Read1
{
	public static void main(String args[])throws IOException
	{  
		FileReader fr=new FileReader("read.java");
		BufferedReader br=new BufferedReader(fr);
		String text;
		while((text=br.readLine())!=null)
		{
			System.out.println(text);
		}
		br.close();
	}
}