package pl.painm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Office extends JFrame implements ActionListener {

    private final int FRAME_WIDTH = 500;
    private final int FRAME_HEIGHT = 500;
    JButton bJob, bPromotion, bExit;

    Office() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(320,100,FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(new Color(255, 255, 0));
        this.setTitle("Nienawidzisz tego miejsca, Twoje biuro");
        this.setLayout(null);
        this.setVisible(true);

        bJob=new JButton("Pracuj");
        bJob.setBounds(10,10,100,30);
        bJob.addActionListener(this);

        bPromotion=new JButton("Poproś o Awans");
        bPromotion.setBounds(10,50,100,30);
        bPromotion.addActionListener(this);

        bExit=new JButton("Wyjdź");
        bExit.setBounds(10,90,100,30);
        bExit.addActionListener(this);

        this.add(bJob);
        this.add(bPromotion);
        this.add(bExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bJob){
            if(GameFrame.karinka.getEnergy()>=10) {
                if (Character.hungry >= 8) {
                    Character.hungry -= 8;
                    Character.hungryBar.setValue(Character.hungry);
                    GameFrame.karinka.setEnergy(GameFrame.karinka.getEnergy()-10);
                    Character.money += Character.knowledge;
                    Character.lMoney.setText("Pieniądze: " + Character.money);
                    Character.energyBar.setValue(GameFrame.karinka.getEnergy());

                    } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Jesteś głodny!!",
                            "Idź Jeść",
                            JOptionPane.PLAIN_MESSAGE);
                            }
                }
            else {
                JOptionPane.showMessageDialog(
                        null,
                        "Nie masz energii. Idź spać!!",
                        "Idź spać",
                        JOptionPane.PLAIN_MESSAGE);
                }


        }

        if (e.getSource()==bPromotion){
        }

        if (e.getSource()==bExit){
            this.dispose();
        }

    }
}
