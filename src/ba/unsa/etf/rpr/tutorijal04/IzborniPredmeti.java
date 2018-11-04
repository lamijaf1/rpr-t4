package ba.unsa.etf.rpr.tutorijal04;

public class IzborniPredmeti extends Predmet {


    public IzborniPredmeti(String ime, int Semestar, int ects){
        super(ime,Semestar, ects);
    }
    @Override
    public void DodajStudentaNaPredmet(Student novi){}
    @Override
    public void UkloniStudenta(Student stari){}
    @Override
    public void IspisiListuStudenata(){}
}
