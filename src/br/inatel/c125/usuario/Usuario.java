package br.inatel.c125.usuario;
import br.inatel.c125.socialnetworks.RedeSocial;

import java.util.List;

public class Usuario {

    @SuppressWarnings("FieldCanBeLocal")
    private final String email, nome;

    private final List<RedeSocial> redeSocial;

    public Usuario(String email, String nome, List<RedeSocial> redeSocial) {

        this.redeSocial = redeSocial;
        this.email = email;
        this.nome = nome;
    }

    public List<RedeSocial> getRedeSocial() {
        return redeSocial;
    }
}
