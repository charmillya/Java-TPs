/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
public class Produit {
    private String reference;
    private String designation;
    private float pdv;
    
    public Produit(String ref, String des, float pdv) {
        reference = ref;
        designation = des;
        pdv = pdv;
    }
    
    public void affiche() {
        System.out.println(reference + " " + designation + " " + pdv);
    }
}
