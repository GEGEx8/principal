/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class nivel1 {

    public void Nivel1() {

        double[] numeros = {1.5, 2.7, 3.8, 4.9};
        System.out.println("Longitud del arreglo: " + numeros.length);
        System.out.println("Último elemento: " + numeros[numeros.length - 1]);

    }

    public void Nivel2() {

        boolean[] valores = {true, false, true, false, true, false};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Posición " + i + ": " + valores[i]);

        }//ciclo for
    }

    public void Nivel3() {
        int[] nums = {};
        int cantNums = 8; //8 numeros
        String mensaje = "";

        for (int i = 0; i < cantNums; i++) { //leer y guardar numeros
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog("(Posicion " + i + 1 + ") \nDigite un numero"));
            mensaje += "Posicion " + i + 1 + ": " + nums[i] + "\n";
        }//fin for

        for (int i = 0; i < cantNums; i++) { //mostrar los numeros
            JOptionPane.showMessageDialog(null, mensaje);
        }//fin for
    }//fin nivel 3

    public void Nivel4() {
        char[] caracteres = {};
        String palabra = "informatica";

        for (int i = 0; i < palabra.length(); i++) {
            caracteres[i] = palabra.charAt(i);
            System.out.println("Posición " + i + 1 + ": " + caracteres[i]);
        }//fin for
    }//fin nivel 4

}//fin clase
