/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;
import java.util.*;

/**
 *
 * @author Titouan
 */
public class Ensemble_livres {
    
    private ArrayList<Livre> livres = new ArrayList<Livre>();
    
    public int existe(String c) {
        for(int i = 0; i < livres.size(); i++) {
            if (livres.get(i).getCode() == c) {
                return i;
            }
        }
        return -1;
    }
    
    public int rechTitre(String c) {
        for(int i = 0; i < livres.size(); i++) {
            if (livres.get(i).getTitre() == c) {
                return i;
            }
        }
        return -1;
    }
    
    public void ajouter(Livre l) {
        livres.add(l);
    }
    
    public int cardinal() {
        return livres.size();
    }
    
    public void obtenirListe() {
        for(Livre l : livres) {
            l.toString();
        }
    }
    
    public void obtenirListe(String a) {
        for(Livre l : livres) {
            if(l.getAuteur() == a) {
               l.toString(); 
            }
        }
    }
    
    public void supprimer(int i) {
        if(livres.contains(i)) {
            livres.remove(i);
        }
    }
    
    public Livre obtenirLivre(int i) {
        if(livres.contains(i)) {
            return livres.get(i);
        } else {
            return null;
        }
    }
    
}
