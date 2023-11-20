package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args)
    {
        Month enero = new Month("Enero");
        Month febrero = new Month("Febrero");
        Month marzo = new Month("Marzo");
        Month abril = new Month("Abril");
        Month mayo = new Month("Mayo");
        Month junio = new Month("Junio");
        Month julio = new Month("Julio");
        Month agosto = new Month("Agosto");
        Month septiembre = new Month("Septiembre");
        Month octubre = new Month("Octubre");
        Month noviembre = new Month("Noviembre");
        Month diciembre = new Month("Diciembre");

        ArrayList<Month> mesos = new ArrayList<>();
        mesos.add(enero);
        mesos.add(febrero);
        mesos.add(marzo);
        mesos.add(abril);
        mesos.add(mayo);
        mesos.add(junio);
        mesos.add(julio);
        mesos.add(septiembre);
        mesos.add(octubre);
        mesos.add(noviembre);
        mesos.add(diciembre);
        //mesos.add(diciembre);

        mesos.add(7, agosto);

        HashSet<Month> hashSet = new HashSet<Month>(mesos);
        for (Month value : hashSet) {
            System.out.println(value.getName());
        }

        System.out.println();

        for (Month mes : mesos)
            System.out.println(mes.getName());

        System.out.println();

        Iterator<Month> it = mesos.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }
}
