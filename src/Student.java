public class Student extends Osoba
{


    Student(String imie, String nazwisko, int indeks)
    {
        super(imie, nazwisko, indeks);
    }
    private enum WydzialEnum
    {
        INFORMATYKA , LOGISTYKA , MATEMAYKA;

        @Override
        public String toString() {
            return "WypiszInfo()" + "WydzialEnum{}";
        }
    }
}
