import java.util.Objects;

public class Address {
    private String street;
    private String aptNr;
    private String city;
    private int zipCode;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAptNr() {
        return aptNr;
    }

    public void setAptNr(String aptNr) {
        this.aptNr = aptNr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <pre>new Address.Builder().build();</pre>
     */
    private Address(){ }

    //Address Builder
    public static class Builder{
        private String street;
        private String aptNr;
        private String city;
        private int zipCode;
        private String state;

        public Builder withStreet(String street){
            this.street = street;
            return this;
        }

        public Builder withAptNr(String aptNr){
            this.aptNr = aptNr;
            return this;
        }
        public Builder withCity(String city){
            this.city = city;
            return this;
        }

        public Builder withZipCode(int zipCode){
            this.zipCode = zipCode;
            return this;
        }

        public Builder withState(String state){
            this.state = state;
            return this;
        }

        public Address build(){
            Address a = new Address();
            a.setStreet(street);
            a.setAptNr(aptNr);
            a.setCity(city);
            a.setState(state);
            a.setZipCode(zipCode);

            return a;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Address address = (Address) o;
        return this.zipCode == address.zipCode &&
                Objects.equals(this.street, address.street) &&
                Objects.equals(this.aptNr, address.aptNr) &&
                Objects.equals(this.city, address.city) &&
                Objects.equals(this.state, address.state);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + zipCode;
        result = prime * result + (street == null ? 0 : street.hashCode());
        result = prime * result + (aptNr == null ? 0 : aptNr.hashCode());
        result = prime * result + (city == null ? 0 : city.hashCode());
        result = prime * result + (state == null ? 0 : state.hashCode());

        return result;
    }

    @Override
    public String toString() {
        if(aptNr != null) {
            return street + ", " +
                    aptNr + ", " +
                    city + ", " +
                    state + " " +
                    zipCode;

        }
        return street + ", " +
                city + ", " +
                state + " " +
                zipCode;
    }

}

