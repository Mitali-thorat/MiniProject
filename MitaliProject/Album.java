package MitaliProject;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
   // FIND SONG METHOD
// for finding the song is exist or not we used enhance for loop.
    public Song findSong(String title){

        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        // retuen type is string so we used null.
        return null;
    }

    // ADD SONG METHOD
    // define a method. used  boolean because the return type is true/false
    
    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title,duration));
            System.out.println(title + "successfully added to the list");
            return true;
        }
        else {
            System.out.println("Song with name "+ title+ " already exist in the list");
            return false;
        }
    }

     // ADD SONGS INTO PLAYLIST IN LIKE tracknumber
    
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album does not have song with trackNumber "+trackNumber);
        return false;
    }
    
    // ADD SONGS INTO PLAYLIST IN LIKE in title manner
    

    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for(Song checkedSong : this.songs){
            if (checkedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return true;
            }
        }
      System.out.println(title + "there is no such song in album");
        return false;
	}
	
	}
	
			
		
	

	

