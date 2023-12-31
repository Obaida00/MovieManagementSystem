package MainPackage;

import Action.go;
import javax.swing.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Movie implements Serializable{
    private String movieTitle;
    private Cinema movieCinema;
    private Type movieType; //Enum
    private ArrayList<Date> movieShowTimesList; //FK
    private int movieRating;
    private ImageIcon movieImage;
    private ArrayList<Ticket> movieTicketsList;
    private Map<String , String> movieTicketsMap;
    private int movieID; //PK
    private static int movieIDInitializer;
    private static ArrayList<Movie> movieList;


    public Movie(String movieTitle, Type movieType, int movieRating, String movieImagePath, Cinema movieCinema
                ,int year , int month , int day) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieRating = movieRating;
        this.movieImage = new ImageIcon(getClass().getResource(movieImagePath));
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
        
        movieTicketsMap = new HashMap<>();
        for(int i = 0 ; i < movieTicketsList.size() ; i++){
            SimpleDateFormat s = new SimpleDateFormat("dd");
            String showtimeKey = String.valueOf(movieTicketsList.get(i).getTicketShowTime().getYear()+1900)+String.valueOf(movieTicketsList.get(i).getTicketShowTime().getMonth()+1)+s.format(movieTicketsList.get(i).getTicketShowTime())+String.valueOf(movieTicketsList.get(i).getTicketShowTime().getHours())+String.valueOf(movieTicketsList.get(i).getTicketShowTime().getMinutes());
            movieTicketsMap.put(showtimeKey+movieTicketsList.get(i).getTicketSeat().getSeatID(), movieTicketsList.get(i).getTicketID());
        }
        
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
    public Map<String, String> getMovieTicketsMap() {return movieTicketsMap;}
    

    public ArrayList<Date> getMovieShowTimesList() {return movieShowTimesList;}
    public static int getMovieIDInitializer() {return movieIDInitializer;}




}
