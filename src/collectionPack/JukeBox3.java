//This class is to demonstrate the ArrayList concept
package collectionPack;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import collectionConcepts.ReadSongsFile;

public class JukeBox3 {

	ArrayList<Songs> songObjType = new ArrayList<Songs>();
	ArrayList<String> songList = new ArrayList<String>();
	String songsArray[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JukeBox3().go();

	}
	
	public void go(){
//		songsArray = ReadSongsFile.getSongs();
		getSongs();
		System.out.println("Song Type - "+songObjType);
		System.out.println("String Type - "+songList);
		Collections.sort(songObjType);  // This wont allow because Collections.sort() allows String type untill the class Song implements the Comparable interface of Song type
		System.out.println("Song type after sort - "+songObjType);
		Collections.sort(songList);
		System.out.println("String Type After sort - "+songList);
	}

	private void getSongs() {
		try {
			File fl = new File("D:\\Study\\Selenium Practices\\JavaConcept\\src\\collectionConcepts\\songs.txt");
			BufferedReader br = new BufferedReader(new FileReader(fl));
			String line = null;
			while ((line = br.readLine()) != null) {
				addSong(line);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private void addSong(String lineToParse) {
		// TODO Auto-generated method stub
		String[] tokens = lineToParse.split("/");
		System.out.println(">> "+tokens.length);
		songList.add(tokens[0]);
		Songs nextSong = new Songs(tokens[0], tokens[1], tokens[2], tokens[3]);
		songObjType.add(nextSong);
		
	}
}

	/*private void makeList(String songArr[]){
		int size = songArr.length;
		int count = 0, j = 0;
		if ((size%4) == 0) {
			for (int i = 0; i < size/4; i++) {
				for (j=j; j < i; j++) {
					Songs songTemp = new Songs(songArr[count], songArr[count+1], songArr[count+2], songArr[count+3]);
					count=+4;
//					songList.add(songTemp);   //Throws error as songTemp is type of Song class and songList is String type
					songObjType.add(songTemp);
				}
				int startC = -4;
				
			}
		}
	}*/



/*class Songs {
	String title, artist, rating, bpm;
	
	public Songs(String t, String a, String r, String b) {
		// TODO Auto-generated constructor stub
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
	
	public String getTitle(){
		return title;		
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getRating() {
		return rating;
	}
	
	public String getBpm() {
		return bpm;
	}
	
	public String toString() {
		return title;
	}
}

*/