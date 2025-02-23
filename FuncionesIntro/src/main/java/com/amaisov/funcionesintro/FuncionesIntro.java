/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.amaisov.funcionesintro;

import java.util.Scanner;

/**
 *
 * @author amairani
 */
public class FuncionesIntro {

    public static void main(String[] args) {
         //siempre estubimos dentro de un metodo (main)
         
        Scanner input = new Scanner(System.in);
        String nombre;
        int num;
        
        System.out.print("ingresa tu nombre:");//print es un metodo
        nombre = input.nextLine();//nexline es un metodo
        
        System.out.print("ingresa un numero entero:");//print es un metodo
        num = Integer.parseInt(input.nextLine());//nextLine y parseInt son metodos!
        
        System.out.println("tu nombre es" + nombre);//print es un metodo
        System.out.println("tu edad es " + num);//print es un metodo
        
        
         
         
    }
    
    
    
}
