package renderer;

import org.junit.jupiter.api.Test;
import primitives.Color;


import static org.junit.jupiter.api.Assertions.*;

/**
 * A class to test the image writer class.
 *
 * @author Eliaou and Etamar
 */
class ImageWriterTest {

    /**
     * A test to test the write to image function.
     */
    @Test
    void writeToImageTest() {
        ImageWriter imageWriter = new ImageWriter("test", 800, 500);

        for (int i = 0; i < 800; i++)
            for (int j = 0; j < 500; j++) {
              //  if ((i % 50 == 0) || (j % 50 == 0)) //to create a 16 * 10 square: 800/16 = 50 . 500/10 = 50
                if ((i % 50 == 0) || (j % 50 == 0)) //to create a 16 * 10 square: 800/16 = 50 . 500/10 = 50
                    imageWriter.writePixel(i, j, new Color(0, 0, 0));//gril
                else imageWriter.writePixel(i, j, new Color(135, 227, 14));

            }

        imageWriter.writeToImage();
    }
}