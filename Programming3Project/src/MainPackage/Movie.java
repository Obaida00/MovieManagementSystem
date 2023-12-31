package MainPackage;

import Action.go;
import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Movie implements Serializable{
    private String movieTitle;
    private Cinema movieCinema;
    private Type movieType; //Enum
    private ArrayList<Date> movieShowTimesList; //FK
    private int movieRating;
    private ImageIcon movieImage;
    private ArrayList<Ticket> movieTicketsList;
    private int movieID; //PK
    private static int movieIDInitializer;
    private static ArrayList<Movie> movieList;

    public Movie(String movieTitle, Type movieType, int movieRating, ImageIcon movieImage, Cinema movieCinema
                ,int year , int month , int day) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieRating = movieRating;
        this.movieImage = movieImage;
        this.movieCinema = movieCinema;
        movieID = movieIDInitializer;
        movieIDInitializer++;
        go.saveInitializer("Movie");

        movieShowTimesList = new ArrayList<>();
        for(int i = 1 ; i <= 3 ; i++ ) {
            movieShowTimesList.add(movieCinema.getShowTime(year , month , day , i , this.movieID));
        }

        movieTicketsList = new ArrayList<>();
        movieCinema.makeSeatsTicketedTo(this);


        go.save("Movie" , this , this.movieID);
        movieList.add(this);
        go.save("Movie" , movieList);
    }







    public static void setMovieList(ArrayList<Movie> movieList) {Movie.movieList = movieList;}
    public static void setMovieIDInitializer(int movieIDInitializer) {Movie.movieIDInitializer = movieIDInitializer;}


    public String getMovieTitle() {return movieTitle;}
    public Cinema getMovieCinema() {return movieCinema;}
    public Type getMovieType() {return movieType;}
    public int getMovieRating() {return movieRating;}
    public ImageIcon getMovieImage() {return movieImage;}
    public ArrayList<Ticket> getMovieTicketsList() {return movieTicketsList;}
    public int getMovieID() {return movieID;}
    public static ArrayList<Movie> getMovieList() {return movieList;}


    public ArrayList<Date> getMovieShowTimesList() {return movieShowTimesList;}
    public static int getMovieIDInitializer() {return movieIDInitializer;}




}
