package pl.painm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class NewGameFrame extends JFrame implements ActionListener {
    private final int FRAME_WIDTH=500;
    private final int FRAME_HEIGHT=400;
    JButton bNewGame, bOptions, bQuit;

    NewGameFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,100,FRAME_WIDTH,FRAME_HEIGHT);
        this.setBackground(new Color(255,255,0));
        this.setTitle("Life Simulation Game");
        this.setLayout(null);

        bNewGame= new JButton("Nowa Gra");
        bNewGame.setBounds(200,10,100,30);
        bNewGame.addActionListener(this);

        bOptions= new JButton("Opcje");
        bOptions.setBounds(200,50,100,30);
        bOptions.addActionListener(this);

        bQuit= new JButton("Wyjdź");
        bQuit.setBounds(200,90,100,30);
        bQuit.addActionListener(this);

        this.add(bNewGame);
        this.add(bOptions);
        this.add(bQuit);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==bNewGame){

            this.dispose();
            new GameFrame();
        }
        if(e.getSource()==bQuit){
            this.dispose();
        }
    }
}

