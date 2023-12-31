package MainPackage;

import Action.go;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ticket implements Serializable{
    private Cinema ticketCinema; //FK
    private Seat ticketSeat; //FK
    private Date ticketShowTime; //FK
    private Movie ticketMovie; //FK
    private String ticketID; //PK
    private static ArrayList<Ticket> ticketList;

    public Ticket(Cinema ticketCinema, Seat ticketSeat, Date ticketShowTime, Movie ticketMovie) {
        this.ticketCinema = ticketCinema;
        this.ticketSeat = ticketSeat;
        this.ticketShowTime = ticketShowTime;
        this.ticketMovie = ticketMovie;
        generateTicketID();

        go.save("Ticket" , this , this.ticketID);
        ticketList.add(this);
        go.save("Ticket" , ticketList);
    }

    public void generateTicketID() {
        byte isBookedByte = 0;
        if(ticketSeat.isBooked()){
            isBookedByte = 1;
        }
        SimpleDateFormat s = new SimpleDateFormat("dd");
        String oldTicketID = ticketID;
        ticketID = String.valueOf( ticketCinema.getCinemaID() ) + String.valueOf(ticketShowTime.getYear()+1900) + String.valueOf((ticketShowTime.getMonth()+1) + s.format(ticketShowTime) + String.valueOf(ticketShowTime.getHours()) + ticketShowTime.getMinutes()) + ticketSeat.getSeatID() + isBookedByte;
        go.rename("Ticket" , oldTicketID , ticketID);
        go.save("Ticket" , ticketList);
    }


    public String toText(){
        SimpleDateFormat s = new SimpleDateFormat("EEEE yyyy / MM / dd   hh:mm ");
        String showtime = s.format(ticketShowTime);
        return ticketMovie.getMovieTitle() +"  "+ ticketCinema.getCinemaName() +"  "+ showtime
                +"  "+ ticketSeat.getSeatID()+"  "+ ticketSeat.getSeatPrice() +"  | ID: "+ ticketID;
    }


    public void setTicketSeatStatus(boolean booked) {
        this.ticketSeat.setBooked(booked);
        generateTicketID();
        go.save("Ticket" , this , this.ticketID);
    }
    public boolean getTicketSeatStatus(){return ticketSeat.isBooked();}

    public static void setTicketList(ArrayList<Ticket> ticketList) {Ticket.ticketList = ticketList;}

    public Cinema getTicketCinema() {return ticketCinema;}
    public Seat getTicketSeat() {return ticketSeat;}
    public Date getTicketShowTime() {return ticketShowTime;}
    public Movie getTicketMovie() {return ticketMovie;}
    public String getTicketID() {return ticketID;}
    public static ArrayList<Ticket> getTicketList() {return ticketList;}

}
