package pl.painm;

import javax.swing.*;
import java.awt.*;

public class Character extends JPanel {

    private final int WIDTH_PANEL = 300;
    private final int HEIGHT_PANEL = 300;
    private final int PANEL_POSITIONX=10;
    private final int PANEL_POSITIONY=10;

    public String name;
    public static int life;
    private int energy;
    public static int strength;
    public static int knowledge;
    public static int money;
    public static int hungry;

    static JProgressBar energyBar, lifeBar, hungryBar;
    static JLabel lName, lLife, lEnergy, lStrength, lKnowledge, lMoney, lHungry;
    Font lFont;

    Character(String name, int life, int energy, int strength, int knowledge, int money, int hungry){
         this.name= name;
         this.energy= energy;
         Character.strength = strength;
         Character.knowledge = knowledge;
         Character.money = money;
         Character.hungry = hungry;

         this.setLayout(null);
         this.setBounds(PANEL_POSITIONX,PANEL_POSITIONY,WIDTH_PANEL,HEIGHT_PANEL);
         this.setBackground(new Color(164,235,111));

         lFont= new Font("Calibri", Font.BOLD, 15);

         lName= new JLabel(name);
         lName.setFont(new Font("Arial",Font.ITALIC,25));
         lName.setForeground(Color.RED);
         FontMetrics metrics = getFontMetrics(lName.getFont());
         lName.setBounds((WIDTH_PANEL-metrics.stringWidth(name))/2,10,metrics.stringWidth(name),30);

         lLife= new JLabel("Życie:");
         lLife.setFont(lFont);
         lLife.setBounds(10,130,150,20);

         lMoney= new JLabel("Piniądze: "+money);
         lMoney.setFont(lFont);
         lMoney.setBounds(10,40,150,20);

         lStrength= new JLabel("Siła: "+strength);
         lStrength.setFont(lFont);
         lStrength.setBounds(10,55,150,20);

         lKnowledge= new JLabel("Wiedza: "+knowledge);
         lKnowledge.setFont(lFont);
         lKnowledge.setBounds(10,70,150,20);


         lEnergy= new JLabel("Energia:");
         lEnergy.setFont(lFont);
         lEnergy.setBounds(10,100,150,20);

         lHungry= new JLabel("Głód:");
         lHungry.setFont(lFont);
         lHungry.setBounds(10,160,150,20);

         energyBar= new JProgressBar();
         energyBar.setValue(energy);
         energyBar.setBounds(100,100,100,20);
         energyBar.setStringPainted(true);
         energyBar.setBackground(Color.BLACK);
         energyBar.setForeground(Color.BLUE);

         lifeBar= new JProgressBar();
         lifeBar.setValue(life);
         lifeBar.setBounds(100,130,100,20);
         lifeBar.setStringPainted(true);
         lifeBar.setBackground(Color.BLACK);
         lifeBar.setForeground(Color.RED);

         hungryBar= new JProgressBar();
         hungryBar.setValue(hungry);
         hungryBar.setBounds(100,160,100,20);
         hungryBar.setStringPainted(true);
         hungryBar.setBackground(Color.BLACK);
         hungryBar.setForeground(Color.YELLOW);

         // Adds components to panel
         this.add(energyBar);
         this.add(lifeBar);
         this.add(hungryBar);
         this.add(lName);
         this.add(lLife);
         this.add(lEnergy);
         this.add(lHungry);
         this.add(lKnowledge);
         this.add(lMoney);
         this.add(lStrength);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
