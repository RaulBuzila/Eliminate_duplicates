package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * Created by raulbuzila on 11/20/2015.
 */

public class Main {

    private static final int MAXVALUE = 49;
    private static final int MAXEXTRASE = 6;

    public static void main(String[] args) {

        //functie random pentru generarea numerelor mele
        Random extragere = new Random();

        //declarare array de 49 de numere pentru numerelele mele
        int[] NumereleMele = new int[MAXEXTRASE];

        //declarare array pentru numerele generate de calculator
        int[] NumereCalculator = new int[MAXEXTRASE];

        //afisare data
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();


        System.out.println("Numerele extrase astazi");
        //generarea seriei de numere extrase de calculator
        for (int i = 0; i < MAXEXTRASE; i++) {
            NumereCalculator[i] = extragere.nextInt(MAXVALUE) + 1;


            //eliminarea duplicatelor
            int current = NumereCalculator[0];
            boolean found = false;

            for (int j = 0; j < NumereCalculator.length; j++) {
                if (current == NumereCalculator[i] && !found) {
                    found = true;
                } else if (current != NumereCalculator[i]) {
                    System.out.print(" " + current);
                    current = NumereCalculator[i];
                    found = false;

                }
            }
            System.out.print(" " + current);
        }







    }
}
