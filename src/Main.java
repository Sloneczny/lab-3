import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        Zombie z1=new Zombie(100,200,"Zombie z pancerzem","miecz + tarcza");
        System.out.println("Zombie"+ z1.toString());
        Zombie z2=new Zombie(150,150,"Zombie z mieczem","miecz ");
        System.out.println("Zombie2"+ z2.toString());
        System.out.println("");
        Szkielet s1 =new Szkielet(50,800,"Szkielet BOSS","MAGIA");
        System.out.println("SZkielet boss" + s1.toString());
        Szkielet s2 =new Szkielet(250,100,"Szkielet szybki","kamienie");
        System.out.println("SZkielet szybki" + s2.toString());

        List<Szkielet> List = new ArrayList<>();
        List.add(s1);
        List.add(s2);
        List<Zombie> Lista = new ArrayList<>();
        Lista.add(z1);
        Lista.add(z2);



        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

    }
}
