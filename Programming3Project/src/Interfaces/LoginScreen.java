package Interfaces;


import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Obaida
 */
public class LoginScreen extends javax.swing.JFrame {

  /**
   * Creates new form LoginScreen
   */
  public LoginScreen() {
    setting();
    initComponents();
    this.setVisible(true);
    shownpw.setVisible(false);
    shownpw.setEnabled(false);
    hidenpw.setVisible(true);
    hidenpw.setEnabled(true);

  }

  public void setting(){
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
      java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        Layered = new javax.swing.JLayeredPane();
        loginPanel = new javax.swing.JPanel();
        txtun = new javax.swing.JTextField();
        usLable = new javax.swing.JLabel();
        unLine = new javax.swing.JLabel();
        txtpw = new javax.swing.JPasswordField();
        pwLable = new javax.swing.JLabel();
        pwLine = new javax.swing.JLabel();
        shownpw = new javax.swing.JLabel();
        hidenpw = new javax.swing.JLabel();
        wrongLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCreateAccont = new javax.swing.JLabel();
        panButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panExit = new javax.swing.JPanel();
        exitButton = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        photoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(4, 15, 19));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtun.setFont(usLable.getFont());
        txtun.setForeground(new java.awt.Color(255, 255, 255));
        txtun.setBorder(null);
        txtun.setCaretColor(new java.awt.Color(255, 255, 255));
        txtun.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunActionPerformed(evt);
            }
        });
        loginPanel.add(txtun, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 310, 20));

        usLable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        usLable.setForeground(new java.awt.Color(255, 255, 255));
        usLable.setText("Username");
        loginPanel.add(usLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        unLine.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        unLine.setForeground(new java.awt.Color(255, 255, 255));
        unLine.setText("____________________________________________");
        loginPanel.add(unLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 320, 20));

        txtpw.setFont(pwLable.getFont());
        txtpw.setForeground(new java.awt.Color(255, 255, 255));
        txtpw.setBorder(null);
        txtpw.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpw.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loginPanel.add(txtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 310, 20));

        pwLable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        pwLable.setForeground(new java.awt.Color(255, 255, 255));
        pwLable.setText("Password");
        loginPanel.add(pwLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        pwLine.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pwLine.setForeground(new java.awt.Color(255, 255, 255));
        pwLine.setText("____________________________________________");
        pwLine.setPreferredSize(new java.awt.Dimension(200, 17));
        loginPanel.add(pwLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 310, -1));

        shownpw.setBackground(new Color(0,0,0,0));
        shownpw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/EyeShow.png"))); // NOI18N
        shownpw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shownpw.setOpaque(true);
        shownpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shownpwMouseClicked(evt);
            }
        });
        loginPanel.add(shownpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 25, 25));

    txtun.setBackground(new Color(0,0,0,1));
    txtun.setFont(usLable.getFont());
    txtun.setForeground(new java.awt.Color(255, 255, 255));
    txtun.setBorder(null);
    txtun.setCaretColor(new java.awt.Color(255, 255, 255));
    txtun.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    txtun.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtunActionPerformed(evt);
      }
    });
    loginPanel.add(txtun, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 190, 170, 20));
        hidenpw.setBackground(new Color(0,0,0,0));
        hidenpw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/EyeHide.png"))); // NOI18N
        hidenpw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hidenpw.setOpaque(true);
        hidenpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidenpwMouseClicked(evt);
            }
        });
        loginPanel.add(hidenpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 25, 25));

        wrongLogin.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        wrongLogin.setForeground(new java.awt.Color(255, 102, 102));
        loginPanel.add(wrongLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 30));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("you don't have accont ??");
        loginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 140, 20));

    txtpw.setBackground(new Color(0,0,0,1));
    txtpw.setFont(pwLable.getFont());
    txtpw.setForeground(new java.awt.Color(255, 255, 255));
    txtpw.setBorder(null);
    txtpw.setCaretColor(new java.awt.Color(255, 255, 255));
    txtpw.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    loginPanel.add(txtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 240, 170, 20));
        lblCreateAccont.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateAccont.setText("Create Account ");
        lblCreateAccont.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreateAccont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreateAccontMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreateAccontMouseExited(evt);
            }
        });
        loginPanel.add(lblCreateAccont, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, 20));

        panButton.setBackground(new java.awt.Color(4, 15, 22));
        panButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 251, 255)));
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 251, 255));
        jLabel5.setText("Login");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panButtonLayout = new javax.swing.GroupLayout(panButton);
        panButton.setLayout(panButtonLayout);
        panButtonLayout.setHorizontalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panButtonLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(49, 49, 49))
        );
        panButtonLayout.setVerticalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panButtonLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

    exitButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    exitButton.setForeground(new java.awt.Color(255, 255, 255));
    exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    exitButton.setText("X");
    exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        exitButtonMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        exitButtonMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        exitButtonMouseExited(evt);
      }
    });
    loginPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 30, 30));
        loginPanel.add(panButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, -1));

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

        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("x");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panExitLayout = new javax.swing.GroupLayout(panExit);
        panExit.setLayout(panExitLayout);
        panExitLayout.setHorizontalGroup(
            panExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panExitLayout.setVerticalGroup(
            panExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panExitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        loginPanel.add(panExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UserLoginImage.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        loginPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 230, 180));

        photoPanel.setBackground(new java.awt.Color(251, 251, 253));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Home-cinema-011.png"))); // NOI18N

        javax.swing.GroupLayout photoPanelLayout = new javax.swing.GroupLayout(photoPanel);
        photoPanel.setLayout(photoPanelLayout);
        photoPanelLayout.setHorizontalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
        );
        photoPanelLayout.setVerticalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Layered.setLayer(loginPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Layered.setLayer(photoPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayeredLayout = new javax.swing.GroupLayout(Layered);
        Layered.setLayout(LayeredLayout);
        LayeredLayout.setHorizontalGroup(
            LayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayeredLayout.createSequentialGroup()
                .addComponent(photoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LayeredLayout.setVerticalGroup(
            LayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayeredLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(LayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(photoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        Layered.add(loginPanel,0);
        Layered.add(photoPanel,0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Layered, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Layered))
        );

  private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
    String username = txtun.getText();
    String password = new String(txtpw.getPassword());
    //Call checkpassword() in the if statement here
    if(true){
      new HomeScreen();
    }else{
      wrongLogin.setText(wrongLoginMsg);
    }
    
  }//GEN-LAST:event_loginButtonActionPerformed
        setSize(new java.awt.Dimension(1293, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
    System.exit(0);
  }//GEN-LAST:event_exitButtonMouseClicked

  private void shownpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shownpwMouseClicked
    txtpw.setEchoChar((char)8226);
    shownpw.setVisible(false);
    shownpw.setEnabled(false);
    hidenpw.setVisible(true);
    hidenpw.setEnabled(true);
  }//GEN-LAST:event_shownpwMouseClicked

  private void hidenpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidenpwMouseClicked
    txtpw.setEchoChar((char)0);
    shownpw.setVisible(true);
    shownpw.setEnabled(true);
    hidenpw.setVisible(false);
    hidenpw.setEnabled(false);
  }//GEN-LAST:event_hidenpwMouseClicked

  private void txtunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtunActionPerformed

    private void lblCreateAccontMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccontMouseEntered
        lblCreateAccont.setForeground(new Color (162,0,255));
    }//GEN-LAST:event_lblCreateAccontMouseEntered

    private void lblCreateAccontMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccontMouseExited
        lblCreateAccont.setForeground(new Color(251,251,255));
    }//GEN-LAST:event_lblCreateAccontMouseExited

    private void panButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panButtonMouseEntered
        panButton.setBackground(new Color(162,0,255));
    }//GEN-LAST:event_panButtonMouseEntered

    private void panButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panButtonMouseExited
        panButton.setBackground(new Color(4,15,22));
    }//GEN-LAST:event_panButtonMouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        panButton.setBackground(new Color(162,0,255));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void panButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panButtonMouseClicked
    String username = txtun.getText();
    String password = new String(txtpw.getPassword());
    //Call checkpassword() in the if statement here
    if(true){
//      new LandingScreen();// login successfully going to next frame (landing)
    }else{
      wrongLogin.setText(wrongLoginMsg);
    }
    }//GEN-LAST:event_panButtonMouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        panButton.setBackground(new Color(4,15,22));
    }//GEN-LAST:event_jLabel5MouseExited

    private void panExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseEntered
        panExit.setBackground(new Color(162,0,255));
    }//GEN-LAST:event_panExitMouseEntered

    private void panExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseExited
        panExit.setBackground(new Color(4,15,22));
    }//GEN-LAST:event_panExitMouseExited

    private void panExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panExitMouseClicked

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
         panExit.setBackground(new Color(162,0,255));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        panExit.setBackground(new Color(4,15,22));
    }//GEN-LAST:event_exitButtonMouseExited



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Layered;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel hidenpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCreateAccont;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel panButton;
    private javax.swing.JPanel panExit;
    private javax.swing.JPanel photoPanel;
    private javax.swing.JLabel pwLable;
    private javax.swing.JLabel pwLine;
    private javax.swing.JLabel shownpw;
    private javax.swing.JPasswordField txtpw;
    private javax.swing.JTextField txtun;
    private javax.swing.JLabel unLine;
    private javax.swing.JLabel usLable;
    private javax.swing.JLabel wrongLogin;
    // End of variables declaration//GEN-END:variables
  String wrongLoginMsg = "Incorrect Username Or Password!!!";
}
