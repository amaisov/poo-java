/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trasportes;

/**
 *
 * @author amairani
 */
public class Trasportes {

    public static void main(String[] args) {
        VehiculoTerrestre vehiculoTerrestre =new VehiculoTerrestre("Toyota","corolla",4);
        VehiculoAcuatico vehiculoAcuatico =new VehiculoAcuatico("Lancha","Yamaha","Motor pru pru");
        
        System.out.println("Informacio del vehiculo Terrestre");
        vehiculoTerrestre.mostarInfo();
        
        System.out.println("Informacion del vehiculo Acuatico");
        vehiculoAcuatico.mostarInfo();
    }
}
