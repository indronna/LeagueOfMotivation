import java.awt.AWTException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {
	// HardCoded coordinate for the red counter of the death
    static int xMin = 662;
    static int yMin = 1012;
    static int xMax = 688;
    static int yMax = 1030;
    static Boolean loop = true;

    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        while(loop) {
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capture = new Robot().createScreenCapture(screenRect);
            ImageIO.write(capture, "bmp", new File(".\\image.bmp"));
            for (int x = xMin; x < xMax; x++) {
                for (int y = xMax; y < yMax; y++) {
                	if (new Color(capture.getRGB(x, y)).getRed() == 255)
                	System.out.println("You are DEAD");
                }
            }
        Thread.sleep(1000);
        }
        
        //capture.getRGB(x, y)
    }

}