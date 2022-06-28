package Spiel;

import java.util.*;
public class DotComVersenken {
    
    private SpielHelfer helfer = new SpielHelfer();
    private ArrayList<DotCom> dotComListe = new ArrayList<DotCom>();
    private int anzahlVersuche = 0;

    private void spielEinrichten() {
        DotCom eins = new DotCom();
        eins.setName("Skyrim.com");
        DotCom zwei = new DotCom();
        zwei.setName("Fallout.com");
        DotCom drei = new DotCom();
        drei.setName("Bethesda.com");
        dotComListe.add(eins);
        dotComListe.add(zwei);
        dotComListe.add(drei);

        System.out.println("Ihre Aufgabe ist es, drei Dot-Coms zu versenken.");
        System.out.println("Skyrim.com, Fallout.com, Bethesda.com");
        System.out.println("Versuchen Sie, sie mit so wenig Versuchen wie möglich zu erledigen.");

        for (DotCom aktuellesDotCom : dotComListe) {
            ArrayList<String> neuerOrt = helfer.platziereDotCom(3);
            aktuellesDotCom.setZellorte(neuerOrt);
        } // for-Schleife schließen
    } // Methode spielEinrichten schließen

    private void beginneSpiel(){
        while(!dotComListe.isEmpty()) {
            String rateversuch = helfer.getBenutzereingabe("Geben Sie einen Rateversuch ein");
            prüfeRateversuch(rateversuch);
        } // while schließen
        beendeSpiel();
    } // Methode beginneSpiel schließen

    private void prüfeRateversuch(String rateversuch) {
        anzahlVersuche++;
        String ergebnis = "Vorbei";

        for (DotCom aktuellesDotCom : dotComListe) {
            ergebnis = aktuellesDotCom.prüfDich(rateversuch);
            if (ergebnis.equals("Treffer")) {
                break;
            }
            if (ergebnis.equals("Versenkt")) {
                dotComListe.remove(aktuellesDotCom);
                break;
            }
        } // for schließen
        System.out.println(ergebnis);
    } // Methode schließen

    private void beendeSpiel () {
        System.out.println("Alle Dot-Coms sind versenkt! Ihre Aktien sind wertlos.");
        if (anzahlVersuche <= 18) {
            System.out.println("Sie haben nur " + anzahlVersuche +
                               "Versuche benötigt. Sie erhalten den KinoWelt-Preis!");
        } else {
            System.out.println("Hat ja lang genug gedauert. " + anzahlVersuche + " Versuche.");
            System.out.println("Warum sind Sie nicht ausgestiegen, bevor der Kurs in den Keller fiel?");
        }
    } // Methode schließen

    public static void main (String[] args) {
        DotComVersenken spiel = new DotComVersenken ();
        spiel.spielEinrichten();
        spiel.beginneSpiel();
    } // Methode schließen
}
