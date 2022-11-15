package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Room1Post;

import static io.restassured.RestAssured.given;
import static utilities.Authentication2.generateToken;

public class Api3Utils {

    public static Response postRequest(String endpoint, Room1Post data) {

Response response = given().headers("Authorization", "Bearer " + generateToken(), "Content-Type",
                       ContentType.JSON, "Accept", ContentType.JSON).
               body(data).contentType(ContentType.JSON).when().post(endpoint);
  return response;
   }

}
