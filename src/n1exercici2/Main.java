package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> listilla = new ArrayList<>();
        listilla.add(0);
        listilla.add(1);
        listilla.add(2);
        listilla.add(3);
        listilla.add(4);
        listilla.add(5);
        listilla.add(6);
        listilla.add(7);
        listilla.add(8);
        listilla.add(9);

        /*List<Integer> notanlistilla = new ArrayList<>();
        int tamanio = listilla.size();
        while (tamanio > 0)
            notanlistilla.add(listilla.get(--tamanio));

        for (Integer i : notanlistilla)
            System.out.println(i);*/

        ListIterator<Integer> listIterator = listilla.listIterator();
        /*while (listIterator.hasNext())
            System.out.println("iterador:" + listIterator.next());*/
        List<Integer> notanlistilla = new ArrayList<>();
        int i = 0;
        while (listIterator.hasNext())
            listIterator.next();
        while (listIterator.hasPrevious())
            notanlistilla.add(listIterator.previous());
        for (Integer h : notanlistilla)
            System.out.println("ntl: " + h);
    }
}
