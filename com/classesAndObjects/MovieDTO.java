package com.ClassesAndObjects;
public class MovieDTO {

    private static int movieCount = 0;

    private String title;
    private String genre;
    private String director;
    private int releaseYear;
    private double rating;
    private int duration; // in minutes
    private String language;
    private double boxOfficeGross;

    public MovieDTO(String title, String genre, String director, int releaseYear, double rating,
                    int duration, String language, double boxOfficeGross) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
        this.language = language;
        this.boxOfficeGross = boxOfficeGross;
        movieCount++;
    }

    //getter and setter 
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setBoxOfficeGross(double boxOfficeGross) {
        this.boxOfficeGross = boxOfficeGross;
    }

    public double getBoxOfficeGross() {
        return boxOfficeGross;
    }

    public static int getMovieCount() {
        return movieCount;
    }

    @Override
    public String toString(){

        return """
                %s

                    Title           : %s
                    Genre           : %s
                    Director        : %s
                    Release Year    : %d
                    Rating          : %.1f
                    Duration (min)  : %d
                    Language        : %s
                    Box Office Gross: %.2f
                %s
            """.formatted("_".repeat(50),getTitle(),getGenre(),getDirector(),getReleaseYear(),
            getRating(),getDuration(),getLanguage(),getBoxOfficeGross(),"_".repeat(50));
    }

    // public static void main(String[] args) {
    //     MovieDTO movie1=new MovieDTO("Naan Thaan Da", "Action", "Anil Ravipudi", 2024, 5.4, 174, "Telugu", 10000000000.00);
    //     System.out.println(movie1);
    // }
}
