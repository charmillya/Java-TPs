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
class Eleve {

    private String nom;
    private double noteOral;
    private double noteEcrit;
    
//    private static int nbEleves;
    
    public void initial(String nom, double noteOral, double noteEcrit) {
        this.nom = nom;
        this.noteOral = noteOral;
        this.noteEcrit = noteEcrit;
//        nbEleves++;
    }
    
    public double moyenne() {
        return (2 * noteEcrit + noteOral) / 3;
    }
    
    public void affiche() {
        System.out.println(this.nom + " : " + this.moyenne());
    }
    
//    public static int getNbEleves() {
//        return nbEleves;
//    }
//    
//    public static eleve meilleur(eleve[] tabEleves) {
//        var meilleur = new eleve();
//        for(int i = 0; i < tabEleves.length; i++) {
//            if(tabEleves[i].moyenne() > meilleur.moyenne()) {
//                meilleur = tabEleves[i];
//            }
//        }
//        return meilleur;
//    }
    
    
    public static void main(String[] args) throws IOException {
        
        Eleve[] tabEleves = new Eleve[5];
        for(var i = 0; i < tabEleves.length; i++) {
            tabEleves[i] = new Eleve();
            tabEleves[i].initial("Eleve " + (i+1), (i+1)*2.8, i*4.5);
            tabEleves[i].affiche();
        }
        
//        System.out.println(getNbEleves());
        System.out.println("Meilleur élève : ");
//        meilleur(tabEleves).affiche();
        
    }

}
