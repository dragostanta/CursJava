package curs12;

import java.io.File;
import java.io.*;
import java.io.IOException;

public class TextFileProcessor {
	
	public void writeTxt(String text) {
		
		try(FileWriter fileWriter = new FileWriter("test.txt")){
			
			fileWriter.write(text);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
