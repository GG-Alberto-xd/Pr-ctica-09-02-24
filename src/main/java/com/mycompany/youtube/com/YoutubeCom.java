package com.mycompany.youtube.com;

public class YoutubeCom {

    public static void main(String[] args) {
     Usuario usuario= new Usuario("Luis Alberto");
        Video video = new Video("Aprendiendo java",2400,"https;//youtube.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        
                
    }
}