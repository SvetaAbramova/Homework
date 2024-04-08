package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.AccountDto;

public class ApiTest {

    @Test
    public void checkAccount() throws JsonProcessingException {
        Response response = RestAssured.given(new RequestSpecBuilder()
                        .setRelaxedHTTPSValidation()
                        .setBaseUri("https://account.test.ms-platform.ameriabank.am/")
                        .setContentType("application/json")
                        .setAccept("text/plain")
                        .build())
                .when()
                .request(Method.GET, "api/v1/accounts/03222530500");
        ObjectMapper objectMapper = new ObjectMapper();
        AccountDto accountDto = objectMapper.readValue(response.asPrettyString(), AccountDto.class);

        System.out.println(accountDto.getBalance().getCurrent());
    }

}
