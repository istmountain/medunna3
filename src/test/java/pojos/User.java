package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

   /*
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
        }
   */

    private int id;
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String ssn;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("pojos.User{");
        sb.append("id=").append(id);
        sb.append(", login='").append(login).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", ssn='").append(ssn).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
