/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
public class Pdtfabatl extends Pdtfab {
    private String nomAtelier;

    public Pdtfabatl(String ref, String des, float pdv, float coutMatPrem, float coutMainOeuvre, String nomAtelier) {
        super(coutMatPrem, coutMainOeuvre, ref, des, pdv);
        this.nomAtelier = nomAtelier;
    }
    
    public void affiche() {
        super.affiche();
        System.out.println(" " + nomAtelier);
    }
}
