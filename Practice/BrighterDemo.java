import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;

public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame= new JFrame();
        frame.setSize(200,200);
        Random generator= new Random();
        while (1==1) {
            Color myColor = new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
            frame.getContentPane().setBackground(myColor);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
}