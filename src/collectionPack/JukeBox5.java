package collectionPack;

import collectionPack.Songs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox5 {

	ArrayList<Songs> songObjType = new ArrayList<Songs>();
	ArrayList<String> songList = new ArrayList<String>();
	String songsArray[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JukeBox5().go();
	}
	
	class ArtistCompare implements Comparator<String>{
		public int compare(Songs one, Songs two){
			return one.getArtist().compareTo(two.getArtist());
		}

		@Override
		public int compare(String o1, String o2) {
			return 0;
		}

		@Override
		public Comparator<String> reversed() {
			return Comparator.super.reversed();
		}

		@Override
		public Comparator<String> thenComparing(Comparator<? super String> other) {
			return Comparator.super.thenComparing(other);
		}
	}
	
	public void go(){
//		songsArray = ReadSongsFile.getSongs();
		getSongs();
		System.out.println("Song Type - "+songObjType);
		System.out.println("String Type - "+songList);
		
		ArtistCompare ac = new ArtistCompare();
//		Collections.sort(songObjType, ac);
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
