package pl.painm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shop extends JFrame implements ActionListener {
    private final int FRAME_WIDTH = 500;
    private final int FRAME_HEIGHT = 500;
    JLabel[] products;
    JLabel[] cost;
    JLabel[] energyRegen;
    JButton[] kup;
    static int[] buysProducts= new int[8];

    Shop() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(320,100,FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(new Color(255, 255, 0));
        this.setTitle("Sklep z jedzeniem");
        this.setLayout(new GridLayout(8,4));
        this.setVisible(true);

        products= new JLabel[8];
        cost= new JLabel[8];
        energyRegen= new JLabel[8];
        kup= new JButton[8];

        for(int i=0; i<=7; i++){
            products[i]= new JLabel();
            products[i].setText(GameFrame.products.get(i).getName());
           this.add(products[i]);

            cost[i]= new JLabel();
            cost[i].setText(String.valueOf(GameFrame.products.get(i).getCost()));
            this.add(cost[i]);

            energyRegen[i]= new JLabel();
            energyRegen[i].setText(String.valueOf(GameFrame.products.get(i).getEnergyRegen()));
            this.add(energyRegen[i]);

            kup[i]= new JButton("Kup");
            kup[i].addActionListener(this);
            this.add(kup[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0; i<=7; i++){
            if(e.getSource()==kup[i]){
                if(Character.money>=Integer.valueOf(cost[i].getText())) {
                    Character.money -= Integer.valueOf(cost[i].getText());
                    Character.lMoney.setText("Piniądze: " + Character.money);
                    buysProducts[i]++;
                }
            }
        }
    }
}
