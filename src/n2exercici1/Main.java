package n2exercici1;

import java.util.HashSet;

public class Main {
    static void avoidBothRepeated(HashSet<Restaurant> hashSet, Restaurant restaurant){
        int flag = 0;
        for (Restaurant res : hashSet) {
            if (res.getNom().equals(restaurant.getNom()) && (res.getPuntuacio() == restaurant.getPuntuacio())) {
                flag = 1;
                System.out.println("El elemento " + restaurant.toString() + " ya existe.");
                break ;
            }
        }
        if (flag != 1)
            hashSet.add(restaurant);
    }

    public static void main(String[] arg) {
        HashSet<Restaurant> hashSet = new HashSet<>();

        Restaurant pepe = new Restaurant("Pepe's", 7);
        avoidBothRepeated(hashSet, pepe);
        Restaurant tino = new Restaurant("Tino's", 4);
        avoidBothRepeated(hashSet, tino);
        Restaurant almacen = new Restaurant("El viejo Almacen", 7);
        avoidBothRepeated(hashSet, almacen);
        Restaurant pepepe = new Restaurant("Pepe's", 7);
        avoidBothRepeated(hashSet, pepepe);
        Restaurant fonte = new Restaurant("La Fonte D'Oro", 9);
        avoidBothRepeated(hashSet, fonte);
        Restaurant pepero = new Restaurant("Pepe's", 5);
        avoidBothRepeated(hashSet, pepero);
        Restaurant retruco = new Restaurant("Retruco", 9);
        avoidBothRepeated(hashSet, retruco);
        Restaurant fany = new Restaurant("Nana Fine", 7);
        avoidBothRepeated(hashSet, fany);
        Restaurant pan = new Restaurant("El rincon del pan", 4);
        avoidBothRepeated(hashSet, pan);
        Restaurant pasta = new Restaurant("Sports Bar", 6);
        avoidBothRepeated(hashSet, pasta);
    }
}
