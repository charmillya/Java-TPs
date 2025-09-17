/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;

/**
 *
 * @author Titouan
 */
public class Palindrome {
    
    public static void main(String[] args) throws IOException {
        BufferedReader rep = new BufferedReader(new InputStreamReader(System.in));
        String recommencer = "";
        
        do {
            System.out.println("Saisis une phrase .. :");
            String phrase = rep.readLine();
            String phraseEpuree = phrase.replaceAll("\\s", "").toLowerCase();
            phraseEpuree = Normalizer.normalize(phraseEpuree, Normalizer.Form.NFD)
                    .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                    .replaceAll("[^a-zA-Z0-9]", "");
            
            StringBuilder phraseInversee = new StringBuilder("");
            int compteur = 0;

            for(int i = phraseEpuree.length(); i > 0; i--) {
                phraseInversee.insert(compteur, phraseEpuree.charAt(i-1));
                compteur++;
            }

            if(phraseEpuree.equals(phraseInversee.toString())) {
                System.out.println("C'est un palindrome !");
            } else {
                System.out.println("Ce n'est pas un palindrome ..");
            }

            System.out.println("Veux-tu essayer avec une autre phrase ?");
            recommencer = rep.readLine();
        } while(!recommencer.equals("N"));
        
    }
    
}
