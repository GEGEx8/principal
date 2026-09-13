/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author gomez
 */
public class nivel5 {

    public void nivel17() {
        int[] arreglo1 = {11, 40, 30, 4, 50};
        int[] arreglo2 = {5, 32, 15, 77, 25};
        int[] suma = new int[5];
        for (int i = 0; i < arreglo1.length; i++) {
            suma[i] = arreglo1[i] + arreglo2[i];
        }
        System.out.println("Arreglo 1:");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println("\nArreglo 2:");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print(arreglo2[i] + " ");
        }
        System.out.println("\nResultado:");
        for (int i = 0; i < suma.length; i++) {
            System.out.print(suma[i] + " ");
        }
    }

    public void nivel18() {
        double[] precios1 = {10.50, 2.8, 15.75, 30.0, 5.5};
        double[] precios2 = {8.50, 25.8, 12.75, 25.5, 30.5};
        double[] diferencias = new double[5];

        double suma = 0;

        for (int i = 0; i < precios1.length; i++) {
            diferencias[i] = Math.abs(precios1[i] - precios2[i]);
            suma = suma + diferencias[i];
        }

        double promedio = suma / diferencias.length;

        System.out.println("Diferencias:");

        for (int i = 0; i < diferencias.length; i++) {
            System.out.println(diferencias[i]);
        }

        System.out.println("Promedio de las diferencias: " + promedio);
    }
}//FIN CLASE 
