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

public class Fenetre extends JFrame {

    JLabel lblcivil, lblnom, lblprénom, lblloisirs, lblmsg;

    JComboBox cbocivil;

    JButton btnok, btnannul, btnrecap;

    JRadioButton optarle, optda, opt1, opt2, optig, optad;

    JCheckBox chksport, chkcinéma, chkmusique, chklecture, chkboursier;

    JTextField txtnom, txtprénom;

    JList lstrégime;

    public Fenetre() {

        addWindowListener(new EvenIhm());

        setTitle("Etudiant au lycée Rabelais");

        setSize(800, 600);

        JPanel j = (JPanel) getContentPane();

        // On indique qu'on utilise GridLayout au niveau du conteneur "implicite" de la fenêtre
        j.setLayout(new GridLayout(8, 1, 0, 6));

        FlowLayout division = new FlowLayout(FlowLayout.LEFT);

        // CRÉATION DE LA PARTIE0 (CONTENANT LA CIVILITÉ, LE NOM ET LE PRÉNOM)
        JPanel partie0 = new JPanel(division);

        j.add(partie0);

        // Création de l'étiquette civilité                             
        lblcivil = new JLabel("Civilité : ");

        partie0.add(lblcivil);

        cbocivil = new JComboBox();

        cbocivil.addItem("M.");

        cbocivil.addItem("Mme");

        cbocivil.addItem("Melle");

        partie0.add(cbocivil);

        lblnom = new JLabel("Nom : ");

        partie0.add(lblnom);

        txtnom = new JTextField("                     ");

        partie0.add(txtnom);

        lblprénom = new JLabel("Prénom : ");

        partie0.add(lblprénom);

        txtprénom = new JTextField("                    ");

        partie0.add(txtprénom);

        // CRÉATION DE LA PARTIE1 (CONTENANT LE REGIME)
        JPanel partie1 = new JPanel(division);

        j.add(partie1);

        // Création de la liste déroulante
        String[] liste = {"Externe", "Demi-pensionnaire", "Interne"};

        lstrégime = new JList(liste);

        partie1.add(lstrégime);

        chkboursier = new JCheckBox("Boursier");

        partie1.add(chkboursier);

        lstrégime.addListSelectionListener(new Lst());

        chkboursier.setVisible(false);

        // CRÉATION DE LA PARTIE2 (CONTENANT LE BTS, L'ANNEE ET EVENTUELLEMENT L'OPTION)
        JPanel partie21 = new JPanel(division);

        j.add(partie21);

        JPanel partie22 = new JPanel(division);

        j.add(partie22);

        JPanel partie23 = new JPanel(division);

        j.add(partie23);

        // Création d'un groupe de boutons pour obtenir l'exclusion des boutons radios entre eux
        ButtonGroup gpbts = new ButtonGroup();

        // Création du 1er bouton radio et incorporation dans le groupe
        optig = new JRadioButton("BTS informatique de gestion");

        gpbts.add(optig);

        partie21.add(optig);

        // Création du 2nd bouton radio et incorporation dans le groupe
        optig.addActionListener(new Opt());

        optad = new JRadioButton("BTS assistant de direction");

        gpbts.add(optad);

        partie21.add(optad);

        optad.addActionListener(new Opt());

        // Création du groupe de boutons radio pour l’année
        ButtonGroup gpan = new ButtonGroup();

        // Création du 1er bouton radio et incorporation dans le groupe
        opt1 = new JRadioButton("1ère année");

        gpan.add(opt1);

        partie22.add(opt1);

        opt1.addActionListener(new Opt());

        // Création du 2nd bouton radio et incorporation dans le groupe
        opt2 = new JRadioButton("2ème année");

        gpan.add(opt2);

        partie22.add(opt2);

        opt2.addActionListener(new Opt());

        // Création du groupe de boutons radio pour l’option en 2ème année
        ButtonGroup gpopt = new ButtonGroup();

// Création du 1er bouton radio et incorporation dans le groupe
        optda = new JRadioButton("DA");

        gpopt.add(optda);

        partie23.add(optda);

        // Création du 2nd bouton radio et incorporation dans le groupe
        optarle = new JRadioButton("ARLE");

        gpopt.add(optarle);

        partie23.add(optarle);

        optda.setVisible(false);

        optarle.setVisible(false);

        // CRÉATION DE LA PARTIE3 (CONTENANT LES LOISIRS DE L'ÉTUDIANT)
        JPanel partie3 = new JPanel(division);

        j.add(partie3);

        lblloisirs = new JLabel("Vos loisirs : ");

        // Par défaut, aucune case n'est sélectionnée. Si on souhaite
        // en sélectionner par défaut, il faut utiliser setSelected ou bien il faut la créer avec true.
        chksport = new JCheckBox("Sport");

        chkcinéma = new JCheckBox("Cinéma");

        chkmusique = new JCheckBox("Musique");

        chklecture = new JCheckBox("Lecture");

        partie3.add(lblloisirs);

        partie3.add(chksport);

        partie3.add(chkcinéma);

        partie3.add(chkmusique);

        partie3.add(chklecture);

        // CRÉATION DE LA PARTIE4 (CONTENANT LES BOUTONS OK ET ANNULER)
        JPanel partie4 = new JPanel(division);

        j.add(partie4);

        // Création des boutons Ok et Annuler
        btnok = new JButton("OK");

        // Enregistrement des boutons auprès de l'objet écouteur, on
        // pourrait procéder comme dans l'exemple précédent mais ici on va créer un objet écouteur par
// composant à écouter
        btnok.addActionListener(new OkBoutonListener());

        partie4.add(btnok);

        btnannul = new JButton("Annuler");

        btnannul.addActionListener(new AnnulBoutonListener());

        partie4.add(btnannul);
        
        btnrecap = new JButton("Récapitulatif");
        btnrecap.addActionListener(new RecapBoutonListener());
        partie4.add(btnrecap);

        // CRÉATION DE LA PARTIE5 (CONTENANT LE RÉSULTAT DE LA SAISIE)
        JPanel partie5 = new JPanel(division);

        j.add(partie5);

        lblmsg = new JLabel("");

        partie5.add(lblmsg);

    }

