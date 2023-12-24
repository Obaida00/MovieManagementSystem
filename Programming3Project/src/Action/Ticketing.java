package Action;

import MainPackage.Ticket;
import MainPackage.User;

import java.util.ArrayList;

public class Ticketing {



    public static void bookTicket(User user, ArrayList<Ticket> tickets){
        for(int i = 0 ; i < tickets.size() ; i++){
            tickets.get(i).setTicketSeatStatus(true);
            user.addBookedTicket(tickets.get(i));
        }
    }

    public static void cancelTicket(String ticketID){
        Ticket ticket = (Ticket)go.load("Ticket" , ticketID);
        if(ticket.equals(null)){
            System.out.println("ticketID Not Found!");
        }else{
            if(ticket.getTicketSeatStatus()){
                ticket.setTicketSeatStatus(false);
                System.out.println("ticket Have been canceled Successfully ");
            }else{
                System.out.println("ticket is Not Booked!");
            }
        }
    }



}
