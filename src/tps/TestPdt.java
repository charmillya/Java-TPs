/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
class Testpdt {

    public static void main(String[] argv) {
        Pdtfabatl p1 = new Pdtfabatl("r1", "crayon", 5, 0.5F, 0.25F, "atelier1");
        Pdtach p2 = new Pdtach("r2", "stylo bille", 10, "Dupont", 6.5F);
        Pdtfabatl p3 = new Pdtfabatl("r3", "stylo feutre", 8.5F, 2.5F, 1, "atelier2");
        Pdtfabusi p4 = new Pdtfabusi("r4", "gomme", 8.5F, 2.5F, 1, "Seclin");
        p1.affiche();
        p2.affiche();
        p3.affiche();
        p4.affiche();
        System.out.println("");
        Produit tab[] = new Produit[4];
        tab[0] = p1;
        tab[1] = p2;
        tab[2] = p3;
        tab[3] = p4;
        for (int i = 0; i < 4; i++) {
            tab[i].affiche();
        }
    }
}
