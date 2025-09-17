/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tps;
import java.io.*;
import tps.Entree;

/**
 *
 * @author Titouan
 */
public class Factorielle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int reponse = Entree.entier("Nombre en question ?");
        
        int factorielle = 1;
        for(int i = 1; i < reponse; i++) {
            factorielle += factorielle * i;
        }
        
        System.out.println("La factorielle en question est " + factorielle);
        
    }
    
}
