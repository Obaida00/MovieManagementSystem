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
//        if(go.loadUserMap() == null){
//            mainInitialize();
//        }
        LoadingScreen loadingScreen = new LoadingScreen();
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