    public static void main(String argv[]) {

        Fenetre fen = new Fenetre();

        fen.setVisible(true);

    }

    // On définit une classe interne pour l’écoute du bouton OK
    public class OkBoutonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String msg = cbocivil.getSelectedItem() + " " + txtprénom.getText() + " " + txtnom.getText();

            // On aurait pu écrire :
            // String msg = cbocivil.getItemAt(cbocivil.getSelectedIndex()) + " " + txtprénom.getText() + " " +
// txtnom.getText();
            if (optig.isSelected()) {
                msg += optig.getText();
            } else {
                msg += optad.getText();
            }

            lblmsg.setText(msg);

        }

    }

    // On définit une classe interne pour l’écoute du bouton Annuler
    public class AnnulBoutonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            lblmsg.setText("Annuler appuyé");

        }

    }
    
    public class RecapBoutonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            Fenetre2 nvFen = new Fenetre2();
            nvFen.setVisible(true);
        }
    }

    // On définit une classe interne pour l’écoute des boutons radio opt1, opt2, optad et optig
    public class Opt implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            // Si l’étudiant est en 2ème année de BTSIG, il faut rendre visibles les boutons radio pour l’option
// (ARLE OU DA)
            if (optig.isSelected() && opt2.isSelected()) {

                optda.setVisible(true);

                optarle.setVisible(true);

            } else {

                optda.setVisible(false);

                optarle.setVisible(false);

            }

        }

    }

    // On définit une classe interne pour l’écoute du Jlist lstrégime
    public class Lst implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {

            if (lstrégime.getSelectedIndex() >= 1) {
                chkboursier.setVisible(true);
            } else {
                chkboursier.setVisible(false);
            }

        }

    }

    // On définit une classe interne pour l’écoute de la fenêtre (on utilise WindowAdapter car on souhaite coder uniquement les
// méthodes windowsOpened et windowClosing)
    public class EvenIhm extends WindowAdapter {

        public void windowOpened(WindowEvent e) {

            // Code effectué après le constructeur
            setTitle(getTitle() + " 8, rue Rabelais 22000 St-Brieuc");

        }

        public void windowClosing(WindowEvent e) {

            System.exit(0);

        }

    }

}
