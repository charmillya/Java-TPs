/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
public class Carre {
    public float longueur;
    
    public Carre(float longueur) {
        this.longueur = longueur;
    }
    
    public float longueur() {
        return longueur;
    }
    
    public float surface() {
        return longueur * longueur;
    }
    
    public float perimetre() {
        return longueur * 4;
    }
}
