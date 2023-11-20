package n1exercici3;

import java.util.Scanner;

public class Usuari {
    final String  nom;
    int     punt = 0;

    public Usuari() {
        System.out.println("Ingrese un nombre o alias:");
        Scanner sc = new Scanner(System.in);
        this.nom = sc.nextLine();
    }

    public void sumarUnPunto()
    {
        this.punt++;
    }

    public String getNom() {
        return nom;
    }

    public int getPunt() {
        return punt;
    }
}
