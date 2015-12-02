package ulozeninacteniobjektu;

// třída pro definici položky v telefonním seznamu

public class PolozkaTelSeznamu {
    String jmeno;
    String prijmeni;
    long cislo;
    
    // napíšeme svoji metodu pro výpis objektu v podobě textu
    // třída dědí implicitní metodu toString() ze třídy Object,
    // která je automatickým kořenovým rodičem všech tříd
    @Override
    public String toString() {
        String vystup;
        vystup = "Jméno: " + this.jmeno + "\r\n";
        vystup += "Příjmení: " + this.prijmeni + "\r\n";
        vystup += "Telefoní číslo: " + this.cislo + "\r\n";
        return(vystup);
    }
}
