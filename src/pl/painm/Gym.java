package pl.painm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gym extends JFrame implements ActionListener {
    private final int FRAME_WIDTH = 500;
    private final int FRAME_HEIGHT = 500;
    JButton bWork, bExit;

    Gym() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(320, 100, FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(new Color(255, 255, 0));
        this.setTitle("Chodź tu chuderlaku, zrobimy z Ciebie koXa");
        this.setLayout(null);
        this.setVisible(true);


        bWork = new JButton("ćwicz");
        bWork.setBounds(10, 10, 100, 30);
        bWork.addActionListener(this);


        bExit = new JButton("Wyjdź");
        bExit.setBounds(10, 50, 100, 30);
        bExit.addActionListener(this);

        this.add(bWork);
        this.add(bExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bWork) {

            if(Character.money>=Character.strength*10) {
                if (Character.hungry >= 8) {
                    Character.hungry -= 8;
                    Character.hungryBar.setValue(Character.hungry);
                    Character.money -= Character.strength * 10;
                    Character.strength++;
                    Character.lStrength.setText("Siła: " + Character.strength);
                    Character.lMoney.setText("Pieniądze: " + Character.money);
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Jesteś głodny!!",
                            "Idź Jeść",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }
            else
                JOptionPane.showMessageDialog(
                        null,
                        "Nie masz kasy biedaku. Idź pracuj!!",
                        "Idź pracuj",
                        JOptionPane.PLAIN_MESSAGE);

        }
        if (e.getSource() == bExit) {
            this.dispose();
        }
    }
}
