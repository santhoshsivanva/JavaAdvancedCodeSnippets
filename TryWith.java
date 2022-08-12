package javaDoc;

import java.io.FileReader;

public class TryWith {

	static void file() throws Exception {
		try(FileReader a = new FileReader("new.txt")){
			System.out.println(a.read());
		} //This is an example for auto closing try with resource concept 
	}
	
	public static void main(String[] args) {
		try {
			TryWith.file();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
