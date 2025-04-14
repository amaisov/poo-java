/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endgame;

/**
 *
 * @author amairani
 */
public class Avenger  extends Heroe{
    protected String equipo;
    
    public Avenger(String nombre,String poder,String arma,String equipo){
        super(nombre,poder,arma);
        this.equipo=equipo;
    }
    public void reunirse(){
        System.out.println(nombre+"se une al equipo"+equipo+"de los avengers");
    }
}
