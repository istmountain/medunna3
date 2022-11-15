package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Appointments2 {


    /*

        "patient":
        {
        "createdBy": "anna",
        "createdDate": "2022-01-03T17:33:42.236154Z",
        "id": 5601,
        "startDate": "2022-01-12T00:00:00Z",
        "endDate": "2022-01-12T01:00:00Z",
        "status": "UNAPPROVED",
        "anamnesis": null,
        "treatment": null,
        "diagnosis": null,
        "prescription": null,
        "description": null,
        "physician": null,
            "patient": {
        "createdBy": "anna",
        "createdDate": "2022-01-03T17:33:42.224609Z",
        "id": 5551,
        "firstName": "Cara",
        "lastName": "Jaskolski",
        "birthDate": "1996-08-26T19:39:00Z",
        "phone": "4165667780",
        "gender": "FEMALE",
        "bloodGroup": "Onegative",
        "adress": "Apt. 001 886 Hirthe Rest, North Efrentown, PA 21160",
        "email": "otis.bechtelar@yahoo.com",
        "description": "asthma",
          "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2021-12-14T10:38:26.705059Z",
        "id": 2001,
        "login": "doctor",
        "firstName": "Doctor",
        "lastName": "Doctor",
        "email": "doctore@email.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "234-55-3432"
            },
        "inPatients": null,
        "country": {
        "id": 1202,
        "name": "Turkey"
        },
        "cstate": {
        "id": 1314,
        "name": "Bitlis",
        "country": {
        "id": 1202,
        "name": "Turkey"
        }
        }
        },
        "ctests": null
        }
     */

     private String createdBy;
     private String createdDate;
     private int id;
     private String anamnesis;
     private String treatment;
     private String startDate;
     private String endDate;
     private Patient patient;

     public String getCreatedBy() {
          return createdBy;
     }

     public void setCreatedBy(String createdBy) {
          this.createdBy = createdBy;
     }

     public String getCreatedDate() {
          return createdDate;
     }

     public void setCreatedDate(String createdDate) {
          this.createdDate = createdDate;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getAnamnesis() {
          return anamnesis;
     }

     public void setAnamnesis(String anamnesis) {
          this.anamnesis = anamnesis;
     }

     public String getTreatment() {
          return treatment;
     }

     public void setTreatment(String treatment) {
          this.treatment = treatment;
     }

     public String getStartDate() {
          return startDate;
     }

     public void setStartDate(String startDate) {
          this.startDate = startDate;
     }

     public String getEndDate() {
          return endDate;
     }

     public void setEndDate(String endDate) {
          this.endDate = endDate;
     }

     public Patient getPatient() {
          return patient;
     }

     public void setPatient(Patient patient) {
          this.patient = patient;
     }

     @Override
     public String toString() {
          final StringBuilder sb = new StringBuilder("pojos.Appointments2{");
          sb.append("createdBy='").append(createdBy).append('\'');
          sb.append(", createdDate='").append(createdDate).append('\'');
          sb.append(", id=").append(id);
          sb.append(", anamnesis='").append(anamnesis).append('\'');
          sb.append(", treatment='").append(treatment).append('\'');
          sb.append(", startDate='").append(startDate).append('\'');
          sb.append(", endDate='").append(endDate).append('\'');
          sb.append(", patient=").append(patient);
          sb.append('}');
          return sb.toString();
     }
}
