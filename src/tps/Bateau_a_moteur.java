/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
interface Veh_a_moteur {

    int PUISSFISCALE = 1;                   // Par défaut, c’est static et final
    int PUISSREELLE = 2;                    // Par défaut, c’est static et final

    public int rendPuissance(int i);           // Par défaut, c’est abstract

    public float rendConso();                   // Par défaut, c’est abstract
}

interface Veh_flottant {

    public float rendTirantEau();              // Par défaut, c’est abstract
}

interface Comparable {

    public int compareTo(Bateau_a_moteur bat);
}

public class Bateau_a_moteur implements Veh_a_moteur, Veh_flottant, Comparable {

    private int puissFiscale;
    private int puissReelle;
    private float conso;
    private float tirantEau;
    private float longueur;

    public Bateau_a_moteur(int pf, int pr, float c, float t, float l) {
        puissFiscale = pf;
        puissReelle = pr;
        conso = c;
        tirantEau = t;
        longueur = l;
    }

    public int rendPuissance(int i) {
        if (i == PUISSFISCALE) {
            return puissFiscale;
        } else {
            return puissReelle;
        }

    }

    public float rendConso() {
        return conso;
    }

    public float rendTirantEau() {
        return tirantEau;
    }

    public float longueur() {
        return longueur;
    }

    public void affich() {
        System.out.println("Puissance fiscale : " + rendPuissance(1));        //On peut
        // bien sûr utiliser directement la donnée
        System.out.println("Puissance réelle : " + rendPuissance(2));
        System.out.println("Consommation : " + conso);
        System.out.println("Tirant d'eau : " + tirantEau);
        System.out.println("Longueur : " + longueur);
    }

    public int compareTo(Bateau_a_moteur bat) {
        if (this.longueur > bat.longueur) {
            return 1;
        } else if (this.longueur == bat.longueur) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String liste[]) {
        Bateau_a_moteur b1 = new Bateau_a_moteur(7, 50, 30F, 1.5F, 200);
        b1.affich();
        
        Bateau_a_moteur b2 = new Bateau_a_moteur(10, 75, 40F, 8F, 550);
        System.out.println(b1.compareTo(b2));
        
    }

}
