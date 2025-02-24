package com.amaisov.usuario.video;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amairani
 */
    public class Video {
        private String titulo;
        private int duracion; // duracion en segundos
    
    public Video( String titulo, int duracion){
        this.titulo= titulo;
        this.duracion= duracion;
    }
    
    public void reproducir(){
        System.out.println(" reproduciendo el video: " +titulo);

}

    public void detener(){
        System.out.println(" se detubo el video: " + titulo);
}
    
    public String getTitulo(){
        return titulo;
    }
}