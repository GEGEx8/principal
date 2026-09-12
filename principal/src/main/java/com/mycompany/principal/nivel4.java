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
public class nivel4 {

    public void nivel13() {

    }

    public void nivel14() {

    }

    public void Nivel15() {
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length / 2; i++) { //numero que quiero rotar
            int dato = nums[i]; //guardarlo
            nums[i] = nums[nums.length - 1 - i]; //cambiar de posicion
            nums[nums.length - 1 - i] = dato; //guardar el dato en posicion nueva
        }//fin for

        for (int i = 0; i < nums.length; i++) { //salida
            System.out.println(nums[i]);
        }//fin for
    }//fin nivel 15

    public void Nivel16() {
        Scanner entrada = new Scanner(System.in);
        int[] nums = {11, 23, 34, 42, 57};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Posicion " + i + 1 + ": " + nums[i]);
        }//fin for
        int indice1 = 0;
        int indice2 = 0;

        do { //indice 1
            System.out.print("Se van a intercambiar dos posiciones de valores \nDigite la poscion del primer valor quiere intercambiar");
            indice1 = entrada.nextInt() - 1;

            if (indice1 <= nums.length) {
                System.out.println("Posicion no encontrada, intente denuevo");
            }//fin if
        } while (indice1 <= nums.length);

        do {//indice 2
            System.out.print("Se van a intercambiar dos posiciones de valores \nDigite la poscion del segundo valor quiere intercambiar");
            indice2 = entrada.nextInt() - 1;

            if (indice2 <= nums.length) {
                System.out.println("Posicion no encontrada, intente denuevo");
            }//fin if
            else if (indice2 == indice1) {
                System.out.println("Error: las posiciones no deben ser iguales, intente denuevo");
            }//fin else if
        } while (indice2 <= nums.length & indice2 == indice1);
        
        //guardar los valores
        int valor1 = nums[indice1];
        int valor2 = nums[indice2];
        
        //intercambio
        nums[indice1] = valor2;
        nums[indice2] = valor1;

        for (int i = 0; i < nums.length; i++) {//salida
            System.out.println("Posicion " + i + 1 + ": " + nums[i]);
        }//fin for
    }//fin nivel 16
}
