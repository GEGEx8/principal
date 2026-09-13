/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author gomez
 */
public class nivel4 {

    public void nivel13() {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numeros.length / 2; i++) {
            int temporal = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temporal;
        }
        System.out.println("Arreglo invertido:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public void nivel14() {

        int[] original = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] copia = new int[10];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        copia[0] = 67 +12 ;
        System.out.println("original:");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println("\n copia:");
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + " ");
        }

    }
}
