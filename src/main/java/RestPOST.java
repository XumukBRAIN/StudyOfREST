import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class RestPOST {
    public static void main(String[] args) {

        final String URL = "https://reqres.in/api/users";

        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "REQRES");

        Map<String, String> map = new HashMap<>();
        map.put("name", "Steve");
        map.put("job", "Doctor");


        HttpEntity<Map<String, String>> req = new HttpEntity<>(map, headers);

        RestTemplate restTemplate = new RestTemplate();
        String res = restTemplate.exchange(URL, HttpMethod.POST, req, String.class).getBody();

        System.out.println(res);
    }
}
