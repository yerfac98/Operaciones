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
public class U2U3_DA_PR02_EQ3_P01_ConversionGFtoGK {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        double f,k,k1;
        try{
        
            System.out.println("Ingrese la temperatura en Farenheit");
            f = T.nextDouble();
            
            k=f+459.67;
            k1=k*5/9;
            
            System.out.println("Los grados farenheit:"+ f+ "∞f");
            System.out.println("son en kelvin:"+ k1+ "∞k");
            
        }catch(Exception e){
            System.out.println("Upps ocurrio un error al ingresar los datos ");
        
        }        
    }
}
