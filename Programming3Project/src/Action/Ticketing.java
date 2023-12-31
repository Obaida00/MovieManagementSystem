package Action;


import MainPackage.Movie;
import MainPackage.Seat;
import MainPackage.Ticket;
import MainPackage.User;

import java.util.ArrayList;

public class Ticketing {

    public static ArrayList<Seat> getAvailableSeatsOf(Movie movie){
        ArrayList<Seat> availableSeats = new ArrayList<>();
        for(int i = 0 ; i < movie.getMovieTicketsList().size() ; i++){
            if(!movie.getMovieTicketsList().get(i).getTicketSeatStatus()){
                availableSeats.add(movie.getMovieTicketsList().get(i).getTicketSeat());
            }
        }
        return availableSeats;
    }

    public static void bookTicket(ArrayList<Ticket> tickets){
        User user = go.getCurrentUser();
        for(int i = 0 ; i < tickets.size() ; i++){
            tickets.get(i).setTicketSeatStatus(true);
            user.addBookedTicket(tickets.get(i));
        }
    }

    public static boolean cancelTicket(String ticketID){
        Object object = (Ticket)go.load("Ticket" , ticketID);
        if(object == null){
            System.out.println("ticketID Not Found!");
            return false;
        }else{
            Ticket ticket = (Ticket)object;
            if(ticket.getTicketSeatStatus()){
                ticket.setTicketSeatStatus(false);
                System.out.println("ticket Have been canceled Successfully ");
                return true;
            }else{
                System.out.println("ticket is Not Booked!");
                return false;
            }
        }
    }



}
