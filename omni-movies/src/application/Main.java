package application;

import entities.Conteudo;
import resource.ExtratorDeConteudo;
import resource.ExtratorDeConteudoDeFilmes;
import request.ClienteHttp;

import java.io.InputStream;
import java.net.URL;
import java.util.*;
import resource.GeradoraDeFigurinhas;

public class Main {
    public static void main(String[] args) throws Exception {

        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        ClienteHttp http = new ClienteHttp();
        String json = http.buscaDados(url);

        ExtratorDeConteudo extratorDeConteudoDeFilmes = new ExtratorDeConteudoDeFilmes();
        List<Conteudo> conteudos = extratorDeConteudoDeFilmes.extraiConteudos(json);

        GeradoraDeFigurinhas gdf = new GeradoraDeFigurinhas();
        for(Conteudo conteudo : conteudos){
            InputStream urlImagem = new URL(conteudo.getUrlImage()).openStream();

            System.out.println(conteudo.getTitulo());
            System.out.println(conteudo.getUrlImage());

            gdf.criaFigurinha(urlImagem, conteudo.getTitulo() + ".png");

        }


    }
}
