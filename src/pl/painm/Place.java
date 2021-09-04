package pl.painm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Place extends JPanel implements ActionListener {
 JButton bHome, bShop, bOffice, bHospital, bGym, bPub, bLibrary;
    Place(){
        this.setBounds(10,320,300,250);
        this.setBackground(new Color(223,131,45));
        this.setLayout(null);

        bHome=new JButton("Dom");
        bHome.setBounds(10,10,100,30);
        bHome.addActionListener( this);

        bShop=new JButton("Sklep");
        bShop.setBounds(10,50,100,30);
        bShop.addActionListener( this);

        bOffice=new JButton("Biuro");
        bOffice.setBounds(10,90,100,30);
        bOffice.addActionListener( this);

        bHospital=new JButton("Szpital");
        bHospital.setBounds(130,10,100,30);
        bHospital.addActionListener( this);

        bGym=new JButton("Siłownia");
        bGym.setBounds(130,50,100,30);
        bGym.addActionListener( this);

        bPub=new JButton("Pub");
        bPub.setBounds(130,90,100,30);
        bPub.addActionListener( this);

        bLibrary=new JButton("Biblioteka");
        bLibrary.setBounds(10,130,100,30);
        bLibrary.addActionListener( this);

        this.add(bHome);
        this.add(bHospital);
        this.add(bOffice);
        this.add(bGym);
        this.add(bPub);
        this.add(bShop);
        this.add(bLibrary);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bHome) {

            ImgPanel.image = new ImageIcon("C:\\programowanie\\Life simulation\\src\\pl\\painm\\img\\dom.jpg").getImage();
           GameFrame.imgpanel.repaint();
            new Home();
        }
        if (e.getSource()==bHospital) {

            ImgPanel.image = new ImageIcon("C:\\programowanie\\Life simulation\\src\\pl\\painm\\img\\szpital.jpg").getImage();
            GameFrame.imgpanel.repaint();
            new Hospital();
        }
        if (e.getSource()==bOffice) {
            ImgPanel.image = new ImageIcon("C:\\programowanie\\Life simulation\\src\\pl\\painm\\img\\biuro.jpg").getImage();
            GameFrame.imgpanel.repaint();
            new Office();
        }
        if (e.getSource()==bGym) {
            ImgPanel.image = new ImageIcon("C:\\programowanie\\Life simulation\\src\\pl\\painm\\img\\silka.jpg").getImage();
            GameFrame.imgpanel.repaint();
            new Gym();
        }
        if (e.getSource()==bPub) {
            ImgPanel.image = new ImageIcon("C:\\programowanie\\Life simulation\\src\\pl\\painm\\img\\pub.jpg").getImage();
            GameFrame.imgpanel.repaint();
            new Pub();
        }
        if (e.getSource()==bShop) {
            new Shop();
            ImgPanel.image = new ImageIcon("C:\\programowanie\\Life simulation\\src\\pl\\painm\\img\\sklep.jpg").getImage();
            GameFrame.imgpanel.repaint();
        }
        if (e.getSource()==bLibrary) {
            new Library();
            ImgPanel.image = new ImageIcon("C:\\programowanie\\Life simulation\\src\\pl\\painm\\piwo.jpg").getImage();
            GameFrame.imgpanel.repaint();
        }
    }
}
