package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class MasterStudij extends VrsteStudija{
    private ArrayList<RedovniPredmeti> listaObaveznih;
    private ArrayList<IzborniPredmeti> listaIzbornih;
    private int ects;
    private int semestar;
    MasterStudij(int ciklus, String smjer, int ects){
        super(ciklus, smjer);
        this.setEcts(ects);
    }

    public ArrayList<RedovniPredmeti> getListaObaveznih() {
        return listaObaveznih;
    }

    public void setListaObaveznih(ArrayList<RedovniPredmeti> listaObaveznih) {
        this.listaObaveznih = listaObaveznih;
    }

    public ArrayList<IzborniPredmeti> getListaIzbornih() {
        return listaIzbornih;
    }

    public void setListaIzbornih(ArrayList<IzborniPredmeti> listaIzbornih) {
        this.listaIzbornih = listaIzbornih;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }
}
