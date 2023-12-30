package Interfaces;

 
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Obaida
 */
public class LoadingScreen extends javax.swing.JFrame {
  
  public static int LOADINGTIME = 1000;
  /**
   * Creates new form LoadingScreen
   */
  public LoadingScreen() {
    setting();
    initComponents();
    this.setVisible(true);
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
    } catch (Exception ex) {
      java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("LoadingFrame"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 384));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(4, 15, 22));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 275));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/SPLASH01.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(697, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    try {
      for(double i=0.0; i<=1.0; i+=0.1){
        String val = i+"";
        float f = Float.valueOf(val);
        this.setOpacity(f);
        Thread.sleep(5);
      }
      Thread.sleep(0);
      System.out.println("start");

      loadingTask();
      //open login window
      new LoginScreen();
      this.dispose();
      
      
    } catch (InterruptedException ex) {
      Logger.getLogger(LoadingScreen.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_formWindowActivated

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


  private void loadingTask() {
    try {
      //Here we cn call loading tasks (preffered in threads)
      Thread.sleep(LOADINGTIME);
    } catch (InterruptedException ex) {
      Logger.getLogger(LoadingScreen.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

}
