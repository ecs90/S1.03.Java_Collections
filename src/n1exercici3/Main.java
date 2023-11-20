package n1exercici3;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        File countries = null;
        File clasificacion = null;
        FileReader fr = null;
        BufferedReader br = null;
        HashMap<String, String> hm = new HashMap<>();
        String filepath0 = "src/n1exercici3/";
        String filepath1 = filepath0 + "countries.txt";
        String filepath2 = filepath0 + "classificacio.txt";

        try {
            countries = new File(filepath1);
            fr = new FileReader(countries);
            br = new BufferedReader(fr);

            String linea;
            String[] lineas;
            while ((linea = br.readLine()) != null) {
                if(!(linea = br.readLine()).isBlank()) {
                    lineas = linea.split(" ");
                    hm.put(lineas[0], lineas[1]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        Usuari usuari = new Usuari();
        Random generator = new Random();
        Object[] values = hm.keySet().toArray();
        String[] randomValue = new String[10];
        for (int i = 0; i < 10; i++) {
            randomValue[i] = (String) values[generator.nextInt(values.length)];
            for (int j = 0; i > 0 && j < i; j++){
                if (randomValue[i].equals(randomValue[j]))
                {
                    i--;
                    break;
                }
            }
        }
        System.out.println("Las siguientes respuestas pueden contener espacios, por favor, reemplazelos con el caracter \"_\"" +
                " o la respuesta será dada como incorrecta");
        for (int i = 0; i < 10; i++) {
            System.out.println("Cuál es la capital de " + randomValue[i] + "?");
            Scanner sc = new Scanner(System.in);
            if ((hm.get(randomValue[i]).toLowerCase()).matches(sc.nextLine().toLowerCase())) {
                System.out.println("Correcto!");
                usuari.sumarUnPunto();
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("La capital de " + randomValue[i] + " es " + hm.get(randomValue[i]));
            }
            if (i != 9)
                System.out.println("Siguiente pregunta:");
        }
        try {
            clasificacion = new File(filepath2);
            if (!clasificacion.exists()) {
                clasificacion.createNewFile();
            }
        }catch(IOException e){
                e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter(filepath2, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Nom: " + usuari.getNom() + ";\nPunts: " + usuari.getPunt() + ";\n\n");
            bw.close();

            System.out.println("Record Saved!");
            //JOptionPane.showMessageDialog(null, "Record Saved!");
        } catch (Exception E) {
            System.out.println("Record not Saved!");
            //JOptionPane.showMessageDialog(null, "Record Not Saved!");
        }
    }
}