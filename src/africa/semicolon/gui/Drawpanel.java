package africa.semicolon.gui;

import javax.swing.*;
import java.awt.*;

public class Drawpanel extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height =getHeight();
        int averageWidth = width/15;
        int averageHeight = height/15;
        int x = 0;
        int y = 0;
        while(x < width) {
            //g.drawLine(0, 0, x, height); // fig 4.20 a
            g.drawLine(0, 0, x, height);
            x += averageWidth;
            height -= averageHeight;
        }
//        while(x < width) {
//            //g.drawLine(0, 0, x, height); // fig 4.20 a
//             g.drawLine(0, 0, x, height);
//            x += averageWidth;
//            height -= averageHeight;
//        }
//        x = getWidth();
//        y = getHeight();
//        int z = x + 0;
//        while(x > 0) {
//            //g.drawLine(0, 0, x, height); // fig 4.20 a
//            g.drawLine(z, 0, x, y);
//            x -= averageWidth;
//            y -= averageHeight;
//        }
//        width = getWidth();
//        x = 0;
//        y = getHeight();
//        z = y + 0;
//        while(width > x) {
//            //g.drawLine(0, 0, x, height); // fig 4.20 a
//            g.drawLine(0, y, width, z);
//            width -= averageWidth ;
//            z -= averageHeight;
//        }
//        width = getWidth();
//        x = 0;
//        y = getHeight();
//        z = y + 0;
//        while(width > x) {
//            //g.drawLine(0, 0, x, height); // fig 4.20 a
//            g.drawLine(0, y, width, z);
//            width -= averageWidth ;
//            z -= averageHeight;
//        }
//        width = getWidth();
//        x =  0;
//        height = getHeight();
//        z =  y + 0;
//        while(x < width) {
//            //g.drawLine(0, 0, x, height); // fig 4.20 a
//            g.drawLine(width, height, x, z);
//            x += averageWidth ;
//            z -= averageHeight;
//        }
    }
}
