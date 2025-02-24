package com.amaisov.usuario.video;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amairani
 */
public class Comentario {
    
    private Video video;
    private String texto;
    
    public Comentario(Video video,String texto){
        this.video=video;
        this.texto=texto;
    }
     public void escribirComentario(){
         System.out.println(" esta escribiendo un comentario al video: "+texto);
     }
    
      public String verComentario(){
          return " escribio un comentario del video:" +texto; 
      }
    
}
