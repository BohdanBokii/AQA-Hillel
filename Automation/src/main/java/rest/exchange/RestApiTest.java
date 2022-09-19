package rest.exchange;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import rest.RestApiClient;
import rest.exchange.ExchangeObject;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RestApiTest {
    private static int OK = 200;
    private String currencyCode;

    public RestApiTest(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Parameterized.Parameters(name = "currencyCode - {0}")
    public static Collection news() {
        return Arrays.asList(new Object[][]{
                {"USD"},
                {"EUR"},
                {"GBP"},
        });
    }

    @Test
    public void RateByCurrencyCode() throws Exception {
        // Arrange
        // Act
        ExchangeObject myObject = ConvertToObject(RestApiClient.Get(ExchangeUrl(currencyCode)));
        System.out.println("Current rate of " + currencyCode + " -> " + myObject.rate);

        // Assert
        Assert.assertEquals(OK, RestApiClient.getLastResponseCode());
    }

    private ExchangeObject ConvertToObject(String json) throws JsonProcessingException {
        json = json.replace("[", "").replace("]", "");
        return new ObjectMapper().readValue(json, ExchangeObject.class);
    }

    private String ExchangeUrl(String currencyCode) {
        return "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json&valcode=" + currencyCode;
    }
}
