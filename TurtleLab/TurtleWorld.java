import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World(500,500);
        Picture picture= new Picture(500,500);
        Random generator= new Random();
        Color color= new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
        picture.setAllPixelsToAColor(color);
        turtleWorld.setPicture(picture);
        turtleWorld.repaint();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtleOne= new Turtle(turtleWorld);        
        color = new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
        turtle.setColor(color);
        color = new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
        turtle.setPenColor(color);
        turtle.setPenDown(true);
        turtle.forward(100);
        color = new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
        turtle.setColor(color);
        color = new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
        turtleOne.setPenColor(color);
        turtleOne.setPenDown(true);
        turtleOne.backward(100);
        color = new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
        turtleOne.setPenColor(color);
        turtleOne.turnRight();
        turtleOne.forward(100);
        color = new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
        turtle.setPenColor(color);
        turtle.turnRight();
        while (true) {
            color = new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
            turtle.setColor(color);
            color = new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256));
            turtleOne.setColor(color);
            turtleWorld.repaint();
        }
        
        
    }
}