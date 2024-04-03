/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import java.util.Scanner;
import static java.lang.Double.NaN;

/**
 *
 * @author mplab4.pc26
 */
public class Calculos {
Scanner leer = new Scanner(System.in);
    public double[] pedir_num() {
        boolean on = true;
        double[] numeros = new double[2];
        while (on) {
           
            System.out.print("Ingrese el primer número: ");
            numeros[0] = leer.nextDouble();
            
            System.out.print("Ingrese el segundo número: ");
            numeros[1] = leer.nextDouble();
            
            if (numeros[0]<0||numeros[1]<0|| numeros[0] == numeros[1] ) {
                System.out.println("¡Los números deben ser distintos y positivos! Por favor, inténtelo de nuevo.");
            } else {
                on = false;}
        }
        return numeros;}
    
    
    
    public double suma(){
    double[] numeros = pedir_num();
        double n1 = numeros[0];
        double n2 = numeros[1];    
    return n1+n2;
    }
    
    public double resta(){
        double[] numeros = pedir_num();
        double n1 = numeros[0];
        double n2 = numeros[1];   
    return n1-n2;
    }
    
    public double multi(){
        double[] numeros = pedir_num();
        double n1 = numeros[0];
        double n2 = numeros[1];   
    return n1*n2;
    }
    
    public double divi(){
        double[] numeros = pedir_num();
        double n1 = numeros[0];
        double n2 = numeros[1];   
        if (n2 ==0){ 
        System.out.println("No se puede realizar una division por 0 ");
        return NaN;}
        else{
            return n1/n2;}
    }
    
    
    public double resto(){
        double[] numeros = pedir_num();
        double n1 = numeros[0];
        double n2 = numeros[1]; 
    return n1%n2;
    }
    public void Palindromo(String p) {
    if (p.length() == 1 || p.length() == 0) {
        System.out.println("Es palíndrome!");}
    else if (p.charAt(0) == p.charAt(p.length() - 1)) {
        Palindromo(p.substring(1, p.length() - 1));} 
    else {
        System.out.println("No es palíndrome!");}
    }

}
