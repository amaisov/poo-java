package com.amaisov.usuario.video;


import com.amaisov.usuario.video.Video;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amairani
 */
public class Usuario {
    private String nombre;
    private String correo;
    
    public Usuario(String nombre, String correo){
        this.nombre=nombre;
        this.correo=correo;
    }
    
    public void verVideo(Video video){
        System.out.println(nombre +" video el video"+ video.getTitulo());
        video.reproducir();
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void comentarVideo(Video video, String texto){
        Comentario comentario = new Comentario(video, texto);
        System.out.println(comentario.verComentario());
    }
      
}
