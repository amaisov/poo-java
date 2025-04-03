/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retornodevalor;

import javax.swing.JOptionPane;



/**
 *
 * @author amairani
 */
public class Calculadora {
    
    public static void main (String[]args){
    
        int n1=Integer.parseInt(JOptionPane.showInputDialog(" Digita el numero 1:"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog(" Digita el numero 2:"));
        
        Operaciones op=new Operaciones();
        
        int suma=op.suma(n1, n2);
        int resta=op.resta(n1, n2);
        int multiplicacion=op.multiplicacion(n1, n2);
        int divicion=op.dividir(n1, n2);
        op.mostrarResultados(suma, resta, multiplicacion, divicion);
        op.mostrarResultados(op.suma(n1,n2),op.resta(n1, n2), op.multiplicacion(n1, n2),op.dividir(n1, n2));
        
    }
    
}
