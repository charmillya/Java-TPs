/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
import java.io.*;
// Classe Entree permettant la saisie et la conversion de données saisies au clavier.

public class Entree {

    static BufferedReader rep = new BufferedReader(new InputStreamReader(System.in));

    public static float flottant(String msg) throws IOException {
        System.out.println(msg);
        try {

            float valeur = Float.parseFloat(rep.readLine());
            return valeur;
        } catch (NumberFormatException e) {
            return Entree.flottant("Zone absente ou type incorrect, essayez a nouveau");

        }

    }

    public static double reeldouble(String msg) throws IOException {
        System.out.println(msg);
        try {
            double valeur = Double.parseDouble(rep.readLine());
            return valeur;
        } catch (NumberFormatException e) {
            return Entree.reeldouble("Zone absente ou type incorrect, essayez a nouveau");

        }
    }
    
    public static String car(String msg) throws IOException {
        System.out.println(msg);
        String valeur = rep.readLine().substring(0, 1);
        return valeur;
    }

    public static String chaine(String msg) throws IOException {
        System.out.println(msg);
        String valeur = rep.readLine();
        return valeur;
    }
    
    public static int entier(String msg) throws IOException {
        System.out.println(msg);
        int valeur = Integer.parseInt(rep.readLine());
        return valeur;
    }
}
