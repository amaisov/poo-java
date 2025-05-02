/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operacionesconarreglos;

/**
 *
 * @author amairani
 */
public class OperacionesConArreglos {

    public static void main(String[] args) {
        int[] arreglo1 = {5, 10, 15, 20, 25};
        int[] arreglo2 = {1, 2, 3, 4, 5};

        int[] suma = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            suma[i] = arreglo1[i] + arreglo1[i];
        }
        System.out.println("Elementos del aggreglo 1");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Elemento" + (i + 1) + ":" + arreglo1[i]);
        }
          int[] multiplicacion = new int[arreglo1.length];
          
          for(int i=0;i<arreglo1.length;i++){
              multiplicacion[i] =arreglo1[i]*arreglo2[1];
          }
        System.out.println("Multiplicacion de arreglos");
        for(int i=0;i< multiplicacion.length;i++){
            System.out.println("Eelemiento"+(+1)+":"+multiplicacion[i]);
        }
        int maximo=arreglo1[0];
        int minimo=arreglo1[0];
        int sumaTotal=0;
        
        for(int i=0;i<arreglo1.length;i++){
            if(arreglo1[i]>maximo){
                maximo=arreglo1[i];
            }
            if(arreglo1[i]<minimo){
                minimo=arreglo1[i];
            }
            sumaTotal+=arreglo1[i];
        }
        double promedio=(double)sumaTotal/arreglo1.length;
        System.out.println(" Informacion extraida del arreglo1 ");
        System.out.println(" Valor maximo: "+maximo);
        System.out.println(" Valor minimo: "+minimo);
        System.out.println(" Valor promedio: "+promedio);
        }
 }
