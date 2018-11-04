package ba.unsa.etf.rpr.tutorijal04;

public abstract class VrsteStudija {
    private int ciklus;
    private String smjer;
    public VrsteStudija(int ciklus, String smjer){}


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
