package Interfaces;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import Action.go;
import static Action.go.getCurrentUser;
import MainPackage.User;

public class my_tickets_form{
    JFrame jf;
    JScrollPane js;
    JTable jt;
    String [] col;
    Object [][] data;
    public my_tickets_form(){
        jf=new JFrame("Table");
        col =new String[]{"Booked Tickets"};
        data=getData();
        jt= new JTable(data,col);
        js=new  JScrollPane(jt);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }
    Object [][] getData(){
       
        User user = go.getCurrentUser();
        Object [][]data =new Object[user.getUserBookedTickets().size()][1];
        for(int i=0;i<user.getUserBookedTickets().size();i++){
            getCurrentUser().getUserBookedTickets().get(i).toText();
        }
        return data;
    }
    
}
