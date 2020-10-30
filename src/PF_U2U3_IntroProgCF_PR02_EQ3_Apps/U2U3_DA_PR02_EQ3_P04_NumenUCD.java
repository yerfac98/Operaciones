/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PF_U2U3_IntroProgCF_PR02_EQ3_Apps;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class U2U3_DA_PR02_EQ3_P04_NumenUCD {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        long numero;
        int millares = 0, centenas = 0, decenas = 0, unidades = 0;

        try {
            System.out.println("Ingresa un numero de 0 a 999");
            numero = T.nextLong();

            /*valido que no sea mayor de 9999 ya que si es mayor 
        * seria decenas de millar y si es cero 
             */
            if (numero > 9999) {
                System.out.println("Numero cuenta con decenas de millar");
            }
            if (numero == 0) {
                System.out.println("el numero es 0");
            }

            //Saco los millares 
            millares = (int) (numero / 1000);
            //saco las centenas 
            if (numero % 1000 != 0) {
                centenas = (int) (numero % 1000 / 100);
            }
            //saco las decenas 
            if (numero % 100 != 0) {
                decenas = (int) (numero % 1000 / 10);
            }

            //saco las unidades 
            if (numero % 10 != 0) {
                unidades = (int) (numero % 1000 / 1);
            }

            System.out.println("el numero " + numero + " cuenta con:");
            System.out.println(millares + " millares.");
            System.out.println(centenas + " centenas.");
            System.out.println(decenas + " decenas.");
            System.out.println(unidades + " unidades.");

        } catch (Exception e) {
            System.out.println("verifica los datos");
        }

    }
}
