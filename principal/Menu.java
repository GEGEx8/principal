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
public class Menu {
//creamos los nuevos objetos nivel que se llaman "N+el numero" para llamar sus diferentes metodos de nivel

    nivel1 N1 = new nivel1();
    nivel2 N2 = new nivel2();
    nivel3 N3 = new nivel3();
    nivel4 N4 = new nivel4();
    nivel5 N5 = new nivel5();

    //ciclo para menu de niveles
    public void MenuNiveles() {
        int selecion = 0;
        do {
            selecion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                Digite el NUMERO del nivel que desea ingresar
                                                                 Nivel 1: Fundamentos
                                                                 Nivel 2: Recorridos y acumulacion
                                                                 Nivel 3: Busqueda, extremos y condiciones
                                                                 Nivel 4: Tranformacion de arreglos
                                                                 Nivel 5: Integracion y retos
                                                                 Salir 0
                                                                    """));
//los switch fue para ver que nivel quiere la persona una vez elige uno se mete al otro switch para ver que numero quiere hacer es como elijo nivel1 entro al submenu opcion y elijo que nivel hacer si el 1 2 3 4 y asi con el resto de niveles

            switch (selecion) {
                case 1:

                    int opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 1
                                                                           nivel 2
                                                                           nivel 3
                                                                           nivel 4
                                                                          Volver 0"""));

                    switch (opcion) {
                        case 1:
                            N1.Nivel1();
                            break;

                        case 2:
                            N1.Nivel2();
                            break;

                        case 3:
                            N1.Nivel3();
                            break;

                        case 4:
                            N1.Nivel4();
                            break;

                        case 0: //volver al menu de niveles
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Numero de subnivel no encontrado");
                    }//fin del switch del submenu del nivel 1

                    break;

                case 2:

                    opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 5
                                                                           nivel 6
                                                                           nivel 7
                                                                           nivel 8
                                                                          Volver 0"""));

                    switch (opcion) {
                        case 5:
                            N2.nivel5();
                            break;

                        case 6:
                            N2.nivel6();
                            break;

                        case 7:
                            N2.Nivel7();
                            break;

                        case 8:
                            N2.Nivel8();
                            break;

                        case 0: //volver al menu de niveles
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Numero de subnivel no encontrado");
                    }//fin del switch del submenu del nivel 2

                    break;

                case 3:

                    opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 9
                                                                           nivel 10
                                                                           nivel 11
                                                                           nivel 12
                                                                          Volver 0"""));

                    switch (opcion) {
                        case 9:

                            break;

                        case 10:

                            break;

                        case 11:
                            N3.Nivel11();
                            break;

                        case 12:
                            N3.Nivel12();
                            break;

                        case 0: //volver al menu de niveles
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Numero de subnivel no encontrado");
                    }//fin del switch del submenu del nivel 3

                    break;

                case 4:

                    opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 13
                                                                           nivel 14
                                                                           nivel 15
                                                                           nivel 16
                                                                          Volver 0"""));
                    switch (opcion) {
                        case 13:

                            break;

                        case 14:

                            break;

                        case 15:
                            N4.Nivel15();
                            break;

                        case 16:
                            N4.Nivel16();
                            break;

                        case 0: //volver al menu de niveles
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Numero de subnivel no encontrado");
                    }//fin del switch del submenu del nivel 4

                    break;

                case 5:

                    opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 17
                                                                           nivel 18
                                                                           nivel 19
                                                                           nivel 20
                                                                          Volver 0"""));
                    switch (opcion) {
                        case 17:

                            break;

                        case 18:

                            break;

                        case 19:
                            N5.Nivel19();
                            break;

                        case 20:
                            N5.Nivel20();
                            break;

                        case 0: //volver al menu de niveles
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Numero de subnivel no encontrado");
                    }//fin del switch del submenu del nivel 5

                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Numero de nivel no encontrado");
            }
        } while (selecion != 0);
    }//fin del menuniveles

}//fin menu
