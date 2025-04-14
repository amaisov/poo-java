/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endgame;

/**
 *
 * @author amairani
 */
public class Villano extends Personaje{
    protected String ejercito;
    
    public Villano(String nombre,String poder,String ejercito){
        super(nombre,poder);
        this.ejercito=ejercito;
    }
    @Override
    public void atacar(){
        System.out.println(nombre+"Comanda su ejercito para atacar");
    }
}
