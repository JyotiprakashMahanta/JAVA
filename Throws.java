package Throwable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream stream=new FileInputStream("d:/File/read.java");
		int num=stream.read();
		while(num>0) {
			System.out.print((char)num);
			num=stream.read();
		}
		System.out.println();
	}

}
