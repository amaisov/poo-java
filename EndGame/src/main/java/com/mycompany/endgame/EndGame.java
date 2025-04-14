/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author amairani
 */
public class EndGame {

    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("BlackPanter GRARRRR","Ser el rey de wakanda","Garras de vibranium");
        Villano galactus=new Villano("Galactus ","Devorar mundos","Usa de chalan a Silven Surfer");
        Avenger ironMan=new Avenger("Tony Stark","Filantropo,multimillonario,Playboy","Mark 42","Primer");
        Thanos thanos=new Thanos("Thanos ","El titan loco","Ejercito Chitaury","Guantelete del infinito");
        
        Personaje[]Personajes={blackPanter,galactus,ironMan,thanos};
        for(Personaje personaje:Personajes){
            personaje.atacar();
        }
        ((Avenger)ironMan).reunirse();
        
        thanos.chasquearDedos();
    }
    
}
