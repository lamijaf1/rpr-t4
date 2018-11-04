package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public abstract class Predmet {
    private String ImePredmeta;
    private int Semestar;
    private int ects;
    private ArrayList<Student> listaStudenata;
    private final int MaksimalanBrojStudenata=60;

    public Predmet( String imePredmeta, int semestar, int ects){
        this.ImePredmeta=imePredmeta;
        this.Semestar=semestar;
        this.ects=ects;
    }
    abstract public void DodajStudentaNaPredmet(Student novi);
    abstract public void UkloniStudenta(Student stari);
    abstract public void IspisiListuStudenata(); //one koji u trenutnom semestru slusaju predmet
    public String getImePredmeta() {
        return ImePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        ImePredmeta = imePredmeta;
    }

    public int getSemestar() {
        return Semestar;
    }

    public void setSemestar(int semestar) {
        Semestar = semestar;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

}
