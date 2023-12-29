/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Obaida
 */
class MovieObjectPanel extends JPanel {

  private JLabel nameLabel;
  private JLabel posterLabel;
  private JButton moreButton;
  String name;
  ImageIcon img;
  
  
//public MovieObjectPanel(Movie m){
  //  this.name = m.getMovieTitle();
  //  this.img = m.getMovieImage();
  public MovieObjectPanel(String name, ImageIcon img) {
    this.name = name;
    this.img = img;

    this.setLayout(new BorderLayout());
    this.setBackground(new Color(0, 0, 0, 1));
    this.setBorder(null);

    nameLabel = new JLabel(name, SwingConstants.CENTER);
    nameLabel.setForeground(Color.WHITE);
    posterLabel = new JLabel(img, SwingConstants.CENTER);

    this.add(nameLabel, BorderLayout.NORTH);
    this.add(posterLabel, BorderLayout.CENTER);

    nameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        movieMouseClicked(evt);
      }
    });
    posterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        movieMouseClicked(evt);
      }
    });

  }

  private void movieMouseClicked(java.awt.event.MouseEvent evt) {
    System.out.println("movie entered   " + name);//here we get the name of the movie we selected then we pass 
                                                  //the object to the next frame
    //new MovieFrame(Movie)  this will be a pop up
  }
}

/*
NOTE TO MYSELF BY OBAIDA
in this class it might be more eff if you pass
the whole Movie object as the commented code line 29
*/