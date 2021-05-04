package p18.textbook.exercises.ex07;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/textbook/exercises/ex07/AddLineNumberExample.java";
		FileReader reader = new FileReader(path);
		BufferedReader br = new BufferedReader(reader);
		
		String line = null;
		int lineNum = 0;
		
		while((line = br.readLine())!=null) {
			System.out.println(lineNum+": "+line);
		}
		
		reader.close();
		br.close();
	}
}
