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
public class nivel3 {

    public void nivel9() {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Valor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);
    }

    public void nivel10() {

        int[] numeros = {10, 25, 8, 15, 30, 7, 20, 5, 18, 12};
        int buscar = 30;
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                posicion = i;
                break;
            }
        }
        System.out.println("Número que busca: " + buscar);
        System.out.println("Primera posicion: " + posicion);
    }

}//fin clase
