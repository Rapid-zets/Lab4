/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author mplab4.pc26
 */

public class Menu {
     public static void main() {
        int opcion;
        Scanner leer = new Scanner(System.in);
        Calculos calculadora = new Calculos();
        do{       
        System.out.println("Menu");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.division");
        System.out.println("5.resto");
        System.out.println("6.Palindrome");
        System.out.println("7.salir");
        
        opcion = leer.nextInt();
        
        
        
        switch (opcion){
            case 1 -> System.out.println("El resultado de la suma es: " + calculadora.suma());
                case 2 -> System.out.println("El resultado de la resta es: " + calculadora.resta());
                case 3 -> System.out.println("El resultado de la multiplicacion es: " + calculadora.multi());
                case 4 -> System.out.println("El resultado de la division es: " + calculadora.divi());
                case 5 -> System.out.println("El resultado del resto es: " + calculadora.resto());
                case 6 -> {
                    System.out.println("Ingrese una palabra o frase para verificar si es palíndromo:");
                    String palabra = leer.next();
                    calculadora.Palindromo(palabra);}
                case 7 -> {
                    System.out.println("¡Hasta luego!");}}}while(opcion != 7);
        
        
        
        
        
    }  
}
