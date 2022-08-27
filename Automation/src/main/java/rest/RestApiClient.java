package rest;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RestApiClient {
    static HttpResponse response;
    public static String Get(String url){

        String stringResponse;
        CloseableHttpClient httpClient = HttpClientBuilder
                .create()
                .disableCookieManagement()
                .build();

        try {
            response = httpClient.execute(new HttpGet(url));
            stringResponse = EntityUtils.toString(response.getEntity());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringResponse;
    }

    public static int getLastResponseCode() throws Exception {
        if (response != null)
            return response.getStatusLine().getStatusCode();

        throw new Exception("Response was not initialized");
    }
}
