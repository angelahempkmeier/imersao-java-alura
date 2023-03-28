package service;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParsearJson {

    public List<Map<String, String>> parsearMeuJson(JSONArray array){
        List<Map<String, String>> filmes = new ArrayList<>();
        for(int i = 0; i < array.length(); i++){
            Map<String, String> dadosTemp = new HashMap<>();
            String title = array.getJSONObject(i).getString("title");
            String image = array.getJSONObject(i).getString("image");
            String imDbRating = array.getJSONObject(i).getString("imDbRating");
            dadosTemp.put("title", title);
            dadosTemp.put("image", image);
            dadosTemp.put("imDbRating", imDbRating);
            filmes.add(dadosTemp);
        }
        return filmes;
    }
}
