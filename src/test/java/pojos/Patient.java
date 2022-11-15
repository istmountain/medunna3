package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {
    /*
            patient": {
            "createdBy": "alex",
            "createdDate": "2022-01-02T05:09:43.560Z",
            "id": 4868,
            "firstName": "Roscoe",
            "lastName": "Feil",
            "birthDate": "1997-11-23T05:00:00Z",
            "phone": "4165667780",
            "gender": "OTHER",
            "bloodGroup": "Bpositive",
            "adress": "4991 Malachi Prairie, Schadenhaven, WA 83960-0275",
            "email": "major.schamberger@hotmail.com",
            "description": "asthma",
            "user": {
        "createdBy": "system",
                "createdDate": null,
                "id": 4,
                "login": "bakalim",
                "firstName": "hastamisin",
                "lastName": "hastaa",
                "email": "hastapasta@gmail.com",
                "activated": true,
                "langKey": "en",
                "imageUrl": null,
                "resetDate": null,
                "ssn": "856-45-6776"
                }
    */

        private String firstName;
        private String lastName;
        private String birthDate;
        private String phone;
        private String adress;
        private String email;
        private String gender;
        private User user;
        private Country country;
        private State cstate;

        @Override
        public String toString() {
                final StringBuilder sb = new StringBuilder("pojos.Patient{");
                sb.append("firstName='").append(firstName).append('\'');
                sb.append(", lastName='").append(lastName).append('\'');
                sb.append(", birthDate='").append(birthDate).append('\'');
                sb.append(", phone='").append(phone).append('\'');
                sb.append(", adress='").append(adress).append('\'');
                sb.append(", email='").append(email).append('\'');
                sb.append(", gender='").append(gender).append('\'');
                sb.append(", user=").append(user);
                sb.append(", country=").append(country);
                sb.append(", cstate=").append(cstate);
                sb.append('}');
                return sb.toString();
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getBirthDate() {
                return birthDate;
        }

        public void setBirthDate(String birthDate) {
                this.birthDate = birthDate;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getAdress() {
                return adress;
        }

        public void setAdress(String adress) {
                this.adress = adress;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        public Country getCountry() {
                return country;
        }

        public void setCountry(Country country) {
                this.country = country;
        }

        public State getCstate() {
                return cstate;
        }

        public void setCstate(State cstate) {
                this.cstate = cstate;
        }
}

