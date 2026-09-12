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

    }

    public void nivel18() {

    }

    public void Nivel19() {
        int[] nums = {1, 2, 3, 4, 5, 5, 9, 23, 65};
        //int[] nums={1,2, 2,3,4,1,0,23,40};
        
        int valor = nums[0]; //inicializar con el primer valor de nums
        String salida = "El arreglo es ascendiente";

        for (int i = 0; i < nums.length; i++) {
            if (valor > nums[i]) {//encuentra un numero no ascendiente
                salida = "El arreglo NO es ascendiente";
                System.out.println("Se detuvo en " + nums[i-1] + ", " + nums[i]);
                break; //salir del for
            }//fin if
        }//fin for
        
        System.out.println(salida);
    }//fin nivel 19
    
    public void Nivel20() {
        int[] nums = {1, 2, 3, 4, 5};
        //int[] nums = {1, 5, 6, 5, 1};
        
        int valor1 = nums[0]; //inicializar con el primer valor de nums
        int valor2 = nums[nums.length]; //inicializar con el ultimo valor de nums
        
        String salida = "El arreglo es capicua";
        
        for (int i = 0; i < nums.length/2; i++) { //terminar a la mitad porque esta leyendo ambos extremos
            if (valor1!=valor2){ //encuentra un valor diferente
                salida = "El arreglo NO es capicua";
                System.out.println("Se detuvo en posicion " + valor1 + ", " + valor2);
                break;
            }//fin if
            
            else{ //ambos valores son iguales
                //recorrer posiciones
                valor1 = nums[i];
                valor2 = nums[nums.length - i];
            }//fin else
        }//fin for
        
        System.out.println(salida);
    }//fin nivel 20

}
