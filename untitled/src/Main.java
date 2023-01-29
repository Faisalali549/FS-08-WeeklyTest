import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "https://jsonplaceholder.typicode.com/albums";

//        Building a request
        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

//      getting http client object
        HttpClient client = HttpClient.newBuilder().build();

//        getting response
        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

//        status code and body
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}