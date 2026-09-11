/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class nivel2 {

    public void nivel5() {

        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[8];
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
            suma = suma + numeros[i];
        }
        double promedio = suma / numeros.length;
        System.out.printf("El promedio general es: %.2f%n", promedio);

    }

    public void nivel6() {

          boolean[] asistencia = {true, false, true, true, false, true, true, false, true, false, true, true, true, false, true, true, true, true, false, true};
        int asistieron = 0;
        int faltaron = 0;
         for (int i = 0; i < asistencia.length; i++) {
            if (asistencia[i] == true) {
                asistieron++;
            } else {
                faltaron++;
            }
        }
        double porcentaje = (asistieron * 100.0) / asistencia.length;
        System.out.println("Total de estudiantes: " + asistencia.length);
        System.out.println("Asistieron: " + asistieron);
        System.out.println("Faltaron: " + faltaron);
        System.out.printf("Porcentaje de asistencia: %.2f%%%n", porcentaje);
    }

}//fin de la clase 
