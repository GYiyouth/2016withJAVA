package dome;

public class CD {
	private String title;
	private String artist;
	private int numofTracks;
	private int playingTime;
	private boolean gotIt;
	private String comment;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) { // ¹¹Ôìº¯Êý
		super();
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.playingTime = playingTime;
		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title+":"+artist);
	}

}
