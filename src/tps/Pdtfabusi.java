/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
public class Pdtfabusi extends Pdtfab {
    private String nomUsine;

    public Pdtfabusi(String ref, String des, float pdv, float coutMatPrem, float coutMainOeuvre, String nomUsine) {
        super(coutMatPrem, coutMainOeuvre, ref, des, pdv);
        this.nomUsine = nomUsine;
    }
    
    public void affiche() {
        super.affiche();
        System.out.println(" " + nomUsine);
    }
}
