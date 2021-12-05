import javax.swing.*;

public class Student
{
    public String imie ;
    public String nazwisko;
    public int nr_indeksu;
    public boolean status;


    public Student(  String imie_ , String nazwisko_, int nr_indeksu_, boolean status)
    {
        this.nazwisko=nazwisko_;
        this.imie=imie_;
        this.nr_indeksu= nr_indeksu_;
        this.status= status;

    }
    public void WypiszInfo()
    {
        System.out.println("Imie:" + " " + imie);
        System.out.println("Nazwisko: " +  " " + nazwisko );
        System.out.println("Numer indeksu:" + " "+ nr_indeksu);
        if(status == true)
        {
            System.out.println("aktywny");

        }
        else
            System.out.println("nieakatywny");

    }








}
