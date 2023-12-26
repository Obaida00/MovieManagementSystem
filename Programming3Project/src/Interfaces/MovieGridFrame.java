package Interfaces;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class MoviePanel extends JPanel {
    private JLabel nameLabel;
    private JLabel posterLabel;

    public MoviePanel(String name, String posterPath) {
        setLayout(new BorderLayout());

        nameLabel = new JLabel(name, SwingConstants.CENTER);
        posterLabel = new JLabel(new ImageIcon(posterPath), SwingConstants.CENTER);

        add(nameLabel, BorderLayout.NORTH);
        add(posterLabel, BorderLayout.CENTER);
    }
}
// الإطار الرئيسي الذي يحتوي على شبكة من لوحات الأفلام
public class MovieGridFrame extends JFrame {
    private Map<String, String> movies;

    // الكونستركتور الرئيسي
    public MovieGridFrame() {
        movies = readMoviesFromFile("movies.dat");

        setLayout(new GridLayout(3, 4));

        // إنشاء لوحة لكل فيلم وإضافتها إلى الإطار
        for (Map.Entry<String, String> entry : movies.entrySet()) {
            MoviePanel panel = new MoviePanel(entry.getKey(), entry.getValue());
            add(panel);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // قراءة بيانات الأفلام من الملف
    private Map<String, String> readMoviesFromFile(String filePath) {
        Map<String, String> movies = new HashMap<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                try {
                    // قراءة كائن فيلم وإضافته إلى الخريطة
                    Movie movie = (Movie) ois.readObject();
                    movies.put(movie.getName(), movie.getPosterPath());
                } catch (EOFException e) {
                    break; // نهاية الملف
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return movies;
    }
}
class Movie implements Serializable {
    private String name;
    private String posterPath;

    public Movie(String name, String posterPath) {
        this.name = name;
        this.posterPath = posterPath;
    }

    public String getName() {
        return name;
    }

    public String getPosterPath() {
        return posterPath;
    }
}
