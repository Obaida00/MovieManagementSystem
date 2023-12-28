package Action;

import MainPackage.Cinema;
import MainPackage.Movie;
import MainPackage.Ticket;
import MainPackage.User;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class go {

    public static void loadAll(){
        Cinema.setCinemaList(load("Cinema"));
        Cinema.setCinemaIDInitializer(loadInitializer("Cinema"));
        User.setUserList(load("User"));
        User.setUserIDInitializer(loadInitializer("User"));
        Movie.setMovieList(load("Movie"));
        Movie.setMovieIDInitializer(loadInitializer("Movie"));
        Ticket.setTicketList(load("Ticket"));
    }

    public static void save(String className , Object object , int objectID){
        try{
            File file = new File(className + "s/" + objectID + ".txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(object);
            oos.flush();
            oos.close();
            System.out.println(className + ":" + objectID + " saved Successfully ");
        } catch (FileNotFoundException e) {
            System.out.println(className + ":" + objectID + " didn't save: File Not Found!");
        } catch (IOException e) {
            System.out.println(className + ":" + objectID + " didn't save: IOException!");
        }
    }
    public static void save(String className , Object object , String objectID){
        try{
            File file = new File(className + "s/" + objectID + ".txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(object);
            oos.flush();
            oos.close();
            System.out.println(className + ":" + objectID + " saved Successfully ");
        } catch (FileNotFoundException e) {
            System.out.println(className + ":" + objectID + " didn't save: File Not Found!");
        } catch (IOException e) {
            System.out.println(className + ":" + objectID + " didn't save: IOException!");
        }
    }
    public static void save(String className , ArrayList objects){
        try{
            File file = new File(className + "s/" + className + "List.txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(objects);
            oos.flush();
            oos.close();
            System.out.println(className + "List saved Successfully ");
        } catch (FileNotFoundException e) {
            System.out.println(className + "List didn't save: File Not Found!");
        } catch (IOException e) {
            System.out.println(className + "List didn't save: IOException!");
        }
    }
    public static Object load(String className , int objectID){
        try{
            File file = new File(className + "s/" + objectID + ".txt");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Object object = ois.readObject();
            ois.close();
            return object;
        }catch (FileNotFoundException e) {
            System.out.println(className + ":" + objectID + " didn't load: File Not Found!");
        }catch (IOException e) {
            System.out.println(className + ":" + objectID + " didn't load: IOException!");
        }catch(ClassNotFoundException e) {
            System.out.println(className + ":" + objectID + " didn't load: Class Not Found!");
        }finally {
            System.out.println(className + ":" + objectID + " loaded Successfully ");
        }
        return null;
    }
    public static Object load(String className , String objectID){
        try{
            File file = new File(className + "s/" + objectID + ".txt");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Object object = ois.readObject();
            ois.close();
            return object;
        }catch (FileNotFoundException e) {
            System.out.println(className + ":" + objectID + " didn't load: File Not Found!");
        }catch (IOException e) {
            System.out.println(className + ":" + objectID + " didn't load: IOException!");
        }catch(ClassNotFoundException e) {
            System.out.println(className + ":" + objectID + " didn't load: Class Not Found!");
        }finally {
            System.out.println(className + ":" + objectID + " loaded Successfully ");
        }
        return null;
    }
    public static ArrayList load(String className){
        try{
            File file = new File(className + "s/" + className + "List.txt");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Object> objects = (ArrayList<Object>) ois.readObject();
            ois.close();
            return objects;
        }catch (FileNotFoundException e) {
            System.out.println(className + "List didn't load: File Not Found!");
        } catch (IOException e) {
            System.out.println(className + "List didn't load: IOException!");
        } catch (ClassNotFoundException e) {
            System.out.println(className + "List didn't load: Class Not Found!");
        }finally {
            System.out.println(className + "List loaded Successfully ");
        }
        return null;
    }
    public static int loadInitializer(String className){
        try{
            File file = new File("Initializers_Ids/" + className + "IDInitializer.txt");
            Scanner scan = new Scanner(file);
            int result = scan.nextInt();
            scan.close();
            return result;
        }catch (FileNotFoundException e) {
            System.out.println(className + "IDInitializer didn't load: File Not Found!");
        }finally{
            System.out.println(className + "IDInitializer loaded Successfully ");
        }
        return -1;
    }
    public static void saveInitializer(String className){
        try{
            File file = new File("Initializers_Ids/" + className + "IDInitializer.txt");
            PrintWriter pw = new PrintWriter(file);
            switch(className){
                case "Cinema":
                    pw.write(Cinema.getCinemaIDInitializer());
                    pw.flush();
                    pw.close();
                    break;
                case "Movie":
                    pw.write(Movie.getMovieIDInitializer());
                    pw.flush();
                    pw.close();
                    break;
                case "User":
                    pw.write(User.getUserIDInitializer());
                    pw.flush();
                    pw.close();
                    break;
                default:
                    System.out.println(className + "isn't a classname !!");
                    break;
            }
        }catch (FileNotFoundException e) {
            System.out.println(className + "IDInitializer didn't saved: File Not Found!");
        }finally{
            System.out.println(className + "IDInitializer saved Successfully ");
        }
    }


    public static void rename(String className , String oldName , String newName){
        File file = new File(className + "s/" + oldName + ".txt");
        file.renameTo(new File(className + "s/" + newName + ".txt"));
    }


    public static void remove(String className , int objectID){
        File file = new File(className + "s/" + objectID + ".txt");
        if(file.delete()){
            System.out.println(className + ":" + objectID + " removed Successfully ");
        }else{
            System.out.println(className + ":" + objectID + " didn't remove Successfully!");
        }
    }
    public static void remove(String className , String objectID){
        File file = new File(className + "s/" + objectID + ".txt");
        if(file.delete()){
            System.out.println(className + ":" + objectID + " removed Successfully ");
        }else{
            System.out.println(className + ":" + objectID + " didn't remove Successfully!");
        }
    }



    public static boolean checkName$Pass(){
        //TODO
        return false;
    }
    public static Date mDate(int Year , int Month, int Day, int Hour, int Minute){
        Date d;
        d = new Date(Year-1900,Month-1,Day,Hour,Minute);
        return d;
    }
    public static ImageIcon makeImage(String imagePath){
        try{
            File file = new File(imagePath);
            Image image = ImageIO.read(file);
            ImageIcon icon = new ImageIcon(image);
            return icon;
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
