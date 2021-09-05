package pl.painm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    private final int FRAME_WIDTH=500;
    private final int FRAME_HEIGHT=500;

    JButton bSleep, bEat, bExit;
    JButton[] bEatThis;
    JLabel[] products, productsAmount;
    JPanel displayPanel;

    Home() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(320,100,FRAME_WIDTH, FRAME_HEIGHT);
       // this.setBackground(new Color(255, 255, 0));
        this.setTitle("Twój dom");
        this.setLayout(null);
        this.setVisible(true);

        bEatThis= new JButton[8];
        displayPanel= new JPanel();
        products= new JLabel[8];
        productsAmount= new JLabel[8];

        displayPanel.setBounds(120,10,300,300);
        //displayPanel.setBackground(Color.RED);
        displayPanel.setLayout(new GridLayout(8,3));

        bSleep=new JButton("Idź spać");
        bSleep.setBounds(10,10,100,30);
        bSleep.addActionListener(this);

        bEat=new JButton("Idź Jeść");
        bEat.setBounds(10,50,100,30);
        bEat.addActionListener(this);

        bExit=new JButton("Wyjdź");
        bExit.setBounds(10,90,100,30);
        bExit.addActionListener(this);

        this.add(bSleep);
        this.add(bEat);
        this.add(bExit);
        this.add(displayPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bSleep){
            GameFrame.character.setEnergy(100);
            Character.energyBar.setValue(GameFrame.character.getEnergy());
        }

        if (e.getSource()==bEat){
            displayProdutcts();
        }

        if (e.getSource()==bExit){
            this.dispose();
        }

        for(int i=0;i<=7;i++) {
            if (e.getSource() == bEatThis[i]) {
                Shop.buysProducts[i]-=1;
                productsAmount[i].setText(String.valueOf(Shop.buysProducts[i]));
                Character.hungry+=GameFrame.products.get(i).energyRegen;
                if (Character.hungry>100) Character.hungry=100;
                Character.hungryBar.setValue(Character.hungry);
                if(Shop.buysProducts[i] == 0) bEatThis[i].setEnabled(false);
            }
        }

    }

    public void displayProdutcts() {
        for (int i = 0; i <= 7; i++) {
            products[i]= new JLabel();
            products[i].setText(GameFrame.products.get(i).getName());
            displayPanel.add(products[i]);

            productsAmount[i]= new JLabel();
            productsAmount[i].setText(String.valueOf(Shop.buysProducts[i]));
            displayPanel.add(productsAmount[i]);

            bEatThis[i]= new JButton("Zjedz to");
            bEatThis[i].addActionListener(this);
            displayPanel.add(bEatThis[i]);

            displayPanel.setVisible(false);
            displayPanel.setVisible(true);
            bEat.setEnabled(false);
            if(Shop.buysProducts[i] == 0) bEatThis[i].setEnabled(false);
        }
    }

}



