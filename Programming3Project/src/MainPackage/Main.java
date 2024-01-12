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

      new Movie("The Skin I Live In", Type.Action, 3, "/res/Posters/107734057_178723.png", "/res/Posters/Thumbnails/107734057_178723.png", cinema, 2024, 1, 26);
      new Movie("Gone Girl", Type.Drama, 3, "/res/Posters/235139097_213899.png", "/res/Posters/Thumbnails/235139097_213899.png", cinema, 2024, 1, 26);
      new Movie("National Treasure", Type.Action, 3, "/res/Posters/235438082_259512.png", "/res/Posters/Thumbnails/235438082_259512.png", cinema, 2024, 1, 26);
      new Movie("Sherlock Holmes", Type.Mystery, 3, "/res/Posters/235438625_157924.png", "/res/Posters/Thumbnails/235438625_157924.png", cinema, 2024, 1, 26);
      new Movie("Fist Fight", Type.Comedy, 3, "/res/Posters/238225666_202995.png", "/res/Posters/Thumbnails/238225666_202995.png", cinema, 2024, 1, 26);
      new Movie("The Martian", Type.Fantasy, 3, "/res/Posters/239518035_331867.png", "/res/Posters/Thumbnails/239518035_331867.png", cinema, 2024, 1, 26);
      new Movie("Divergent", Type.Action, 3, "/res/Posters/245106249_333108.png", "/res/Posters/Thumbnails/245106249_333108.png", cinema, 2024, 1, 26);
      new Movie("Allegiant", Type.Action, 3, "/res/Posters/245013227_329637.png", "/res/Posters/Thumbnails/245013227_329637.png", cinema, 2024, 1, 26);
      new Movie("Shooter", Type.Drama, 3, "/res/Posters/245109161_78020.png", "/res/Posters/Thumbnails/245109161_78020.png", cinema, 2024, 1, 26);
      new Movie("Lady Bird", Type.Romance, 3, "/res/Posters/245109657_96378.png", "/res/Posters/Thumbnails/245109657_96378.png", cinema, 2024, 1, 26);
      new Movie("The Maze Runner", Type.Action, 3, "/res/Posters/245109675_43368.png", "/res/Posters/Thumbnails/245109675_43368.png", cinema, 2024, 1, 26);
      new Movie("Vengeance", Type.Western, 3, "/res/Posters/246107413_348183.png", "/res/Posters/Thumbnails/246107413_348183.png", cinema, 2024, 1, 26);
      new Movie("Enter The Wild", Type.Mystery, 3, "/res/Posters/246109424_310470.png", "/res/Posters/Thumbnails/246109424_310470.png", cinema, 2024, 1, 26);
      new Movie("Mission Imposible III", Type.Action, 3, "/res/Posters/246112355_342173.png", "/res/Posters/Thumbnails/246112355_342173.png", cinema, 2024, 1, 26);
      new Movie("Benji", Type.Comedy, 3, "/res/Posters/246133283_84024.png", "/res/Posters/Thumbnails/246133283_84024.png", cinema, 2024, 1, 26);
      new Movie("Upgrade", Type.Fantasy, 3, "/res/Posters/246133649_309337.png", "/res/Posters/Thumbnails/246133649_309337.png", cinema, 2024, 1, 26);
      new Movie("Adrift", Type.Romance, 3, "/res/Posters/246135418_308770.png", "/res/Posters/Thumbnails/246135418_308770.png", cinema, 2024, 1, 26);
      new Movie("The Yellow Birds", Type.Action, 3, "/res/Posters/246202491_182573.png", "/res/Posters/Thumbnails/246202491_182573.png", cinema, 2024, 1, 26);
      new Movie("Spectre", Type.Mystery, 3, "/res/Posters/246205408_347604.png", "/res/Posters/Thumbnails/246205408_347604.png", cinema, 2024, 1, 26);
      new Movie("LUCY", Type.Action, 3, "/res/Posters/246209256_321915.png", "/res/Posters/Thumbnails/246209256_321915.png", cinema, 2024, 1, 26);
      new Movie("SuperFly", Type.Action, 3, "/res/Posters/246209417_348361.png", "/res/Posters/Thumbnails/246209417_348361.png", cinema, 2024, 1, 26);
      new Movie("Focus", Type.Action, 3, "/res/Posters/246215044_325988.png", "/res/Posters/Thumbnails/246215044_325988.png", cinema, 2024, 1, 26);
      new Movie("The Commuter", Type.Action, 3, "/res/Posters/246225795_331992.png", "/res/Posters/Thumbnails/246225795_331992.png", cinema, 2024, 1, 26);
      new Movie("About Time", Type.Action, 3, "/res/Posters/246227795_358565.png", "/res/Posters/Thumbnails/246227795_358565.png", cinema, 2024, 1, 26);
      new Movie("Insurgent", Type.Action, 3, "/res/Posters/246228646_144871.png", "/res/Posters/Thumbnails/246228646_144871.png", cinema, 2024, 1, 26);
      new Movie("Cast Away", Type.Action, 3, "/res/Posters/246229068_350773.png", "/res/Posters/Thumbnails/246229068_350773.png", cinema, 2024, 1, 26);
      new Movie("Who Am I", Type.Action, 3, "/res/Posters/246925065_215463.png", "/res/Posters/Thumbnails/246925065_215463.png", cinema, 2024, 1, 26);

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
