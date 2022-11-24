package collectionPack;

public class Songs implements Comparable<Songs> {
	String title, artist, rating, bpm;
	
//	public int compareTo(Songs s){
//		return title.compareTo(s.getTitle());
//	}
	
	/*public String toString(){
		return title+":"+artist;
	}*/

	
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

	@Override
	public int compareTo(Songs arg0) {

		// TODO Auto-generated method stub
		return 0;
	}
}
