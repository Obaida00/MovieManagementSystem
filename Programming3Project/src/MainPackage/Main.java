package MainPackage;

import Action.go;
import Interfaces.LoadingScreen;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //if(go.loadUserMap() == null){
            //mainInitialize();
            //createMainData();
        //}
        LoadingScreen loadingScreen = new LoadingScreen();
        //booked_ticket_form f = new booked_ticket_form();
        //f.setVisible(true);
    }

  

    
    public static void createMainData(){
        ArrayList<String> dailyShowTimeList = new ArrayList<>();
        dailyShowTimeList.add("1200"); //12:00 AM
        dailyShowTimeList.add("1500"); //03:00 PM
        dailyShowTimeList.add("1700"); //06:00 PM
      try {
          Cinema cinema = new Cinema("Hall1" , dailyShowTimeList , 50 , 10000);
          
          new Movie("What Men Want" , Type.Action , 3 , "/res/temp posters/What men want.jpg" , cinema , 2024 , 1 , 26);
          new Movie("Five Feet Apart" , Type.Drama , 2 , "/res/temp posters/Five feet apart.jpg" , cinema , 2024 , 1 , 27);
          new Movie("Emancepation" , Type.Comedy , 4 , "/res/temp posters/Emancipation.jpg" , cinema , 2024 , 1 , 28);
          new Movie("LUCY" , Type.Romance , 3 , "/res/temp posters/LUCY.jpg" , cinema , 2024 , 1 , 29);
          new Movie("The  happyness" , Type.Fantasy , 2 , "/res/temp posters/The Pursuite of happyness.jpg" , cinema , 2024 , 2 , 20);
          new Movie("The   Cristmass" , Type.Horror , 4 , "/res/temp posters/The Nightmare Before Cristmass.jpg" , cinema , 2024 , 2 , 21);
          new Movie("Escape room" , Type.Mystery , 5 , "/res/temp posters/Escape room.jpg" , cinema , 2024 , 2 , 22);
          new Movie("AD astra" , Type.Western , 3 , "/res/temp posters/AD astra.jpg" , cinema , 2024 , 2 , 23);
          new Movie("Ternet Ninja" , Type.Thriller , 5 , "/res/temp posters/Ternet Ninja.jpg" , cinema , 2024 , 2 , 24);
          new Movie("HellBoy" , Type.Action , 5 , "/res/temp posters/HellBoy.jpg" , cinema , 2024 , 2 , 25);
          new Movie("AboMinable" , Type.Comedy , 4 , "/res/temp posters/AboMinable.jpg" , cinema , 2024 , 3 , 10);
          new Movie("The Pool" , Type.Drama , 3 , "/res/temp posters/The Pool.jpg" , cinema , 2024 , 3 , 12);
      }catch (CustomException ex) {
          System.out.println(ex.getMessage());
      }
    }
    
    
    
    
    
    
    
    
    

    private static void mainInitialize(){
        try{
            File file = new File("Users/UserList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new ArrayList<User>());
            oos.flush();
            oos.close();
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
        try{
            File file = new File("Movies/MovieList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new ArrayList<Movie>());
            oos.flush();
            oos.close();
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
        try{
            File file = new File("Cinemas/CinemaList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new ArrayList<Cinema>());
            oos.flush();
            oos.close();
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
        try{
            File file = new File("Tickets/TicketList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new ArrayList<Ticket>());
            oos.flush();
            oos.close();
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
        //    To Initializing the userMap File By Filling it with empty new HashMap<String , Integer> :
        try{
            File file = new File("Users/userMap.txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new HashMap<String , Integer>());
            oos.flush();
            oos.close();
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
    }





}







//    To Print The Date We Did:
//    Date d = go.MDate(2024 , 4 , 12 , 07 , 30);
//    SimpleDateFormat s = new SimpleDateFormat("EEEE yyyy / MM / dd   hh:mm ");
//    System.out.println(s.format(d));