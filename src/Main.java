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
        student[0]= new Student("Jan" , "Kowalski" ,116 , false);
        student[1] = new Student("Bogdan", "jolek" ,5888,true);
        student[2] = new Student("Kamil" , "Kokoszek" , 519778 ,true);
        for (Student p : student)
        {
            p.WypiszInfo();
            System.out.println();
            //System.out.println("Imie:" + " " + p.imie);
            //System.out.println("Nazwisko: " +  " " + p.nazwisko );
            //System.out.println("Numer indeksu:" + " "+ p.nr_indeksu);
            //System.out.println("status" + " " + p.status);
            //System.out.println();


        }



    }
}


