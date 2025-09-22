/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
public class Pdtach extends Produit {
    private String nomFournisseur;
    private float prixAchat;

    public Pdtach(String ref, String des, int pdv, String nomFournisseur, float prixAchat) {
        super(ref, des, pdv);
        this.nomFournisseur = nomFournisseur;
        this.prixAchat = prixAchat;
    }
    
    public void affiche() {
        super.affiche();
        System.out.println(" " + nomFournisseur + " " + prixAchat);
    }

}
