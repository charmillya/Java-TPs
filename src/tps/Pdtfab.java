/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
public class Pdtfab extends Produit {
    private float coutMatPrem;
    private float coutMainOeuvre;

    public Pdtfab(float coutMatPrem, float coutMainOeuvre, String ref, String des, float pdv) {
        super(ref, des, pdv);
        this.coutMatPrem = coutMatPrem;
        this.coutMainOeuvre = coutMainOeuvre;
    }
    
    public void affiche() {
        super.affiche();
        System.out.println(" " + coutMatPrem + " " + coutMainOeuvre);
    }
    
}
