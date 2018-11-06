package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class MasterStudij extends PlanStudija {
    private ArrayList<Predmet> predmeti;
    private int ects;
    private int semestar;
    MasterStudij(int ciklus, String smjer, int ects){
        super(ciklus, smjer);
        this.setEcts(ects);
    }


    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
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
