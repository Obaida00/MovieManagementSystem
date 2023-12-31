package Interfaces;

import Action.go;
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

  public void setting() {
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
    loginButton = new JButton("Log In") {
      @Override
      protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // هاد رح يكون اوبجيكت من كلاس جاهز فيو الشكل يلي بيعطي حواف مدورة ويلي رح نمررو لتابع بعد كم سطر
        int arcDiameter = getHeight();
        RoundRectangle2D roundRect = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), arcDiameter, arcDiameter);

        // هي التريك المسؤولة عن تغير اللون
        if (getModel().isArmed()) {
          g2.setColor(new Color(107, 73, 117)); // لون عند الضغط
        } else if (getModel().isRollover()) {
          g2.setColor(new Color(157, 121, 168)); // لون عند التحويل
        } else {
          g2.setColor(new Color(251,251,253)); // اللون الافتراضي
        }
        // هون حددنا الشكل يلي بدنا ياه يكون للزر
        g2.fill(roundRect);

        // الخط والالوان
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Trebuchet MS", 0, 11));

        // خوارزمية جاهزة لهتى تكون الجملة بمنتصف الزر
        FontMetrics fm = g.getFontMetrics();
        String text = getText();
        int textWidth = fm.stringWidth(text);
        int textHeight = fm.getHeight();

        int x = (getWidth() - textWidth) / 2;
        int y = (getHeight() - textHeight) / 2 + fm.getAscent();

        // اذا ع التجربة ما حسيناها كتير راكزة ممكن نضيف او نطرح ع ال y  و ال x  يلي هون
        g2.drawString(text, x, y);

        g2.dispose();
      }
    };
    ;
    exitButton = new javax.swing.JLabel();
    userIcon = new javax.swing.JLabel();
    shownpw = new javax.swing.JLabel();
    hidenpw = new javax.swing.JLabel();
    wrongLogin = new javax.swing.JLabel();
    signupLabel = new javax.swing.JLabel();
    dhaccount = new javax.swing.JLabel();
    photoPanel = new javax.swing.JPanel();
    photo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    setPreferredSize(new java.awt.Dimension(1289, 638));
    setResizable(false);

    loginPanel.setBackground(new java.awt.Color(4, 15, 19));
    loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
    loginPanel.add(txtun, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 270, 30));

    usLable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    usLable.setForeground(new java.awt.Color(255, 255, 255));
    usLable.setText("Username");
    loginPanel.add(usLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

    unLine.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    unLine.setForeground(new java.awt.Color(255, 255, 255));
    unLine.setText("_______________________________________");
    loginPanel.add(unLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 280, 20));

    txtpw.setBackground(new Color(0,0,0,1));
    txtpw.setFont(pwLable.getFont());
    txtpw.setForeground(new java.awt.Color(255, 255, 255));
    txtpw.setBorder(null);
    txtpw.setCaretColor(new java.awt.Color(255, 255, 255));
    txtpw.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    loginPanel.add(txtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 200, 30));

    pwLable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    pwLable.setForeground(new java.awt.Color(255, 255, 255));
    pwLable.setText("Password");
    loginPanel.add(pwLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

    pwLine.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    pwLine.setForeground(new java.awt.Color(255, 255, 255));
    pwLine.setText("______________________________");
    loginPanel.add(pwLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 220, 20));

    loginButton.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
    loginButton.setText("LOGIN");
    loginButton.setBorder(null);
    loginButton.setBorderPainted(false);
    // وال 3 تعليمات ال تاليين ضروريين مشان ما تظهر اي حواف او شي مزعج ع الزر
    loginButton.setFocusPainted(false);
    loginButton.setContentAreaFilled(false);
    loginButton.setBounds(100, 50, 200, 40);
    loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    loginButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loginButtonActionPerformed(evt);
      }
    });
    loginPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 123, 25));

    exitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
    loginPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 40, 30));

    userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/userIcon.png"))); // NOI18N
    userIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    userIcon.setIconTextGap(0);
    loginPanel.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 410, 140));

    shownpw.setBackground(new Color(0,0,0,0));
    shownpw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/EyeShow.png"))); // NOI18N
    shownpw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    shownpw.setOpaque(true);
    shownpw.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        shownpwMouseClicked(evt);
      }
    });
    loginPanel.add(shownpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 25, 30));

    hidenpw.setBackground(new Color(0,0,0,0));
    hidenpw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/EyeHide.png"))); // NOI18N
    hidenpw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    hidenpw.setOpaque(true);
    hidenpw.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        hidenpwMouseClicked(evt);
      }
    });
    loginPanel.add(hidenpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 25, 30));

    wrongLogin.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
    wrongLogin.setForeground(new java.awt.Color(255, 102, 102));
    loginPanel.add(wrongLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 160, 30));

    signupLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
    signupLabel.setForeground(new java.awt.Color(251, 251, 255));
    signupLabel.setText("SIGN UP");
    signupLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    signupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        signupLabelMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        signupLabelMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        signupLabelMouseExited(evt);
      }
    });
    loginPanel.add(signupLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 50, 40));

    dhaccount.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
    dhaccount.setForeground(new java.awt.Color(251, 251, 255));
    dhaccount.setText("Don't have an account ?");
    loginPanel.add(dhaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 130, 20));

    photoPanel.setBackground(new java.awt.Color(251, 251, 253));

    photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/HomeCinema.png"))); // NOI18N
    photo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    javax.swing.GroupLayout photoPanelLayout = new javax.swing.GroupLayout(photoPanel);
    photoPanel.setLayout(photoPanelLayout);
    photoPanelLayout.setHorizontalGroup(
      photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(photoPanelLayout.createSequentialGroup()
        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    photoPanelLayout.setVerticalGroup(
      photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(photoPanelLayout.createSequentialGroup()
        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    Layered.setLayer(loginPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
    Layered.setLayer(photoPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

    javax.swing.GroupLayout LayeredLayout = new javax.swing.GroupLayout(Layered);
    Layered.setLayout(LayeredLayout);
    LayeredLayout.setHorizontalGroup(
      LayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(LayeredLayout.createSequentialGroup()
        .addGap(0, 0, 0)
        .addComponent(photoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(0, 0, 0)
        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    LayeredLayout.setVerticalGroup(
      LayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(LayeredLayout.createSequentialGroup()
        .addGap(0, 0, 0)
        .addGroup(LayeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(photoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    setSize(new java.awt.Dimension(1289, 638));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
    String username = txtun.getText();
    String password = new String(txtpw.getPassword());
    //Call checkpassword() in the if statement here
    if (go.checkName$Pass(username, password)){
      go.saveCurrentUser(username);
      new HomeScreen();
      this.dispose();
    } else {
      wrongLogin.setText(wrongLoginMsg);
    }

  }//GEN-LAST:event_loginButtonActionPerformed

  private void shownpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shownpwMouseClicked
    txtpw.setEchoChar((char) 8226);
    shownpw.setVisible(false);
    shownpw.setEnabled(false);
    hidenpw.setVisible(true);
    hidenpw.setEnabled(true);
  }//GEN-LAST:event_shownpwMouseClicked

  private void hidenpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidenpwMouseClicked
    txtpw.setEchoChar((char) 0);
    shownpw.setVisible(true);
    shownpw.setEnabled(true);
    hidenpw.setVisible(false);
    hidenpw.setEnabled(false);
  }//GEN-LAST:event_hidenpwMouseClicked

  private void txtunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtunActionPerformed

  private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
    exitButton.setForeground(new Color(251, 251, 255));
  }//GEN-LAST:event_exitButtonMouseExited

  private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
    exitButton.setForeground(new Color(162, 0, 255));
  }//GEN-LAST:event_exitButtonMouseEntered

  private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
    System.exit(0);
  }//GEN-LAST:event_exitButtonMouseClicked

  private void signupLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseEntered
    signupLabel.setForeground(new Color(162, 0, 255));
  }//GEN-LAST:event_signupLabelMouseEntered

  private void signupLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseExited
    signupLabel.setForeground(new Color(251, 251, 255));
  }//GEN-LAST:event_signupLabelMouseExited

  private void signupLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseClicked
    new sign_up_form();
    this.dispose();
  }//GEN-LAST:event_signupLabelMouseClicked


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLayeredPane Layered;
  private javax.swing.JLabel dhaccount;
  private javax.swing.JLabel exitButton;
  private javax.swing.JLabel hidenpw;
  private javax.swing.JButton loginButton;
  private javax.swing.JPanel loginPanel;
  private javax.swing.JLabel photo;
  private javax.swing.JPanel photoPanel;
  private javax.swing.JLabel pwLable;
  private javax.swing.JLabel pwLine;
  private javax.swing.JLabel shownpw;
  private javax.swing.JLabel signupLabel;
  private javax.swing.JPasswordField txtpw;
  private javax.swing.JTextField txtun;
  private javax.swing.JLabel unLine;
  private javax.swing.JLabel usLable;
  private javax.swing.JLabel userIcon;
  private javax.swing.JLabel wrongLogin;
  // End of variables declaration//GEN-END:variables
  String wrongLoginMsg = "Incorrect Username Or Password!!!";
}
