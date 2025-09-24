/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

import java.io.IOException;

/**
 *
 * @author Titouan
 */
public class ProgTest {

    public static void main(String[] args) throws IOException {
        Ensemble_livres ens1 = new Ensemble_livres();
        String recommencer = "O";
        do {
            System.out.println("MENU ----------");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Rechercher un livre à partir de son code ou de son titre");
            System.out.println("3. Afficher tous les livres");
            System.out.println("4. Supprimer un livre par code");
            System.out.println("5. Afficher les livres d'un auteur");
            System.out.println("6. Afficher les livres d'un éditeur");
            int choix = Entree.entier("Choix ?");
            switch (choix) {
                case 1:
                    String code = Entree.chaine("Code ?");
                    String titre = Entree.chaine("Titre ?");
                    String anneePublication = Entree.chaine("Année de publication ?");
                    String auteur = Entree.chaine("Auteur ?");
                    String editeur = Entree.chaine("Editeur ?");
                    ens1.ajouter(new Livre(code, titre, anneePublication, auteur, editeur));
                    System.out.println("Livre ajouté.");
                    break;

                case 2:
                    String codeTitre = Entree.chaine("Code ou titre ?");
                    int indexLivre = ens1.existe(codeTitre);
                    if (indexLivre == -1) {
                        indexLivre = ens1.rechTitre(codeTitre);
                        if(indexLivre == -1) {
                            System.out.println("Livre introuvable.");
                        } else {
                            System.out.println(ens1.obtenirLivre(indexLivre).toString());
                        }
                    } else {
                        System.out.println(ens1.obtenirLivre(indexLivre).toString());
                    }
                    break;
                    
                case 3:
                    ens1.obtenirListe();
                    break;
                    
                case 4:
                    code = Entree.chaine("Code ?");
                    int index = ens1.existe(code);
                    ens1.supprimer(index);
                    System.out.println("Livre supprimé.");
                    break;
                    
                case 5:
                    auteur = Entree.chaine("Nom de l'auteur ?");
                    ens1.obtenirListe(auteur);
                    break;
                    
                case 6:
                    editeur = Entree.chaine("Nom de l'éditeur ?");
                    ens1.obtenirListeEditeur(editeur);
                    break;

            }
            recommencer = Entree.car("Continuer le programme ?");
        } while (!recommencer.equals("N"));
    }
}
