/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
public class Rectangle extends Carre {
    public float largeur;

    public Rectangle(float longueur, float largeur) {
        super(longueur);
        this.largeur = largeur;
    }
    
    public float largeur() {
        return largeur;
    }
}
