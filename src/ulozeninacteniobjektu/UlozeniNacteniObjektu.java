// 1) vytiskněte objekt v podobě textu pomocí metody toString()
// 2) zapište objekt do souboru v podobě textu

package ulozeninacteniobjektu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UlozeniNacteniObjektu {

    public static void main(String[] args) {
        TelefonniSeznam polozka1;
        polozka1 = new TelefonniSeznam();
        polozka1.jmeno = "René";
        polozka1.prijmeni = "Hužva";
        polozka1.cislo = 608123456;
        
        // Zde se použije metoda toString()
        // Metodu toString() má každý objekt implicitní, ale nám
        // nevyhovuje, tak je v třídě TelefonniSeznam napsána znova.
        System.out.println(polozka1);
        
        // zápis do souboru bude využívat metodu toString(), která
        // vlastně vytvoří (serializovanou) posloupnost znaků
        // (tj. výpis objektu v podobě textového výstupu)
        BufferedWriter vystup;
        try {
            vystup = new BufferedWriter(new FileWriter("pokus.txt"));
            vystup.write(polozka1.toString());
            vystup.close();
        } catch (IOException ex) {
            Logger.getLogger(UlozeniNacteniObjektu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
