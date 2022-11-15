package stepdefinitions.apisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.Appointments2;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static utilities.Authentication2.generateToken;
import static utilities.WriteToText2.saveAppointmentData;

public class Appitmentsteps {

    Response response;
    Appointments2[] appointments;

    @Given("kullanici appoitments isin get request yapar")
    public void kullanici_appoitments_isin_get_request_yapar() {

        response = response = given().headers("Authorization", "Bearer " + generateToken(), "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON).when().get(ConfigurationReader.getProperty("medunna_appointments"));
        response.prettyPrint();
    }

    @Then("kullanici appotiments bilgilerini desarialize eder")
    public void kullanici_appotiments_bilgilerini_desarialize_eder() throws Exception {

        ObjectMapper objectmapper = new ObjectMapper();
        appointments = objectmapper.readValue(response.asString(), (Appointments2[].class));

    }

    @Then("kullanici appitments bilgilerini validate eder")
    public void kullanici_appitments_bilgilerini_validate_eder() {

    /*    System.out.println(appointments.length);
        for (int i = 0; i < appointments.length; i++) {
            System.out.println(appointments[i].getId());
            if (appointments[i].getPatient() != null) {

                System.out.println(appointments[i].getPatient().getFirstName());
                System.out.println(appointments[i].getPatient().getLastName());
                System.out.println(appointments[i].getPatient().getAdress());
                if (appointments[i].getPatient().getCountry() != null) {
                    System.out.println(appointments[i].getPatient().getCountry().getName());
                    System.out.println(appointments[i].getPatient().getCountry().getId());
                    System.out.println(appointments[i].getPatient().getAdress());
                }
                if (appointments[i].getPatient().getUser()!=null){

                    System.out.println(appointments[i].getPatient().getUser().getSsn());
                }
            }

        }
  */

        for (int i = 0; i <appointments.length ; i++) {

            System.out.println(appointments[i].toString());
        }
        saveAppointmentData(appointments);

    }
}