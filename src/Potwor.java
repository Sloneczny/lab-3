public class Potwor
{
    protected double predkosc_chodzenia;
    protected double HP;
    public String nazwa;
    private String bron;

    public Potwor()
    {

    }

    public Potwor(double predkosc, double HP, String nazwa , String bron) {
        this.predkosc_chodzenia = predkosc;
        this.HP = HP;
        this.nazwa=nazwa;
        this.bron=bron;
    }

    void atak()
    {
        System.out.println("Giń!!!");
    }

    public double getPredkosc_chodzenia() {
        return predkosc_chodzenia;
    }

    public void setPredkosc_chodzenia(double predkosc_chodzenia) {
        this.predkosc_chodzenia = predkosc_chodzenia;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


    public String getBron() {
        return bron;
    }

    public void setBron(String bron) {
        this.bron = bron;
    }

    @Override
    public String toString() {
        return "Potwor{" +
                "predkosc_chodzenia=" + predkosc_chodzenia +
                ", HP=" + HP +
                ", nazwa='" + nazwa + '\'' +
                ", bron='" + bron + '\'' +
                '}';
    }
}

