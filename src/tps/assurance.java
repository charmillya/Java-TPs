/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

import java.io.*;

/**
 *
 * @author Titouan
 */
public class assurance {

    public static void main(String[] args) throws IOException {
        int nbPoints = 0;
        System.out.println("Quel âge as-tu ?");
        BufferedReader rep = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(rep.readLine());

        if (age < 18) {
            System.out.println("Tu n'as pas l'âge requis !");
        } else {
            if (age >= 25) {
                nbPoints++;
            }

            System.out.println("Depuis combien d'années possèdes-tu ton permis ?");
            int anneesPermis = Integer.parseInt(rep.readLine());
            if (anneesPermis < 0) {
                System.out.println("Le nombre saisi est incorrect !");
            } else {
                if (anneesPermis >= 2) {
                    nbPoints++;
                }

                System.out.println("Combien d'accidents as-tu eu?");
                int nbAccidents = Integer.parseInt(rep.readLine());
                if (nbAccidents < 0) {
                    System.out.println("Le nombre saisi est incorrect !");
                } else {
                    if (nbAccidents > 0) {
                        nbPoints = nbPoints - nbAccidents;
                    }

                    if (nbPoints >= 0) {
                        System.out.println("As-tu un an ou plus d'ancienneté au sein de la compagnie ? (O/N)");
                        String reponseAnciennete = rep.readLine();
                        if (reponseAnciennete == "O") {
                            nbPoints++;
                        }
                    }
                    
                    if(nbPoints <= 0) {
                        System.out.println("Tu appartiens à la famille des tarifs rouges.");
                    } else if (nbPoints == 1) {
                        System.out.println("Tu appartiens à la famille des tarifs oranges.");
                    } else if (nbPoints == 2) {
                        System.out.println("Tu appartiens à la famille des tarifs verts.");
                    } else if (nbPoints == 3) {
                        System.out.println("Tu appartiens à la famille des tarifs bleus.");
                    }
                }
            }
        }
    }
}
