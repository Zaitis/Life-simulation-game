package pl.painm;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GameFrame extends JFrame {
            private final int FRAME_WIDTH=1600;
            private final int FRAME_HEIGHT=800;
            static Map<Integer, ShopProducts> products;
            static ImgPanel imgpanel;
            static Character character =new Character(NewGameFrame.name,100,100,5,5,1000,100);

    GameFrame(){

        //add products to static HashMap for using on Shop, Home->Eat
        products = new HashMap<>();
        products.put(0,new ShopProducts("Jogurt",5,5));
        products.put(1,new ShopProducts("Ciasteczka",5,5));
        products.put(2,new ShopProducts("Płatki",10,10));
        products.put(3,new ShopProducts("Kanapka",10,10));
        products.put(4,new ShopProducts("Zapiekanka",15,15));
        products.put(5,new ShopProducts("Pizza",20,20));
        products.put(6,new ShopProducts("Spagetti",15,15));
        products.put(7,new ShopProducts("Jabłko",5,5));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        this.setBackground(new Color(255,255,0));
        this.setTitle("Life Simulation");
        this.setLayout(null);

        this.add(character);
        this.add(new Place());
        imgpanel= new ImgPanel();
        this.add(imgpanel);
        this.setVisible(true);
    }

}
