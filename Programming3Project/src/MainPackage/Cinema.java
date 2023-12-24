package MainPackage;

import Action.go;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

class Seat{
    private String seatID;
    private double seatPrice;
    private boolean Booked;


    public void setSeatID(String seatID) {this.seatID = seatID;}
    public void setSeatPrice(double seatPrice) {this.seatPrice = seatPrice;}
    public void setBooked(boolean booked) {Booked = booked;}


    public String getSeatID() {return seatID;}
    public double getSeatPrice() {return seatPrice;}
    public boolean isBooked() {return Booked;}
}





public class Cinema {
    private String cinemaName; //Unique
    private int cinemaSeatNumber;
    private ArrayList<Seat> cinemaSeatsList; //FK
    private ArrayList<String> cinemaDailyShowTimesList;
    private int cinemaID;  //PK
    private static int cinemaIDInitializer;
    private static ArrayList<Cinema> cinemaList;

    public Cinema(String cinemaName, ArrayList<String> cinemaDailyShowTimesList , int cinemaSeatNumber , double theSeatAPrice)throws CustomException {
        if((theSeatAPrice/cinemaSeatNumber) <= 25){
            this.cinemaName = cinemaName;
            this.cinemaDailyShowTimesList = cinemaDailyShowTimesList;
            this.cinemaSeatNumber = cinemaSeatNumber;
            this.cinemaID = cinemaIDInitializer;
            cinemaIDInitializer++;
            go.saveInitializer("Cinema");


            cinemaSeatsList = new ArrayList<>();
            double price = theSeatAPrice;
            int character = 65 ;
            for(int j = 0 ; j < (100/20) ; j++){
                for (int i = 0; i < 100; i++){
                    this.cinemaSeatsList.get(i).setSeatID(String.valueOf(i + 1) + (char) character);
                    this.cinemaSeatsList.get(i).setSeatPrice(price);
                    this.cinemaSeatsList.get(i).setBooked(false);
                }
                price -= 500;
                character++;
            }

            go.save("Cinema" , this , this.cinemaID);
            cinemaList.add(this);
            go.save("Cinema" , cinemaList);
        }else{
            System.out.println("in Cinema Constructor:  theSeatAPrice / cinemaSeatNumber = " + (theSeatAPrice/cinemaSeatNumber) + " !!!");
            throw new CustomException("in Cinema Constructor:  theSeatAPrice / cinemaSeatNumber = " + (theSeatAPrice/cinemaSeatNumber) + " !!!");
        }

    }



    public Date getShowTime(int year , int month , int day , int i , int movieID){
        if(i != 1 || i != 2 || i != 3){
            System.out.println("(i) Must Be (1-3) !");
        }else{
            File file = new File("Tickets/" + (String.valueOf(this.cinemaID)+String.valueOf(year)+String.valueOf(month)+String.valueOf(day)+this.cinemaDailyShowTimesList.get(i-1)+"0A11") + ".txt");
            if(file.exists()){
                System.out.println("Sorry! : There is another movie show at the same time in this cinema!!");
            }else{
                String hours = this.cinemaDailyShowTimesList.get(i-1).substring(0,1);
                String minutes = this.cinemaDailyShowTimesList.get(i-1).substring(2,3);
                Date d = go.mDate(year , month , day , Integer.valueOf(hours) , Integer.valueOf(minutes));
                return d;
            }
        }
        return null;
    }
    public void makeSeatsTicketedTo(Movie movie){
        for(int i = 0 ; i < movie.getMovieShowTimesList().size() ; i++){
            for(int j = 0 ; j < this.cinemaSeatsList.size() ; j++){
                Ticket ticket = new Ticket(this, this.cinemaSeatsList.get(j) , movie.getMovieShowTimesList().get(i) , movie);
            }
        }
    }


    public static void setCinemaList(ArrayList<Cinema> cinemaList) {Cinema.cinemaList = cinemaList;}
    public static void setCinemaIDInitializer(int cinemaIDInitializer) {Cinema.cinemaIDInitializer = cinemaIDInitializer;}

    public String getCinemaName() {return cinemaName;}
    public int getCinemaSeatNumber() {return cinemaSeatNumber;}
    public int getCinemaID(){return cinemaID;}
    public static int getCinemaIDInitializer() {return cinemaIDInitializer;}
    public static ArrayList<Cinema> getCinemaList() {return cinemaList;}



}