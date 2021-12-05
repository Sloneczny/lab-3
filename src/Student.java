public class Student
{
    public String imie ;
    public String nazwisko;
    public int nr_indeksu;
    public boolean ocena;

    public Student(  String imie_ , String nazwisko_, int nr_indeksu_)
    {
        this.nazwisko=nazwisko_;
        this.imie=imie_;
        this.nr_indeksu= nr_indeksu_;



    }



    boolean WypiszInfo(int ocena)
    { if(ocena <=0)
        return true;

    else
        return false;


    }
}
