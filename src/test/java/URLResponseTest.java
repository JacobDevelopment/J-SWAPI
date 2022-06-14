import io.jking.core.API;
import io.jking.request.Requester;
import org.jetbrains.annotations.TestOnly;

import java.io.IOException;

public class URLResponseTest {

    @TestOnly
    public static void main(String[] args) throws IOException {
        API api = new API.Builder().build();
        Requester requester = api.getRequester();

        String response = requester.getUrlResponse("https://swapi.dev/api/planets/1/");
        System.out.println(response);
    }

}
