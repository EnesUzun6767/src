package day31_CustomClass_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country,title,Genre,releasedDate,director;
    public ArrayList<String> Cast =new ArrayList<>();

    public Movie(String country, String title, String genre, String releasedDate, String director) {
        this.country = country;
        this.title = title;
        Genre = genre;
        this.releasedDate = releasedDate;
        this.director = director;
    }
    public void addCast(String cast){
        Cast.add(cast);
    }
    public void addCasts(String[] casts) {
        Cast.addAll(Arrays.asList(casts));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", releasedDate='" + releasedDate + '\'' +
                ", director='" + director + '\'' +
                ", Cast=" + Cast +
                '}';
    }
}

/*
3. Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts
 */