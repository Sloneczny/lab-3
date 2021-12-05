import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student[] student = new Student[3];
        student[0]= new Student("jan" , "kowalski" ,116 );
        student[1] = new Student("Bogdan", "jolek" ,5888);
        student[2] = new Student("Kamil" , "Kokoszek" , 519778);
        for (Student p : student)
        {
            System.out.println(p.imie + " " + p.nazwisko + " " + p.nr_indeksu);
        }



    }
}

class Student
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
