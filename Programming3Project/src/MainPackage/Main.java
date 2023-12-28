package MainPackage;
import Interfaces.HomeScreen;
import Interfaces.LoadingScreen;
import java.util.logging.Level;
import java.util.logging.Logger;


////////////////TESTING
/**
 *
 * @author Obaida
 */
public class Main {

  public static void main(String[] args) {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    LoadingScreen loadingScreen = new LoadingScreen();
//    new HomeScreen();
  }
}


//    To Print The Date We Did:
//    Date d = go.MDate(2024 , 4 , 12 , 07 , 30);
//    SimpleDateFormat s = new SimpleDateFormat("EEEE yyyy / MM / dd   hh:mm ");
//    System.out.println(s.format(d));