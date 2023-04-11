import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main
{
    private static int WIDTH = 600;
    private static int HEIGHT = 400;


    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Ball Game");
        BallGame game = new BallGame();
        frame.add(game);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        game.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

            }
        });
    }
}