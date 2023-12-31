/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import MainPackage.Movie;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *c
 * @author Obaida
 */
class MovieObjectPanel extends JPanel {

  private JLabel nameLabel;
  private JLabel posterLabel;
  Movie movie;
  
  
public MovieObjectPanel(Movie movie){
  this.movie = movie;
    this.setLayout(new BorderLayout());
    this.setBackground(new Color(0, 0, 0, 1));
    this.setBorder(null);

    String name = movie.getMovieTitle();
    ImageIcon img = movie.getMovieImage();
    
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
    //this will be a pop up
//    new movie_form(movie);//
    
  }
}

/*
NOTE TO MYSELF BY OBAIDA
in this class it might be more eff if you pass
the whole Movie object as the commented code line 29
*/