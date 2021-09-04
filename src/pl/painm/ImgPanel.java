package pl.painm;

import javax.swing.*;
import java.awt.*;


public  class ImgPanel extends JPanel  {
    static Image image;
    static String path;


    ImgPanel() {

        this.setBounds(900, 100, 700, 700);
        this.setLayout(null);

        image = new ImageIcon(path).getImage();





    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
       // g2d.setColor(Color.cyan);
        super.paint(g);
        g2d.drawImage(image, 10, 10, null);

    }







}
