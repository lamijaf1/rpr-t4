package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Student {
    private String imeStudenta;
    private int brojIndeksa;
    private String Adresa;
    private String BrojTelefona;
    private int godinaUpisa;
    private int BrojPolozenihEcts; //od pocetka studija pa do danas
    private ArrayList<Predmet> Predmeti; // koje slusa trenutno;


    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    public String getBrojTelefona() {
        return BrojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        BrojTelefona = brojTelefona;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public int getBrojPolozenihEcts() {
        return BrojPolozenihEcts;
    }

    public void setBrojPolozenihEcts(int brojPolozenihEcts) {
        BrojPolozenihEcts = brojPolozenihEcts;
    }
}
