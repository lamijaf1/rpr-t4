package ba.unsa.etf.rpr.tutorijal04;

import java.util.Map;

public  class PlanStudija {

    private int ciklus;
    private String smjer;
    Map<Integer, Upis> plan;
    public PlanStudija(int ciklus, String smjer){}
    public int getCiklus() {
        return ciklus;
    }

    public void setCiklus(int ciklus) {
        this.ciklus = ciklus;
    }

    public String getSmjer() {
        return smjer;
    }

    public void setSmjer(String smjer) {
        this.smjer = smjer;
    }
}
