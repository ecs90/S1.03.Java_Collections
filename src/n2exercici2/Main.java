package n2exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] arg) {
        List<Restaurant> lista = new ArrayList<Restaurant>();

        Restaurant pepe = new Restaurant("Pepe's", 7);
        Restaurant tino = new Restaurant("Tino's", 4);
        Restaurant almacen = new Restaurant("El viejo Almacen", 7);
        Restaurant fonte = new Restaurant("La Fonte D'Oro", 9);
        Restaurant pepero = new Restaurant("Pepe's", 5);
        Restaurant retruco = new Restaurant("Retruco", 9);
        Restaurant fany = new Restaurant("Nana Fine", 7);
        Restaurant pan = new Restaurant("El rincon del pan", 4);
        Restaurant pasta = new Restaurant("Sports Bar", 6);

        lista.add(pepe);
        lista.add(tino);
        lista.add(almacen);
        lista.add(fonte);
        lista.add(pepero);
        lista.add(retruco);
        lista.add(fany);
        lista.add(pan);
        lista.add(pasta);

        //TODO arreglar el orden que falla
        Collections.sort(lista, new Comparator() {
            @Override
            public int compare(Object softDrinkOne, Object softDrinkTwo) {
                return ((Restaurant)softDrinkOne).nom
                        .compareTo(((Restaurant)softDrinkTwo).nom);
            }
        });

        for (Restaurant res : lista)
            System.out.println(res.toString());
    }
}
