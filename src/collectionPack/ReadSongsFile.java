package collectionConcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadSongsFile {
	
	File fl;
	static BufferedReader br;
	public ReadSongsFile() throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		
		fl = new File("D:\\Study\\Selenium Practices\\JavaConcept\\src\\collectionConcepts\\songs.txt");
		br = new BufferedReader(new FileReader(fl));
	}
	public static String[] getSongs(){
		String[] token = null;
		try {
			String line = null;
			while ((line = br.readLine()) != null) {
				token = line.split("/");
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return token;
	}
	
	public void addSong(String songLine){
		String[] token = songLine.split("/");
	}

}
