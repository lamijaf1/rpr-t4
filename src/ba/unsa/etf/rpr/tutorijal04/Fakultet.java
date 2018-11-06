package ba.unsa.etf.rpr.tutorijal04;

import java.util.Iterator;
import java.util.Set;

public class Fakultet {
    private String ImeFakulteta;
    private String Adresa;
    private String BrojTelefona;
    private PlanStudija vrsteStudija;
    Set<Upis>upisani;
    Fakultet(String ime, String adresa, String brojTel){}
    public void ListaPredmeta(){}
    public void ListaStudenata(){}
    public void UpisiStudenta(Upis dodaj){
        upisani.add(dodaj);
    }
    public boolean ProvjeraPrekoracenjaEcts(Student provjera){
        for(Upis u: upisani){
            if(provjera.getImeStudenta()==u.student.getImeStudenta())return false;
        }
        return true;
    }
    void IspisiStudentaSaPredmeta(Student student){
        Iterator iter = upisani.iterator();
        while(iter.hasNext()){
          //naci studenta istog imena, predmeta i plana studija i izbaciti
        }
    }
    void DodajStudentaNaPredmet(Student student){}


}
