import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {
    
    static int xMax = 0;
    static int yMax = 0;

    public static void main(String[] args) throws IOException, AWTException {
        while(true) {
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capture = new Robot().createScreenCapture(screenRect);
            ImageIO.write(capture, "bmp", new File(".\\image.bmp"));
            for (int x = 0; x < xMax; x++) {
                
            }
        }
        
        //capture.getRGB(x, y)
    }

}