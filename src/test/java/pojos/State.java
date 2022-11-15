package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class State {
    /*
     cstate": {
        "id": 1314,
        "name": "Bitlis",
        "country": {
        "id": 1202,
        "name": "Turkey"
        }
 */

  private int id;
  private String name;
  private Country country;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("pojos.State{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", country=").append(country);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
