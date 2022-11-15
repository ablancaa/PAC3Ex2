package edu.uoc.pac3;

import java.time.Duration;
import java.time.LocalDate;

public class Trailer {
    private String url;
    private int duration;
    private LocalDate releaseDate;

    public static final int MAX_DURATION = 180;
    public static final String ERR_DURATION = "[ERROR] The duration cannot be 0, negative or greater than "+MAX_DURATION;
    public static final String ERR_RELEASE = "[ERROR] The release of the trailer cannot be null or a date that is later than today";

    private Movie movie;

    public Trailer (String urlNew, int durationNew, LocalDate releaseDateNew) {
        this.url = urlNew;
        this.duration = durationNew;
        this.releaseDate = releaseDateNew;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String urlNew) {
        this.url = urlNew;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int durationNew) throws Exception {
        if (durationNew <= 0 || durationNew > MAX_DURATION){
            throw new Exception(ERR_DURATION);
        } else {
            this.duration = durationNew;
        }
    }

    public String getFormattedDuration() {
        Duration duracion = Duration.ofMinutes(duration);
        Duration duracion2 = Duration.ofSeconds(duration);
        //Duration seg = Duration.ofSeconds(duration);

        String patron = "0%d:%d";
        //String fomatedReleaseDate = duracion.toString();

        String fomatedReleaseDate = String.format(patron,duracion.toHours(),duracion.toMinutes());


        return fomatedReleaseDate;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDateNew) throws Exception {
        LocalDate fechaHoy = LocalDate.now();
        if(releaseDateNew == null || releaseDateNew.isAfter(fechaHoy)) {
            throw new Exception(ERR_RELEASE);
        } else {
            this.releaseDate = releaseDateNew;
        }
    }

}
