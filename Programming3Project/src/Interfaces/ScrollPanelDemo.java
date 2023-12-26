package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollPanelDemo {

  private static final int SCROLL_INCREMENT_SPEED = 8;
  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Scroll Panel Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create a panel with a GridLayout (for the grid-like layout)
            JPanel movieRowPanel = new JPanel(new GridLayout(1, 0));

            // Add colored panels to the main panel
            for (int i = 1; i <= 50; i++) {
                JPanel coloredPanel = new JPanel();
                coloredPanel.setBackground(getRandomColor());
                coloredPanel.setPreferredSize(new Dimension(100, 100));
                movieRowPanel.add(coloredPanel);
                
            }

            // Create a JScrollPane and set its viewport to the main panel
            JScrollPane scrollPane = new JScrollPane(movieRowPanel);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

            // Hide both vertical and horizontal scroll bars
            scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
            scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));

            // Control the speed of the pass
            scrollPane.getHorizontalScrollBar().setUnitIncrement(SCROLL_INCREMENT_SPEED);

            // Create buttons for manual scrolling
            JButton scrollLeftButton = new JButton("Scroll Left");
            JButton scrollRightButton = new JButton("Scroll Right");
            // Add ActionListener to the buttons
            scrollLeftButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JScrollBar horizontalScrollBar = scrollPane.getHorizontalScrollBar();
                    horizontalScrollBar.setValue(horizontalScrollBar.getValue() - SCROLL_INCREMENT_SPEED*5);
                }
            });

            scrollRightButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JScrollBar horizontalScrollBar = scrollPane.getHorizontalScrollBar();
                    horizontalScrollBar.setValue(horizontalScrollBar.getValue() + SCROLL_INCREMENT_SPEED*5);
                }
            });

            // Create a panel for the buttons
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(scrollLeftButton);
            buttonPanel.add(scrollRightButton);

            // Create the main frame and add components
            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }

    // Helper method to generate a random color
    private static Color getRandomColor() {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        return new Color(red, green, blue);
    }
}
