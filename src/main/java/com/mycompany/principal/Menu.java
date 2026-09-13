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

    public void MenuNiveles() {

        int selecion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                digite el numero del nivel que desea ingresar
                                                                 nivel: 1
                                                                 nivel: 2
                                                                 nivel: 3
                                                                 nivel: 4
                                                                 nivel: 5"""));
//los switch fue para ver que nivel quiere la persona una vez elige uno se mete al otro switch para ver que numero quiere hacer es como elijo nivel1 entro al submenu opcion y elijo que nivel hacer si el 1 2 3 4 y asi con el resto de niveles

        switch (selecion) {
            case 1:

                int opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 1
                                                                           nivel 2
                                                                           nivel 3
                                                                           nivel 4"""));

                switch (opcion) {
                    case 1:
                        N1.Nivel1();
                        break;

                    case 2:
                        N1.Nivel2();
                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    default:

                }//fin del switch del submenu del nivel 1

                break;

            case 2:

                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 5
                                                                           nivel 6
                                                                           nivel 7
                                                                           nivel 8"""));

                switch (opcion) {
                    case 5:
                           N2.nivel5();
                        break;

                    case 6:
                            N2.nivel6();
                        break;

                    case 7:

                        break;

                    case 8:

                        break;

                    default:

                }//fin del switch del submenu del nivel 2

                break;

            case 3:

                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 9
                                                                           nivel 10
                                                                           nivel 11
                                                                           nivel 12"""));

                switch (opcion) {
                    case 9:
                            N3.nivel9();
                        break;

                    case 10:
                            N3.nivel10();
                        break;

                    case 11:

                        break;

                    case 12:

                        break;

                    default:

                }//fin del switch del submenu del nivel 3

                break;

            case 4:

                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 13
                                                                           nivel 14
                                                                           nivel 15
                                                                           nivel 16"""));
                switch (opcion) {
                    case 13:
                        N4.nivel13();
                        break;

                    case 14:
                          N4.nivel14();
                        break;

                    case 15:

                        break;

                    case 16:

                        break;

                    default:

                }//fin del switch del submenu del nivel 4

                break;

            case 5:

                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                          digite que subnivel quiere
                                                                           nivel 17
                                                                           nivel 18
                                                                           nivel 19
                                                                           nivel 20"""));
                switch (opcion) {
                    case 17:
                            N5.nivel17();
                        break;

                    case 18:
                        N5.nivel18();
                        break;

                    case 19:

                        break;

                    case 20:

                        break;

                    default:

                }//fin del switch del submenu del nivel 5

                break;

            default:

        }
    }//fin del menuniveles

}//fin menu
