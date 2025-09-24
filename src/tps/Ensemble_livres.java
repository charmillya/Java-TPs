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

    public int existe(String code) {
        for (int i = 0; i < livres.size(); i++) {
            if (livres.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public int rechTitre(String c) {
        for (int i = 0; i < livres.size(); i++) {
            if (livres.get(i).getTitre().equals(c)) {
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
        for (Livre l : livres) {
            System.out.println(l.toString());
        }
    }

    public void obtenirListe(String a) {
        for (Livre l : livres) {
            if (l.getAuteur().equals(a)) {
                System.out.println(l.toString());
            }
        }
    }
    
    public void obtenirListeEditeur(String e) {
        for (Livre l : livres) {
            if (l.getEditeur().equals(e)) {
                System.out.println(l.toString());
            }
        }
    }

    public void supprimer(int i) {
        if (i >= 0 && i < livres.size()) {
            livres.remove(i);
        }
    }

    public Livre obtenirLivre(int index) {
        if (index >= 0 && index < livres.size()) {
            return livres.get(index);
        } else {
            return null;
        }
    }

    public int obtenirIndexTitre(String t) {
        for (int i = 0; i < livres.size(); i++) {
            if (livres.get(i).getTitre().equals(t)) {
                return i;
            }
        }
        return -1;
    }

}
