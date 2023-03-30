package resource;

import entities.Conteudo;
import org.json.JSONArray;
import org.json.JSONObject;
import service.ParsearJson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDeFilmes implements ExtratorDeConteudo{
    public List<Conteudo> extraiConteudos(String json){
        JSONObject obj = new JSONObject(json);
        JSONArray array = obj.getJSONArray("items");
        ParsearJson parsearJson = new ParsearJson();
        List<Map<String, String>> atributos = parsearJson.parsearMeuJson(array);

        List<Conteudo> conteudos = new ArrayList<>();

        for(Map<String, String> atributo : atributos){
            String titulo = atributo.get("title");
            String urlImagem = atributo.get("image");
            Conteudo conteudo = new Conteudo(titulo, urlImagem);
            conteudos.add(conteudo);
        }

        return conteudos;
    }
}
