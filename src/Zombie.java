public class Zombie extends Potwor
{
    public Zombie(double predkosc, double HP, String nazwa , String bron)
    {
        super(predkosc, HP, nazwa, bron);
        System.out.println("Atak Zombie");

    }

    @Override
    void atak() {
        super.atak();
    }


}
