/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tps;
import java.io.*;

/**
 *
 * @author Titouan
 */
public class Factorielle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Nombre en question?");
        BufferedReader rep = new BufferedReader(new InputStreamReader(System.in));
        int reponse = Integer.parseInt(rep.readLine());
        
        int factorielle = 1;
        for(int i = 1; i < reponse; i++) {
            factorielle += factorielle * i;
        }
        
        System.out.println("La factorielle en question est " + factorielle);
        
    }
    
}
