/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trasportes;

/**
 *
 * @author amairani
 */
public class VehiculoAcuatico extends Vehiculo {
   private String tipoPropulsion; 
   
   public VehiculoAcuatico(String marca,String modelo,String tipoPropulsion){
       super(marca,modelo);
       this.tipoPropulsion=tipoPropulsion;
   }
public void mostrarInf(){
   super.mostarInfo();
    System.out.println("Tipo de propulsion"+tipoPropulsion);
}

}
