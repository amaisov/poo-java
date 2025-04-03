/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.retornodevalor;

/**
 *
 * @author amairani
 */
import javax.swing.JOptionPane;
public class Operaciones {
    
    
    public int suma(int numero1, int numero2){
        int suma= numero1+ numero2;
        return suma;
    }

    public int resta(int numero1, int numero2){
        int resta= numero1- numero2;
        return resta;
    }
    
    public int multiplicacion(int numero1, int numero2){
        int multiplicacion= numero2* numero2;
        return multiplicacion;
        
    }
    
    public int dividir(int numero1, int numero2){
        int dividir= numero1/numero2;
        return dividir;
        
    }
    
    public void mostrarResultados(int suma,int resta,int multiplicacion,int division){
        System.out.println(" La suma es"+suma);
        System.out.println(" La resta es "+resta);
        System.out.println("La multiplicacion es"+multiplicacion);
        System.out.println("La division es"+ division);
    }
}
