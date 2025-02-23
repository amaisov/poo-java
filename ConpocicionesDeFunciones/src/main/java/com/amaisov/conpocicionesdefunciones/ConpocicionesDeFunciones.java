/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.amaisov.conpocicionesdefunciones;

/**
 *
 * @author amairani
 */
public class ConpocicionesDeFunciones {

    public static void main(String[] args) {
         //cual es el doble delsiguiente de 9?
     System.out.println(doble(siguiente(9))); 
         
    } // cierre de main
    
    static int siguiente(int num){
        return num +1;
    }
    static int doble(int num){
        return num *2;
    }
       
}//cierre de clase


