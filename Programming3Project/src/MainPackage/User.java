package MainPackage;

import Action.go;
import javax.swing.*;
import java.util.ArrayList;

public class User {
    private String userName;
    private String userPassword;
    private String userAddress;
    private ArrayList<Ticket> userBookedTickets;//FK
    private ImageIcon image;
    private int userID;//pk
    private static int userIDInitializer;
    private static ArrayList<User> userList ;

    public User(String userName, String userPassword,String userAddress){
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAddress = userAddress;
        this.userID = userIDInitializer;
        userIDInitializer++;
        go.saveInitializer("User");

        userBookedTickets = new ArrayList<>();

        this.image = go.makeImage("Default User Image .jpg");

        go.save("User" , this , this.userID);
        userList.add(this);
        go.save("User" , userList);
    }

    public void addBookedTicket(Ticket ticket) {
        userBookedTickets.add(ticket);}

    public void setImage(ImageIcon image) {this.image = image;}
    public static void setUserList(ArrayList<User> userList) {User.userList = userList;}
    public static void setUserIDInitializer(int userIDInitializer) {User.userIDInitializer = userIDInitializer;}

    public String getUserName() {return userName;}
    public String getUserPassword() {return userPassword;}
    public String getUserAddress() {return userAddress;}
    public ImageIcon getImage() {return image;}
    public int getUserID() {return userID;}
    public ArrayList<Ticket> getUserBookedTickets() {return userBookedTickets;}
    public static ArrayList<User> getUserList() {return userList;}
    public static int getUserIDInitializer() {return userIDInitializer;}
}