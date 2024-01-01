package MainPackage;

import Interfaces.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    //if(go.loadUserMap() == null){
//            mainInitialize();
    //createMainData();
    //}
    LoadingScreen loadingScreen = new LoadingScreen();
  }

  public static void createMainData() {
    ArrayList<String> dailyShowTimeList = new ArrayList<>();
    dailyShowTimeList.add("1200"); //12:00 AM
    dailyShowTimeList.add("1500"); //03:00 PM
    dailyShowTimeList.add("1700"); //06:00 PM
    try {
      Cinema cinema = new Cinema("Hall1", dailyShowTimeList, 50, 10000);

      new Movie("Godzilla", Type.Action, 3, "/res/Posters/Godzilla.png", "/res/Posters/Thumbnails/Godzilla.png", cinema, 2024, 1, 26);
//      new Movie("KGF", Type.Action, 3, "/res/Posters/KGF.png", "/res/Posters/Thumbnails/KGF.png", cinema, 2024, 1, 26);
//      new Movie("Little Woman", Type.Action, 3, "/res/Posters/Little Woman.png", "/res/Posters/Thumbnails/Little Woman.png", cinema, 2024, 1, 26);
//      new Movie("The Silence", Type.Action, 3, "/res/Posters/The Silence.png", "/res/Posters/Thumbnails/The Silence.png", cinema, 2024, 1, 26);

    } catch (CustomException ex) {
      System.out.println(ex.getMessage());
    }
  }

  private static void mainInitialize() {
    try {
      File file = new File("Users/UserList.txt");
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
      oos.writeObject(new ArrayList<User>());
      oos.flush();
      oos.close();
    } catch (IOException e) {
      System.out.print(e.getMessage());
    }
    try {
      File file = new File("Movies/MovieList.txt");
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
      oos.writeObject(new ArrayList<Movie>());
      oos.flush();
      oos.close();
    } catch (IOException e) {
      System.out.print(e.getMessage());
    }
    try {
      File file = new File("Cinemas/CinemaList.txt");
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
      oos.writeObject(new ArrayList<Cinema>());
      oos.flush();
      oos.close();
    } catch (IOException e) {
      System.out.print(e.getMessage());
    }
    try {
      File file = new File("Tickets/TicketList.txt");
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
      oos.writeObject(new ArrayList<Ticket>());
      oos.flush();
      oos.close();
    } catch (IOException e) {
      System.out.print(e.getMessage());
    }
    //    To Initializing the userMap File By Filling it with empty new HashMap<String , Integer> :
    try {
      File file = new File("Users/userMap.txt");
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
      oos.writeObject(new HashMap<String, Integer>());
      oos.flush();
      oos.close();
    } catch (IOException e) {
      System.out.print(e.getMessage());
    }
  }
}

//    To Print The Date We Did:
//    Date d = go.MDate(2024 , 4 , 12 , 07 , 30);
//    SimpleDateFormat s = new SimpleDateFormat("EEEE yyyy / MM / dd   hh:mm ");
//    System.out.println(s.format(d));
