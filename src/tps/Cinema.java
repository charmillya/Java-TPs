/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

import java.io.*;
import java.util.stream.*;

/**
 *
 * @author Titouan
 */
public class Cinema {

    public static void main(String[] args) throws IOException {
        BufferedReader rep = new BufferedReader(new InputStreamReader(System.in));
        String recommencer = "O";

        String[] tabCSP = {
            "Agriculteur",
            "Ouvrier",
            "CommerÃ§ant",
            "Enseignant",
            "Cadre moyen",
            "Cadre supérieur",
            "Profession libérale",
            "Chef d'entreprise",
            "Artiste"
        };

        int[] tabAucun = new int[8];
        int[] tab50 = new int[8];
        int[] tabNbPersonnes = new int[8];

        System.out.println("Bienvenue dans notre service de sondages cinématographiques.");

        do {
            System.out.println("Pour commencer, quel est le code de la CSP de la personne sondée ?");
            int codeCSP = Integer.parseInt(rep.readLine());
            if (codeCSP < 1 || codeCSP > 9) {
                System.out.println("Le code CSP est invalide !");
            } else {
                tabNbPersonnes[codeCSP - 1] += 1;

                System.out.println("Ensuite, combien de films as-t-elle vus dans l'année ?");
                int nbFilmsVus = Integer.parseInt(rep.readLine());
                if (nbFilmsVus == 0) {
                    tabAucun[codeCSP - 1] += 1;
                } else if (nbFilmsVus >= 50) {
                    tab50[codeCSP - 1] += 1;
                }
            }

            System.out.println("Voulez-vous interroger une autre personne ?");
            recommencer = rep.readLine();
        } while (!recommencer.equals("N"));

        System.out.println("RECAPITULATIF DU SONDAGE :");

        int sommeTabAucun = IntStream.of(tabAucun).sum();
        int sommeTab50 = IntStream.of(tab50).sum();

        // évite les divisions par 0
        if (sommeTabAucun > 0) {
            System.out.println("0 films :");
            for (int i = 0; i < tabAucun.length; i++) {
                System.out.println("Catégorie " + tabCSP[i] + " (" + tabNbPersonnes[i] + " interrogés) : " + Math.round((tabAucun[i] * 100) / sommeTabAucun) + "%");
            }
        }

        // évite les divisions par 0
        if (sommeTab50 > 0) {
            System.out.println("50 films ou + :");
            for (int i = 0; i < tab50.length; i++) {
                System.out.println("Catégorie " + tabCSP[i] + " (" + tabNbPersonnes[i] + " interrogés) : " + Math.round((tab50[i] * 100) / sommeTab50) + "%");
            }
        }
        
        if(sommeTabAucun == 0 && sommeTab50 == 0) {
            System.out.println("Aucune donnée exploitable !");
        }
    }
}
