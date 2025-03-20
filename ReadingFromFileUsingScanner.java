package Revision;

import java.awt.desktop.ScreenSleepEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ReadingFromFileUsingScanner {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Programming\\java\\know.java");
		try (FileReader  fileReader=new FileReader(file) ){
			
//			Scanner scanner=new Scanner(file);
//			while (scanner.hasNextLine()) {
//				ScreenSleepEvent event=new ScreenSleepEvent();
//				System.out.println(scanner.nextLine().charAt(0));
//				Thread.sleep(1000);
//			}
			int character;
			while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);  // Print the character

                // Add delay of 200 milliseconds
                Thread.sleep(20);
            }
//			scanner.close();
		} catch (FileNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
