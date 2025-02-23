/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.amaisov.primerafuncion;

/**
 *
 * @author amairani
 */
public class PrimeraFuncion {

    public static void main(String[] args) {
        int x = siguiente(8);
        System.out.println(x);
        System.out.println(siguiente(0));
        
        
        
        
    }// cierre de main
   static int siguiente(int num){
        return num +1;   
    }
    
} // cierre de clasa
