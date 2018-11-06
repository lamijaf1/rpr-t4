package ba.unsa.etf.rpr.tutorijal04;

public class Upis {
    private PlanStudija plan;
    private Student student;
    private Predmet predmet;

    public Upis(Student student, Predmet predmet, PlanStudija plan) {
        this.setStudent(student);
        this.setPredmet(predmet);
        this.setPlan(plan);
    }


    public PlanStudija getPlan() {
        return plan;
    }

    public void setPlan(PlanStudija plan) {
        this.plan = plan;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }
}
