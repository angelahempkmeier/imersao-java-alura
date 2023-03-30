package resource;

import entities.Conteudo;

import java.util.List;

public interface ExtratorDeConteudo {
    public List<Conteudo> extraiConteudos(String json);
}
