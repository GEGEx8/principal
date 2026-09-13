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

    public void Nivel19() {
        //int[] nums = {1, 2, 3, 4, 5, 5, 9, 23, 65};
        int[] nums = {1, 2, 2, 3, 4, 1, 0, 23, 40};

        int valor = nums[0]; //inicializar con el primer valor de nums
        String salida = "El arreglo es ascendiente";

        for (int i = 0; i < nums.length; i++) {
            if (valor > nums[i]) {//encuentra un numero no ascendiente
                salida = "El arreglo NO es ascendiente";
                System.out.println("Se detuvo en " + nums[i - 1] + ", " + nums[i]);
                break; //salir del for
            }//fin if
        }//fin for

        System.out.println(salida);
    }//fin nivel 19

    public void Nivel20() {
        //int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {1, 5, 6, 5, 1};

        int valor1 = nums[0]; //inicializar con el primer valor de nums
        int valor2 = nums[(nums.length - 1)]; //inicializar con el ultimo valor de nums

        String salida = "El arreglo es capicua";

        for (int i = 0; i < nums.length / 2; i++) { //terminar a la mitad porque esta leyendo ambos extremos
            if (valor1 != valor2) { //encuentra un valor diferente
                salida = "El arreglo NO es capicua";
                System.out.println("Se detuvo en los valores " + valor1 + ", " + valor2);
                break;
            }//fin if
            else { //ambos valores son iguales
                //recorrer posiciones
                valor1 = nums[i];
                valor2 = nums[(nums.length - 1 - i)];
            }//fin else
        }//fin for

        System.out.println(salida);
    }//fin nivel 20

}
