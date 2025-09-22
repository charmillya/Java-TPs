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
public class Livre {
    
    private String code;
    private String titre;
    private String anneePublication;
    private String auteur;
    private String editeur;

    public Livre(String code, String titre, String anneePublication, String auteur, String editeur) {
        this.code = code;
        this.titre = titre;
        this.anneePublication = anneePublication;
        this.auteur = auteur;
        this.editeur = editeur;
    }

    public String getCode() {
        return code;
    }

    public String getTitre() {
        return titre;
    }

    public String getAnneePublication() {
        return anneePublication;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    @Override
    public String toString() {
        return "Livre{" + "code=" + code + ", titre=" + titre + ", anneePublication=" + anneePublication + ", auteur=" + auteur + ", editeur=" + editeur + '}';
    }
    
}
