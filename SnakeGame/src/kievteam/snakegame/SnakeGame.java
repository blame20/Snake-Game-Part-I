package kievteam.snakegame;

import javax.swing.*;
import java.awt.*;

public class SnakeGame extends JPanel {

    public static final int SCALE = 32;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;

    public void paint(Graphics graphics) {
        graphics.setColor(color(5, 50, 10));
        graphics.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
        graphics.setColor(color(255, 166, 0));

        for (int xx = 0; xx < WIDTH * SCALE; xx += SCALE) {
            graphics.drawLine(xx, 0, xx, HEIGHT * SCALE);
        }
        for (int yy = 0; yy < HEIGHT * SCALE; yy += SCALE) {
            graphics.drawLine(0, yy, WIDTH * SCALE, yy);
        }
    }

    public Color color(int red, int green, int blue) {
        return new Color(red, green, blue);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(WIDTH * SCALE + 7, HEIGHT * SCALE + 30);
        frame.setLocationRelativeTo(null);
        frame.add(new SnakeGame());
        frame.setVisible(true);

    }
}
