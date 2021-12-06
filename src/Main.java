import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Student student = new Student("Joanna" , "KOKO", 25851);
        Student student1 = new Student("Golun" , "Golota", 24111);
        Student student2 = new Student("Sebastian" , "PASSEK", 18414);
        Student student3 = new Student("Kim" , "POKOLE", 19881);
        Student student4 = new Student("Marek" , "ROBKOO", 18171);

        List<Student> studentLista = new ArrayList<>();
        studentLista.add(student);
        studentLista.add(student1);
        studentLista.add(student2);
        studentLista.add(student3);
        studentLista.add(student4);

        studentLista.toString();
    }
}
