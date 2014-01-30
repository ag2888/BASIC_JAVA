package Collection_package;

import java.util.*;

class GenreSort implements Comparator<DVDInfo> {
	public int compare (DVDInfo one, DVDInfo two) {
		return one.getGenre().compareTo(two.getGenre());
	}
}

/*
 * Basically this shows how to use a Comparator 
 */


public class DVDInfo implements Comparable<DVDInfo> {
	
	private String title;
	private String genre;
	
	private String leadActor;
	
	DVDInfo(String t, String g, String a) {
		title = t; genre = g; leadActor = a; 
	}
	
	
	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}


	public String toString() {
		return title + " " + genre + " " + leadActor + "\n";
	}
	
	public String getTitle() {
		return title; 
	}
	
	
	public int compareTo(DVDInfo d) {
		return title.compareTo(d.getTitle());
	}
	
	
	
	public static void main ( String [] args) {
		
		ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();
		dvdlist.add( new DVDInfo("Titanic", "Romance", "Leonardo di Capro"));
		dvdlist.add( new DVDInfo("Departed", "Action", "Matt Damon"));
		dvdlist.add( new DVDInfo("Ted", "Comedy", "Mark Walberg"));
		dvdlist.add( new DVDInfo("Lord of the Rings", "Fantasy", "Orlando Bloom"));
		
		Collections.sort(dvdlist, new GenreSort());
		
		System.out.println(dvdlist);
	}
	
	
	
	
}
