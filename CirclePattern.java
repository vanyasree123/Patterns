import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CirclePattern extends JPanel {

    // Override the paintComponent method to draw custom shapes
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set color for the circles
        g.setColor(Color.BLUE);

        // Draw multiple circles in a pattern
        int rows = 5;  // Number of rows of circles
        int cols = 5;  // Number of columns of circles
        int radius = 30; // Radius of each circle
        int spacing = 80; // Distance between the centers of circles

        // Loop through rows and columns to draw the pattern of circles
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = j * spacing + 50; // X position of the circle
                int y = i * spacing + 50; // Y position of the circle
                g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius); // Draw circle
            }
        }
    }

    public static void main(String[] args) {
        // Create a frame to display the pattern
        JFrame frame = new JFrame("Circle Pattern");
        CirclePattern pattern = new CirclePattern();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pattern);
        frame.setVisible(true);
    }
}

