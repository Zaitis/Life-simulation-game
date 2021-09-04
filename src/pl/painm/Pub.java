package pl.painm;

import javax.swing.*;
import java.awt.*;

public class Pub extends JFrame{

    private final int FRAME_WIDTH = 500;
    private final int FRAME_HEIGHT =500;

    Pub() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(320,100,FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(new Color(255, 255, 0));
        this.setTitle("Ze mną się nie napijesz? Witaj w Pubie");
        this.setLayout(null);
        this.setVisible(true);
        JOptionPane.showMessageDialog(
                null,
                "To jeszcze nie działa ",
                "Idź pracuj",
                JOptionPane.PLAIN_MESSAGE);
        dispose();
    }
}
