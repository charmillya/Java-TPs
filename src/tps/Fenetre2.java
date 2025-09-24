/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
import javax.swing.*;

import javax.swing.event.*;

import java.awt.*;

import java.awt.event.*;

public class Fenetre2 extends JFrame {

    public Fenetre2() {
        addWindowListener(new EventFenetre2());

        setTitle("Maxi W");

        setSize(800, 600);

        JPanel j = (JPanel) getContentPane();

        // On indique qu'on utilise GridLayout au niveau du conteneur "implicite" de la fenêtre
        j.setLayout(new GridLayout(8, 1, 0, 6));

        FlowLayout division = new FlowLayout(FlowLayout.LEFT);
    }

    public static void main(String argv[]) {

        Fenetre2 fen = new Fenetre2();

        fen.setVisible(true);

    }

    // On définit une classe interne pour l’écoute de la fenêtre (on utilise WindowAdapter car on souhaite coder uniquement les
// méthodes windowsOpened et windowClosing)
    public class EventFenetre2 extends WindowAdapter {

        public void windowClosing(WindowEvent e) {

            System.exit(0);

        }

    }

}
