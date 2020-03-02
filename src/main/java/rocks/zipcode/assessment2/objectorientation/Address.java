package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {


    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */

    private String addressLine1 = "";
    private String addressLine2 = "";
    private String city = "";
    private String state = "";
    private String zipcode = "";

    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Address() {

    }



    public String getAddressLine1() {

        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {

        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {

        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    @Override
    public String toString() {
        return "Address{addressLine1='"+addressLine1+ "', addressLine2='"+addressLine2+"', city='"+city+"', state='"+state+"', zipcode='"+zipcode+"'}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof Address)) {
            return false;
        }
        Address a = (Address) o;

        if(!this.addressLine1.equals(((Address) o).addressLine1)){
            return false;
        }
         if(!this.addressLine2.equals(((Address) o).addressLine2)){
            return false;
        }
        if(!this.city.equals(((Address) o).city)){
            return false;
        }
        if(!this.state.equals(((Address) o).state)){
            return false;
        }
        if(!this.zipcode.equals(((Address) o).zipcode)){
            return false;
        }


        return a.toString().equals(o.toString());
    }
}
