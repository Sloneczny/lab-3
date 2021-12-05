import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
             Punkt A = new Punkt(8);
             A.toString();
             Punkt B = new Punkt( 1, 2 ,3 );
             B.toString();
             B.setpX(5);
             B.setpY(8);
             B.setpZ(6);
             B.toString();
        System.out.println("X" + " " + B.getpX());
        System.out.println("Y" + " " + B.getpY());
        System.out.println("Z" + " " + B.getpZ());
        System.out.println("suma" + " " + B.suma());
        System.out.println("roznica pierwsza " + " " + B.roznica());
        System.out.println("roznica dróga " + " " + B.roznica(1,2,3));
    }
}
