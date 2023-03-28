import org.json.JSONArray;
import org.json.JSONObject;
import vo.MoviesInfoVO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {


        // fazer um http - protocolo pra acessar algo na web e buscar os top 250 filmes
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        URI endereco = URI.create(url); //url é um tipo de URI
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();


        System.out.println("Testando c meu método");

        JSONObject obj = new JSONObject(body);
        JSONArray array = obj.getJSONArray("items");
        //List<Map<String, String>> filmes = new ArrayList<>();
        ParsearJson parsearJson = new ParsearJson();
        List<Map<String, String>> filmes = parsearJson.parsearMeuJson(array);


//        for(int i = 0; i < array.length(); i++){
//            Map<String, String> dadosTemp = new HashMap<>();
//            String title = array.getJSONObject(i).getString("title");
//            String image = array.getJSONObject(i).getString("image");
//            String imDbRating = array.getJSONObject(i).getString("imDbRating");
//            dadosTemp.put("title", title);
//            dadosTemp.put("image", image);
//            dadosTemp.put("imDbRating", imDbRating);
//            filmes.add(dadosTemp);
//        }

        for(Map<String, String> movies : filmes){
            System.out.println(movies.get("title"));
            System.out.println(movies.get("image"));
            System.out.println(movies.get("imDbRating"));
        }

    }
}
