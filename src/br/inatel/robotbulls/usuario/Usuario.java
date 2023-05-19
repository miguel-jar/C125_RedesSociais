package br.inatel.robotbulls.usuario;

import br.inatel.robotbulls.socialnetworks.*;

public class Usuario {
    private String email, nome;
    public Facebook contaFacebook;
    public GooglePlus contaGooglePlus;
    public Instagram contaInstagram;
    public Twitter contaTwitter;

    public Usuario(String email, String nome, RedeSocial[] redesocial) {

        for (RedeSocial rede : redesocial) {
            if (rede instanceof Facebook) {
                contaFacebook = (Facebook) rede;
            } else if (rede instanceof GooglePlus) {
                contaGooglePlus = (GooglePlus) rede;
            } else if (rede instanceof Instagram) {
                contaInstagram = (Instagram) rede;
            } else if (rede instanceof Twitter) {
                contaTwitter = (Twitter) rede;
            }
        }

        this.email = email;
        this.nome = nome;
    }
}
