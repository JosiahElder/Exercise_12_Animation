import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class BallGame extends JPanel
{
    private static int ballSize = 20;
    private static int maxSpeed = 10;
    private static int width = 600;
    private static int height = 400;

    private int xPosition = width / 2;
    private int yPosition = height / 2;
    private int xSpeed = 2;
    private int score = 0;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(xPosition, yPosition, ballSize, maxSpeed);
    }

    public void moveBall()
    {
        xPosition += xSpeed;
        if (xPosition <= 0 || xPosition + ballSize >= width)
        {
            JOptionPane.showMessageDialog(null,
                    "GAME OVER! Your score is: " + score);
            System.exit(0);
        }
    }

    public void increaseSpeed()
    {
        if (xSpeed < maxSpeed)
        {
            xSpeed++;
            score++;
        }
    }
}
