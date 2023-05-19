package br.inatel.robotbulls.socialnetworks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Instagram extends RedeSocial {

    public Instagram() {
        try {
            Path arquivo = Paths.get("src/br/inatel/robotbulls/arquivos/instagram.txt");
            List<String> lista = Files.readAllLines(arquivo);

            this.senha = lista.get(0).split("=")[1];
            this.numAmigos = Integer.parseInt(lista.get(1).split("=")[1]);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postada com sucesso no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postada com sucesso no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário publicado com sucesso no Instagram");
    }
}