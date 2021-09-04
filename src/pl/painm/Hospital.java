package pl.painm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hospital extends JFrame implements ActionListener {

    private final int FRAME_WIDTH = 500;
    private final int FRAME_HEIGHT = 500;

    JButton bExit, bHeal;

    Hospital() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(320,100,FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(new Color(255, 255, 0));
        this.setTitle("Złamałeś coś? Zapłać, a Ci pomożemy");
        this.setLayout(null);
        this.setVisible(true);

        bHeal=new JButton("Lecz się!!");
        bHeal.setBounds(10,10,100,30);
        bHeal.addActionListener(this);


        bExit=new JButton("Wyjdź");
        bExit.setBounds(10,50,100,30);
        bExit.addActionListener(this);

        this.add(bHeal);
        this.add(bExit);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bHeal){
            Character.life=100;
            Character.lifeBar.setValue(Character.life);

        }
        if (e.getSource()==bExit){
            this.dispose();
        }
    }
}
