package programs.Api;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AsyncApi {

    WireMockServer wireMockServer = new WireMockServer(8089);

    @BeforeClass
    public void setup() {
        wireMockServer.start();
        wireMockServer.stubFor(WireMock.get(WireMock.urlEqualTo("/users/101"))
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{ \"id\":101, \"name\":\"Siddu\", \"status\":\"active\" }")));
    }

    @Test
    public void test1(){
        RestAssured.given().baseUri("http://localhost:8089")
                .when()
                .get("/users/101")
                .then()
                .statusCode(200)
                .body("name", Matchers.is(Matchers.equalTo("Siddu")))
                .body("status", Matchers.is(Matchers.equalTo("active")));
    }
}
