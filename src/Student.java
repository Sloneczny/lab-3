public class Student extends Osoba
{
    @Override
    public String toString() {
        return "WypiszInfo()" + "WydzialEnum{} Student{" +
                "osoba=" + osoba +
                '}';
    }

    private Osoba osoba;
    private enum WydzialEnum
    {
        INFORMATYKA , LOGISTYKA , MATEMAYKA;


    }

    Student(String imie, String nazwisko, int indeks)
    {
        super(imie, nazwisko, indeks);

    }


}
