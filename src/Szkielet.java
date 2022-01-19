public class Szkielet extends Potwor
{
    public Szkielet(double predkosc, double HP, String nazwa , String bron)
    {
        super(predkosc, HP, nazwa, bron);
        System.out.println("Atak Szkieleta");
    }

    @Override
    void atak() {
        super.atak();
    }


}
