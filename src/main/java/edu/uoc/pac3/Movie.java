package edu.uoc.pac3;

import java.time.LocalDate;
import java.util.UUID;

public class Movie {
    private String id;
    private String title;
    private String summary;
    private int duration;
    private LocalDate releaseDate;
    private boolean ov;
    private Trailer trailer;
    private Theater [] theaters;

    private static final int MAX_SUMMARY_LENGTH = 450;
    public static final String ERR_DURATION = "[ERROR] The duration of the movie cannot be 0 or negative";
    public static final String ERR_SUMMARY_LENGTH="[ERROR] Summary's cannot be greater than "+MAX_SUMMARY_LENGTH+" characters";
    public static final String ERR_WRONG_INDEX = "[ERROR] Wrong index";
    public static final String ERR_THEATER_EXISTS = "[ERROR] Movie already exists in this theater";
    public static final int MAX_THEATERS = 5;

    public Movie(String title, String summary, int duration, LocalDate releaseDate, boolean ov) {
        setId();
        this.title = title;
        this.summary = summary;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.ov = ov;
        this.trailer = null;
    }

    public Movie (String title, String summaryNew, int duration, LocalDate releaseDate, boolean ov, String url,
                  int trailerDuration, LocalDate trailerReleaseDate) {
        setId();
        this.title = title;
        this.summary = summaryNew;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.ov = ov;
        this.trailer = new Trailer (url,trailerDuration,trailerReleaseDate);

    }

    public String getId() {
        return id;
    }

    private void setId() {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public String setSummary(String summaryNew) throws Exception {
            if (summaryNew.length() > MAX_SUMMARY_LENGTH) {
                 throw new Error(ERR_SUMMARY_LENGTH);
            } else {
                return this.summary = summaryNew;
            }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int durationNew) throws Exception {
        if (durationNew <= 0){
            throw new Exception(ERR_DURATION);
        } else {
            this.duration = durationNew;
        }
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isOv() {
        return ov;
    }

    public void setOv(boolean ov) {
        this.ov = ov;
    }

    public Trailer getTrailer() { return trailer; }

    public void setTrailer (String urlNew, int durationNew, LocalDate releaseDateNew) {
        this.trailer = new Trailer (urlNew, durationNew, releaseDateNew);
    }

    private Theater[] getTheaters(){
        return theaters;
    }
    public Theater getTheater(int index) {
        return theaters[index];
    }

    public Theater isInTheTheater(Theater theater) {
        return theater;
    }

    private Theater findTheaterIndex (Theater theater){
        return theater;
    }
    private void setTheater (int index, Theater theater){

    }
    public Theater addTheater(Theater theater){
        return theater;
    }

    public Theater removeTheater(Theater theater){
        return theater;
    }
    public void notInTheaters(){

    }
}
