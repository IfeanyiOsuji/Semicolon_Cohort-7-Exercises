package africa.semicolon.gui;

import javax.swing.*;

public class DrawpanelTest{

    public static void main(String[] args) {
        Drawpanel panel = new Drawpanel();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);

    }
}
