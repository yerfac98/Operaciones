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
public class U2U3_DA_PR02_EQ3_P06_MayorMenorPromedio {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        /*Declaracion de variables*/
        int n, mayor, menor;//Tipo entero
        double prom, suma = 0;//tipo double para las operaciones

        /*Validación de datos para evitar errores en la captura de datos*/
        try {
            System.out.println("Escribe el valor de n");
            n = T.nextInt();

            int numero[] = new int[n];

            for (int i = 0; i < n; i++) {

                System.out.println("Ingresa el valor " + (i + 1));
                numero[i] = T.nextInt();

            }

            /*Comapracion para el valor mayor*/
            mayor = numero[0];
            menor = numero[0];

            for (int i = 1; i < n; i++) {

                /*Mayor*/
                if (numero[i] > mayor) {
                    mayor = numero[i];

                }
                /*Menor*/
                if (numero[i] < menor) {
                    menor = numero[i];

                }

            }
            /*En caso de que los numeros sean iguales*/
            if (mayor == menor) {
                System.out.println("Los numeros son iguales");
            } else {
                /*Mostrar el numero mayor*/
                System.out.println("El número mayor es " + mayor);
                /*Mostrar el número menor*/
                System.out.println("El número menor es " + menor);
            }

            /*Calcular el promedio de los valores ingresados por el usuario*/
            for (int i = 0; i < n; i++) {

                suma = suma + numero[i];

            }
            prom = suma / n;

            System.out.println("El promedio es " + prom);

        } catch (Exception e) {

            System.err.println("Upss ocurrio un error al ingresar los valores ");

        }
    }
}
