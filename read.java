//write in a file and read from that file only primitive data type
import java.io.*;
class Read
{
	public static void main(String args[])throws IOException
	{
		File f1=new File("me.txt");
		FileOutputStream fos=new FileOutputStream(f1);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeInt(5);
		dos.writeChar('t');
		dos.close();
		FileInputStream fis=new FileInputStream(f1);
		DataInputStream dis=new  DataInputStream(fis);
		boolean b1=dis.readBoolean();
		int k=dis.readInt();
		char c=dis.readChar();
		System.out.println(b1+"  "+k+"  "+c);
		//System.out.println(b1+"  "+c);
	}
}