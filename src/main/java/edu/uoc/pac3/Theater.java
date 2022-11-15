package edu.uoc.pac3;

public class Theater {

    private String name;
    private int capacity;

    private Movie[] movie;

    public static final String ERR_WRONG_INDEX = "[ERROR] Wrong index";
    public static final String ERR_NULL_MOVIE = "[ERROR] The movie cannot be null";
    public static final String ERR_NO_MORE_MOVIES = "[ERROR] This theater cannot screen more movies";
    public static final String ERR_MOVIE_EXISTS = "[ERROR] This movie is already screened in this theater";
    public static final String ERR_MOVIE_DOESNT_EXIST = "[ERROR] This movie does not exist in this theater";

    public Theater(String name, int capacity, int MAX_MOVIES) {
        this.name = name;
        this.capacity = capacity;
        this.movie = new Movie[MAX_MOVIES];
    }

    public String getName() { return name; }
    public void setName(String nameNew) {
        this.name = nameNew;
    }
    public int getCapacity() { return capacity; }

    private void setCapacity (int capacityNew) {
        this.capacity= capacityNew;
    }
    public Movie [] getMovies() {
        return this.movie;
    }
    public Movie getMovie (int index){
        return  this.movie[index];
    }
    private int findMovieIndex(Movie movie){
        return 1;
    }
    public Movie movieExists(Movie movie) throws java.lang.Exception {
        return movie;
    }

    public boolean canScreenMoreMovies(){
        return true;
    }

    private void setMovie (int index, Movie movie){

    }
    public Movie addMovie(Movie movie){
        return movie;
    }

    public Movie removeMovie(Movie movie){
        return movie;
    }


}
