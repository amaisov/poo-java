package com.amaisov.usuario.video;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author amairani
 */
public class UsuarioVideo {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("MACACO", " Macaco@gmail.com");
        Video video = new Video(" Monky Fliyp ", 3600);
        usuario.verVideo(video);
        usuario.comentarVideo(video, " este video no es gracioso ");
        video.detener();
    }

}
