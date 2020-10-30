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
public class U2U3_DA_PR02_EQ3_P10_MultiplicacionMatrices {

    public static void main(String[] args) {
        //Declarando teclado
        Scanner T = new Scanner(System.in);

        try {
            int tamArrFilas, tamArrColumnas;
            System.out.println("Escriba el tamaño en filas para los arreglos");
            tamArrFilas = T.nextInt();
            System.out.println("Escriba el tamaño en columnas para los arreglos");
            tamArrColumnas = T.nextInt();
            //Creando Arreglos
            int A[][] = new int[tamArrFilas][tamArrColumnas];
            int B[][] = new int[tamArrFilas][tamArrColumnas];
            int C[][] = new int[tamArrFilas][tamArrColumnas];
            int x, y;

            System.out.println("Datos de la Matriz A");

            for (x = 0; x < tamArrFilas; x++) {
                for (y = 0; y < tamArrColumnas; y++) {
                    System.out.println("Ingresa valor [" + x + "," + y + "]");
                    A[x][y] = T.nextInt();

                }
            }
            System.out.println("Datos de la Matriz B");

            for (x = 0; x < tamArrFilas; x++) {
                for (y = 0; y < tamArrColumnas; y++) {
                    System.out.println("Ingresa valor [" + x + "," + y + "]");
                    B[x][y] = T.nextInt();
                }
            }
            for (x = 0; x < tamArrFilas; x++) {
                for (y = 0; y < tamArrColumnas; y++) {
                    C[x][y] = A[x][y] * B[x][y];
                }
            }
            System.out.println("El resultado es...");
            for (x = 0; x < tamArrFilas; x++) {
                for (y = 0; y < tamArrColumnas; y++) {

                    System.out.println(A[x][y] + "*" + B[x][y] + "=" + C[x][y]);

                }
            }

        } catch (Exception e) {
            System.out.println("Upss ocurrio un error ");
        }

    }
}
