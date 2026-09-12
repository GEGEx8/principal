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

    }

    public void nivel10() {

    }

    public void Nivel11() {
        Scanner entrada = new Scanner(System.in);
        int[] nums = {};
        int cantNums = 12;
        int valorBuscar = 0;
        int contador = 0;

        for (int i = 0; i < cantNums; i++) { //Leer y guardar numeros
            System.out.print("Digite un numero \nPosicion " + (i + 1) + ": ");
            nums[i] = entrada.nextInt();
        }//fin for

        System.out.print("Digite un valor para buscar en el arreglo");
        valorBuscar = entrada.nextInt();

        for (int i = 0; i < cantNums; i++) { //Buscar y contar
            if (nums[i] == valorBuscar) {
                contador++;
            }//fin if
        }//fin for

        System.out.print("Hay " + contador + " instancias del numero " + valorBuscar + " en el arreglo");

    }//fin nivel 11

    public void Nivel12() {
        char[] caracteres = {'a', 'l', 'k', 'd', 'e', 'l', 'o', 'r', 'ú', 'ñ', '1', 'i'};
        int contVocal = 0;
        int contConsonante = 0;
        int contSimbolo = 0;

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < caracteres.length; i++) {
            if (Character.isLetter(caracteres[i])) {//confirmar si es una letra del alfabeto (la ñ no es)
                for (int a = 0; a < vocales.length; i++) {
                    if (caracteres[i] == vocales[a]) { //si es una vocal
                        contVocal++;
                    }//fin if
                    else { //si no es vocal, es consonante
                        contConsonante++;
                    }//fin else
                }//fin for
            }//fin if
            
            else {//no es del alfabeto
                contSimbolo++;
            }//fin else
        }//fin for
        
        System.out.println("Cantidad de... \nVocales: " + contVocal + "\nConsonantes: " + contConsonante + "\nSimbolos: " + contSimbolo);
    }//fin nivel 12

}
