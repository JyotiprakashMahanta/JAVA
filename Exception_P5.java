package Throwable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exception_P5 {
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("give ");
		File file=new File("d://File");
		boolean b=file.mkdir();
		if (b) {
			System.out.println("folder created ");
		}else {
			System.out.println("folder already exist");
		}
		try {	
			//store
			FileOutputStream stream =new FileOutputStream("d://File/file1.txt");
			System.out.println("file created");
			String msg="i want to store this message in drive by creating a new file and folder..";
			byte[] bs=msg.getBytes();
			stream.write(bs);
			System.out.println("data stored");
			
			//read
			FileInputStream stream2 =new FileInputStream("d://File/file1.txt");
			int n=stream2.read();
			while(n>0) {
				System.out.print((char)n);
				n=stream2.read();
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
