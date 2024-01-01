/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Action.Ticketing;
import Action.go;
import MainPackage.Movie;
import MainPackage.Ticket;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author gtx
 */
public class booked_ticket_form extends javax.swing.JFrame {
    private JLabel j=new JLabel(); 
    private ArrayList<String> SeatIDs;
    private ArrayList<JLabel> labels;
    private Movie movie;
    private int showtime;
    private boolean[][] isPurble;
    private boolean[][] isRed;
    /**
     * Creates new form booked_ticket_form
     */
    public booked_ticket_form(int showtime , Movie movie){
        initComponents();
        this.showtime = showtime;
        this.movie  = movie;
        this.setVisible(true);
        isPurble = new boolean[5][10];
        isRed = new boolean[5][10];
        //j.setIcon(imageIconRed);
        SeatIDs = new ArrayList<>();
        labels = new ArrayList<>();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            A1.setName("A1");A2.setName("A2");A3.setName("A3");A4.setName("A4");A5.setName("A5");A6.setName("A6");A7.setName("A7");A8.setName("A8");A9.setName("A9");A10.setName("A10");
            B1.setName("B1");B2.setName("B2");B3.setName("B3");B4.setName("B4");B5.setName("B5");B6.setName("B6");B7.setName("B7");B8.setName("B8");B9.setName("B9");B10.setName("B10");
            C1.setName("C1");C2.setName("C2");C3.setName("C3");C4.setName("C4");C5.setName("C5");C6.setName("C6");C7.setName("C7");C8.setName("C8");C9.setName("C9");C10.setName("C10");
            D1.setName("D1");D2.setName("D2");D3.setName("D3");D4.setName("D4");D5.setName("D5");D6.setName("D6");D7.setName("D7");D8.setName("D8");D9.setName("D9");D10.setName("D10");
            E1.setName("E1");E2.setName("E2");E3.setName("E3");E4.setName("E4");E5.setName("E5");E6.setName("E6");E7.setName("E7");E8.setName("E8");E9.setName("E9");E10.setName("E10");
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            labels.add(A1);labels.add(A2);labels.add(A3);labels.add(A4);labels.add(A5);labels.add(A6);labels.add(A7);labels.add(A8);labels.add(A9);labels.add(A10);
            labels.add(B1);labels.add(B2);labels.add(B3);labels.add(B4);labels.add(B5);labels.add(B6);labels.add(B7);labels.add(B8);labels.add(B9);labels.add(B10);
            labels.add(C1);labels.add(C2);labels.add(C3);labels.add(C4);labels.add(C5);labels.add(C6);labels.add(C7);labels.add(C8);labels.add(C9);labels.add(C10);
            labels.add(D1);labels.add(D2);labels.add(D3);labels.add(D4);labels.add(D5);labels.add(D6);labels.add(D7);labels.add(D8);labels.add(D9);labels.add(D10);
            labels.add(E1);labels.add(E2);labels.add(E3);labels.add(E4);labels.add(E5);labels.add(E6);labels.add(E7);labels.add(E8);labels.add(E9);labels.add(E10);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                isPurble[i][j] = false;
                isRed[i][j] = false;
            }
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        initializeSeatsStatus();
//        Thread t = new Thread(new Runnable(){
//            @Override
//            public void run(){
//                while(true){
//                    refreshSeatsStatus();
//                }
//            }
//        });
//        t.start();
    }
    
    public void initializeSeatsStatus(){
        ImageIcon RedSeat = new ImageIcon("src\\res\\seatRed.png");
        ImageIcon BlackSeat = new ImageIcon("src\\res\\seatBlack.png");
        String SHOWTIME = go.createShowtimeID(movie.getMovieShowTimesList().get(showtime));
        for(int i = 0 ; i < labels.size() ; i++){
            String s1 = labels.get(i).getName().substring(0 , 1);
            String s2 = labels.get(i).getName().substring(1);
            String seatID = s2+s1;
            Ticket ticket = (Ticket)go.load("Ticket",movie.getMovieTicketsMap().get(SHOWTIME+seatID));
            int I = Integer.valueOf(s2) - 1 , J; 
            if(s1.equals("A")){J=0;}else if(s1.equals("B")){J=1;}else if(s1.equals("C")){J=2;}else if(s1.equals("D")){J=3;}else{J=4;}
            if(ticket.getTicketSeatStatus()){
                labels.get(i).setIcon(RedSeat);
                isRed[J][I] = true;
            }else{
                labels.get(i).setIcon(BlackSeat);
                isRed[J][I] = false;
            }
                
        }
    }
    
    public synchronized void refreshSeatsStatus(){
        ImageIcon imageIconBlack = new ImageIcon("src\\res\\seatBlack.png");
        String SHOWTIME = go.createShowtimeID(movie.getMovieShowTimesList().get(showtime));
        for(int i = 0 ; i < labels.size() ; i++){
            String s1 = labels.get(i).getName().substring(0 , 1);
            String s2 = labels.get(i).getName().substring(1);
            String seatID = s2+s1;
            Object object = go.load("Ticket",movie.getMovieTicketsMap().get(SHOWTIME + seatID));
            Ticket ticket = (Ticket)object;
            if(ticket.getTicketSeatStatus()){
                //labels.get(i).setIcon(imageIconRed);
                int I = Integer.valueOf(s2) - 1 , J; 
                if(s1.equals("A")){J=0;}else if(s1.equals("B")){J=1;}else if(s1.equals("C")){J=2;}else if(s1.equals("D")){J=3;}else{J=4;}
                isRed[J][I] = true;
            }else{
                int I = Integer.valueOf(s2) - 1 , J; 
                if(s1.equals("A")){J=0;}else if(s1.equals("B")){J=1;}else if(s1.equals("C")){J=2;}else if(s1.equals("D")){J=3;}else{J=4;}
                if(!isPurble[J][I]){
                    labels.get(i).setIcon(imageIconBlack);                    
                }
            }
        }
        try{
            Thread.sleep(250);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        E1 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        A5 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        A7 = new javax.swing.JLabel();
        E8 = new javax.swing.JLabel();
        D8 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        A8 = new javax.swing.JLabel();
        E9 = new javax.swing.JLabel();
        D9 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        A9 = new javax.swing.JLabel();
        E10 = new javax.swing.JLabel();
        D10 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        B10 = new javax.swing.JLabel();
        A10 = new javax.swing.JLabel();
        panBook = new javax.swing.JPanel();
        lblBook = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        lblresult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E1MouseClicked(evt);
            }
        });

        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
        });

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E2MouseClicked(evt);
            }
        });

        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D2MouseClicked(evt);
            }
        });

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });

        E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E3MouseClicked(evt);
            }
        });

        D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D3MouseClicked(evt);
            }
        });

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });

        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });

        E4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E4MouseClicked(evt);
            }
        });

        D4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D4MouseClicked(evt);
            }
        });

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C4MouseClicked(evt);
            }
        });

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });

        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
        });

        E5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E5MouseClicked(evt);
            }
        });

        D5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D5MouseClicked(evt);
            }
        });

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C5MouseClicked(evt);
            }
        });

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });

        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
        });

        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E6MouseClicked(evt);
            }
        });

        D6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D6MouseClicked(evt);
            }
        });

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
        });

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });

        A6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A6MouseClicked(evt);
            }
        });

        E7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E7MouseClicked(evt);
            }
        });

        D7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D7MouseClicked(evt);
            }
        });

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
        });

        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });

        A7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A7MouseClicked(evt);
            }
        });

        E8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E8MouseClicked(evt);
            }
        });

        D8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D8MouseClicked(evt);
            }
        });

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
        });

        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });

        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A8MouseClicked(evt);
            }
        });

        E9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E9MouseClicked(evt);
            }
        });

        D9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D9MouseClicked(evt);
            }
        });

        C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C9MouseClicked(evt);
            }
        });

        B9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
        });

        A9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A9MouseClicked(evt);
            }
        });

        E10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        E10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E10MouseClicked(evt);
            }
        });

        D10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        D10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D10MouseClicked(evt);
            }
        });

        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        C10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C10MouseClicked(evt);
            }
        });

        B10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        B10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B10MouseClicked(evt);
            }
        });

        A10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/seatBlack.png"))); // NOI18N
        A10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A10MouseClicked(evt);
            }
        });

        panBook.setBackground(new java.awt.Color(255, 255, 255));
        panBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255), 3));
        panBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panBookMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panBookMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panBookMouseEntered(evt);
            }
        });

        lblBook.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblBook.setText("book");
        lblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBookMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBookMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panBookLayout = new javax.swing.GroupLayout(panBook);
        panBook.setLayout(panBookLayout);
        panBookLayout.setHorizontalGroup(
            panBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(lblBook, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panBookLayout.setVerticalGroup(
            panBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("choos seats to book ");

        panExit.setBackground(new java.awt.Color(255, 255, 255));
        panExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panExitMouseExited(evt);
            }
        });

        lblExit.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblExit.setText("x");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panExitLayout = new javax.swing.GroupLayout(panExit);
        panExit.setLayout(panExitLayout);
        panExitLayout.setHorizontalGroup(
            panExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panExitLayout.setVerticalGroup(
            panExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExitLayout.createSequentialGroup()
                .addComponent(lblExit)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1)
                    .addComponent(B1)
                    .addComponent(C1)
                    .addComponent(D1)
                    .addComponent(E1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A2)
                    .addComponent(B2)
                    .addComponent(C2)
                    .addComponent(D2)
                    .addComponent(E2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A3)
                    .addComponent(B3)
                    .addComponent(C3)
                    .addComponent(D3)
                    .addComponent(E3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(276, 276, 276))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(panBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblresult, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A4)
                            .addComponent(B4)
                            .addComponent(C4)
                            .addComponent(D4)
                            .addComponent(E4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A5)
                            .addComponent(B5)
                            .addComponent(C5)
                            .addComponent(D5)
                            .addComponent(E5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A6)
                            .addComponent(B6)
                            .addComponent(C6)
                            .addComponent(D6)
                            .addComponent(E6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A7)
                            .addComponent(B7)
                            .addComponent(C7)
                            .addComponent(D7)
                            .addComponent(E7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A8)
                            .addComponent(B8)
                            .addComponent(C8)
                            .addComponent(D8)
                            .addComponent(E8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A9)
                            .addComponent(B9)
                            .addComponent(C9)
                            .addComponent(D9)
                            .addComponent(E9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A10)
                                    .addComponent(B10)
                                    .addComponent(C10))
                                .addContainerGap(171, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D10)
                                    .addComponent(E10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(E1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A1))))
                    .addComponent(panExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblresult, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void E1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E1MouseClicked
        //4,0//
//        ImageIcon imageIconBarble = new ImageIcon("src\\res\\seatBarble.png");
//        Object e1;
//        ImageIcon imageIconRed = new ImageIcon("src\\res\\seatRed.png"); 
//        boolean isEqual= E1.getIcon().equals(j.getIcon());
//        if(!isEqual){
//            E1.setIcon(imageIconBarble);
//            SeatIDs.add("E1");
//        }
        
    }//GEN-LAST:event_E1MouseClicked

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
        if(!isRed[3][0] && !isPurble[3][0]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D1.setIcon(imageIcon);
            SeatIDs.add("D1");
            isPurble[3][0] = true;
        }
    }//GEN-LAST:event_D1MouseClicked

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked
        if(!isRed[2][0] && !isPurble[2][0]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C1.setIcon(imageIcon);
            SeatIDs.add("C1");
            isPurble[2][0] = true;
        }else{
            
        }
    }//GEN-LAST:event_C1MouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        if(!isRed[1][0] && !isPurble[1][0]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B1.setIcon(imageIcon);
            SeatIDs.add("B1");
            isPurble[1][0] = true;
        }else{
            
        }
    }//GEN-LAST:event_B1MouseClicked

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        if(!isRed[0][0] && !isPurble[0][0]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A1.setIcon(imageIcon);
            SeatIDs.add("A1");
            isPurble[0][0] = true;
        }else{
            
        }
    }//GEN-LAST:event_A1MouseClicked

    private void E2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E2MouseClicked
        if(!isRed[4][1] && !isPurble[4][1]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            E2.setIcon(imageIcon);
            SeatIDs.add("E2");
            isPurble[4][1] = true;
        }else{
            
        }
    }//GEN-LAST:event_E2MouseClicked

    private void D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseClicked
        if(!isRed[3][1] && !isPurble[3][1]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D2.setIcon(imageIcon);
            SeatIDs.add("D2");
            isPurble[3][1] = true;
        }else{
            
        }
    }//GEN-LAST:event_D2MouseClicked

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
        if(!isRed[2][1] && !isPurble[2][1]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C2.setIcon(imageIcon);
            SeatIDs.add("C2");
            isPurble[2][1] = true;
        }else{
            
        }
    }//GEN-LAST:event_C2MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        if(!isRed[1][1] && !isPurble[1][1]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B2.setIcon(imageIcon);
            SeatIDs.add("B2");
            isPurble[1][1] = true;
        }else{
            
        }
    }//GEN-LAST:event_B2MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        if(!isRed[0][1] && !isPurble[0][1]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A2.setIcon(imageIcon);
            SeatIDs.add("A2");
            isPurble[0][1] = true;
        }else{
            
        }
    }//GEN-LAST:event_A2MouseClicked

    private void E3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E3MouseClicked
        if(!isRed[4][2] && !isPurble[4][2]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            E3.setIcon(imageIcon);
            SeatIDs.add("E3");
            isPurble[4][2] = true;
        }else{
            
        }
    }//GEN-LAST:event_E3MouseClicked

    private void D3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseClicked
        if(!isRed[3][2] && !isPurble[3][2]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D3.setIcon(imageIcon);
            SeatIDs.add("D3");
            isPurble[3][2] = true;
        }else{
            
        }
    }//GEN-LAST:event_D3MouseClicked

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
        if(!isRed[2][2] && !isPurble[2][2]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C3.setIcon(imageIcon);
            SeatIDs.add("C3");
            isPurble[2][2] = true;
        }else{
            
        }
    }//GEN-LAST:event_C3MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        if(!isRed[1][2] && !isPurble[1][2]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B3.setIcon(imageIcon);
            SeatIDs.add("B3");
            isPurble[1][2] = true;
        }else{
            
        }
    }//GEN-LAST:event_B3MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        if(!isRed[0][2] && !isPurble[0][2]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A3.setIcon(imageIcon);
            SeatIDs.add("A3");
            isPurble[0][2] = true;
        }else{
            
        }
    }//GEN-LAST:event_A3MouseClicked

    private void E4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E4MouseClicked
        if(!isRed[4][3] && !isPurble[4][3]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            E4.setIcon(imageIcon);
            SeatIDs.add("E4");
            isPurble[4][3] = true;
        }else{
            
        }
    }//GEN-LAST:event_E4MouseClicked

    private void D4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D4MouseClicked
        if(!isRed[3][3] && !isPurble[3][3]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D4.setIcon(imageIcon);
            SeatIDs.add("D4");
            isPurble[3][3] = true;
        }else{
            
        }
    }//GEN-LAST:event_D4MouseClicked

    private void C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseClicked
        if(!isRed[2][3] && !isPurble[2][3]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C4.setIcon(imageIcon);
            SeatIDs.add("C4");
            isPurble[2][3] = true;
        }else{
            
        }
    }//GEN-LAST:event_C4MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        if(!isRed[1][3] && !isPurble[1][3]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B4.setIcon(imageIcon);
            SeatIDs.add("B4");
            isPurble[1][3] = true;
        }else{
            
        }
    }//GEN-LAST:event_B4MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked
        if(!isRed[0][3] && !isPurble[0][3]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A4.setIcon(imageIcon);
            SeatIDs.add("A4");
            isPurble[0][3] = true;
        }else{
            
        }
    }//GEN-LAST:event_A4MouseClicked

    private void E5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E5MouseClicked
        if(!isRed[4][4] && !isPurble[4][4]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            E5.setIcon(imageIcon);
            SeatIDs.add("E5");
            isPurble[4][4] = true;
        }else{
            
        }
    }//GEN-LAST:event_E5MouseClicked

    private void D5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseClicked
        if(!isRed[3][4] && !isPurble[3][4]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D5.setIcon(imageIcon);
            SeatIDs.add("D5");
            isPurble[3][4] = true;
        }else{
            
        }
    }//GEN-LAST:event_D5MouseClicked

    private void C5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseClicked
        if(!isRed[2][4] && !isPurble[2][4]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C5.setIcon(imageIcon);
            SeatIDs.add("C5");
            isPurble[2][4] = true;
        }else{
            
        }
    }//GEN-LAST:event_C5MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        if(!isRed[1][4] && !isPurble[1][4]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B5.setIcon(imageIcon);
            SeatIDs.add("B5");
            isPurble[1][4] = true;
        }else{
            
        }
    }//GEN-LAST:event_B5MouseClicked

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
        if(!isRed[0][4] && !isPurble[0][4]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A5.setIcon(imageIcon);
            SeatIDs.add("A5");
            isPurble[0][4] = true;
        }else{
            
        }
    }//GEN-LAST:event_A5MouseClicked

    private void E6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E6MouseClicked
        if(!isRed[4][5] && !isPurble[2][5]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            E6.setIcon(imageIcon);
            SeatIDs.add("E6");
            isPurble[4][5] = true;
        }else{
            
        }
    }//GEN-LAST:event_E6MouseClicked

    private void D6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseClicked
        if(!isRed[3][5] && !isPurble[3][5]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D6.setIcon(imageIcon);
            SeatIDs.add("D6");
            isPurble[3][5] = true;
        }else{
            
        }
    }//GEN-LAST:event_D6MouseClicked

    private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
        if(!isRed[2][5] && !isPurble[2][5]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C6.setIcon(imageIcon);
            SeatIDs.add("C6");
            isPurble[2][5] = true;
        }else{
            
        }
    }//GEN-LAST:event_C6MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        if(!isRed[1][5] && !isPurble[1][5]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B6.setIcon(imageIcon);
            SeatIDs.add("B6");
            isPurble[1][5] = true;
        }else{
            
        }
    }//GEN-LAST:event_B6MouseClicked

    private void A6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseClicked
        if(!isRed[0][5] && !isPurble[0][5]){    
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A6.setIcon(imageIcon);
            SeatIDs.add("A6");
            isPurble[0][5] = true;
        }else{
            
        }
    }//GEN-LAST:event_A6MouseClicked

    private void E7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E7MouseClicked
        if(!isRed[4][6] && !isPurble[4][6]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            E7.setIcon(imageIcon);
            SeatIDs.add("E7");
            isPurble[4][6] = true;
        }else{
            
        }
    }//GEN-LAST:event_E7MouseClicked

    private void D7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseClicked
        if(!isRed[3][6] && !isPurble[3][6]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D7.setIcon(imageIcon);
            SeatIDs.add("D7");
            isPurble[3][6] = true;
        }else{
            
        }
    }//GEN-LAST:event_D7MouseClicked

    private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
        if(!isRed[2][6] && !isPurble[2][6]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C7.setIcon(imageIcon);
            SeatIDs.add("C7");
            isPurble[2][6] = true;
        }else{
            
        }
    }//GEN-LAST:event_C7MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        if(!isRed[1][6] && !isPurble[1][6]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B7.setIcon(imageIcon);
            SeatIDs.add("B7");
            isPurble[1][6] = true;
        }else{
            
        }
    }//GEN-LAST:event_B7MouseClicked

    private void A7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseClicked
        if(!isRed[0][6] && !isPurble[0][6]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A7.setIcon(imageIcon);
            SeatIDs.add("A7");
            isPurble[0][6] = true;
        }else{
            
        }
    }//GEN-LAST:event_A7MouseClicked

    private void E8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E8MouseClicked
        if(!isRed[4][7] && !isPurble[4][7]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            E8.setIcon(imageIcon);
            SeatIDs.add("E8");
            isPurble[4][7] = true;
        }else{
            
        }
    }//GEN-LAST:event_E8MouseClicked

    private void D8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D8MouseClicked
        if(!isRed[3][7] && !isPurble[3][7]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D8.setIcon(imageIcon);
            SeatIDs.add("D8");
            isPurble[3][7] = true;
        }else{
            
        }
    }//GEN-LAST:event_D8MouseClicked

    private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
        if(!isRed[2][7] && !isPurble[2][7]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C8.setIcon(imageIcon);
            SeatIDs.add("C8");
            isPurble[2][7] = true;
        }else{
            
        }
    }//GEN-LAST:event_C8MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        if(!isRed[1][7] && !isPurble[1][7]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B8.setIcon(imageIcon);
            SeatIDs.add("B8");
            isPurble[1][7] = true;
        }else{
            
        }
    }//GEN-LAST:event_B8MouseClicked

    private void A8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseClicked
        if(!isRed[0][7] && !isPurble[0][7]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A8.setIcon(imageIcon);
            SeatIDs.add("A8");
            isPurble[0][7] = true;
        }else{
            
        }
    }//GEN-LAST:event_A8MouseClicked

    private void E9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E9MouseClicked
        if(!isRed[4][8] && !isPurble[4][8]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            E9.setIcon(imageIcon);
            SeatIDs.add("E9");
            isPurble[4][8] = true;
        }else{
            
        }
    }//GEN-LAST:event_E9MouseClicked

    private void D9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D9MouseClicked
        if(!isRed[3][8] && !isPurble[3][8]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D9.setIcon(imageIcon);
            SeatIDs.add("D9");
            isPurble[3][8] = true;
        }else{
            
        }
    }//GEN-LAST:event_D9MouseClicked

    private void C9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C9MouseClicked
        if(!isRed[2][8] && !isPurble[2][8]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C9.setIcon(imageIcon);
            SeatIDs.add("C9");
            isPurble[2][8] = true;
        }else{
            
        }
    }//GEN-LAST:event_C9MouseClicked

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
        if(!isRed[1][8] && !isPurble[1][8]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B9.setIcon(imageIcon);
            SeatIDs.add("B9");
            isPurble[1][8] = true;
        }else{
            
        }
    }//GEN-LAST:event_B9MouseClicked

    private void A9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A9MouseClicked
        if(!isRed[0][8] && !isPurble[0][8]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A9.setIcon(imageIcon);
            SeatIDs.add("A9");
            isPurble[0][8] = true;
        }else{
            
        }
    }//GEN-LAST:event_A9MouseClicked

    private void E10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E10MouseClicked
        if(!isRed[4][9] && !isPurble[4][9]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            E10.setIcon(imageIcon);
            SeatIDs.add("E10");
            isPurble[4][9] = true;
        }else{
            
        }
    }//GEN-LAST:event_E10MouseClicked

    private void D10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D10MouseClicked
        if(!isRed[3][9] && !isPurble[3][9]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            D10.setIcon(imageIcon);
            SeatIDs.add("D10");
            isPurble[3][9] = true;
        }else{
            
        }
    }//GEN-LAST:event_D10MouseClicked

    private void C10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseClicked
        if(!isRed[2][9] && !isPurble[2][9]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            C10.setIcon(imageIcon);
            SeatIDs.add("C10");
            isPurble[2][9] = true;
        }else{
            
        }
    }//GEN-LAST:event_C10MouseClicked

    private void B10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B10MouseClicked
        if(!isRed[1][9] && !isPurble[1][9]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            B10.setIcon(imageIcon);
            SeatIDs.add("B10");
            isPurble[1][9] = true;
        }else{
            
        }
    }//GEN-LAST:event_B10MouseClicked

    private void A10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A10MouseClicked
        if(!isRed[0][9] && !isPurble[0][9]){
            ImageIcon imageIcon = new ImageIcon("src\\res\\seatBarble.png");
            A10.setIcon(imageIcon);
            SeatIDs.add("A10");
            isPurble[0][9] = true;
        }else{
            
        }
    }//GEN-LAST:event_A10MouseClicked

    private void panBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBookMouseEntered
        panBook.setBackground(new Color (153,0,255));
        lblBook.setForeground(Color.WHITE);
    }//GEN-LAST:event_panBookMouseEntered

    private void lblBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookMouseEntered
        panBook.setBackground(new Color (153,0,255));
        lblBook.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblBookMouseEntered

    private void panBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBookMouseExited
        panBook.setBackground(Color.WHITE);
        lblBook.setForeground(Color.BLACK);
    }//GEN-LAST:event_panBookMouseExited

    private void lblBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookMouseExited
        panBook.setBackground(Color.WHITE);
        lblBook.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblBookMouseExited

    private void panExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseEntered
        panExit.setBackground(new Color(153,0,255));
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_panExitMouseEntered

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void panExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_panExitMouseClicked

    private void panExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseExited
        panExit.setBackground(Color.WHITE);
        lblExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_panExitMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        panExit.setBackground(new Color(153,0,255));
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        panExit.setBackground(Color.WHITE);
        lblExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookMouseClicked
        
    }//GEN-LAST:event_lblBookMouseClicked

    private void panBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBookMouseClicked
        if(SeatIDs.isEmpty()){
            lblresult.setForeground(new Color(255,102,102));
            lblresult.setText("Please Choose A Place To Book!");
            return;
        }
        ArrayList<String> SeatsLabelsNames = SeatIDs;
        String SHOWTIME = go.createShowtimeID(movie.getMovieShowTimesList().get(showtime));
        for(int i = 0 ; i < SeatIDs.size() ; i++){
            String s1 = SeatIDs.get(i).substring(0 , 1);
            String s2 = SeatIDs.get(i).substring(1);
            SeatIDs.set(i, (s2+s1));
        }
        
        ArrayList<Ticket> tickets = new ArrayList<>();
        for(int i = 0 ; i < SeatIDs.size() ; i++){
            Ticket ticket = (Ticket)go.load("Ticket" , movie.getMovieTicketsMap().get(SHOWTIME + SeatIDs.get(i)));
            tickets.add(ticket);
        }
        Ticketing.bookTicket(tickets);
        
        ImageIcon RedSeat = new ImageIcon("src\\res\\seatRed.png");
        for(int i = 0 ; i < SeatsLabelsNames.size() ; i++){
            String s1 = SeatsLabelsNames.get(i).substring(0 , 1);
            String s2 = SeatsLabelsNames.get(i).substring(1);
            int I = Integer.valueOf(s2) - 1 , J; 
            if(s1.equals("A")){J=0;}else if(s1.equals("B")){J=1;}else if(s1.equals("C")){J=2;}else if(s1.equals("D")){J=3;}else{J=4;}
            isRed[J][I] = true;
        }
        for(int i = 0 ; i < labels.size() ; i++){
            String ss1 = labels.get(i).getName().substring(0 , 1);
            String ss2 = labels.get(i).getName().substring(1);
            int II = Integer.valueOf(ss2) - 1 , JJ; 
            if(ss1.equals("A")){JJ=0;}else if(ss1.equals("B")){JJ=1;}else if(ss1.equals("C")){JJ=2;}else if(ss1.equals("D")){JJ=3;}else{JJ=4;}
                if(isRed[JJ][II]){
                    labels.get(i).setIcon(RedSeat);
                }
        }
    }//GEN-LAST:event_panBookMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(booked_ticket_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(booked_ticket_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(booked_ticket_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(booked_ticket_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new booked_ticket_form().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A10;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel A5;
    private javax.swing.JLabel A6;
    private javax.swing.JLabel A7;
    private javax.swing.JLabel A8;
    private javax.swing.JLabel A9;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B10;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel C9;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D10;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel D8;
    private javax.swing.JLabel D9;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E10;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JLabel E8;
    private javax.swing.JLabel E9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblresult;
    private javax.swing.JPanel panBook;
    private javax.swing.JPanel panExit;
    // End of variables declaration//GEN-END:variables
}
