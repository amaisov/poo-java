/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.amaisov.usuario.video;

/**
 *
 * @author amairani
 */
public class UsuarioVideo {

    public static void main(String[] args) {
        Usuario usuario = new Usuario ("MACACO","Macaco@gmail.com");
       Video video= new Video("Monky Fliyp", 3600);
        usuario.VerVideo(video);
        video.detener();
    }
    
}
