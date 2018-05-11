import java.util.Date;
import java.util.Objects;

public class Customer {
    private long id;
    private String name;
    private Date customerSince;
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCustomerSince() {
        return customerSince;
    }

    public void setCustomerSince(Date customerSince) {
        this.customerSince = customerSince;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <pre>new Customer.Builder().build();
     */
    private Customer(){ }

    public static class Builder {
        private long id;
        private String name;
        private Date customerSince;
        private Address address;

        public Builder withId(long id){
            this.id = id;
            return this;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withcustomerSince(Date date){
            this.customerSince = date;
            return this;
        }

        public Builder withAddress(Address address){
            this.address = address;
            return this;
        }

        public Customer build(){
            Customer c = new Customer();
            c.setId(id);
            c.setName(name);
            c.setCustomerSince(customerSince);
            c.setAddress(address);
            return c;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (this.getClass() != o.getClass())
            return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + (int) id;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (address == null ? 0 : address.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return name + '\n' +
                address + '\n' +
                "Customer #: "+ id + '\n' +
                "Customer Since: " + customerSince;
    }
}