/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;

/**
 *
 * @author gtx
 */
public class user_account_form extends javax.swing.JFrame {

    /**
     * Creates new form user_account_form
     */
    public user_account_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    panExit = new javax.swing.JPanel();
    lblExit = new javax.swing.JLabel();
    panClick = new javax.swing.JPanel();
    lblClick = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    lblUserNAme = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    panClick1 = new javax.swing.JPanel();
    lblClick1 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    jLabel19 = new javax.swing.JLabel();
    jLabel22 = new javax.swing.JLabel();
    jLabel23 = new javax.swing.JLabel();
    jLabel24 = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    jLabel26 = new javax.swing.JLabel();
    jLabel27 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);

    jPanel2.setBackground(new java.awt.Color(153, 0, 255));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 124, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );

    jPanel3.setBackground(new java.awt.Color(251, 251, 255));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel1.setText("Address :");

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel2.setText("Booked Tickets");

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel3.setText("Account ID  :");

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Ali UserImage3.png"))); // NOI18N

    panExit.setBackground(new java.awt.Color(251, 251, 255));
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

    lblExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    lblExit.setText("x");
    lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lblExitMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lblExitMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lblExitMouseExited(evt);
      }
    });

    javax.swing.GroupLayout panExitLayout = new javax.swing.GroupLayout(panExit);
    panExit.setLayout(panExitLayout);
    panExitLayout.setHorizontalGroup(
      panExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panExitLayout.createSequentialGroup()
        .addContainerGap(16, Short.MAX_VALUE)
        .addComponent(lblExit)
        .addContainerGap())
    );
    panExitLayout.setVerticalGroup(
      panExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panExitLayout.createSequentialGroup()
        .addComponent(lblExit)
        .addGap(0, 8, Short.MAX_VALUE))
    );

    panClick.setBackground(new java.awt.Color(251, 251, 255));
    panClick.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255), 3));
    panClick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    panClick.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        panClickMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        panClickMouseExited(evt);
      }
    });

    lblClick.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    lblClick.setText("to see my tickets ");
    lblClick.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lblClickMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lblClickMouseExited(evt);
      }
    });

    javax.swing.GroupLayout panClickLayout = new javax.swing.GroupLayout(panClick);
    panClick.setLayout(panClickLayout);
    panClickLayout.setHorizontalGroup(
      panClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panClickLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblClick)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panClickLayout.setVerticalGroup(
      panClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panClickLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblClick)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel6.setFont(new java.awt.Font("Stencil", 2, 100)); // NOI18N
    jLabel6.setText("5");

    jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel7.setText("Jaramana");

    lblUserNAme.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
    lblUserNAme.setText("Ali Almusfi");

    jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel9.setText("192.175.3");

    panClick1.setBackground(new java.awt.Color(251, 251, 255));
    panClick1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255), 3));
    panClick1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    panClick1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        panClick1MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        panClick1MouseExited(evt);
      }
    });

    lblClick1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    lblClick1.setText("Cancel Ticket");
    lblClick1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lblClick1MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lblClick1MouseExited(evt);
      }
    });

    javax.swing.GroupLayout panClick1Layout = new javax.swing.GroupLayout(panClick1);
    panClick1.setLayout(panClick1Layout);
    panClick1Layout.setHorizontalGroup(
      panClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panClick1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblClick1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panClick1Layout.setVerticalGroup(
      panClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panClick1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblClick1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tape1.png"))); // NOI18N

    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/filming1.png"))); // NOI18N

    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/glasses.png"))); // NOI18N

    jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/drink.png"))); // NOI18N

    jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tablet.png"))); // NOI18N

    jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tape2.png"))); // NOI18N

    jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tape2B.png"))); // NOI18N

    jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/filming3.png"))); // NOI18N

    jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tape1.png"))); // NOI18N

    jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Popcorn.png"))); // NOI18N
    jLabel19.setText("jLabel19");

    jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tablet.png"))); // NOI18N

    jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/filming2.png"))); // NOI18N

    jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tape2.png"))); // NOI18N

    jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/filming2.png"))); // NOI18N
    jLabel25.setText("jLabel19");

    jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Popcorn.png"))); // NOI18N

    jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/clipart1.png"))); // NOI18N

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(48, 48, 48)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel3)
                  .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel7)
                  .addComponent(jLabel9)))
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(62, 62, 62)
            .addComponent(panClick1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 524, Short.MAX_VALUE)
        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(panClick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(44, 44, 44))
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(196, 196, 196)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)))
            .addComponent(jLabel4)
            .addGap(71, 71, 71))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(105, 105, 105)
            .addComponent(lblUserNAme)
            .addGap(137, 137, 137)))
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(51, 51, 51)
            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(82, 82, 82))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(89, 89, 89)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(23, 23, 23))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259)
                .addComponent(panExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel17)))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(53, 53, 53)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(55, 55, 55))))
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addComponent(panExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
                .addGap(30, 30, 30))))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(223, 223, 223))))
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addComponent(jLabel4))
          .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
              .addGap(198, 198, 198)
              .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(48, 48, 48)
              .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
              .addContainerGap()
              .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(88, 88, 88)
                  .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(53, 53, 53)
                  .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(39, 39, 39)
                  .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(63, 63, 63)
        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
        .addComponent(jLabel27)
        .addGap(65, 65, 65)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(panClick1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGap(55, 55, 55))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addComponent(lblUserNAme, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(400, 400, 400))))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void panExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseEntered
        panExit.setBackground(new Color(153,0,255));
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_panExitMouseEntered

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void panExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseExited
        panExit.setBackground(new Color(251,251,255));
        lblExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_panExitMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        panExit.setBackground(new Color(153,0,255));
        lblExit.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_lblExitMouseEntered

    private void panClickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panClickMouseEntered
        panClick.setBackground(new Color(153,0,255));
        lblClick.setForeground(Color.WHITE);
    }//GEN-LAST:event_panClickMouseEntered

    private void panClickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panClickMouseExited
        panClick.setBackground(new Color(251,251,255));
        lblClick.setForeground(Color.BLACK);
    }//GEN-LAST:event_panClickMouseExited

    private void panExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panExitMouseClicked

    private void lblClickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClickMouseEntered
        lblClick.setForeground(Color.white);
        panClick.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_lblClickMouseEntered

    private void lblClickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClickMouseExited
        lblClick.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblClickMouseExited

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblClick1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClick1MouseEntered
        lblClick1.setForeground(Color.white);
        panClick1.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_lblClick1MouseEntered

    private void lblClick1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClick1MouseExited
        panClick1.setBackground(new Color(251,251,255));
        lblClick1.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblClick1MouseExited

    private void panClick1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panClick1MouseEntered
        lblClick1.setForeground(Color.white);
        panClick1.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_panClick1MouseEntered

    private void panClick1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panClick1MouseExited
        panClick1.setBackground(new Color(251,251,255));
        lblClick1.setForeground(Color.BLACK);
    }//GEN-LAST:event_panClick1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(user_account_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_account_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_account_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_account_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_account_form().setVisible(true);
            }
        });
    }
    

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel27;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JLabel lblClick;
  private javax.swing.JLabel lblClick1;
  private javax.swing.JLabel lblExit;
  public static javax.swing.JLabel lblUserNAme;
  private javax.swing.JPanel panClick;
  private javax.swing.JPanel panClick1;
  private javax.swing.JPanel panExit;
  // End of variables declaration//GEN-END:variables
}
