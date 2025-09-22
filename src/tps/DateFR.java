/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author Titouan
 */
public class DateFR {
    
    public String nomJour() {
        return LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE);
    }
    
    public String nomMois() {
        return LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE);
    }
    
    public int annee() {
        return LocalDate.now().getYear();
    }

    public int noJourSemaine() {
        return LocalDate.now().getDayOfWeek().getValue();
    }
    
    public int noJourMois() {
        return LocalDate.now().getMonthValue();
    }

    public static void main(String[] argv) {
        DateFR date1 = new DateFR();
        
        System.out.println(date1.annee());
    }

}
