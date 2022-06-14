import io.jking.api.Root;
import io.jking.core.API;
import io.jking.request.Requester;
import org.jetbrains.annotations.TestOnly;

import java.io.IOException;

public class RootResponseTest {

    @TestOnly
    public static void main(String[] args) throws IOException {
        API api = new API.Builder().build();
        Requester requester = api.getRequester();

        String url = Root.PEOPLE.getAllUrl();
        System.out.println(url);
        String response = requester.getUrlResponse(url);
        System.out.println(response);
    }

}
