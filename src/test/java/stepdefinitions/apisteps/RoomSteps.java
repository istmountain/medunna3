package stepdefinitions.apisteps;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.Room1;
import pojos.Room1Post;
import utilities.ConfigurationReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Api3Utils.postRequest;
import static utilities.Authentication2.generateToken;

public class RoomSteps {
    Response response;
    Room1[] rooms;
    Room1Post obj = new Room1Post();
    Room1 room1put = new Room1();

    //String token= "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtNzFhIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2NjIzMTg0NDh9.lugCit1NbPnBei2M5XSHSh-9itnUEM3dCRDbDRqGmv_adzhRakS5RjcZ9QbZdWRc6OSMGOrWwVjoXJcb-oqybA";

    @Given("kullanici roomlar icin get request yapar")
    public void kullanici_roomlar_icin_get_request_yapar() {

        response = given().headers("Authorization", "Bearer " + generateToken(), "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON).when().get(ConfigurationReader.getProperty("medunna_appoitments"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
    }

    @Given("kullanici gelen room datayi deserialize eder")
    public void kullanici_gelen_room_datayi_deserialize_eder() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        rooms = obj.readValue(response.asString(), Room1[].class);
        System.out.println("kac tane room objesi var :" + rooms.length);
        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i].getRoomNumber());
        }

    }

    @Then("kullanici room datasini validate eder")
    public void kullanici_room_datasini_validate_eder() {


    }

    @Given("kullanici roomlar icin post request yapar")
    public void kullanici_roomlar_icin_post_request_yapar() {

        // set the expected data istenilen datayi hazirla
        obj.setRoomType("TWIN");
        obj.setPrice(500);
        obj.setRoomNumber(1189);
        obj.setStatus(true);
        obj.setDescription("Techproed TWIN ROOM");
        response = postRequest(ConfigurationReader.getProperty("room_post"), obj);




    /*response = given().headers("Authorization", "Bearer " + generateToken(), "Content-Type",
    ContentType.JSON, "Accept", ContentType.JSON).
    body(obj).contentType(ContentType.JSON).when().post(ConfigurationReader.getProperty("room_post"));
        response.prettyPrint();*/

    }


    @Then("kullanici roomlar icin post request dogrulama yapar")
    public void kullanici_roomlar_icin_post_request_dogrulama_yapar() throws Exception {
        // 1. dogrulama
        response.then().assertThat().statusCode(201);
        response.then().assertThat().body("roomNumber", equalTo(1189));
        response.prettyPrint();

        // 2. dogrulama
        JsonPath jsonPath = response.jsonPath();
        assertEquals(obj.getRoomNumber(), jsonPath.getInt("roomNumber"));
        assertEquals(obj.getRoomType(), jsonPath.getString("roomType"));

        // 3. dogrulama
        Map<String, Object> actualMapData = response.as(HashMap.class);
        assertEquals(obj.getPrice(), actualMapData.get("price"));

        // 4. dogrulama

        Room1 actualPojoData = response.as(Room1.class);
        assertEquals(obj.getRoomNumber(), actualPojoData.getRoomNumber());
        // 5. dogrulama

        ObjectMapper objmapper = new ObjectMapper();

        Room1 actualRoom2Data = objmapper.readValue(response.asString(), Room1.class);

        assertEquals(obj.getRoomNumber(), actualRoom2Data.getRoomNumber());

        // 6. dogrulama
        Gson gson = new Gson();
        Room1 actualRoom3Data = gson.fromJson(response.asString(), Room1.class);


    }

    @Given("kullanici roomlar icin put request yapar")
    public void kullanici_roomlar_icin_put_request_yapar() {

        room1put.setId(256595);
        room1put.setPrice(20);
        room1put.setRoomNumber(394737972);
        room1put.setRoomType("TWIN");
        room1put.setStatus(true);
        room1put.setCreatedBy("team63admin");
        room1put.setCreatedDate("2022-08-31T11:49:31.324794Z");
        room1put.setDescription("AAAA");

        response = given().headers("Authorization", "Bearer " + generateToken(), "Content-Type",
                        ContentType.JSON, "Accept", ContentType.JSON).
                body(room1put).contentType(ContentType.JSON).when().put(ConfigurationReader.getProperty("room_post"));
        response.prettyPrint();

    }


    @Then("kullanici roomlar icin put request dogrulama yapar")
    public void kullaniciRoomlarIcinPutRequestDogrulamaYapar()  throws Exception{


        // 1. dogrulama
        response.then().assertThat().statusCode(200);
        response.then().assertThat().body("roomNumber", equalTo(394737972));
        response.prettyPrint();

        // 2. dogrulama
        JsonPath jsonPath = response.jsonPath();
        assertEquals(room1put.getRoomNumber(), jsonPath.getInt("roomNumber"));
        assertEquals(room1put.getRoomType(), jsonPath.getString("roomType"));

        // 3. dogrulama
        Map<String, Object> actualMapData = response.as(HashMap.class);
        assertEquals(room1put.getPrice(), actualMapData.get("price"));

        // 4. dogrulama

        Room1 actualPojoData = response.as(Room1.class);
        assertEquals(room1put.getRoomNumber(), actualPojoData.getRoomNumber());
        // 5. dogrulama

        ObjectMapper objmapper = new ObjectMapper();

        Room1 actualRoom2Data = objmapper.readValue(response.asString(), Room1.class);

        assertEquals(room1put.getRoomNumber(), actualRoom2Data.getRoomNumber());

        // 6. dogrulama
        Gson gson = new Gson();
        Room1 actualRoom3Data = gson.fromJson(response.asString(), Room1.class);

    }


    @Given("kullanici roomlar icin delete request yapar {string}")
    public void kullaniciRoomlarIcinDeleteRequestYapar(String id) {

    response = given().headers("Authorization", "Bearer " + generateToken(), "Content-Type",
    ContentType.JSON, "Accept", ContentType.JSON).when().delete(ConfigurationReader.getProperty("room_post")+"/"+id);
     response.prettyPrint();

    }

    @Then("delete validation")
    public void delete_validation() {

        response.then().assertThat().statusCode(204);


    }


}



