package br.inatel.c125;

import br.inatel.c125.socialnetworks.*;
import br.inatel.c125.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<RedeSocial> redeSocial = new ArrayList<>();

        redeSocial.add(new Facebook());
        redeSocial.add(new Instagram());

        Usuario usuario = new Usuario("Bagatela", "eldourado@ss.com.br", redeSocial);

        System.out.println();

        try {
            RedeSocial conta = usuario.getRedeSocial().get(0);
            conta.postarFoto();

            if (conta instanceof Facebook facebook) {

                facebook.compartilhar();
                facebook.fazStreaming();

            } else if (conta instanceof GooglePlus googlePlus) {

                googlePlus.compartilhar();
                googlePlus.fazStreaming();

            } else if (conta instanceof Twitter twitter) {

                twitter.compartilhar();
                System.out.println("Erro: este tipo de conta não permite fazer streaming");

            } else {
                System.out.println("Erro: este tipo de conta não permite compartilhamento");
                System.out.println("Erro: este tipo de conta não permite fazer streaming");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            RedeSocial conta = usuario.getRedeSocial().get(1);

            conta.postarComentario();
            conta.curtirPublicacao();
            conta.postarVideo();

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nPrograma finalizado");
    }
}
