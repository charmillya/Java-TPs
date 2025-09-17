/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tps;
import java.io.*;
import tps.entree;

/**
 *
 * @author Titouan
 */
public class factorielle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int reponse = entree.entier("Nombre en question ?");
        
        int factorielle = 1;
        for(int i = 1; i < reponse; i++) {
            factorielle += factorielle * i;
        }
        
        System.out.println("La factorielle en question est " + factorielle);
        
    }
    
}
