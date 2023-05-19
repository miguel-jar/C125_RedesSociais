package br.inatel.c125.socialnetworks;

import br.inatel.c125.interfaces.Compartilhamento;
import br.inatel.c125.interfaces.VideoConferencia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook() {
        try {
            Path arquivo = Paths.get("src/br/inatel/c125/arquivos/facebook.txt");
            List<String> lista = Files.readAllLines(arquivo);

            this.senha = lista.get(0).split("=")[1];
            this.numAmigos = Integer.parseInt(lista.get(1).split("=")[1]);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postada com sucesso no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postada com sucesso no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário publicado com sucesso no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Iniciando Streaming no Facebook...");
        System.out.println("Streaming finalizado");
    }

    @Override
    public void compartilhar() {
        System.out.println("Publicação compartilhada com sucesso no Facebook");
    }
}
