package Interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Action.go;
import MainPackage.User;
import java.awt.Color;

/**
 *
 * @author Ali
 */
public class sign_up_form extends javax.swing.JFrame {

  /**
   * Creates new form sign_up_form
   */
  public sign_up_form() {
    sittings();
    initComponents();
    this.setVisible(true);
  }

  private void sittings() {
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
      java.util.logging.Logger.getLogger(sign_up_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(sign_up_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(sign_up_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(sign_up_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
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
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        untxt = new javax.swing.JTextField();
        adrtxt = new javax.swing.JTextField();
        pwtxt = new javax.swing.JPasswordField();
        confirmpwtxt = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panButton = new javax.swing.JPanel();
        lblButton = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        panExit = new javax.swing.JPanel();
        panExit1 = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        lblClickHere = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signintxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(251, 251, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/signUpImg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(4, 15, 22));

        untxt.setBackground(new java.awt.Color(4, 15, 22));
        untxt.setForeground(new java.awt.Color(255, 255, 255));
        untxt.setBorder(null);
        untxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                untxtMouseClicked(evt);
            }
        });
        untxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                untxtActionPerformed(evt);
            }
        });

        adrtxt.setBackground(new java.awt.Color(4, 15, 22));
        adrtxt.setForeground(new java.awt.Color(251, 251, 255));
        adrtxt.setBorder(null);
        adrtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adrtxtMouseClicked(evt);
            }
        });
        adrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrtxtActionPerformed(evt);
            }
        });

        pwtxt.setBackground(new java.awt.Color(4, 15, 22));
        pwtxt.setForeground(new java.awt.Color(251, 251, 255));
        pwtxt.setBorder(null);
        pwtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwtxtMouseClicked(evt);
            }
        });

        confirmpwtxt.setBackground(new java.awt.Color(4, 15, 22));
        confirmpwtxt.setForeground(new java.awt.Color(251, 251, 255));
        confirmpwtxt.setToolTipText("");
        confirmpwtxt.setBorder(null);
        confirmpwtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmpwtxtMouseClicked(evt);
            }
        });
        confirmpwtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpwtxtActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/home.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/openLock.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        panButton.setBackground(new java.awt.Color(4, 15, 22));
        panButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 251, 255), 3));
        panButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panButtonMouseExited(evt);
            }
        });

        lblButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblButton.setForeground(new java.awt.Color(251, 251, 255));
        lblButton.setText("Sign Up");
        lblButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panButtonLayout = new javax.swing.GroupLayout(panButton);
        panButton.setLayout(panButtonLayout);
        panButtonLayout.setHorizontalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panButtonLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(lblButton)
                .addGap(49, 49, 49))
        );
        panButtonLayout.setVerticalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panButtonLayout.createSequentialGroup()
                .addComponent(lblButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/SignUp.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("already have an account ?");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        lblConfirmPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblConfirmPassword.setText("Confirm Password");

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username");
        lblUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsernameMouseClicked(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address");

        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        panExit.setBackground(new java.awt.Color(4, 15, 22));
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

        panExit1.setBackground(new java.awt.Color(4, 15, 22));
        panExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panExit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panExit1MouseExited(evt);
            }
        });

        lblExit.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("x");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout panExit1Layout = new javax.swing.GroupLayout(panExit1);
        panExit1.setLayout(panExit1Layout);
        panExit1Layout.setHorizontalGroup(
            panExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExit1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panExit1Layout.setVerticalGroup(
            panExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExit1Layout.createSequentialGroup()
                .addComponent(lblExit)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panExitLayout = new javax.swing.GroupLayout(panExit);
        panExit.setLayout(panExitLayout);
        panExitLayout.setHorizontalGroup(
            panExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panExitLayout.setVerticalGroup(
            panExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExitLayout.createSequentialGroup()
                .addComponent(panExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblClickHere.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClickHere.setForeground(new java.awt.Color(255, 255, 255));
        lblClickHere.setText("Login");
        lblClickHere.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClickHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClickHereMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClickHereMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClickHereMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/openLock.png"))); // NOI18N
        jLabel6.setText("jLabel4");

        signintxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signintxt.setForeground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(adrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(untxt, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblUsername))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(confirmpwtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(pwtxt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblPassword))
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(lblClickHere, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(signintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addComponent(panExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(untxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmpwtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirmPassword))
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(panButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClickHere))
                .addGap(72, 72, 72))
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

    private void untxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_untxtActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_untxtActionPerformed

    private void confirmpwtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpwtxtActionPerformed

    }//GEN-LAST:event_confirmpwtxtActionPerformed

    private void adrtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrtxtActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_adrtxtActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

    }//GEN-LAST:event_jLabel9MouseClicked

    private void confirmpwtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmpwtxtMouseClicked
      lblConfirmPassword.setText(" ");
      lblUsername.setText("Username");
      lblAddress.setText("Address");
      lblPassword.setText("Password");
    }//GEN-LAST:event_confirmpwtxtMouseClicked

    private void lblUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsernameMouseClicked

    }//GEN-LAST:event_lblUsernameMouseClicked

    private void untxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_untxtMouseClicked
      lblUsername.setText(" ");
      lblAddress.setText("Address");
      lblPassword.setText("Password");
      lblConfirmPassword.setText("Confirm Password");
    }//GEN-LAST:event_untxtMouseClicked

    private void adrtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adrtxtMouseClicked
      lblAddress.setText(" ");
      lblUsername.setText("Username");
      lblPassword.setText("Password");
      lblConfirmPassword.setText("Confirm Password");
    }//GEN-LAST:event_adrtxtMouseClicked

    private void panExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseEntered
      panExit.setForeground(new Color(153, 0, 255));
    }//GEN-LAST:event_panExitMouseEntered

    private void panExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseExited
      panExit.setForeground(new Color(4, 15, 22));
    }//GEN-LAST:event_panExitMouseExited

    private void panExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseClicked
      System.exit(0);
    }//GEN-LAST:event_panExitMouseClicked

    private void panButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panButtonMouseEntered
      panButton.setBackground(new Color(153, 0, 255));
      lblButton.setForeground(new Color(4, 15, 22));
    }//GEN-LAST:event_panButtonMouseEntered

    private void panButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panButtonMouseExited
      panButton.setBackground(new Color(4, 15, 22));
      lblButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_panButtonMouseExited

    private void pwtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwtxtMouseClicked
      lblPassword.setText(" ");
      lblConfirmPassword.setText("Confirm Password");
      lblUsername.setText("Username");
      lblAddress.setText("Address");
    }//GEN-LAST:event_pwtxtMouseClicked

    private void lblClickHereMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClickHereMouseEntered
      lblClickHere.setForeground(new Color(153, 0, 255));
    }//GEN-LAST:event_lblClickHereMouseEntered

    private void lblClickHereMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClickHereMouseExited
      lblClickHere.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblClickHereMouseExited

  private void panButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panButtonMouseClicked
    String password = new String(pwtxt.getPassword());
    String confirmPassword = new String(confirmpwtxt.getPassword());
    if(untxt.getText().isEmpty() || adrtxt.getText().isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            //Fields Shouldn't be Empty
            signintxt.setForeground(new Color(255, 102, 102));
            signintxt.setText("Please Don't Leave Empty Fields!");
    }else{
        if (!password.equals(confirmPassword)){
            //password should equals confirm password
            signintxt.setForeground(new Color(255, 102, 102));
            signintxt.setText("Your Password Confirm is incorrect");
            return;
        }else{
            if(go.isUsernameTaken(untxt.getText())){
                //username shouldn't be taken from other user
                signintxt.setForeground(new Color(255, 102, 102));
                signintxt.setText(untxt.getText() + " username is taken!");
            }else{
                //create an account
                User user = new User(untxt.getText() , password , adrtxt.getText());
                signintxt.setForeground(new Color(51, 204, 0));
                signintxt.setText("Your account has been created");
            }
        }
    }
  }//GEN-LAST:event_panButtonMouseClicked

  private void lblClickHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClickHereMouseClicked
    new LoginScreen();
    this.dispose();
  }//GEN-LAST:event_lblClickHereMouseClicked

    private void lblButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonMouseClicked
    String password = new String(pwtxt.getPassword());
    String confirmPassword = new String(confirmpwtxt.getPassword());
    if(untxt.getText().isEmpty() || adrtxt.getText().isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            //Fields Shouldn't be Empty
            signintxt.setForeground(new Color(255, 102, 102));
            signintxt.setText("Please Don't Leave Empty Fields!");
    }else{
        if (!password.equals(confirmPassword)){
            //password should equals confirm password
            signintxt.setForeground(new Color(255, 102, 102));
            signintxt.setText("Your Password Confirm is incorrect");
            return;
        }else{
            if(go.isUsernameTaken(untxt.getText())){
                //username shouldn't be taken from other user
                signintxt.setForeground(new Color(255, 102, 102));
                signintxt.setText(untxt.getText() + " username is taken!");
            }else{
                //create an account
                User user = new User(untxt.getText() , password , adrtxt.getText());
                signintxt.setForeground(new Color(51, 204, 0));
                signintxt.setText("Your account has been created");
            }
        }
    }
    }//GEN-LAST:event_lblButtonMouseClicked

    private void lblButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonMouseEntered
      panButton.setBackground(new Color(153, 0, 255));
      lblButton.setForeground(new Color(4, 15, 22));
    }//GEN-LAST:event_lblButtonMouseEntered

    private void lblButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonMouseExited
      panButton.setBackground(new Color(4, 15, 22));
      lblButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblButtonMouseExited

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        panExit1.setBackground(new Color(153,0,255));
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        panExit1.setBackground(new Color(4,15,22));
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseExited

    private void panExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_panExit1MouseClicked

    private void panExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExit1MouseEntered
        panExit1.setBackground(new Color(153,0,255));
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_panExit1MouseEntered

    private void panExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExit1MouseExited
        panExit1.setBackground(new Color(4,15,22));
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_panExit1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adrtxt;
    private javax.swing.JPasswordField confirmpwtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblButton;
    private javax.swing.JLabel lblClickHere;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panButton;
    private javax.swing.JPanel panExit;
    private javax.swing.JPanel panExit1;
    private javax.swing.JPasswordField pwtxt;
    private javax.swing.JLabel signintxt;
    private javax.swing.JTextField untxt;
    // End of variables declaration//GEN-END:variables

}
