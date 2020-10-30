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
public class U2U3_DA_PR02_EQ3_P08_Potencia {

    public int calcularPotencia(int base, int exp) {

        int potencia = 1;

        for (int i = 0; i < exp; i++) {
            potencia = potencia * base;

        }

        return potencia;
    }

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int base, exponente;
        U2U3_DA_PR02_EQ3_P08_Potencia obj = new U2U3_DA_PR02_EQ3_P08_Potencia();
        try {

            System.out.println("Escribe la base");
            base = T.nextInt();
            System.out.println("Escribe el exponente");
            exponente = T.nextInt();

            System.out.println("La potencia de " + base + "^" + exponente + " es: " + obj.calcularPotencia(base, exponente));

        } catch (Exception e) {

            System.err.println("Upps ocurrio un error al ingresar los datos ");
        }

    }
}
