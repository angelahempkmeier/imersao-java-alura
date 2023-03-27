import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {


        // fazer um http - protocolo pra acessar algo na web e buscar os top 250 filmes
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        URI endereco = URI.create(url); //url é um tipo de URI
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();

        System.out.println(body);

        // pegar só os dados que interessam (titulo, poster, classificacao)
//        var parser = new JsonParser();
//        List<Map<String, String>> listaDeFilmes = parser.parse(body);




        // exibir e manipular os dados


    }
}