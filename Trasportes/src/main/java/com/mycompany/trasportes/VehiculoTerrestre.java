/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trasportes;

/**
 *
 * @author amairani
 */
public class VehiculoTerrestre extends Vehiculo {
   private int numRuedas;
   
   public VehiculoTerrestre(String marca,String modelo,int numRuedas){
       super(marca,modelo);
       this.numRuedas=numRuedas;
   }
   
   private void mostrarInf(){
       super.mostarInfo();
       System.out.println("Numero de ruedad"+numRuedas);
   } 
}
