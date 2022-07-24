import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;


public class RestGET {
    public static void main(String[] args) {

        String url = "https://reqres.in/api/users/2";

        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "REQRES");

        HttpEntity<String> entity = new HttpEntity<>(headers);


        RestTemplate restTemplate = new RestTemplate();

        String res = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
        System.out.println(res);

    }

}
