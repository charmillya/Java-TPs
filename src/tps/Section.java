/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Titouan
 */
class Section {

    Scanner scanner = new Scanner(System.in);

    private String nomSection;
    private int nbEleves;
    private Eleve[] tabEleves = new Eleve[30];

    private static int positionLibre;

    public Section(int noSection) {
        nomSection = "TSSIO" + noSection;
        nbEleves = 0;
        for(var i = 0; i < tabEleves.length; i++) {
            tabEleves[i] = new Eleve();
            tabEleves[i].initial("Eleve " + (i+1), (i+1)*2.8, i*4.5);
            tabEleves[i].affiche();
        }
    }

    public void afficheNomSec() {
        System.out.println(nomSection);
    }

    public void ajouter(Eleve e) {
        System.out.println("Nom de l'élève : ");
        String nom = scanner.nextLine();
        System.out.println("Note orale : ");
        double noteOrale = scanner.nextDouble();
        System.out.println("Note écrite : ");
        double noteEcrite = scanner.nextDouble();

        tabEleves[positionLibre] = new Eleve();
        tabEleves[positionLibre].initial(nom, noteOrale, noteEcrite);

        positionLibre++;
    }

    public int effectif() {
        return this.nbEleves;
    }

    public Eleve meilleur() {
        var meilleur = new Eleve();
        for (int i = 0; i < tabEleves.length; i++) {
            if (tabEleves[i].moyenne() > meilleur.moyenne()) {
                meilleur = tabEleves[i];
            }
        }
        return meilleur;
    }

    public double moygen() {
        double moygen = 0;
        for (int i = 0; i < this.tabEleves.length; i++) {
            moygen += this.tabEleves[i].moyenne();
        }
        return moygen;
    }

    public Section compare(Section s) {
        if (s.moygen() > this.moygen()) {
            return s;
        } else {
            return this;
        }
    }

    public void afficheEleveSec() {
        if (this.tabEleves[0] == null) {
            System.out.println("Aucun élève dans la classe " + nomSection + " !");
        } else {
            for (int i = 0; i < this.tabEleves.length; i++) {
                tabEleves[i].affiche();
            }
        }
    }

    public void afficheEleveSec(double f, String tri) {
        if (this.tabEleves.length == 0) {
            System.out.println("Aucun élève dans la classe " + nomSection + " !");
        } else {
            if (tri.equals("I")) {
                for (int i = 0; i < this.tabEleves.length; i++) {
                    if (tabEleves[i].moyenne() <= f) {
                        tabEleves[i].affiche();
                    }
                }
            } else {
                for (int i = 0; i < this.tabEleves.length; i++) {
                    if (tabEleves[i].moyenne() >= f) {
                        tabEleves[i].affiche();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        Section[] lesSections = new Section[2];

        do {

            System.out.println("--- MENU ---");
            System.out.println("1. Créer une section");
            System.out.println("2. Afficher les élèves");
            System.out.println("3. Afficher les élèves d'une classe");
            System.out.println("4. Afficher les élèves d'une classe dont la moyenne est >= ou <= à la moyenne choisie");
            System.out.println("5. Afficher le meilleur élève de la classe choisie");
            System.out.println("6. Afficher le nom de la classe avec la meilleure moyenne générale");
            System.out.println("7. Fermer le programme");

            System.out.println("Tapez le numéro de la sélection désirée ci-dessous.");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    int noSection = Entree.entier("Quel est le numéro de la classe (1 ou 2) ?");
                    if (noSection < 1 || noSection > 2) {
                        System.out.println("Numéro incorrect !");
                    } else {
                        lesSections[noSection - 1] = new Section(noSection);
                        System.out.println("Classe ajoutée.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < lesSections.length; i++) {
                        if (lesSections[i] != null) {
                            lesSections[i].afficheEleveSec();
                        }
                    }
                    break;

                case 3:
                    noSection = Entree.entier("Quel est le numéro de la classe ?");
                    if (lesSections[noSection - 1] == null) {
                        System.out.println("Classe inexistante !");
                    } else {
                        Section laClasse = lesSections[noSection - 1];
                        if (laClasse.tabEleves[0] == null) {
                            System.out.println("Classe vide !");
                        } else {
                            laClasse.afficheEleveSec();
                        }
                    }
                    break;

                case 4:
                    noSection = Entree.entier("Quel est le numéro de la classe ?");
                    if (lesSections[noSection - 1] == null) {
                        System.out.println("Classe inexistante !");
                    } else {
                        Section laClasse = lesSections[noSection - 1];
                        if (laClasse.tabEleves[0] == null) {
                            System.out.println("Classe vide !");
                        } else {
                            double moyenne = Entree.entier("Quel est la moyenne en question ?");
                            String tri = Entree.car("Trier supérieur (S) à la moyenne ou inférieur (I) ?");
                            laClasse.afficheEleveSec(moyenne, tri);
                        }
                    }
                    break;

                case 5:
                    noSection = Entree.entier("Quel est le numéro de la classe ?");
                    if (lesSections[noSection - 1] == null) {
                        System.out.println("Classe inexistante !");
                    } else {
                        Section laClasse = lesSections[noSection - 1];
                        if (laClasse.tabEleves[0] == null) {
                            System.out.println("Classe vide !");
                        } else {
                            laClasse.meilleur().affiche();
                        }
                    }
                    break;

                case 6:
                    if(lesSections[0] != null && lesSections[1] != null) {
                        if(lesSections[0].tabEleves[0] == null || lesSections[1].tabEleves[0] == null) {
                            System.out.println("Une classe (ou les deux) est vide !");
                        } else {
                            lesSections[0].compare(lesSections[1]).afficheNomSec();
                        }
                    } else {
                        System.out.println("Les deux classes n'ont pas été renseignées !");
                    }
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Choix incorrect !");
                    break;
            }

        } while (choix != 7);
    }

}
