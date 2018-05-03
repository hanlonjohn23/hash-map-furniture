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
}
