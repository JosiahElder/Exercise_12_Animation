import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main
{
    private static int width = 600;
    private static int height = 400;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Ball Game");
        BallGame game = new BallGame();
        frame.add(game);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        game.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                game.increaseSpeed();
            }
        });

        while (true)
        {
            game.moveBall();
            game.repaint();
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}