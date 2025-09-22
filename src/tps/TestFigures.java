/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Titouan
 */
public class TestFigures {

    public static void main(String[] argv) {
        Carre carre1 = new Carre(10);
        System.out.println("Longueur : " + carre1.longueur());
        System.out.println("Surface : " + carre1.surface());
        System.out.println("Périmètre : " + carre1.perimetre());
        
        System.out.println("----------------");
        
        Rectangle rectangle1 = new Rectangle(20, 15);
        System.out.println("Longueur : " + rectangle1.longueur());
        System.out.println("Largeur : " + rectangle1.largeur());
        System.out.println("Surface : " + rectangle1.surface());
        System.out.println("Périmètre : " + rectangle1.perimetre());
    }

}
