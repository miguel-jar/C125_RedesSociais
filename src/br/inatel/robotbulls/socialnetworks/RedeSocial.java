package br.inatel.robotbulls.socialnetworks;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao() {
        System.out.println("Publicação curtida com sucesso");
    }
}
