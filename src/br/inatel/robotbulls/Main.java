package br.inatel.robotbulls;

import br.inatel.robotbulls.socialnetworks.*;
import br.inatel.robotbulls.usuario.Usuario;

public class Main {
    public static void main(String[] args) {

        RedeSocial[] redeSocial = new RedeSocial[2];
        redeSocial[0] = new Facebook();
        redeSocial[1] = new Twitter();

        Usuario usuario = new Usuario("Bagatela", "eldourado@ss.com.br", redeSocial);

        System.out.println();
        usuario.contaFacebook.compartilhar();
        usuario.contaFacebook.postarFoto();
        usuario.contaFacebook.fazStreaming();

        System.out.println();
        usuario.contaTwitter.postarComentario();
        usuario.contaTwitter.curtirPublicacao();
        usuario.contaTwitter.postarVideo();

    }
}
